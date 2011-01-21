package org.bukkit.event.player;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;

/**
 * 
 * @author durron597
 *
 */
public class PlayerUseItemEvent extends PlayerItemEvent{
    protected Block blockClicked;
    protected BlockFace blockFace;
    
    public PlayerUseItemEvent(Type type, Player who, ItemStack item, Block blockClicked, BlockFace blockFace) {
        super(type, who, item);
        this.blockClicked = blockClicked;
        this.blockFace = blockFace;
    }

    /**
     * Returns the clicked block
     * 
     * @return Block returns the block clicked with this item.
     */
    public Block getBlockClicked() {
        return blockClicked;
    }
    
    /**
     * Returns the face of the block that was clicked
     * 
     * @return BlockFace returns the face of the block that was clicked
     */
    public BlockFace getBlockFace() {
        return blockFace;
    }
}
