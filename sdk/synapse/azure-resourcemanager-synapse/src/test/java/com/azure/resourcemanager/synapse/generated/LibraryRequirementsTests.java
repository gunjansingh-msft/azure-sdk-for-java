// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.LibraryRequirements;
import org.junit.jupiter.api.Assertions;

public final class LibraryRequirementsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LibraryRequirements model
            = BinaryData.fromString("{\"time\":\"2021-01-26T18:01:46Z\",\"content\":\"nqnm\",\"filename\":\"ngz\"}")
                .toObject(LibraryRequirements.class);
        Assertions.assertEquals("nqnm", model.content());
        Assertions.assertEquals("ngz", model.filename());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LibraryRequirements model = new LibraryRequirements().withContent("nqnm").withFilename("ngz");
        model = BinaryData.fromObject(model).toObject(LibraryRequirements.class);
        Assertions.assertEquals("nqnm", model.content());
        Assertions.assertEquals("ngz", model.filename());
    }
}
