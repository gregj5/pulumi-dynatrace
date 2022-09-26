// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeSourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs Empty = new CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs();

    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="matchOnChildCalls")
    private @Nullable Output<Boolean> matchOnChildCalls;

    public Optional<Output<Boolean>> matchOnChildCalls() {
        return Optional.ofNullable(this.matchOnChildCalls);
    }

    @Import(name="operator")
    private @Nullable Output<String> operator;

    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="requestAttribute", required=true)
    private Output<String> requestAttribute;

    public Output<String> requestAttribute() {
        return this.requestAttribute;
    }

    @Import(name="source")
    private @Nullable Output<CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeSourceArgs> source;

    public Optional<Output<CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs() {}

    private CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs(CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.matchOnChildCalls = $.matchOnChildCalls;
        this.operator = $.operator;
        this.requestAttribute = $.requestAttribute;
        this.source = $.source;
        this.unknowns = $.unknowns;
        this.value = $.value;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs();
        }

        public Builder(CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs defaults) {
            $ = new CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public Builder matchOnChildCalls(@Nullable Output<Boolean> matchOnChildCalls) {
            $.matchOnChildCalls = matchOnChildCalls;
            return this;
        }

        public Builder matchOnChildCalls(Boolean matchOnChildCalls) {
            return matchOnChildCalls(Output.of(matchOnChildCalls));
        }

        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder requestAttribute(Output<String> requestAttribute) {
            $.requestAttribute = requestAttribute;
            return this;
        }

        public Builder requestAttribute(String requestAttribute) {
            return requestAttribute(Output.of(requestAttribute));
        }

        public Builder source(@Nullable Output<CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeSourceArgs source) {
            return source(Output.of(source));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public CalculatedServiceMetricConditionConditionComparisonStringRequestAttributeArgs build() {
            $.requestAttribute = Objects.requireNonNull($.requestAttribute, "expected parameter 'requestAttribute' to be non-null");
            return $;
        }
    }

}