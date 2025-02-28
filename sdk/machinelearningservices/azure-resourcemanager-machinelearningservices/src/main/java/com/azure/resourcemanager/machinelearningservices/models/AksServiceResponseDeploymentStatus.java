// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The deployment status. */
@Immutable
public final class AksServiceResponseDeploymentStatus extends AksReplicaStatus {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AksServiceResponseDeploymentStatus.class);

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseDeploymentStatus withDesiredReplicas(Integer desiredReplicas) {
        super.withDesiredReplicas(desiredReplicas);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseDeploymentStatus withUpdatedReplicas(Integer updatedReplicas) {
        super.withUpdatedReplicas(updatedReplicas);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseDeploymentStatus withAvailableReplicas(Integer availableReplicas) {
        super.withAvailableReplicas(availableReplicas);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseDeploymentStatus withError(AksReplicaStatusError error) {
        super.withError(error);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
