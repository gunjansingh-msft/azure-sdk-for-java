// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.IpRule;
import com.azure.resourcemanager.signalr.models.NetworkAcl;
import com.azure.resourcemanager.signalr.models.PrivateEndpointAcl;
import com.azure.resourcemanager.signalr.models.SignalRNetworkACLs;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SignalRNetworkACLsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SignalRNetworkACLs model = BinaryData.fromString(
            "{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"Trace\",\"Trace\"],\"deny\":[\"RESTAPI\",\"Trace\",\"ServerConnection\"]},\"privateEndpoints\":[{\"name\":\"wycz\",\"allow\":[\"ClientConnection\",\"RESTAPI\"],\"deny\":[\"ServerConnection\",\"Trace\",\"RESTAPI\",\"ClientConnection\"]},{\"name\":\"hyus\",\"allow\":[\"ServerConnection\",\"Trace\"],\"deny\":[\"ServerConnection\",\"ServerConnection\",\"RESTAPI\",\"RESTAPI\"]}],\"ipRules\":[{\"value\":\"x\",\"action\":\"Allow\"}]}")
            .toObject(SignalRNetworkACLs.class);
        Assertions.assertEquals(AclAction.DENY, model.defaultAction());
        Assertions.assertEquals(SignalRRequestType.TRACE, model.publicNetwork().allow().get(0));
        Assertions.assertEquals(SignalRRequestType.RESTAPI, model.publicNetwork().deny().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION, model.privateEndpoints().get(0).allow().get(0));
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("wycz", model.privateEndpoints().get(0).name());
        Assertions.assertEquals("x", model.ipRules().get(0).value());
        Assertions.assertEquals(AclAction.ALLOW, model.ipRules().get(0).action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SignalRNetworkACLs model
            = new SignalRNetworkACLs().withDefaultAction(AclAction.DENY)
                .withPublicNetwork(new NetworkAcl()
                    .withAllow(Arrays.asList(SignalRRequestType.TRACE, SignalRRequestType.TRACE))
                    .withDeny(
                        Arrays.asList(SignalRRequestType.RESTAPI, SignalRRequestType.TRACE,
                            SignalRRequestType.SERVER_CONNECTION)))
                .withPrivateEndpoints(Arrays.asList(new PrivateEndpointAcl()
                    .withAllow(Arrays.asList(SignalRRequestType.CLIENT_CONNECTION, SignalRRequestType.RESTAPI))
                    .withDeny(
                        Arrays.asList(SignalRRequestType.SERVER_CONNECTION, SignalRRequestType.TRACE,
                            SignalRRequestType.RESTAPI, SignalRRequestType.CLIENT_CONNECTION))
                    .withName("wycz"),
                    new PrivateEndpointAcl()
                        .withAllow(Arrays.asList(SignalRRequestType.SERVER_CONNECTION, SignalRRequestType.TRACE))
                        .withDeny(
                            Arrays.asList(SignalRRequestType.SERVER_CONNECTION, SignalRRequestType.SERVER_CONNECTION,
                                SignalRRequestType.RESTAPI, SignalRRequestType.RESTAPI))
                        .withName("hyus")))
                .withIpRules(Arrays.asList(new IpRule().withValue("x").withAction(AclAction.ALLOW)));
        model = BinaryData.fromObject(model).toObject(SignalRNetworkACLs.class);
        Assertions.assertEquals(AclAction.DENY, model.defaultAction());
        Assertions.assertEquals(SignalRRequestType.TRACE, model.publicNetwork().allow().get(0));
        Assertions.assertEquals(SignalRRequestType.RESTAPI, model.publicNetwork().deny().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION, model.privateEndpoints().get(0).allow().get(0));
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("wycz", model.privateEndpoints().get(0).name());
        Assertions.assertEquals("x", model.ipRules().get(0).value());
        Assertions.assertEquals(AclAction.ALLOW, model.ipRules().get(0).action());
    }
}
