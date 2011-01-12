package org.bukkit.event.entity;

import org.bukkit.LivingEntity;
import org.bukkit.event.Cancellable;

public class EntityDeathEvent extends EntityEvent implements Cancellable {
    
    
    private static final int defaultHealth = 1;
    private static final int maxHealth = 20;
    
    private int health;
    
    private boolean cancelled;
    private boolean healthSet;
    
    public EntityDeathEvent(LivingEntity what) {
        super(Type.ENTITY_DEATH, what);
        cancelled = false;
        healthSet = false;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
    
    /**
     * The health that the LivingEntity will have in the case that death is cancelled.
     * 
     * If no health has been specified with setPostEventHealth() a default value will be used.
     * 
     * @return the health the LivingEntity should have.
     * 
     * @see LivingEntity#getHealth() LivingEntity.getHealth() to determine current health.
     */
    public int getPostEventHealth(){
        return healthSet ? this.health:defaultHealth;
    }
    
    /**
     * Specify the health the LivingEntity should have if death is cancelled.
     * 
     * If no health is specified, the LivingEntity will be given a default health.
     * 
     * @param health must be in range 0-20.
     */
    public void setPostEventHealth(int health){
        if(health < 0){
            health = 0;
        }
        if(health > maxHealth){
            health = maxHealth;
        }
        this.health = health;
        healthSet = true;
    }
    

}
