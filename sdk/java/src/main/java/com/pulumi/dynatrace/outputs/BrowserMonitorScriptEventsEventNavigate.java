// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventNavigateAuthentication;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventNavigateTarget;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventNavigateValidate;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventNavigateWait;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorScriptEventsEventNavigate {
    private @Nullable BrowserMonitorScriptEventsEventNavigateAuthentication authentication;
    private @Nullable BrowserMonitorScriptEventsEventNavigateTarget target;
    private String url;
    private @Nullable BrowserMonitorScriptEventsEventNavigateValidate validate;
    private @Nullable BrowserMonitorScriptEventsEventNavigateWait wait;

    private BrowserMonitorScriptEventsEventNavigate() {}
    public Optional<BrowserMonitorScriptEventsEventNavigateAuthentication> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    public Optional<BrowserMonitorScriptEventsEventNavigateTarget> target() {
        return Optional.ofNullable(this.target);
    }
    public String url() {
        return this.url;
    }
    public Optional<BrowserMonitorScriptEventsEventNavigateValidate> validate() {
        return Optional.ofNullable(this.validate);
    }
    public Optional<BrowserMonitorScriptEventsEventNavigateWait> wait_() {
        return Optional.ofNullable(this.wait);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventNavigate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BrowserMonitorScriptEventsEventNavigateAuthentication authentication;
        private @Nullable BrowserMonitorScriptEventsEventNavigateTarget target;
        private String url;
        private @Nullable BrowserMonitorScriptEventsEventNavigateValidate validate;
        private @Nullable BrowserMonitorScriptEventsEventNavigateWait wait;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventNavigate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.target = defaults.target;
    	      this.url = defaults.url;
    	      this.validate = defaults.validate;
    	      this.wait = defaults.wait;
        }

        @CustomType.Setter
        public Builder authentication(@Nullable BrowserMonitorScriptEventsEventNavigateAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable BrowserMonitorScriptEventsEventNavigateTarget target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder validate(@Nullable BrowserMonitorScriptEventsEventNavigateValidate validate) {
            this.validate = validate;
            return this;
        }
        @CustomType.Setter("wait")
        public Builder wait_(@Nullable BrowserMonitorScriptEventsEventNavigateWait wait) {
            this.wait = wait;
            return this;
        }
        public BrowserMonitorScriptEventsEventNavigate build() {
            final var o = new BrowserMonitorScriptEventsEventNavigate();
            o.authentication = authentication;
            o.target = target;
            o.url = url;
            o.validate = validate;
            o.wait = wait;
            return o;
        }
    }
}