// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DomainAvailabilityInner;
import org.junit.jupiter.api.Assertions;

public final class DomainAvailabilityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DomainAvailabilityInner model = BinaryData.fromString(
            "{\"isSubdomainAvailable\":false,\"reason\":\"tbobz\",\"subdomainName\":\"pcjwv\",\"type\":\"dldwmgxc\",\"kind\":\"slpmutwuo\"}")
            .toObject(DomainAvailabilityInner.class);
        Assertions.assertEquals(false, model.isSubdomainAvailable());
        Assertions.assertEquals("tbobz", model.reason());
        Assertions.assertEquals("pcjwv", model.subdomainName());
        Assertions.assertEquals("dldwmgxc", model.type());
        Assertions.assertEquals("slpmutwuo", model.kind());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DomainAvailabilityInner model = new DomainAvailabilityInner().withIsSubdomainAvailable(false)
            .withReason("tbobz")
            .withSubdomainName("pcjwv")
            .withType("dldwmgxc")
            .withKind("slpmutwuo");
        model = BinaryData.fromObject(model).toObject(DomainAvailabilityInner.class);
        Assertions.assertEquals(false, model.isSubdomainAvailable());
        Assertions.assertEquals("tbobz", model.reason());
        Assertions.assertEquals("pcjwv", model.subdomainName());
        Assertions.assertEquals("dldwmgxc", model.type());
        Assertions.assertEquals("slpmutwuo", model.kind());
    }
}
