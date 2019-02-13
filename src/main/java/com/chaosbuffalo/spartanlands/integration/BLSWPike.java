package com.chaosbuffalo.spartanlands.integration;

import com.google.common.collect.Multimap;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.item.ItemPike;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thebetweenlands.api.item.CorrosionHelper;
import thebetweenlands.api.item.IAnimatorRepairable;
import thebetweenlands.api.item.ICorrodible;
import thebetweenlands.common.capability.circlegem.CircleGemHelper;
import thebetweenlands.common.item.BLMaterialRegistry;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Jacob on 8/12/2018.
 */
public class BLSWPike extends ItemPike implements ICorrodible, IAnimatorRepairable {

    protected final ToolMaterialEx toolMaterial;

    public BLSWPike(String unlocName, String externalModId, ToolMaterialEx material, float weaponDamage) {
        super(unlocName, externalModId, material, weaponDamage);
        this.toolMaterial = material;
        CorrosionHelper.addCorrosionPropertyOverrides(this);
        CircleGemHelper.addGemPropertyOverrides(this);
    }

    @Override
    public boolean shouldCauseBlockBreakReset(ItemStack oldStack, ItemStack newStack) {
        return CorrosionHelper.shouldCauseBlockBreakReset(oldStack, newStack);
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return CorrosionHelper.shouldCauseReequipAnimation(oldStack, newStack, slotChanged);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        return CorrosionHelper.getDestroySpeed(super.getDestroySpeed(stack, state), stack, state);
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity holder, int slot, boolean isHeldItem) {
        super.onUpdate(itemStack, world, holder, slot, isHeldItem);
        CorrosionHelper.updateCorrosion(itemStack, world, holder, slot, isHeldItem);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        return CorrosionHelper.getAttributeModifiers(super.getAttributeModifiers(slot, stack), slot, stack, ItemTool.ATTACK_DAMAGE_MODIFIER, 3.0F + this.getAttackDamage());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        CorrosionHelper.addCorrosionTooltips(stack, tooltip, flagIn.isAdvanced());
    }

    @Override
    public int getMinRepairFuelCost(ItemStack stack) {
        return BLMaterialRegistry.getMinRepairFuelCost(this.toolMaterial.getMaterial());
    }

    @Override
    public int getFullRepairFuelCost(ItemStack stack) {
        return BLMaterialRegistry.getFullRepairFuelCost(this.toolMaterial.getMaterial());
    }

    @Override
    public int getMinRepairLifeCost(ItemStack stack) {
        return BLMaterialRegistry.getMinRepairLifeCost(this.toolMaterial.getMaterial());
    }

    @Override
    public int getFullRepairLifeCost(ItemStack stack) {
        return BLMaterialRegistry.getFullRepairLifeCost(this.toolMaterial.getMaterial());
    }
}
