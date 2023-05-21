// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.DiskSpecificAnomaliesV2DiskLowSpaceDetectionCustomThresholds;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskSpecificAnomaliesV2DiskLowSpaceDetection {
    /**
     * @return no documentation available
     * 
     */
    private @Nullable DiskSpecificAnomaliesV2DiskLowSpaceDetectionCustomThresholds customThresholds;
    /**
     * @return Detection mode for low disk space
     * 
     */
    private @Nullable String detectionMode;
    /**
     * @return Detect low disk space
     * 
     */
    private Boolean enabled;

    private DiskSpecificAnomaliesV2DiskLowSpaceDetection() {}
    /**
     * @return no documentation available
     * 
     */
    public Optional<DiskSpecificAnomaliesV2DiskLowSpaceDetectionCustomThresholds> customThresholds() {
        return Optional.ofNullable(this.customThresholds);
    }
    /**
     * @return Detection mode for low disk space
     * 
     */
    public Optional<String> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }
    /**
     * @return Detect low disk space
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSpecificAnomaliesV2DiskLowSpaceDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DiskSpecificAnomaliesV2DiskLowSpaceDetectionCustomThresholds customThresholds;
        private @Nullable String detectionMode;
        private Boolean enabled;
        public Builder() {}
        public Builder(DiskSpecificAnomaliesV2DiskLowSpaceDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customThresholds = defaults.customThresholds;
    	      this.detectionMode = defaults.detectionMode;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customThresholds(@Nullable DiskSpecificAnomaliesV2DiskLowSpaceDetectionCustomThresholds customThresholds) {
            this.customThresholds = customThresholds;
            return this;
        }
        @CustomType.Setter
        public Builder detectionMode(@Nullable String detectionMode) {
            this.detectionMode = detectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public DiskSpecificAnomaliesV2DiskLowSpaceDetection build() {
            final var o = new DiskSpecificAnomaliesV2DiskLowSpaceDetection();
            o.customThresholds = customThresholds;
            o.detectionMode = detectionMode;
            o.enabled = enabled;
            return o;
        }
    }
}