// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.KubernetesEventPatternsEventPattern;
import java.util.List;
import java.util.Objects;

@CustomType
public final class KubernetesEventPatterns {
    private List<KubernetesEventPatternsEventPattern> eventPatterns;

    private KubernetesEventPatterns() {}
    public List<KubernetesEventPatternsEventPattern> eventPatterns() {
        return this.eventPatterns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesEventPatterns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<KubernetesEventPatternsEventPattern> eventPatterns;
        public Builder() {}
        public Builder(KubernetesEventPatterns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventPatterns = defaults.eventPatterns;
        }

        @CustomType.Setter
        public Builder eventPatterns(List<KubernetesEventPatternsEventPattern> eventPatterns) {
            this.eventPatterns = Objects.requireNonNull(eventPatterns);
            return this;
        }
        public Builder eventPatterns(KubernetesEventPatternsEventPattern... eventPatterns) {
            return eventPatterns(List.of(eventPatterns));
        }
        public KubernetesEventPatterns build() {
            final var o = new KubernetesEventPatterns();
            o.eventPatterns = eventPatterns;
            return o;
        }
    }
}