// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventSelectValidateValidationArgs;
import java.util.List;
import java.util.Objects;


public final class BrowserMonitorScriptEventsEventSelectValidateArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventSelectValidateArgs Empty = new BrowserMonitorScriptEventsEventSelectValidateArgs();

    @Import(name="validations", required=true)
    private Output<List<BrowserMonitorScriptEventsEventSelectValidateValidationArgs>> validations;

    public Output<List<BrowserMonitorScriptEventsEventSelectValidateValidationArgs>> validations() {
        return this.validations;
    }

    private BrowserMonitorScriptEventsEventSelectValidateArgs() {}

    private BrowserMonitorScriptEventsEventSelectValidateArgs(BrowserMonitorScriptEventsEventSelectValidateArgs $) {
        this.validations = $.validations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventSelectValidateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventSelectValidateArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventSelectValidateArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventSelectValidateArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventSelectValidateArgs(Objects.requireNonNull(defaults));
        }

        public Builder validations(Output<List<BrowserMonitorScriptEventsEventSelectValidateValidationArgs>> validations) {
            $.validations = validations;
            return this;
        }

        public Builder validations(List<BrowserMonitorScriptEventsEventSelectValidateValidationArgs> validations) {
            return validations(Output.of(validations));
        }

        public Builder validations(BrowserMonitorScriptEventsEventSelectValidateValidationArgs... validations) {
            return validations(List.of(validations));
        }

        public BrowserMonitorScriptEventsEventSelectValidateArgs build() {
            $.validations = Objects.requireNonNull($.validations, "expected parameter 'validations' to be non-null");
            return $;
        }
    }

}