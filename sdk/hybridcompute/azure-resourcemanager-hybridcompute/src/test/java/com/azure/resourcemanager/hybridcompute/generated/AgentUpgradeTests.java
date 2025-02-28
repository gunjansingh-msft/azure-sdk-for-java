// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.AgentUpgrade;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class AgentUpgradeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentUpgrade model = BinaryData.fromString(
            "{\"desiredVersion\":\"cgyncocpecf\",\"correlationId\":\"90bafd9b-6353-405e-989c-160d86df46fa\",\"enableAutomaticUpgrade\":true,\"lastAttemptDesiredVersion\":\"ofsx\",\"lastAttemptTimestamp\":\"2021-10-25T19:09:19Z\",\"lastAttemptStatus\":\"Failed\",\"lastAttemptMessage\":\"m\"}")
            .toObject(AgentUpgrade.class);
        Assertions.assertEquals("cgyncocpecf", model.desiredVersion());
        Assertions.assertEquals(UUID.fromString("90bafd9b-6353-405e-989c-160d86df46fa"), model.correlationId());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentUpgrade model = new AgentUpgrade().withDesiredVersion("cgyncocpecf")
            .withCorrelationId(UUID.fromString("90bafd9b-6353-405e-989c-160d86df46fa"))
            .withEnableAutomaticUpgrade(true);
        model = BinaryData.fromObject(model).toObject(AgentUpgrade.class);
        Assertions.assertEquals("cgyncocpecf", model.desiredVersion());
        Assertions.assertEquals(UUID.fromString("90bafd9b-6353-405e-989c-160d86df46fa"), model.correlationId());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }
}
