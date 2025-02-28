// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.implementation;

import com.azure.resourcemanager.networkanalytics.fluent.models.ListRoleAssignmentsInner;
import com.azure.resourcemanager.networkanalytics.fluent.models.RoleAssignmentDetailInner;
import com.azure.resourcemanager.networkanalytics.models.ListRoleAssignments;
import com.azure.resourcemanager.networkanalytics.models.RoleAssignmentDetail;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ListRoleAssignmentsImpl implements ListRoleAssignments {
    private ListRoleAssignmentsInner innerObject;

    private final com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager serviceManager;

    ListRoleAssignmentsImpl(ListRoleAssignmentsInner innerObject,
        com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int count() {
        return this.innerModel().count();
    }

    public List<RoleAssignmentDetail> roleAssignmentResponse() {
        List<RoleAssignmentDetailInner> inner = this.innerModel().roleAssignmentResponse();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new RoleAssignmentDetailImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ListRoleAssignmentsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager() {
        return this.serviceManager;
    }
}
