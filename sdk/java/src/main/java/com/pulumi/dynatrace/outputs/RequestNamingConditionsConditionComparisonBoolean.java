// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RequestNamingConditionsConditionComparisonBoolean {
    private @Nullable String operator;
    private @Nullable String unknowns;
    private @Nullable Boolean value;
    private @Nullable List<Boolean> values;

    private RequestNamingConditionsConditionComparisonBoolean() {}
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }
    public Optional<Boolean> value() {
        return Optional.ofNullable(this.value);
    }
    public List<Boolean> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestNamingConditionsConditionComparisonBoolean defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String operator;
        private @Nullable String unknowns;
        private @Nullable Boolean value;
        private @Nullable List<Boolean> values;
        public Builder() {}
        public Builder(RequestNamingConditionsConditionComparisonBoolean defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.unknowns = defaults.unknowns;
    	      this.value = defaults.value;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Boolean value) {
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<Boolean> values) {
            this.values = values;
            return this;
        }
        public Builder values(Boolean... values) {
            return values(List.of(values));
        }
        public RequestNamingConditionsConditionComparisonBoolean build() {
            final var o = new RequestNamingConditionsConditionComparisonBoolean();
            o.operator = operator;
            o.unknowns = unknowns;
            o.value = value;
            o.values = values;
            return o;
        }
    }
}