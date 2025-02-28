// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.generated;

import com.azure.resourcemanager.containerorchestratorruntime.models.AdvertiseMode;
import com.azure.resourcemanager.containerorchestratorruntime.models.LoadBalancerProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for LoadBalancers CreateOrUpdate.
 */
public final class LoadBalancersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-03-01/LoadBalancers_CreateOrUpdate.json
     */
    /**
     * Sample code: LoadBalancers_CreateOrUpdate.
     * 
     * @param manager Entry point to ContainerOrchestratorRuntimeManager.
     */
    public static void loadBalancersCreateOrUpdate(
        com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager manager) {
        manager.loadBalancers()
            .define("testlb")
            .withExistingResourceUri(
                "subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/example/providers/Microsoft.Kubernetes/connectedClusters/cluster1")
            .withProperties(new LoadBalancerProperties()
                .withAddresses(Arrays.asList("192.168.50.1/24", "192.168.51.2-192.168.51.10"))
                .withServiceSelector(mapOf("app", "frontend"))
                .withAdvertiseMode(AdvertiseMode.ARP))
            .create();
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
