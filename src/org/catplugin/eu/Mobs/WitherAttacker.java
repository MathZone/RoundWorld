package org.catplugin.eu.Mobs;

import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntitySkeletonWither;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.inventory.ItemStack;

public class WitherAttacker {//} extends EntitySkeletonWither {
    public WitherAttacker(Location l) {
        //super(EntityTypes.ba,((CraftWorld) l.getWorld()).getHandle());
       /* ItemStack netheriteAxe = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemStack goldHelm = new ItemStack(Material.GOLDEN_HELMET, 1);
        ItemStack goldChestplate = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemStack netheriteLeggings = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemStack netheriteBoots = new ItemStack(Material.NETHERITE_BOOTS, 1);
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(netheriteAxe);
        this.setPosition(l.getX(), l.getY(), l.getZ());
        this.setSlot(EnumItemSlot.MAINHAND, nmsItem);
        //this.setSlot(EnumItemSlot.OFFHAND, nmsItem);
        this.setSlot(EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(goldHelm));
        this.setSlot(EnumItemSlot.CHEST, CraftItemStack.asNMSCopy(goldChestplate));
        this.setSlot(EnumItemSlot.LEGS, CraftItemStack.asNMSCopy(netheriteLeggings));
        this.setSlot(EnumItemSlot.FEET, CraftItemStack.asNMSCopy(netheriteBoots));
        this.setCustomName(new ChatComponentText(ChatColor.RED + "" + ChatColor.BOLD + "Wither Attacker"));
        this.setCustomNameVisible(true);
        this.setHealth(30.0F);
        this.goalSelector.a(0, new PathfinderGoalNearestAttackableTarget<EntityHuman>(this, EntityHuman.class, true));
        //this.goalSelector.a(1, new PathfinderGoalRandomStrollLand(this, 1.0D));
        //this.goalSelector.a(2, new PathfinderGoalRandomLookaround(this));*/
    }
}
