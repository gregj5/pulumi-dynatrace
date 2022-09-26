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


public final class DatabaseAnomaliesResponseTimeAutoArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAnomaliesResponseTimeAutoArgs Empty = new DatabaseAnomaliesResponseTimeAutoArgs();

    /**
     * Configuration for anomalies regarding load drops and spikes
     * 
     */
    @Import(name="load", required=true)
    private Output<String> load;

    /**
     * @return Configuration for anomalies regarding load drops and spikes
     * 
     */
    public Output<String> load() {
        return this.load;
    }

    @Import(name="milliseconds", required=true)
    private Output<Integer> milliseconds;

    public Output<Integer> milliseconds() {
        return this.milliseconds;
    }

    @Import(name="percent", required=true)
    private Output<Integer> percent;

    public Output<Integer> percent() {
        return this.percent;
    }

    @Import(name="slowestMilliseconds", required=true)
    private Output<Integer> slowestMilliseconds;

    public Output<Integer> slowestMilliseconds() {
        return this.slowestMilliseconds;
    }

    @Import(name="slowestPercent", required=true)
    private Output<Integer> slowestPercent;

    public Output<Integer> slowestPercent() {
        return this.slowestPercent;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private DatabaseAnomaliesResponseTimeAutoArgs() {}

    private DatabaseAnomaliesResponseTimeAutoArgs(DatabaseAnomaliesResponseTimeAutoArgs $) {
        this.load = $.load;
        this.milliseconds = $.milliseconds;
        this.percent = $.percent;
        this.slowestMilliseconds = $.slowestMilliseconds;
        this.slowestPercent = $.slowestPercent;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAnomaliesResponseTimeAutoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAnomaliesResponseTimeAutoArgs $;

        public Builder() {
            $ = new DatabaseAnomaliesResponseTimeAutoArgs();
        }

        public Builder(DatabaseAnomaliesResponseTimeAutoArgs defaults) {
            $ = new DatabaseAnomaliesResponseTimeAutoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param load Configuration for anomalies regarding load drops and spikes
         * 
         * @return builder
         * 
         */
        public Builder load(Output<String> load) {
            $.load = load;
            return this;
        }

        /**
         * @param load Configuration for anomalies regarding load drops and spikes
         * 
         * @return builder
         * 
         */
        public Builder load(String load) {
            return load(Output.of(load));
        }

        public Builder milliseconds(Output<Integer> milliseconds) {
            $.milliseconds = milliseconds;
            return this;
        }

        public Builder milliseconds(Integer milliseconds) {
            return milliseconds(Output.of(milliseconds));
        }

        public Builder percent(Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public Builder slowestMilliseconds(Output<Integer> slowestMilliseconds) {
            $.slowestMilliseconds = slowestMilliseconds;
            return this;
        }

        public Builder slowestMilliseconds(Integer slowestMilliseconds) {
            return slowestMilliseconds(Output.of(slowestMilliseconds));
        }

        public Builder slowestPercent(Output<Integer> slowestPercent) {
            $.slowestPercent = slowestPercent;
            return this;
        }

        public Builder slowestPercent(Integer slowestPercent) {
            return slowestPercent(Output.of(slowestPercent));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public DatabaseAnomaliesResponseTimeAutoArgs build() {
            $.load = Objects.requireNonNull($.load, "expected parameter 'load' to be non-null");
            $.milliseconds = Objects.requireNonNull($.milliseconds, "expected parameter 'milliseconds' to be non-null");
            $.percent = Objects.requireNonNull($.percent, "expected parameter 'percent' to be non-null");
            $.slowestMilliseconds = Objects.requireNonNull($.slowestMilliseconds, "expected parameter 'slowestMilliseconds' to be non-null");
            $.slowestPercent = Objects.requireNonNull($.slowestPercent, "expected parameter 'slowestPercent' to be non-null");
            return $;
        }
    }

}