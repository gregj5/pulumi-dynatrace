// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs Empty = new ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs();

    @Import(name="conditionType", required=true)
    private Output<String> conditionType;

    public Output<String> conditionType() {
        return this.conditionType;
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="ruleMatcher", required=true)
    private Output<String> ruleMatcher;

    public Output<String> ruleMatcher() {
        return this.ruleMatcher;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs() {}

    private ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs $) {
        this.conditionType = $.conditionType;
        this.key = $.key;
        this.ruleMatcher = $.ruleMatcher;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs $;

        public Builder() {
            $ = new ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs();
        }

        public Builder(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs defaults) {
            $ = new ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionType(Output<String> conditionType) {
            $.conditionType = conditionType;
            return this;
        }

        public Builder conditionType(String conditionType) {
            return conditionType(Output.of(conditionType));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder ruleMatcher(Output<String> ruleMatcher) {
            $.ruleMatcher = ruleMatcher;
            return this;
        }

        public Builder ruleMatcher(String ruleMatcher) {
            return ruleMatcher(Output.of(ruleMatcher));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs build() {
            $.conditionType = Objects.requireNonNull($.conditionType, "expected parameter 'conditionType' to be non-null");
            $.ruleMatcher = Objects.requireNonNull($.ruleMatcher, "expected parameter 'ruleMatcher' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}