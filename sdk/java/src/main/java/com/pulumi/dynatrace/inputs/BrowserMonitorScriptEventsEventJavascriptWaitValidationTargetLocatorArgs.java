// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocatorArgs;
import java.util.List;
import java.util.Objects;


public final class BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs Empty = new BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs();

    @Import(name="locators", required=true)
    private Output<List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocatorArgs>> locators;

    public Output<List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocatorArgs>> locators() {
        return this.locators;
    }

    private BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs() {}

    private BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs $) {
        this.locators = $.locators;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs(Objects.requireNonNull(defaults));
        }

        public Builder locators(Output<List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocatorArgs>> locators) {
            $.locators = locators;
            return this;
        }

        public Builder locators(List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocatorArgs> locators) {
            return locators(Output.of(locators));
        }

        public Builder locators(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocatorArgs... locators) {
            return locators(List.of(locators));
        }

        public BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorArgs build() {
            $.locators = Objects.requireNonNull($.locators, "expected parameter 'locators' to be non-null");
            return $;
        }
    }

}