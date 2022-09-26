// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventTapTargetLocatorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptEventsEventTapTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventTapTargetArgs Empty = new BrowserMonitorScriptEventsEventTapTargetArgs();

    @Import(name="locators")
    private @Nullable Output<List<BrowserMonitorScriptEventsEventTapTargetLocatorArgs>> locators;

    public Optional<Output<List<BrowserMonitorScriptEventsEventTapTargetLocatorArgs>>> locators() {
        return Optional.ofNullable(this.locators);
    }

    @Import(name="window")
    private @Nullable Output<String> window;

    public Optional<Output<String>> window() {
        return Optional.ofNullable(this.window);
    }

    private BrowserMonitorScriptEventsEventTapTargetArgs() {}

    private BrowserMonitorScriptEventsEventTapTargetArgs(BrowserMonitorScriptEventsEventTapTargetArgs $) {
        this.locators = $.locators;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventTapTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventTapTargetArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventTapTargetArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventTapTargetArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventTapTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder locators(@Nullable Output<List<BrowserMonitorScriptEventsEventTapTargetLocatorArgs>> locators) {
            $.locators = locators;
            return this;
        }

        public Builder locators(List<BrowserMonitorScriptEventsEventTapTargetLocatorArgs> locators) {
            return locators(Output.of(locators));
        }

        public Builder locators(BrowserMonitorScriptEventsEventTapTargetLocatorArgs... locators) {
            return locators(List.of(locators));
        }

        public Builder window(@Nullable Output<String> window) {
            $.window = window;
            return this;
        }

        public Builder window(String window) {
            return window(Output.of(window));
        }

        public BrowserMonitorScriptEventsEventTapTargetArgs build() {
            return $;
        }
    }

}