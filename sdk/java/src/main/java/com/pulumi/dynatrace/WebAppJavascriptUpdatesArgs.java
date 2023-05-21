// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppJavascriptUpdatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppJavascriptUpdatesArgs Empty = new WebAppJavascriptUpdatesArgs();

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Possible Values: `CUSTOM`, `LATEST_IE7_10_SUPPORTED`, `LATEST_STABLE`, `PREVIOUS_STABLE`
     * 
     */
    @Import(name="javascriptVersion", required=true)
    private Output<String> javascriptVersion;

    /**
     * @return Possible Values: `CUSTOM`, `LATEST_IE7_10_SUPPORTED`, `LATEST_STABLE`, `PREVIOUS_STABLE`
     * 
     */
    public Output<String> javascriptVersion() {
        return this.javascriptVersion;
    }

    private WebAppJavascriptUpdatesArgs() {}

    private WebAppJavascriptUpdatesArgs(WebAppJavascriptUpdatesArgs $) {
        this.applicationId = $.applicationId;
        this.javascriptVersion = $.javascriptVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppJavascriptUpdatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppJavascriptUpdatesArgs $;

        public Builder() {
            $ = new WebAppJavascriptUpdatesArgs();
        }

        public Builder(WebAppJavascriptUpdatesArgs defaults) {
            $ = new WebAppJavascriptUpdatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param javascriptVersion Possible Values: `CUSTOM`, `LATEST_IE7_10_SUPPORTED`, `LATEST_STABLE`, `PREVIOUS_STABLE`
         * 
         * @return builder
         * 
         */
        public Builder javascriptVersion(Output<String> javascriptVersion) {
            $.javascriptVersion = javascriptVersion;
            return this;
        }

        /**
         * @param javascriptVersion Possible Values: `CUSTOM`, `LATEST_IE7_10_SUPPORTED`, `LATEST_STABLE`, `PREVIOUS_STABLE`
         * 
         * @return builder
         * 
         */
        public Builder javascriptVersion(String javascriptVersion) {
            return javascriptVersion(Output.of(javascriptVersion));
        }

        public WebAppJavascriptUpdatesArgs build() {
            $.javascriptVersion = Objects.requireNonNull($.javascriptVersion, "expected parameter 'javascriptVersion' to be non-null");
            return $;
        }
    }

}