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
public final class MobileApplicationPropertiesRequestAttribute {
    private @Nullable String aggregation;
    private @Nullable String cleanupRule;
    private @Nullable String displayName;
    private String id;
    private String key;
    private @Nullable Boolean storeAsSessionProperty;
    private @Nullable Boolean storeAsUserActionProperty;
    private String type;

    private MobileApplicationPropertiesRequestAttribute() {}
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    public Optional<String> cleanupRule() {
        return Optional.ofNullable(this.cleanupRule);
    }
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String id() {
        return this.id;
    }
    public String key() {
        return this.key;
    }
    public Optional<Boolean> storeAsSessionProperty() {
        return Optional.ofNullable(this.storeAsSessionProperty);
    }
    public Optional<Boolean> storeAsUserActionProperty() {
        return Optional.ofNullable(this.storeAsUserActionProperty);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobileApplicationPropertiesRequestAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregation;
        private @Nullable String cleanupRule;
        private @Nullable String displayName;
        private String id;
        private String key;
        private @Nullable Boolean storeAsSessionProperty;
        private @Nullable Boolean storeAsUserActionProperty;
        private String type;
        public Builder() {}
        public Builder(MobileApplicationPropertiesRequestAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.cleanupRule = defaults.cleanupRule;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.storeAsSessionProperty = defaults.storeAsSessionProperty;
    	      this.storeAsUserActionProperty = defaults.storeAsUserActionProperty;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder cleanupRule(@Nullable String cleanupRule) {
            this.cleanupRule = cleanupRule;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder storeAsSessionProperty(@Nullable Boolean storeAsSessionProperty) {
            this.storeAsSessionProperty = storeAsSessionProperty;
            return this;
        }
        @CustomType.Setter
        public Builder storeAsUserActionProperty(@Nullable Boolean storeAsUserActionProperty) {
            this.storeAsUserActionProperty = storeAsUserActionProperty;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MobileApplicationPropertiesRequestAttribute build() {
            final var o = new MobileApplicationPropertiesRequestAttribute();
            o.aggregation = aggregation;
            o.cleanupRule = cleanupRule;
            o.displayName = displayName;
            o.id = id;
            o.key = key;
            o.storeAsSessionProperty = storeAsSessionProperty;
            o.storeAsUserActionProperty = storeAsUserActionProperty;
            o.type = type;
            return o;
        }
    }
}