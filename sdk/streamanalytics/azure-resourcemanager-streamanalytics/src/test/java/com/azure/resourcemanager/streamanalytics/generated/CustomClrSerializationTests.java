// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.CustomClrSerialization;
import org.junit.jupiter.api.Assertions;

public final class CustomClrSerializationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomClrSerialization model = BinaryData.fromString(
            "{\"type\":\"CustomClr\",\"properties\":{\"serializationDllPath\":\"lwwrl\",\"serializationClassName\":\"m\"}}")
            .toObject(CustomClrSerialization.class);
        Assertions.assertEquals("lwwrl", model.serializationDllPath());
        Assertions.assertEquals("m", model.serializationClassName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomClrSerialization model
            = new CustomClrSerialization().withSerializationDllPath("lwwrl").withSerializationClassName("m");
        model = BinaryData.fromObject(model).toObject(CustomClrSerialization.class);
        Assertions.assertEquals("lwwrl", model.serializationDllPath());
        Assertions.assertEquals("m", model.serializationClassName());
    }
}
