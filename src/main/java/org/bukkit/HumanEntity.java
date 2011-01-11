
package org.bukkit;

/**
 * Represents a human entity, such as an NPC or a player
 */
public interface HumanEntity extends LivingEntity {
    /**
     * Returns the name of this player
     *
     * @return Player name
     */
    public String getName();

    /**
     * Get the player's inventory.
     *
     * @return The inventory of the player, this also contains the armor slots.
     */
    public PlayerInventory getInventory();

    /**
     * Returns the ItemStack currently in your hand, can be empty.
     * 
     * @return The ItemStack of the item you are currently holding.
     */
    public ItemStack getItemInHand();

    
    /** TODO: This probably won't work ;(
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was holding.
     * 
     * @param item The ItemStack which will end up in the hand
     * @return 
     *
    public void setItemInHand( ItemStack item );

     **
     * Changes the item in hand to another of your 'action slots'.
     * 
     * @param index The new index to use, only valid ones are 0-8.
     * 
    public void selectItemInHand( int index );
    */
    
    /**
     * Tries to give an ItemStack to the HumanEntity.
     * 
     * @param item the ItemStack to give to the HumanEntity
     * 
     * @return an ItemStack of leftover items not be given to the player.
     */
    public ItemStack giveItem(ItemStack item);
}
