package org.bukkit.material;

import org.bukkit.DyeColor;

public interface Colorable {

    /**
     * Gets the current color of this dye
     *
     * @return DyeColor of this dye
     */
    public abstract DyeColor getColor();

    /**
     * Sets the color of this dye
     *
     * @param color New color of this dye
     */
    public abstract void setColor(DyeColor color);

}