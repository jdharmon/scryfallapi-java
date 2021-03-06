/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.scryfall.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LegalStatus.
 */
public enum LegalStatus {
    /** Enum value legal. */
    LEGAL("legal"),

    /** Enum value not_legal. */
    NOT_LEGAL("not_legal"),

    /** Enum value restricted. */
    RESTRICTED("restricted"),

    /** Enum value banned. */
    BANNED("banned");

    /** The actual serialized value for a LegalStatus instance. */
    private String value;

    LegalStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LegalStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LegalStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static LegalStatus fromString(String value) {
        LegalStatus[] items = LegalStatus.values();
        for (LegalStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
