// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * The key operations parameters.
 */
@Fluent
public final class KeySignParameters implements JsonSerializable<KeySignParameters> {
    /*
     * The signing/verification algorithm identifier. For more information on possible algorithm types, see
     * JsonWebKeySignatureAlgorithm.
     */
    private JsonWebKeySignatureAlgorithm algorithm;

    /*
     * The value property.
     */
    private Base64Url value;

    /**
     * Creates an instance of KeySignParameters class.
     */
    public KeySignParameters() {
    }

    /**
     * Get the algorithm property: The signing/verification algorithm identifier. For more information on possible
     * algorithm types, see JsonWebKeySignatureAlgorithm.
     * 
     * @return the algorithm value.
     */
    public JsonWebKeySignatureAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: The signing/verification algorithm identifier. For more information on possible
     * algorithm types, see JsonWebKeySignatureAlgorithm.
     * 
     * @param algorithm the algorithm value to set.
     * @return the KeySignParameters object itself.
     */
    public KeySignParameters setAlgorithm(JsonWebKeySignatureAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public byte[] getValue() {
        if (this.value == null) {
            return null;
        }
        return this.value.decodedBytes();
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the KeySignParameters object itself.
     */
    public KeySignParameters setValue(byte[] value) {
        if (value == null) {
            this.value = null;
        } else {
            this.value = Base64Url.encode(CoreUtils.clone(value));
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("alg", this.algorithm == null ? null : this.algorithm.toString());
        jsonWriter.writeStringField("value", Objects.toString(this.value, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeySignParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeySignParameters if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeySignParameters.
     */
    public static KeySignParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeySignParameters deserializedKeySignParameters = new KeySignParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alg".equals(fieldName)) {
                    deserializedKeySignParameters.algorithm
                        = JsonWebKeySignatureAlgorithm.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedKeySignParameters.value
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeySignParameters;
        });
    }
}
