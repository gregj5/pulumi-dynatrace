// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GenericTypesRulesRuleSourcesSource {
    private @Nullable String condition;
    private String sourceType;

    private GenericTypesRulesRuleSourcesSource() {}
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericTypesRulesRuleSourcesSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String condition;
        private String sourceType;
        public Builder() {}
        public Builder(GenericTypesRulesRuleSourcesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public GenericTypesRulesRuleSourcesSource build() {
            final var o = new GenericTypesRulesRuleSourcesSource();
            o.condition = condition;
            o.sourceType = sourceType;
            return o;
        }
    }
}