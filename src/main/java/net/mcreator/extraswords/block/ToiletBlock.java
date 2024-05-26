
package net.mcreator.extraswords.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.extraswords.procedures.ToiletOnBlockRightClickedProcedure;
import net.mcreator.extraswords.init.ExtraswordsModBlocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class ToiletBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ToiletBlock() {
		super(PROPERTIES);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return (switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6, 0, 5, 10, 5, 12), box(3, 5, 3, 13, 6, 15), box(11, 6, 3, 13, 11, 15), box(5, 6, 13, 11, 11, 15), box(3, 6, 3, 5, 11, 15), box(5, 6, 3, 11, 11, 5), box(2, 11, 0, 14, 16, 4), box(5, 6, 5, 11, 8, 13));
			case NORTH -> Shapes.or(box(6, 0, 4, 10, 5, 11), box(3, 5, 1, 13, 6, 13), box(3, 6, 1, 5, 11, 13), box(5, 6, 1, 11, 11, 3), box(11, 6, 1, 13, 11, 13), box(5, 6, 11, 11, 11, 13), box(2, 11, 12, 14, 16, 16), box(5, 6, 3, 11, 8, 11));
			case EAST -> Shapes.or(box(5, 0, 6, 12, 5, 10), box(3, 5, 3, 15, 6, 13), box(3, 6, 3, 15, 11, 5), box(13, 6, 5, 15, 11, 11), box(3, 6, 11, 15, 11, 13), box(3, 6, 5, 5, 11, 11), box(0, 11, 2, 4, 16, 14), box(5, 6, 5, 13, 8, 11));
			case WEST -> Shapes.or(box(4, 0, 6, 11, 5, 10), box(1, 5, 3, 13, 6, 13), box(1, 6, 11, 13, 11, 13), box(1, 6, 5, 3, 11, 11), box(1, 6, 3, 13, 11, 5), box(11, 6, 5, 13, 11, 11), box(12, 11, 2, 16, 16, 14), box(3, 6, 5, 11, 8, 11));
		}).move(offset.x, offset.y, offset.z);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		ToiletOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(ExtraswordsModBlocks.TOILET, RenderType.solid());
	}
}
