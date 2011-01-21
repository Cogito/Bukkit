/**
 * 
 */
package org.bukkit.entity;

import org.bukkit.inventory.ItemStack;

/**
 * Represents an Item.
 * 
 * @author Cogito
 *
 */
public interface Item extends Entity {
    /**
     * Gets the stack of this item.
     * 
     * @return an ItemStack
     */
    public ItemStack getItemStack();
    
    /**
     * The age of this item, in ticks.
     * 
     * If an item ever reaches 6000, it dies.
     * 
     * @return the age of the item.
     */
    public int getAge();
    
    /**
     * Send this item back to better times.
     * 
     * Let this item relive its youth by turning back the clock.
     * 0 is a newborn, 6000 is dead.
     * 
     * @param age the age you would like the item to be.
     */
    public void setAge(int age);
    
    /**
     * The current health of the item.
     * 
     * An item with 
     * @return
     */
    public int getHealth();
    
    /**
     * 
     * @param health
     */
    public void setHealth(int health);
}
