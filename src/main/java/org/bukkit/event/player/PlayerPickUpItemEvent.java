package org.bukkit.event.player;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class PlayerPickUpItemEvent extends PlayerItemEvent {

    public PlayerPickUpItemEvent(Type type, Player who, Item item) {
        super(type, who, item);
    }

}
