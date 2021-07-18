package com.bizzan.bitrade.constant;

import com.bizzan.bitrade.core.BaseEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * All those with only two states can be used, ordinal is 0 means normal, enable; ordinal is 1 means soft delete, disable, cancel.<br>
 *
 * @author GS
 * @date December 07, 2017
 */
@AllArgsConstructor
@Getter
public enum CommonStatus implements BaseEnum {
    /**
     * Indicates normal state
     */
    NORMAL("normal"),
    /**
     * Indicates illegal status
     */
    ILLEGAL("illegal");

    @Setter
    private String cnName;

    @Override
    @JsonValue
    public int getOrdinal(){
        return this.ordinal();
    }
}
