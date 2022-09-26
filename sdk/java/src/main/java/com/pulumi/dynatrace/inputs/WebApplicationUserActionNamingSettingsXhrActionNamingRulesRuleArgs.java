// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs Empty = new WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs();

    @Import(name="conditions")
    private @Nullable Output<WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsArgs> conditions;

    public Optional<Output<WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsArgs>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    @Import(name="template", required=true)
    private Output<String> template;

    public Output<String> template() {
        return this.template;
    }

    @Import(name="useOrConditions")
    private @Nullable Output<Boolean> useOrConditions;

    public Optional<Output<Boolean>> useOrConditions() {
        return Optional.ofNullable(this.useOrConditions);
    }

    private WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs() {}

    private WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs(WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs $) {
        this.conditions = $.conditions;
        this.template = $.template;
        this.useOrConditions = $.useOrConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs $;

        public Builder() {
            $ = new WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs();
        }

        public Builder(WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs defaults) {
            $ = new WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsArgs> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsArgs conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder template(Output<String> template) {
            $.template = template;
            return this;
        }

        public Builder template(String template) {
            return template(Output.of(template));
        }

        public Builder useOrConditions(@Nullable Output<Boolean> useOrConditions) {
            $.useOrConditions = useOrConditions;
            return this;
        }

        public Builder useOrConditions(Boolean useOrConditions) {
            return useOrConditions(Output.of(useOrConditions));
        }

        public WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleArgs build() {
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}