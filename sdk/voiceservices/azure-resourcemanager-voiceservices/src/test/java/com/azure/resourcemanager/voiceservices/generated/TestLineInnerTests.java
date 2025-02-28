// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.voiceservices.fluent.models.TestLineInner;
import com.azure.resourcemanager.voiceservices.models.TestLinePurpose;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TestLineInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestLineInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"phoneNumber\":\"ypnddhsgcb\",\"purpose\":\"Manual\"},\"location\":\"hejkotynqgou\",\"tags\":{\"gakeqsr\":\"dlikwyqkgfgibma\",\"qqedqytbciqfou\":\"yb\"},\"id\":\"lmmnkzsmodmglo\",\"name\":\"gpbkwtmut\",\"type\":\"uqktap\"}")
            .toObject(TestLineInner.class);
        Assertions.assertEquals("hejkotynqgou", model.location());
        Assertions.assertEquals("dlikwyqkgfgibma", model.tags().get("gakeqsr"));
        Assertions.assertEquals("ypnddhsgcb", model.phoneNumber());
        Assertions.assertEquals(TestLinePurpose.MANUAL, model.purpose());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestLineInner model = new TestLineInner().withLocation("hejkotynqgou")
            .withTags(mapOf("gakeqsr", "dlikwyqkgfgibma", "qqedqytbciqfou", "yb"))
            .withPhoneNumber("ypnddhsgcb")
            .withPurpose(TestLinePurpose.MANUAL);
        model = BinaryData.fromObject(model).toObject(TestLineInner.class);
        Assertions.assertEquals("hejkotynqgou", model.location());
        Assertions.assertEquals("dlikwyqkgfgibma", model.tags().get("gakeqsr"));
        Assertions.assertEquals("ypnddhsgcb", model.phoneNumber());
        Assertions.assertEquals(TestLinePurpose.MANUAL, model.purpose());
    }

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
