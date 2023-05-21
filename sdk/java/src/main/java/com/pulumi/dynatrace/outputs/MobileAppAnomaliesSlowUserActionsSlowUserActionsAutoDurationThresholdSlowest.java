// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest {
    private Double durationThreshold;
    private Double slowdownPercentage;

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest() {}
    public Double durationThreshold() {
        return this.durationThreshold;
    }
    public Double slowdownPercentage() {
        return this.slowdownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double durationThreshold;
        private Double slowdownPercentage;
        public Builder() {}
        public Builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationThreshold = defaults.durationThreshold;
    	      this.slowdownPercentage = defaults.slowdownPercentage;
        }

        @CustomType.Setter
        public Builder durationThreshold(Double durationThreshold) {
            this.durationThreshold = Objects.requireNonNull(durationThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder slowdownPercentage(Double slowdownPercentage) {
            this.slowdownPercentage = Objects.requireNonNull(slowdownPercentage);
            return this;
        }
        public MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest build() {
            final var o = new MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest();
            o.durationThreshold = durationThreshold;
            o.slowdownPercentage = slowdownPercentage;
            return o;
        }
    }
}