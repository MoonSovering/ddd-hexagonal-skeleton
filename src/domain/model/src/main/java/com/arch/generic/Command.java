package com.arch.generic;

public abstract class Command<T extends Identity>  {
    protected final T agreggateId;

    protected Command(T agreggateId) {
        this.agreggateId = agreggateId;
    }
    public T getAgreggateId() {
        return agreggateId;

    }
}
