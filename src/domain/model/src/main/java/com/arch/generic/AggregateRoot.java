package com.arch.generic;

import java.util.List;

public abstract class AggregateRoot<I extends Identity> extends Entity<I> {
    private final ChangeEventSubscriber changeEventSubscriber;
    public AggregateRoot(I uuid) {
        super(uuid);
        changeEventSubscriber = new ChangeEventSubscriber();
    }
    public List<DomainEvent> getUncommitedChanges(){
        return List.copyOf(changeEventSubscriber.events());
    }
    public void markAsCommitted(){
        changeEventSubscriber.events().clear();
    }
    protected void subscribe(EventChange eventChange){
        changeEventSubscriber.subscribe(eventChange);
    }
    protected void applyEvent(DomainEvent domainEvent){
        changeEventSubscriber.applyEvent(domainEvent);
    }
    protected ChangeApply appendEvent(DomainEvent domainEvent){
        var nameClass = identity().getClass().getSimpleName();
        var aggregate = nameClass.replaceAll("(Identity|Id|ID)", "");
        domainEvent.setAggregateName(aggregate);
        domainEvent.setAggregateRootId(identity().value());
        return changeEventSubscriber.appendChange(domainEvent);
    }
}