package com.arch.generic;


import java.util.List;

public interface ICommandUseCase<T extends Command<I>, I extends Identity> {
    List<DomainEvent> execute(T command);
}
