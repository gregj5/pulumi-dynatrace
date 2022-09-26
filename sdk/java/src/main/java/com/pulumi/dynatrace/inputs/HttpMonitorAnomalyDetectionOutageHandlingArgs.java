// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpMonitorAnomalyDetectionOutageHandlingArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpMonitorAnomalyDetectionOutageHandlingArgs Empty = new HttpMonitorAnomalyDetectionOutageHandlingArgs();

    @Import(name="globalOutage")
    private @Nullable Output<Boolean> globalOutage;

    public Optional<Output<Boolean>> globalOutage() {
        return Optional.ofNullable(this.globalOutage);
    }

    @Import(name="localOutage")
    private @Nullable Output<Boolean> localOutage;

    public Optional<Output<Boolean>> localOutage() {
        return Optional.ofNullable(this.localOutage);
    }

    @Import(name="localOutagePolicies")
    private @Nullable Output<List<HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs>> localOutagePolicies;

    public Optional<Output<List<HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs>>> localOutagePolicies() {
        return Optional.ofNullable(this.localOutagePolicies);
    }

    @Import(name="retryOnError")
    private @Nullable Output<Boolean> retryOnError;

    public Optional<Output<Boolean>> retryOnError() {
        return Optional.ofNullable(this.retryOnError);
    }

    private HttpMonitorAnomalyDetectionOutageHandlingArgs() {}

    private HttpMonitorAnomalyDetectionOutageHandlingArgs(HttpMonitorAnomalyDetectionOutageHandlingArgs $) {
        this.globalOutage = $.globalOutage;
        this.localOutage = $.localOutage;
        this.localOutagePolicies = $.localOutagePolicies;
        this.retryOnError = $.retryOnError;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpMonitorAnomalyDetectionOutageHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpMonitorAnomalyDetectionOutageHandlingArgs $;

        public Builder() {
            $ = new HttpMonitorAnomalyDetectionOutageHandlingArgs();
        }

        public Builder(HttpMonitorAnomalyDetectionOutageHandlingArgs defaults) {
            $ = new HttpMonitorAnomalyDetectionOutageHandlingArgs(Objects.requireNonNull(defaults));
        }

        public Builder globalOutage(@Nullable Output<Boolean> globalOutage) {
            $.globalOutage = globalOutage;
            return this;
        }

        public Builder globalOutage(Boolean globalOutage) {
            return globalOutage(Output.of(globalOutage));
        }

        public Builder localOutage(@Nullable Output<Boolean> localOutage) {
            $.localOutage = localOutage;
            return this;
        }

        public Builder localOutage(Boolean localOutage) {
            return localOutage(Output.of(localOutage));
        }

        public Builder localOutagePolicies(@Nullable Output<List<HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs>> localOutagePolicies) {
            $.localOutagePolicies = localOutagePolicies;
            return this;
        }

        public Builder localOutagePolicies(List<HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs> localOutagePolicies) {
            return localOutagePolicies(Output.of(localOutagePolicies));
        }

        public Builder localOutagePolicies(HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs... localOutagePolicies) {
            return localOutagePolicies(List.of(localOutagePolicies));
        }

        public Builder retryOnError(@Nullable Output<Boolean> retryOnError) {
            $.retryOnError = retryOnError;
            return this;
        }

        public Builder retryOnError(Boolean retryOnError) {
            return retryOnError(Output.of(retryOnError));
        }

        public HttpMonitorAnomalyDetectionOutageHandlingArgs build() {
            return $;
        }
    }

}