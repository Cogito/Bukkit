
package org.bukkit.inventory;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Represents a stack of items
 */
public interface ItemStack {

    /**
     * Gets the type of this item
     *
     * @return Type of the items in this stack
     */
    public Material getType();

    /**
     * Sets the type of this item<br />
     * <br />
     * Note that in doing so you will reset the MaterialData for this stack
     *
     * @param type New type to set the items in this stack to
     */
    public void setType(Material type);

    /**
     * Gets the amount of items in this stack
     *
     * @return Amount of items in this stick
     */
    public int getAmount();

    /**
     * Sets the amount of items in this stack
     *
     * @param amount New amount of items in this stack
     */
    public void setAmount(int amount);

    /**
     * Gets the MaterialData for this stack of items
     *
     * @return MaterialData for this item
     */
    public MaterialData getData();

    /**
     * Sets the MaterialData for this stack of items
     *
     * @param amount New MaterialData for this item
     */
    public void setData(MaterialData data);

    /**
     * Sets the damage of this item<br /><br />
     *
     * 0x00 represents an item which cannot be damaged<br />
     * 0x01 represents an item at maximum health<br />
     * 0x32 represents an item with no health left
     *
     * @param damage Damage of this item
     */
    public void setDamage(final byte damage);

    /**
     * Gets the damage of this ItemStack<br /><br />
     *
     * 0x00 represents an ItemStack which cannot be damaged<br />
     * 0x01 represents an ItemStack at maximum health<br />
     * 0x32 represents an ItemStack with no health left
     *
     * @return Damage of this ItemStack
     */
    public byte getDamage();

    /**
     * Get the maximum stacksize for the material hold in this ItemStack
     * Returns -1 if it has no idea.
     * 
     * @return The maximum you can stack this material to.
     */
    public int getMaxStackSize();

    //private void createData(final byte data);
}
