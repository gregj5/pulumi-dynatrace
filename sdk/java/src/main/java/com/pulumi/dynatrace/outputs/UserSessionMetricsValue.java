// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserSessionMetricsValue {
    /**
     * @return Field name
     * 
     */
    private @Nullable String fieldName;
    /**
     * @return Possible Values: `COUNTER`, `FIELD`
     * 
     */
    private String type;

    private UserSessionMetricsValue() {}
    /**
     * @return Field name
     * 
     */
    public Optional<String> fieldName() {
        return Optional.ofNullable(this.fieldName);
    }
    /**
     * @return Possible Values: `COUNTER`, `FIELD`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSessionMetricsValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fieldName;
        private String type;
        public Builder() {}
        public Builder(UserSessionMetricsValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder fieldName(@Nullable String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public UserSessionMetricsValue build() {
            final var o = new UserSessionMetricsValue();
            o.fieldName = fieldName;
            o.type = type;
            return o;
        }
    }
}