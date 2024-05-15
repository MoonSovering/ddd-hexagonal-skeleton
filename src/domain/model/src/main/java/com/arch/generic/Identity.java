package com.arch.generic;


import java.util.Objects;
import java.util.UUID;

public class Identity implements ValueObject<String> {

    private final String uuid;

    public Identity() {
        this.uuid = UUID.randomUUID().toString();
    }
    public Identity(String uuid){
        ensureValidUuid(uuid);
        this.uuid = uuid;
    }
    private void ensureValidUuid(String value){
        try {
            UUID.fromString(value);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid ID. ");
        }
    }
    @Override
    public String value() {
        return uuid;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Identity identity = (Identity) o;

        return Objects.equals(uuid, identity.uuid);
    }
    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }
}