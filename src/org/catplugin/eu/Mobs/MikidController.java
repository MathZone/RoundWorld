package org.catplugin.eu.Mobs;

import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntityZombie;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Player;

public class MikidController {//extends EntityZombie {
    public MikidController(Location loc) {
       // super(EntityTypes.be, ((CraftWorld) loc.getWorld()).getHandle());
       /* this.setCustomName(new ChatComponentText(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Wither Skeleton BOSS"));
        this.setCustomNameVisible(true);
        this.setPosition(loc.getX(), loc.getY(), loc.getZ());
        this.setHealth(690.0F);
        this.setAggressive(true);
        org.bukkit.inventory.ItemStack netheriteSword = new org.bukkit.inventory.ItemStack(Material.NETHERITE_SWORD, 1);
        this.setSlot(EnumItemSlot.MAINHAND, CraftItemStack.asNMSCopy(netheriteSword));
        this.setSlot(EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(head));

        for (Player player1 : Bukkit.getOnlinePlayers()) {
                this.setGoalTarget((EntityLiving) ((CraftPlayer) player1).getHandle());
            }
    }
    @Override
    public void setOnFire(int i) {

    }
    @Override
    protected void initPathfinder() {
        this.goalSelector.a(0, new PathfinderGoalNearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
}*/
    }
}
