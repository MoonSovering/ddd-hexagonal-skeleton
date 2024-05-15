package com.arch.gateway.generic;


import com.arch.generic.Command;
import com.arch.generic.DomainEvent;
import com.arch.generic.Identity;

import java.util.List;

public interface ICommandUseCase<T extends Command<I>, I extends Identity> {
    List<DomainEvent> execute(T command);
}
