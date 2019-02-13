package com.chaosbuffalo.spartanlands.init;

import com.chaosbuffalo.spartanlands.MatConverter;
import com.chaosbuffalo.spartanlands.Spartanlands;
import com.chaosbuffalo.spartanlands.integration.*;
import com.chaosbuffalo.spartanlands.utils;
import com.oblivioussp.spartanweaponry.api.DamageHelper;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import com.oblivioussp.spartanweaponry.init.ModelRenderRegistry;
import com.oblivioussp.spartanweaponry.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import thebetweenlands.common.item.BLMaterialRegistry;
import thebetweenlands.common.registries.BlockRegistry;
import thebetweenlands.common.registries.ItemRegistry;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jacob on 7/20/2018.
 */@Mod.EventBusSubscriber
public class ItemRegistrySpartanlands {
    public static final Set<MatConverter> MATERIALS_TO_REGISTER = new HashSet<>();

    public static final String WEEDWOOD = "weedwood";
    public static final String SLIMY_BONE = "slimybone";
    public static final String OCTINE = "octine";
    public static final String VALONITE = "valonite";
    static {

        MATERIALS_TO_REGISTER.add(new MatConverter(WEEDWOOD, utils.spartanMatFromToolMat(WEEDWOOD,
                BLMaterialRegistry.TOOL_WEEDWOOD,
                1971718, 8485189)));
        MATERIALS_TO_REGISTER.add(new MatConverter(SLIMY_BONE, utils.spartanMatFromToolMat(SLIMY_BONE,
                BLMaterialRegistry.TOOL_BONE, 9867904, 1472278)));
        MATERIALS_TO_REGISTER.add(new MatConverter(OCTINE, utils.spartanMatFromToolMat(OCTINE,
                BLMaterialRegistry.TOOL_OCTINE, 16278797, 16762911)));
        MATERIALS_TO_REGISTER.add(new MatConverter(VALONITE, utils.spartanMatFromToolMat(VALONITE,
                BLMaterialRegistry.TOOL_VALONITE, 5650518, 16114165)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {

        OreDictionary.registerOre("ingotSlimybone", new ItemStack(ItemRegistry.ITEMS_MISC, 1, 14));
        OreDictionary.registerOre("ingotValonite", new ItemStack(ItemRegistry.ITEMS_MISC, 1, 19));
        OreDictionary.registerOre("ingotWeedwood", new ItemStack(BlockRegistry.WEEDWOOD));
        OreDictionary.registerOre("ingotWeedwood", ItemRegistry.WEEDWOOD_SHOVEL);
        Set<Item> item_set = new HashSet<>();
        for (MatConverter mat : MATERIALS_TO_REGISTER){
            ItemKatana katana = new BLSWKatana("katana_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.KATANA, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(katana, mat.material, "katana_custom");
            item_set.add(katana);
            ItemGreatsword greatsword = new BLSWGreatsword("greatsword_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.GREATSWORD, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(greatsword, mat.material, "greatsword_custom");
            item_set.add(greatsword);
            ItemLongsword longsword = new BLSWLongsword("longsword_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LONGSWORD, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(longsword, mat.material, "longsword_custom");
            item_set.add(longsword);
            ItemSaber saber = new BLSWSaber("saber_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SABER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(saber, mat.material, "saber_custom");
            item_set.add(saber);
            ItemRapier rapier = new BLSWRapier("rapier_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.RAPIER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(rapier, mat.material, "rapier_custom");
            item_set.add(rapier);
            ItemDagger dagger = new BLSWDagger("dagger_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.DAGGER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(dagger, mat.material, "dagger_custom");
            item_set.add(dagger);
            ItemSpear spear = new BLSWSpear("spear_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SPEAR, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(spear, mat.material, "spear_custom");
            item_set.add(spear);
            ItemPike pike = new BLSWPike("pike_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.PIKE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(pike, mat.material, "pike_custom");
            item_set.add(pike);
            ItemLance lance = new BLSWLance("lance_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LANCE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(lance, mat.material, "lance_custom");
            item_set.add(lance);
            ItemHalberd halberd = new BLSWHalberd("halberd_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HALBERD, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(halberd, mat.material, "halberd_custom");
            item_set.add(halberd);
            ItemWarhammer warhammer = new BLSWWarhammer("warhammer_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.WARHAMMER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(warhammer, mat.material, "warhammer_custom");
            item_set.add(warhammer);
            ItemHammer hammer = new BLSWHammer("hammer_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HAMMER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(hammer, mat.material, "hammer_custom");
            item_set.add(hammer);
            ItemThrowingAxe throwing_axe = new BLSWThrowingAxe("throwing_axe_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_AXE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(throwing_axe, mat.material, "throwing_axe_custom");
            item_set.add(throwing_axe);
            ItemThrowingKnife throwing_knife = new BLSWThrowingKnife("throwing_knife_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_KNIFE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(throwing_knife, mat.material, "throwing_knife_custom");
            item_set.add(throwing_knife);
            ItemLongbow longbow = new BLSWLongbow("longbow_" + mat.name,  mat.material);
            ModelRenderRegistry.addItemToRegistry(longbow, mat.material, "longbow_custom");
            item_set.add(longbow);
            ItemCrossbow crossbow = new BLSWCrossbow("crossbow_" + mat.name, mat.material);
            ModelRenderRegistry.addItemToRegistry(crossbow, mat.material, "crossbow_custom");
            item_set.add(crossbow);
            ItemJavelin javelin = new BLSWJavelin("javelin_" + mat.name, Spartanlands.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.JAVELIN, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(javelin, mat.material, "javelin_custom");
            item_set.add(javelin);

        }
        for (Item it : item_set){
            it.setCreativeTab(CreativeTabsSW.TAB_SW);
            ev.getRegistry().register(it);
        }
    }
}
