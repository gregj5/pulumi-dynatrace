// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebApplicationUserActionAndSessionPropertiesPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationUserActionAndSessionPropertiesPropertyArgs Empty = new WebApplicationUserActionAndSessionPropertiesPropertyArgs();

    @Import(name="aggregation")
    private @Nullable Output<String> aggregation;

    public Optional<Output<String>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    @Import(name="cleanupRule")
    private @Nullable Output<String> cleanupRule;

    public Optional<Output<String>> cleanupRule() {
        return Optional.ofNullable(this.cleanupRule);
    }

    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of this resource.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="longStringLength")
    private @Nullable Output<Integer> longStringLength;

    public Optional<Output<Integer>> longStringLength() {
        return Optional.ofNullable(this.longStringLength);
    }

    @Import(name="metadataId")
    private @Nullable Output<Integer> metadataId;

    public Optional<Output<Integer>> metadataId() {
        return Optional.ofNullable(this.metadataId);
    }

    @Import(name="origin", required=true)
    private Output<String> origin;

    public Output<String> origin() {
        return this.origin;
    }

    @Import(name="serverSideRequestAttribute")
    private @Nullable Output<String> serverSideRequestAttribute;

    public Optional<Output<String>> serverSideRequestAttribute() {
        return Optional.ofNullable(this.serverSideRequestAttribute);
    }

    @Import(name="storeAsSessionProperty")
    private @Nullable Output<Boolean> storeAsSessionProperty;

    public Optional<Output<Boolean>> storeAsSessionProperty() {
        return Optional.ofNullable(this.storeAsSessionProperty);
    }

    @Import(name="storeAsUserActionProperty")
    private @Nullable Output<Boolean> storeAsUserActionProperty;

    public Optional<Output<Boolean>> storeAsUserActionProperty() {
        return Optional.ofNullable(this.storeAsUserActionProperty);
    }

    /**
     * The type of the web application. Possible values are `AUTO_INJECTED`, `BROWSER_EXTENSION_INJECTED` and `MANUALLY_INJECTED`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the web application. Possible values are `AUTO_INJECTED`, `BROWSER_EXTENSION_INJECTED` and `MANUALLY_INJECTED`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private WebApplicationUserActionAndSessionPropertiesPropertyArgs() {}

    private WebApplicationUserActionAndSessionPropertiesPropertyArgs(WebApplicationUserActionAndSessionPropertiesPropertyArgs $) {
        this.aggregation = $.aggregation;
        this.cleanupRule = $.cleanupRule;
        this.displayName = $.displayName;
        this.id = $.id;
        this.ignoreCase = $.ignoreCase;
        this.key = $.key;
        this.longStringLength = $.longStringLength;
        this.metadataId = $.metadataId;
        this.origin = $.origin;
        this.serverSideRequestAttribute = $.serverSideRequestAttribute;
        this.storeAsSessionProperty = $.storeAsSessionProperty;
        this.storeAsUserActionProperty = $.storeAsUserActionProperty;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationUserActionAndSessionPropertiesPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationUserActionAndSessionPropertiesPropertyArgs $;

        public Builder() {
            $ = new WebApplicationUserActionAndSessionPropertiesPropertyArgs();
        }

        public Builder(WebApplicationUserActionAndSessionPropertiesPropertyArgs defaults) {
            $ = new WebApplicationUserActionAndSessionPropertiesPropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregation(@Nullable Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        public Builder cleanupRule(@Nullable Output<String> cleanupRule) {
            $.cleanupRule = cleanupRule;
            return this;
        }

        public Builder cleanupRule(String cleanupRule) {
            return cleanupRule(Output.of(cleanupRule));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder longStringLength(@Nullable Output<Integer> longStringLength) {
            $.longStringLength = longStringLength;
            return this;
        }

        public Builder longStringLength(Integer longStringLength) {
            return longStringLength(Output.of(longStringLength));
        }

        public Builder metadataId(@Nullable Output<Integer> metadataId) {
            $.metadataId = metadataId;
            return this;
        }

        public Builder metadataId(Integer metadataId) {
            return metadataId(Output.of(metadataId));
        }

        public Builder origin(Output<String> origin) {
            $.origin = origin;
            return this;
        }

        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        public Builder serverSideRequestAttribute(@Nullable Output<String> serverSideRequestAttribute) {
            $.serverSideRequestAttribute = serverSideRequestAttribute;
            return this;
        }

        public Builder serverSideRequestAttribute(String serverSideRequestAttribute) {
            return serverSideRequestAttribute(Output.of(serverSideRequestAttribute));
        }

        public Builder storeAsSessionProperty(@Nullable Output<Boolean> storeAsSessionProperty) {
            $.storeAsSessionProperty = storeAsSessionProperty;
            return this;
        }

        public Builder storeAsSessionProperty(Boolean storeAsSessionProperty) {
            return storeAsSessionProperty(Output.of(storeAsSessionProperty));
        }

        public Builder storeAsUserActionProperty(@Nullable Output<Boolean> storeAsUserActionProperty) {
            $.storeAsUserActionProperty = storeAsUserActionProperty;
            return this;
        }

        public Builder storeAsUserActionProperty(Boolean storeAsUserActionProperty) {
            return storeAsUserActionProperty(Output.of(storeAsUserActionProperty));
        }

        /**
         * @param type The type of the web application. Possible values are `AUTO_INJECTED`, `BROWSER_EXTENSION_INJECTED` and `MANUALLY_INJECTED`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the web application. Possible values are `AUTO_INJECTED`, `BROWSER_EXTENSION_INJECTED` and `MANUALLY_INJECTED`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebApplicationUserActionAndSessionPropertiesPropertyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.origin = Objects.requireNonNull($.origin, "expected parameter 'origin' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}