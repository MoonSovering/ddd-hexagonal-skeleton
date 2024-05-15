package com.arch.generic;

public class Entity<I extends Identity> {

    public final I uuid;

    public Entity(I uuid){
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        return uuid.equals(0);
    }
    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }

    public I identity() {
        return uuid;
    }
}