// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.AgentPoolPatchParameters;
import com.azure.resourcemanager.networkcloud.models.AgentPoolUpgradeSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AgentPoolPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentPoolPatchParameters model = BinaryData.fromString(
            "{\"properties\":{\"count\":1064127963046156604,\"upgradeSettings\":{\"maxSurge\":\"fsv\"}},\"tags\":{\"gahxkumasjcaa\":\"vbopfppdbwnu\",\"ehqepvufhbzehe\":\"fdmmcpug\"}}")
            .toObject(AgentPoolPatchParameters.class);
        Assertions.assertEquals("vbopfppdbwnu", model.tags().get("gahxkumasjcaa"));
        Assertions.assertEquals(1064127963046156604L, model.count());
        Assertions.assertEquals("fsv", model.upgradeSettings().maxSurge());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentPoolPatchParameters model = new AgentPoolPatchParameters()
            .withTags(mapOf("gahxkumasjcaa", "vbopfppdbwnu", "ehqepvufhbzehe", "fdmmcpug"))
            .withCount(1064127963046156604L)
            .withUpgradeSettings(new AgentPoolUpgradeSettings().withMaxSurge("fsv"));
        model = BinaryData.fromObject(model).toObject(AgentPoolPatchParameters.class);
        Assertions.assertEquals("vbopfppdbwnu", model.tags().get("gahxkumasjcaa"));
        Assertions.assertEquals(1064127963046156604L, model.count());
        Assertions.assertEquals("fsv", model.upgradeSettings().maxSurge());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
