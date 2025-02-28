// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.models.SubscriberMessageDropStrategy;
import com.azure.resourcemanager.iotoperations.models.SubscriberQueueLimit;
import org.junit.jupiter.api.Assertions;

public final class SubscriberQueueLimitTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubscriberQueueLimit model
            = BinaryData.fromString("{\"length\":4003532112030419385,\"strategy\":\"DropOldest\"}")
                .toObject(SubscriberQueueLimit.class);
        Assertions.assertEquals(4003532112030419385L, model.length());
        Assertions.assertEquals(SubscriberMessageDropStrategy.DROP_OLDEST, model.strategy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubscriberQueueLimit model = new SubscriberQueueLimit().withLength(4003532112030419385L)
            .withStrategy(SubscriberMessageDropStrategy.DROP_OLDEST);
        model = BinaryData.fromObject(model).toObject(SubscriberQueueLimit.class);
        Assertions.assertEquals(4003532112030419385L, model.length());
        Assertions.assertEquals(SubscriberMessageDropStrategy.DROP_OLDEST, model.strategy());
    }
}
