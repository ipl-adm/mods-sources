/*
 * Decompiled with CFR 0.152.
 */
package com.meteor.extrabotany.common.item;

import com.meteor.extrabotany.common.item.ItemMods;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import vazkii.botania.client.core.helper.IconHelper;

public class ItemTest
extends ItemMods {
    public static IIcon spear;
    int chunkX = 0;
    NBTTagCompound nbtTer = new NBTTagCompound();

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        super.registerIcons(par1IconRegister);
        spear = IconHelper.forName((IIconRegister)par1IconRegister, (String)"spear");
    }

    public ItemTest(String name) {
        super(name);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean adv) {
        list.add(StatCollector.translateToLocal((String)"item.test.desc"));
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase player) {
        return true;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        return stack;
    }
}

