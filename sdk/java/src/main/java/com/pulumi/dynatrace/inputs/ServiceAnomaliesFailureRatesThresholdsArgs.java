// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAnomaliesFailureRatesThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesFailureRatesThresholdsArgs Empty = new ServiceAnomaliesFailureRatesThresholdsArgs();

    @Import(name="sensitivity", required=true)
    private Output<String> sensitivity;

    public Output<String> sensitivity() {
        return this.sensitivity;
    }

    @Import(name="threshold", required=true)
    private Output<Integer> threshold;

    public Output<Integer> threshold() {
        return this.threshold;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private ServiceAnomaliesFailureRatesThresholdsArgs() {}

    private ServiceAnomaliesFailureRatesThresholdsArgs(ServiceAnomaliesFailureRatesThresholdsArgs $) {
        this.sensitivity = $.sensitivity;
        this.threshold = $.threshold;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesFailureRatesThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesFailureRatesThresholdsArgs $;

        public Builder() {
            $ = new ServiceAnomaliesFailureRatesThresholdsArgs();
        }

        public Builder(ServiceAnomaliesFailureRatesThresholdsArgs defaults) {
            $ = new ServiceAnomaliesFailureRatesThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sensitivity(Output<String> sensitivity) {
            $.sensitivity = sensitivity;
            return this;
        }

        public Builder sensitivity(String sensitivity) {
            return sensitivity(Output.of(sensitivity));
        }

        public Builder threshold(Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public ServiceAnomaliesFailureRatesThresholdsArgs build() {
            $.sensitivity = Objects.requireNonNull($.sensitivity, "expected parameter 'sensitivity' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}