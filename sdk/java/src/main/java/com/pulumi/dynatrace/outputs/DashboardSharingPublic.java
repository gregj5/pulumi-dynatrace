// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DashboardSharingPublic {
    /**
     * @return A list of management zones that can display data on the publicly shared dashboard.
     * 
     */
    private List<String> managementZones;

    private DashboardSharingPublic() {}
    /**
     * @return A list of management zones that can display data on the publicly shared dashboard.
     * 
     */
    public List<String> managementZones() {
        return this.managementZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSharingPublic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> managementZones;
        public Builder() {}
        public Builder(DashboardSharingPublic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementZones = defaults.managementZones;
        }

        @CustomType.Setter
        public Builder managementZones(List<String> managementZones) {
            this.managementZones = Objects.requireNonNull(managementZones);
            return this;
        }
        public Builder managementZones(String... managementZones) {
            return managementZones(List.of(managementZones));
        }
        public DashboardSharingPublic build() {
            final var o = new DashboardSharingPublic();
            o.managementZones = managementZones;
            return o;
        }
    }
}