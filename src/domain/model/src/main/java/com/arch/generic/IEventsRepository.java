package com.arch.generic;

import java.util.List;

public interface IEventsRepository {
    DomainEvent save(DomainEvent domainEvent);
    List<DomainEvent> findByAggregateId(String aggregateId);
}
