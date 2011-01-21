package org.bukkit.event.player;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class PlayerDropItemEvent extends PlayerItemEvent {

    public PlayerDropItemEvent(Type type, Player who, Item item) {
        super(type, who, item);
    }

}
