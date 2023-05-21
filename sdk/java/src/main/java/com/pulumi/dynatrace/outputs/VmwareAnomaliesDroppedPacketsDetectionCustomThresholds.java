// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VmwareAnomaliesDroppedPacketsDetectionCustomThresholds {
    private Integer droppedPacketsPerSecond;

    private VmwareAnomaliesDroppedPacketsDetectionCustomThresholds() {}
    public Integer droppedPacketsPerSecond() {
        return this.droppedPacketsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareAnomaliesDroppedPacketsDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer droppedPacketsPerSecond;
        public Builder() {}
        public Builder(VmwareAnomaliesDroppedPacketsDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.droppedPacketsPerSecond = defaults.droppedPacketsPerSecond;
        }

        @CustomType.Setter
        public Builder droppedPacketsPerSecond(Integer droppedPacketsPerSecond) {
            this.droppedPacketsPerSecond = Objects.requireNonNull(droppedPacketsPerSecond);
            return this;
        }
        public VmwareAnomaliesDroppedPacketsDetectionCustomThresholds build() {
            final var o = new VmwareAnomaliesDroppedPacketsDetectionCustomThresholds();
            o.droppedPacketsPerSecond = droppedPacketsPerSecond;
            return o;
        }
    }
}