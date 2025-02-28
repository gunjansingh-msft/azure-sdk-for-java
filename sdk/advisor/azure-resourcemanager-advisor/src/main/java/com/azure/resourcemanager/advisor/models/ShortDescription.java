// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A summary of the recommendation.
 */
@Fluent
public final class ShortDescription implements JsonSerializable<ShortDescription> {
    /*
     * The issue or opportunity identified by the recommendation and proposed solution.
     */
    private String problem;

    /*
     * The issue or opportunity identified by the recommendation and proposed solution.
     */
    private String solution;

    /**
     * Creates an instance of ShortDescription class.
     */
    public ShortDescription() {
    }

    /**
     * Get the problem property: The issue or opportunity identified by the recommendation and proposed solution.
     * 
     * @return the problem value.
     */
    public String problem() {
        return this.problem;
    }

    /**
     * Set the problem property: The issue or opportunity identified by the recommendation and proposed solution.
     * 
     * @param problem the problem value to set.
     * @return the ShortDescription object itself.
     */
    public ShortDescription withProblem(String problem) {
        this.problem = problem;
        return this;
    }

    /**
     * Get the solution property: The issue or opportunity identified by the recommendation and proposed solution.
     * 
     * @return the solution value.
     */
    public String solution() {
        return this.solution;
    }

    /**
     * Set the solution property: The issue or opportunity identified by the recommendation and proposed solution.
     * 
     * @param solution the solution value to set.
     * @return the ShortDescription object itself.
     */
    public ShortDescription withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("problem", this.problem);
        jsonWriter.writeStringField("solution", this.solution);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ShortDescription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ShortDescription if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ShortDescription.
     */
    public static ShortDescription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ShortDescription deserializedShortDescription = new ShortDescription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("problem".equals(fieldName)) {
                    deserializedShortDescription.problem = reader.getString();
                } else if ("solution".equals(fieldName)) {
                    deserializedShortDescription.solution = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedShortDescription;
        });
    }
}
