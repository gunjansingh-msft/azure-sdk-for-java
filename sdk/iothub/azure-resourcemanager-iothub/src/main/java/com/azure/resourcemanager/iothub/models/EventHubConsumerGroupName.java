// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EventHub consumer group name. */
@Fluent
public final class EventHubConsumerGroupName {
    /*
     * EventHub consumer group name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of EventHubConsumerGroupName class. */
    public EventHubConsumerGroupName() {
    }

    /**
     * Get the name property: EventHub consumer group name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: EventHub consumer group name.
     *
     * @param name the name value to set.
     * @return the EventHubConsumerGroupName object itself.
     */
    public EventHubConsumerGroupName withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model EventHubConsumerGroupName"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventHubConsumerGroupName.class);
}
