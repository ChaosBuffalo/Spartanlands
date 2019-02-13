package com.chaosbuffalo.spartanlands.integration;

/**
 * Created by Jacob on 8/12/2018.
 */

import com.chaosbuffalo.spartanlands.Spartanlands;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.item.ItemCrossbow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thebetweenlands.api.item.CorrosionHelper;
import thebetweenlands.api.item.IAnimatorRepairable;
import thebetweenlands.api.item.ICorrodible;
import thebetweenlands.common.item.BLMaterialRegistry;

import javax.annotation.Nullable;
import java.util.List;

public class BLSWCrossbow extends ItemCrossbow implements ICorrodible, IAnimatorRepairable {

    public BLSWCrossbow(String unlocName, ToolMaterialEx material) {
        super(unlocName, Spartanlands.MODID, material);
        CorrosionHelper.addCorrosionPropertyOverrides(this);
    }

    @Override
    public boolean shouldCauseBlockBreakReset(ItemStack oldStack, ItemStack newStack) {
        return super.shouldCauseBlockBreakReset(oldStack, newStack) || CorrosionHelper.shouldCauseBlockBreakReset(oldStack, newStack);
    }
//
    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return super.shouldCauseReequipAnimation(oldStack, newStack, slotChanged) || CorrosionHelper.shouldCauseReequipAnimation(oldStack, newStack, slotChanged);
    }
//
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        return CorrosionHelper.getDestroySpeed(super.getDestroySpeed(stack, state), stack, state);
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity holder, int slot, boolean isHeldItem) {
        super.onUpdate(itemStack, world, holder, slot, isHeldItem);
        CorrosionHelper.updateCorrosion(itemStack, world, holder, slot, isHeldItem);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        CorrosionHelper.addCorrosionTooltips(stack, tooltip, flagIn.isAdvanced());
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public int getMinRepairFuelCost(ItemStack stack) {
        return BLMaterialRegistry.getMinRepairFuelCost(BLMaterialRegistry.TOOL_WEEDWOOD);
    }

    @Override
    public int getFullRepairFuelCost(ItemStack stack) {
        return BLMaterialRegistry.getFullRepairFuelCost(BLMaterialRegistry.TOOL_WEEDWOOD);
    }

    @Override
    public int getMinRepairLifeCost(ItemStack stack) {
        return BLMaterialRegistry.getMinRepairLifeCost(BLMaterialRegistry.TOOL_WEEDWOOD);
    }

    @Override
    public int getFullRepairLifeCost(ItemStack stack) {
        return BLMaterialRegistry.getFullRepairLifeCost(BLMaterialRegistry.TOOL_WEEDWOOD);
    }
}
