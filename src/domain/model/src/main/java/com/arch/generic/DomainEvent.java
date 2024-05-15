package com.arch.generic;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class DomainEvent  implements Serializable {

    public final Instant moment;
    public final UUID uuid;
    public final String type;
    private String aggregateRootId;
    private String aggregate;
    private long versionType;

    public DomainEvent(final String type) {
        this.type = type;
        this.aggregate = "default";
        this.moment = Instant.now();
        this.uuid = UUID.randomUUID();
        this.versionType = 1L;
    }
    public long versionType(){
        return versionType;
    }

    public void setVersionType( Long versionType ){
        this.versionType = versionType;
    }
    public String aggregateRootId(){
        return aggregateRootId;
    }
    public void setAggregateRootId(String aggregateRootId){
        this.aggregateRootId = Objects.requireNonNull(aggregateRootId, "The aggregateRootId cannot be null value");
    }
    public String getAggregateName(){
        return aggregate;
    }
    public void setAggregateName(String aggregate){
        this.aggregate = aggregate;
    }
}
