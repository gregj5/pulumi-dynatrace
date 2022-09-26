// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomAnomaliesScopeScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomAnomaliesScopeScopeArgs Empty = new CustomAnomaliesScopeScopeArgs();

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private CustomAnomaliesScopeScopeArgs() {}

    private CustomAnomaliesScopeScopeArgs(CustomAnomaliesScopeScopeArgs $) {
        this.type = $.type;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomAnomaliesScopeScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAnomaliesScopeScopeArgs $;

        public Builder() {
            $ = new CustomAnomaliesScopeScopeArgs();
        }

        public Builder(CustomAnomaliesScopeScopeArgs defaults) {
            $ = new CustomAnomaliesScopeScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public CustomAnomaliesScopeScopeArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}