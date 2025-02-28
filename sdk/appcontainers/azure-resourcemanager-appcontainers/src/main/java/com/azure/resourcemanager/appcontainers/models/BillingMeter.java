// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Billing meter.
 */
@Fluent
public final class BillingMeter implements JsonSerializable<BillingMeter> {
    /*
     * Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{
     * resourceType}/{resourceName}
     */
    private String id;

    /*
     * The name of the resource
     */
    private String name;

    /*
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     */
    private String type;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Region for the billing meter.
     */
    private String location;

    /*
     * Revision resource specific properties
     */
    private BillingMeterProperties properties;

    /**
     * Creates an instance of BillingMeter class.
     */
    public BillingMeter() {
    }

    /**
     * Get the id property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
     * "Microsoft.Storage/storageAccounts".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: Region for the billing meter.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Region for the billing meter.
     * 
     * @param location the location value to set.
     * @return the BillingMeter object itself.
     */
    public BillingMeter withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Revision resource specific properties.
     * 
     * @return the properties value.
     */
    public BillingMeterProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Revision resource specific properties.
     * 
     * @param properties the properties value to set.
     * @return the BillingMeter object itself.
     */
    public BillingMeter withProperties(BillingMeterProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BillingMeter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BillingMeter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BillingMeter.
     */
    public static BillingMeter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BillingMeter deserializedBillingMeter = new BillingMeter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBillingMeter.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBillingMeter.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBillingMeter.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedBillingMeter.systemData = SystemData.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedBillingMeter.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedBillingMeter.properties = BillingMeterProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBillingMeter;
        });
    }
}
