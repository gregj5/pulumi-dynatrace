// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


public final class ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs Empty = new ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs();

    @Import(name="minutesAbnormalState", required=true)
    private Output<Integer> minutesAbnormalState;

    public Output<Integer> minutesAbnormalState() {
        return this.minutesAbnormalState;
    }

    @Import(name="requestsPerMinute", required=true)
    private Output<Double> requestsPerMinute;

    public Output<Double> requestsPerMinute() {
        return this.requestsPerMinute;
    }

    private ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs() {}

    private ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs(ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs $) {
        this.minutesAbnormalState = $.minutesAbnormalState;
        this.requestsPerMinute = $.requestsPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs $;

        public Builder() {
            $ = new ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs();
        }

        public Builder(ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs defaults) {
            $ = new ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder minutesAbnormalState(Output<Integer> minutesAbnormalState) {
            $.minutesAbnormalState = minutesAbnormalState;
            return this;
        }

        public Builder minutesAbnormalState(Integer minutesAbnormalState) {
            return minutesAbnormalState(Output.of(minutesAbnormalState));
        }

        public Builder requestsPerMinute(Output<Double> requestsPerMinute) {
            $.requestsPerMinute = requestsPerMinute;
            return this;
        }

        public Builder requestsPerMinute(Double requestsPerMinute) {
            return requestsPerMinute(Output.of(requestsPerMinute));
        }

        public ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtectionArgs build() {
            $.minutesAbnormalState = Objects.requireNonNull($.minutesAbnormalState, "expected parameter 'minutesAbnormalState' to be non-null");
            $.requestsPerMinute = Objects.requireNonNull($.requestsPerMinute, "expected parameter 'requestsPerMinute' to be non-null");
            return $;
        }
    }

}