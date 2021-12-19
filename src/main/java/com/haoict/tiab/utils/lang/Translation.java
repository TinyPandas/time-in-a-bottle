package com.haoict.tiab.utils.lang;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

public enum Translation implements ITranslationProvider {
    TOOLTIP_STORED_TIME("item.tiab.time_in_a_bottle.tooltip.stored_time", 3),
    TOOLTIP_TIAB_FE("item.tiab.time_in_a_bottle_fe.tooltip", 0),
    TOOLTIP_STORED_ENERGY("item.tiab.time_in_a_bottle_fe.tooltip.stored_energy", 2);

    private final String key;
    private final int argCount;

    Translation(@Nonnull String key, @Nonnegative int argCount) {
        this.key = key;
        this.argCount = argCount;
    }

    @Override
    public boolean areValidArguments(Object... args) {
        return args.length == argCount;
    }

    @Override
    public String getTranslationKey() {
        return key;
    }
}
