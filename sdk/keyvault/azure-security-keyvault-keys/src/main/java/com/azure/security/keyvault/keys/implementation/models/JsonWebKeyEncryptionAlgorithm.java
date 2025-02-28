// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * algorithm identifier.
 */
public final class JsonWebKeyEncryptionAlgorithm extends ExpandableStringEnum<JsonWebKeyEncryptionAlgorithm> {
    /**
     * Static value RSA-OAEP for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm RSAOAEP = fromString("RSA-OAEP");

    /**
     * Static value RSA-OAEP-256 for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm RSAOAEP256 = fromString("RSA-OAEP-256");

    /**
     * Static value RSA1_5 for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm RSA15 = fromString("RSA1_5");

    /**
     * Static value A128GCM for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A128GCM = fromString("A128GCM");

    /**
     * Static value A192GCM for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A192GCM = fromString("A192GCM");

    /**
     * Static value A256GCM for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A256GCM = fromString("A256GCM");

    /**
     * Static value A128KW for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A128KW = fromString("A128KW");

    /**
     * Static value A192KW for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A192KW = fromString("A192KW");

    /**
     * Static value A256KW for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A256KW = fromString("A256KW");

    /**
     * Static value A128CBC for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A128CBC = fromString("A128CBC");

    /**
     * Static value A192CBC for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A192CBC = fromString("A192CBC");

    /**
     * Static value A256CBC for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A256CBC = fromString("A256CBC");

    /**
     * Static value A128CBCPAD for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A128CBCPAD = fromString("A128CBCPAD");

    /**
     * Static value A192CBCPAD for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A192CBCPAD = fromString("A192CBCPAD");

    /**
     * Static value A256CBCPAD for JsonWebKeyEncryptionAlgorithm.
     */
    public static final JsonWebKeyEncryptionAlgorithm A256CBCPAD = fromString("A256CBCPAD");

    /**
     * Creates a new instance of JsonWebKeyEncryptionAlgorithm value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JsonWebKeyEncryptionAlgorithm() {
    }

    /**
     * Creates or finds a JsonWebKeyEncryptionAlgorithm from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JsonWebKeyEncryptionAlgorithm.
     */
    public static JsonWebKeyEncryptionAlgorithm fromString(String name) {
        return fromString(name, JsonWebKeyEncryptionAlgorithm.class);
    }

    /**
     * Gets known JsonWebKeyEncryptionAlgorithm values.
     * 
     * @return known JsonWebKeyEncryptionAlgorithm values.
     */
    public static Collection<JsonWebKeyEncryptionAlgorithm> values() {
        return values(JsonWebKeyEncryptionAlgorithm.class);
    }
}
