package com.arch.generic;

import java.util.List;

public interface IInitialCommandUseCase<T extends InitialCommand> {
    List<DomainEvent> execute(T command);
}
