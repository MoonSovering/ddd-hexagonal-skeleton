package com.arch.gateway.generic;

import com.arch.generic.DomainEvent;
import com.arch.generic.InitialCommand;

import java.util.List;

public interface IInitialCommandUseCase<T extends InitialCommand> {
    List<DomainEvent> execute(T command);
}
