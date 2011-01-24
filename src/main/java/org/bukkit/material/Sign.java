
package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.Material;

/**
 * MaterialData for signs
 */
public interface Sign extends MaterialData, Attachable {

    /**
     * Gets the direction that this sign is currently facing
     *
     * @return BlockFace indicating where this sign is facing
     */
    public BlockFace getFacing();
}
