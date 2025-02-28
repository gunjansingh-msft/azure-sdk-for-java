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
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPeriod;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CommitmentPlansCreateOrUpdatePlanMockTests {
    @Test
    public void testCreateOrUpdatePlan() throws Exception {
        String responseStr
            = "{\"etag\":\"vibidmhmwffpl\",\"kind\":\"u\",\"sku\":{\"name\":\"pckc\",\"tier\":\"Free\",\"size\":\"weyoxoy\",\"family\":\"k\",\"capacity\":420064622},\"tags\":{\"shbraga\":\"moiroqb\",\"vbopfppdbwnu\":\"yyrmfsvbp\",\"fdmmcpug\":\"gahxkumasjcaa\",\"hoqhnl\":\"ehqepvufhbzehe\"},\"location\":\"nbldxeaclgschori\",\"properties\":{\"provisioningState\":\"Succeeded\",\"commitmentPlanGuid\":\"rmoucsofl\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"iyfc\",\"current\":{\"tier\":\"eolhbhlvbmx\",\"count\":3919977,\"quota\":{\"quantity\":4601909388448494407,\"unit\":\"cudfbsfarfsiowl\"},\"startDate\":\"xnq\",\"endDate\":\"wgfstmhqykizm\"},\"autoRenew\":true,\"next\":{\"tier\":\"afclu\",\"count\":1013116019,\"quota\":{\"quantity\":8904305259908062937,\"unit\":\"im\"},\"startDate\":\"vwg\",\"endDate\":\"wpbmzgwesydsxwef\"},\"last\":{\"tier\":\"cbvopwndyqleallk\",\"count\":1225153333,\"quota\":{\"quantity\":571481130330646230,\"unit\":\"kxxpvbrd\"},\"startDate\":\"mzsyzfhotl\",\"endDate\":\"k\"},\"provisioningIssues\":[\"ch\",\"nsjlpjrtws\",\"hv\",\"uic\"]},\"id\":\"hvtrrmhwrbfdpyf\",\"name\":\"ubhvj\",\"type\":\"lrocuyzlwh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CommitmentPlan response = manager.commitmentPlans()
            .definePlan("arfdlpukhpyrnei")
            .withExistingResourceGroup("ta")
            .withRegion("f")
            .withTags(mapOf("duugwbsre", "uevrhrljyoogwxhn", "nlvhhtklnvnafvv", "rfqkfuar"))
            .withKind("khnmgbrou")
            .withSku(new Sku().withName("dbhfhp")
                .withTier(SkuTier.BASIC)
                .withSize("jzoywjxhp")
                .withFamily("lontacnpq")
                .withCapacity(68476839))
            .withProperties(new CommitmentPlanProperties().withCommitmentPlanGuid("bo")
                .withHostingModel(HostingModel.PROVISIONED_WEB)
                .withPlanType("xypokkhmi")
                .withCurrent(new CommitmentPeriod().withTier("ymc").withCount(331015750))
                .withAutoRenew(false)
                .withNext(new CommitmentPeriod().withTier("mxxdtddmflh").withCount(334709748)))
            .create();

        Assertions.assertEquals("u", response.kind());
        Assertions.assertEquals("pckc", response.sku().name());
        Assertions.assertEquals(SkuTier.FREE, response.sku().tier());
        Assertions.assertEquals("weyoxoy", response.sku().size());
        Assertions.assertEquals("k", response.sku().family());
        Assertions.assertEquals(420064622, response.sku().capacity());
        Assertions.assertEquals("moiroqb", response.tags().get("shbraga"));
        Assertions.assertEquals("nbldxeaclgschori", response.location());
        Assertions.assertEquals("rmoucsofl", response.properties().commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, response.properties().hostingModel());
        Assertions.assertEquals("iyfc", response.properties().planType());
        Assertions.assertEquals("eolhbhlvbmx", response.properties().current().tier());
        Assertions.assertEquals(3919977, response.properties().current().count());
        Assertions.assertEquals(true, response.properties().autoRenew());
        Assertions.assertEquals("afclu", response.properties().next().tier());
        Assertions.assertEquals(1013116019, response.properties().next().count());
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
