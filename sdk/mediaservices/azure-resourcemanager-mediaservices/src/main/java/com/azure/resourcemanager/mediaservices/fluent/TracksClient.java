// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetTrackInner;

/**
 * An instance of this class provides access to all the operations defined in TracksClient.
 */
public interface TracksClient {
    /**
     * List Tracks in the Asset
     * 
     * Lists the Tracks in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetTrack items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetTrackInner> list(String resourceGroupName, String accountName, String assetName);

    /**
     * List Tracks in the Asset
     * 
     * Lists the Tracks in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetTrack items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetTrackInner> list(String resourceGroupName, String accountName, String assetName,
        Context context);

    /**
     * Get a Track
     * 
     * Get the details of a Track in the Asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Track in the Asset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetTrackInner> getWithResponse(String resourceGroupName, String accountName, String assetName,
        String trackName, Context context);

    /**
     * Get a Track
     * 
     * Get the details of a Track in the Asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Track in the Asset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetTrackInner get(String resourceGroupName, String accountName, String assetName, String trackName);

    /**
     * Create or update a Track
     * 
     * Create or update a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetTrackInner>, AssetTrackInner> beginCreateOrUpdate(String resourceGroupName,
        String accountName, String assetName, String trackName, AssetTrackInner parameters);

    /**
     * Create or update a Track
     * 
     * Create or update a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetTrackInner>, AssetTrackInner> beginCreateOrUpdate(String resourceGroupName,
        String accountName, String assetName, String trackName, AssetTrackInner parameters, Context context);

    /**
     * Create or update a Track
     * 
     * Create or update a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetTrackInner createOrUpdate(String resourceGroupName, String accountName, String assetName, String trackName,
        AssetTrackInner parameters);

    /**
     * Create or update a Track
     * 
     * Create or update a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetTrackInner createOrUpdate(String resourceGroupName, String accountName, String assetName, String trackName,
        AssetTrackInner parameters, Context context);

    /**
     * Delete a Track
     * 
     * Deletes a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String assetName,
        String trackName);

    /**
     * Delete a Track
     * 
     * Deletes a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String assetName,
        String trackName, Context context);

    /**
     * Delete a Track
     * 
     * Deletes a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String assetName, String trackName);

    /**
     * Delete a Track
     * 
     * Deletes a Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String assetName, String trackName, Context context);

    /**
     * Update an Track
     * 
     * Updates an existing Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetTrackInner>, AssetTrackInner> beginUpdate(String resourceGroupName, String accountName,
        String assetName, String trackName, AssetTrackInner parameters);

    /**
     * Update an Track
     * 
     * Updates an existing Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetTrackInner>, AssetTrackInner> beginUpdate(String resourceGroupName, String accountName,
        String assetName, String trackName, AssetTrackInner parameters, Context context);

    /**
     * Update an Track
     * 
     * Updates an existing Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetTrackInner update(String resourceGroupName, String accountName, String assetName, String trackName,
        AssetTrackInner parameters);

    /**
     * Update an Track
     * 
     * Updates an existing Track in the asset.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Track resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetTrackInner update(String resourceGroupName, String accountName, String assetName, String trackName,
        AssetTrackInner parameters, Context context);

    /**
     * Update the track data
     * 
     * Update the track data. Call this API after any changes are made to the track data stored in the asset container.
     * For example, you have modified the WebVTT captions file in the Azure blob storage container for the asset,
     * viewers will not see the new version of the captions unless this API is called. Note, the changes may not be
     * reflected immediately. CDN cache may also need to be purged if applicable.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateTrackData(String resourceGroupName, String accountName,
        String assetName, String trackName);

    /**
     * Update the track data
     * 
     * Update the track data. Call this API after any changes are made to the track data stored in the asset container.
     * For example, you have modified the WebVTT captions file in the Azure blob storage container for the asset,
     * viewers will not see the new version of the captions unless this API is called. Note, the changes may not be
     * reflected immediately. CDN cache may also need to be purged if applicable.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateTrackData(String resourceGroupName, String accountName,
        String assetName, String trackName, Context context);

    /**
     * Update the track data
     * 
     * Update the track data. Call this API after any changes are made to the track data stored in the asset container.
     * For example, you have modified the WebVTT captions file in the Azure blob storage container for the asset,
     * viewers will not see the new version of the captions unless this API is called. Note, the changes may not be
     * reflected immediately. CDN cache may also need to be purged if applicable.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateTrackData(String resourceGroupName, String accountName, String assetName, String trackName);

    /**
     * Update the track data
     * 
     * Update the track data. Call this API after any changes are made to the track data stored in the asset container.
     * For example, you have modified the WebVTT captions file in the Azure blob storage container for the asset,
     * viewers will not see the new version of the captions unless this API is called. Note, the changes may not be
     * reflected immediately. CDN cache may also need to be purged if applicable.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateTrackData(String resourceGroupName, String accountName, String assetName, String trackName,
        Context context);
}
