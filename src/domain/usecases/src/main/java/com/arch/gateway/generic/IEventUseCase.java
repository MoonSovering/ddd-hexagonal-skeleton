package com.arch.gateway.generic;

import com.arch.generic.DomainEvent;

import java.util.List;

public interface IEventUseCase<T extends DomainEvent> {
    List<DomainEvent> execute(T domainEvent);
}