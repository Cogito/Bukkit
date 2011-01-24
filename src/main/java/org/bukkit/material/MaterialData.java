
package org.bukkit.material;

import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

/**
 * Handles specific metadata for certain items or blocks
 */
public interface MaterialData {

    /**
     * Gets the raw data in this material
     *
     * @return Raw data
     */
    public byte getData();

    /**
     * Sets the raw data of this material
     * 
     * @param data New raw data
     */
    public void setData(byte data);

    /**
     * Gets the Material that this MaterialData represents
     *
     * @return Material represented by this MaterialData
     */
    public Material getItemType();

    /**
     * Creates a new ItemStack based on this MaterialData
     *
     * @return New ItemStack containing a copy of this MaterialData
     */
    public ItemStack toItemStack();
}
