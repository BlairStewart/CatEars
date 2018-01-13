package Crystalshard.CatEars.domain.identifier;

import java.util.UUID;

public abstract class UUIDId extends Id<UUID> {

    protected UUIDId(UUID id) {
        super(id);
    }

    @Override
    protected boolean validate(UUID id) {
        return id.version() == 4;
    }
    
    public int compareTo(Id<UUID> o) {
        return this.getId().compareTo(o.getId());
    }
}
