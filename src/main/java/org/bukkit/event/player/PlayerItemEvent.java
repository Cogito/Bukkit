package org.bukkit.event.player;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;

public class PlayerItemEvent extends PlayerEvent implements Cancellable {

    protected Item item;
    protected boolean cancel;

    public PlayerItemEvent(Type type, Player who, Item item) {
        super(type, who);
        cancel = false;
        this.item = item;
    }

    /**
     * Gets the cancellation state of this event. Set to true if you
     * want to prevent buckets from placing water and so forth
     * 
     * @return boolean cancellation state
     */
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * Sets the cancellation state of this event. A cancelled event will not
     * be executed in the server, but will still pass to other plugins
     *
     * Cancelling this event will prevent use of food (player won't lose the
     * food item), prevent bows/snowballs/eggs from firing, etc. (player won't
     * lose the ammo)
     *
     * @param cancel true if you wish to cancel this event
     */
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Returns the item in hand represented by this event
     * 
     * @return ItemStack the item used
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * Convenience method. Returns the material of the item represented by this
     * event
     * 
     * @return Material the material of the item used
     */
    public Material getMaterial() {
        if (this.item == null || this.item.getItemStack() == null) return Material.AIR;
        
        return item.getType();
    }

    /**
     * Convenience method to inform the user whether this was a block placement
     * event.
     * 
     * @return boolean true if the item in hand was a block
     */
    public boolean isBlock() {
        if (item == null) return false;
        
        return item.getType().isBlock();
    }

}