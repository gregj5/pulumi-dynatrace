// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs;
import java.util.List;
import java.util.Objects;


public final class WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs Empty = new WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs();

    @Import(name="rules", required=true)
    private Output<List<WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs>> rules;

    public Output<List<WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs>> rules() {
        return this.rules;
    }

    private WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs() {}

    private WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs(WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs $;

        public Builder() {
            $ = new WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs();
        }

        public Builder(WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs defaults) {
            $ = new WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(Output<List<WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(WebApplicationMonitoringSettingsJavascriptInjectionRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public WebApplicationMonitoringSettingsJavascriptInjectionRulesArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}