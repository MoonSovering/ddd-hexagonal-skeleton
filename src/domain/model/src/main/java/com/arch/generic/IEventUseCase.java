package com.arch.generic;

import java.util.List;

public interface IEventUseCase<T extends DomainEvent> {
    List<DomainEvent> execute(T domainEvent);
}