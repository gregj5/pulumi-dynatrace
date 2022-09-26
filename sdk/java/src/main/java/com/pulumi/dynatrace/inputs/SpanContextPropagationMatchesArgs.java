// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.SpanContextPropagationMatchesMatchArgs;
import java.util.List;
import java.util.Objects;


public final class SpanContextPropagationMatchesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpanContextPropagationMatchesArgs Empty = new SpanContextPropagationMatchesArgs();

    /**
     * Matching strategies for the Span
     * 
     */
    @Import(name="matches", required=true)
    private Output<List<SpanContextPropagationMatchesMatchArgs>> matches;

    /**
     * @return Matching strategies for the Span
     * 
     */
    public Output<List<SpanContextPropagationMatchesMatchArgs>> matches() {
        return this.matches;
    }

    private SpanContextPropagationMatchesArgs() {}

    private SpanContextPropagationMatchesArgs(SpanContextPropagationMatchesArgs $) {
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpanContextPropagationMatchesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpanContextPropagationMatchesArgs $;

        public Builder() {
            $ = new SpanContextPropagationMatchesArgs();
        }

        public Builder(SpanContextPropagationMatchesArgs defaults) {
            $ = new SpanContextPropagationMatchesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matches Matching strategies for the Span
         * 
         * @return builder
         * 
         */
        public Builder matches(Output<List<SpanContextPropagationMatchesMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches Matching strategies for the Span
         * 
         * @return builder
         * 
         */
        public Builder matches(List<SpanContextPropagationMatchesMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches Matching strategies for the Span
         * 
         * @return builder
         * 
         */
        public Builder matches(SpanContextPropagationMatchesMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public SpanContextPropagationMatchesArgs build() {
            $.matches = Objects.requireNonNull($.matches, "expected parameter 'matches' to be non-null");
            return $;
        }
    }

}