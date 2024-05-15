package com.arch.gateway.generic;

import com.arch.generic.DomainEvent;

import java.util.List;

public interface IEventsRepository {
    DomainEvent save(DomainEvent domainEvent);
    List<DomainEvent> findByAggregateId(String aggregateId);
}
