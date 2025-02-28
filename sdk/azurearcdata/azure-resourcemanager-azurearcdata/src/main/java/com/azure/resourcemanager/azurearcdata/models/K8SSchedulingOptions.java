// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The kubernetes scheduling options. It describes restrictions used to help Kubernetes select appropriate nodes to host
 * the database service.
 */
@Fluent
public final class K8SSchedulingOptions implements JsonSerializable<K8SSchedulingOptions> {
    /*
     * The kubernetes resource limits and requests used to restrict or reserve resource usage.
     */
    private K8SResourceRequirements resources;

    /*
     * The kubernetes scheduling options. It describes restrictions used to help Kubernetes select appropriate nodes to
     * host the database service
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of K8SSchedulingOptions class.
     */
    public K8SSchedulingOptions() {
    }

    /**
     * Get the resources property: The kubernetes resource limits and requests used to restrict or reserve resource
     * usage.
     * 
     * @return the resources value.
     */
    public K8SResourceRequirements resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The kubernetes resource limits and requests used to restrict or reserve resource
     * usage.
     * 
     * @param resources the resources value to set.
     * @return the K8SSchedulingOptions object itself.
     */
    public K8SSchedulingOptions withResources(K8SResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the additionalProperties property: The kubernetes scheduling options. It describes restrictions used to help
     * Kubernetes select appropriate nodes to host the database service.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The kubernetes scheduling options. It describes restrictions used to help
     * Kubernetes select appropriate nodes to host the database service.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the K8SSchedulingOptions object itself.
     */
    public K8SSchedulingOptions withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resources() != null) {
            resources().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("resources", this.resources);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of K8SSchedulingOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of K8SSchedulingOptions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the K8SSchedulingOptions.
     */
    public static K8SSchedulingOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            K8SSchedulingOptions deserializedK8SSchedulingOptions = new K8SSchedulingOptions();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resources".equals(fieldName)) {
                    deserializedK8SSchedulingOptions.resources = K8SResourceRequirements.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedK8SSchedulingOptions.additionalProperties = additionalProperties;

            return deserializedK8SSchedulingOptions;
        });
    }
}
