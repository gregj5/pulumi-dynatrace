// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.SpanCaptureRuleMatchesMatch;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SpanCaptureRuleMatches {
    /**
     * @return Matching strategies for the Span
     * 
     */
    private List<SpanCaptureRuleMatchesMatch> matches;

    private SpanCaptureRuleMatches() {}
    /**
     * @return Matching strategies for the Span
     * 
     */
    public List<SpanCaptureRuleMatchesMatch> matches() {
        return this.matches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpanCaptureRuleMatches defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<SpanCaptureRuleMatchesMatch> matches;
        public Builder() {}
        public Builder(SpanCaptureRuleMatches defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matches = defaults.matches;
        }

        @CustomType.Setter
        public Builder matches(List<SpanCaptureRuleMatchesMatch> matches) {
            this.matches = Objects.requireNonNull(matches);
            return this;
        }
        public Builder matches(SpanCaptureRuleMatchesMatch... matches) {
            return matches(List.of(matches));
        }
        public SpanCaptureRuleMatches build() {
            final var o = new SpanCaptureRuleMatches();
            o.matches = matches;
            return o;
        }
    }
}