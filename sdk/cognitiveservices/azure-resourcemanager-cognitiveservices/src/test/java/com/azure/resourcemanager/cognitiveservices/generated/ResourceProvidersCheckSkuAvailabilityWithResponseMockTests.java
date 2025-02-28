// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CheckSkuAvailabilityParameter;
import com.azure.resourcemanager.cognitiveservices.models.SkuAvailabilityListResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceProvidersCheckSkuAvailabilityWithResponseMockTests {
    @Test
    public void testCheckSkuAvailabilityWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"kind\":\"petogebjox\",\"type\":\"hvnh\",\"skuName\":\"brqnkkzjcjb\",\"skuAvailable\":true,\"reason\":\"ehvvib\",\"message\":\"jj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SkuAvailabilityListResult response = manager.resourceProviders()
            .checkSkuAvailabilityWithResponse("u",
                new CheckSkuAvailabilityParameter().withSkus(Arrays.asList("gqibrtalmetttw"))
                    .withKind("dslqxihhrmooizqs")
                    .withType("ypxiutcxap"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("petogebjox", response.value().get(0).kind());
        Assertions.assertEquals("hvnh", response.value().get(0).type());
        Assertions.assertEquals("brqnkkzjcjb", response.value().get(0).skuName());
        Assertions.assertEquals(true, response.value().get(0).skuAvailable());
        Assertions.assertEquals("ehvvib", response.value().get(0).reason());
        Assertions.assertEquals("jj", response.value().get(0).message());
    }
}
