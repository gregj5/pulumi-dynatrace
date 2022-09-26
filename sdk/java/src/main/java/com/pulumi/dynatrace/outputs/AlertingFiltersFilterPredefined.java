// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertingFiltersFilterPredefined {
    private @Nullable Boolean negate;
    private String type;

    private AlertingFiltersFilterPredefined() {}
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingFiltersFilterPredefined defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean negate;
        private String type;
        public Builder() {}
        public Builder(AlertingFiltersFilterPredefined defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negate = defaults.negate;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder negate(@Nullable Boolean negate) {
            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AlertingFiltersFilterPredefined build() {
            final var o = new AlertingFiltersFilterPredefined();
            o.negate = negate;
            o.type = type;
            return o;
        }
    }
}