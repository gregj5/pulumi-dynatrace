// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class AutotagV2RulesRuleAttributeRuleConditionsCondition
    {
        public readonly bool? CaseSensitive;
        public readonly string? DynamicKey;
        public readonly string? DynamicKeySource;
        public readonly string? EntityId;
        public readonly string? EnumValue;
        public readonly int? IntegerValue;
        public readonly string Key;
        public readonly string Operator;
        public readonly string? StringValue;
        public readonly string? Tag;

        [OutputConstructor]
        private AutotagV2RulesRuleAttributeRuleConditionsCondition(
            bool? caseSensitive,

            string? dynamicKey,

            string? dynamicKeySource,

            string? entityId,

            string? enumValue,

            int? integerValue,

            string key,

            string @operator,

            string? stringValue,

            string? tag)
        {
            CaseSensitive = caseSensitive;
            DynamicKey = dynamicKey;
            DynamicKeySource = dynamicKeySource;
            EntityId = entityId;
            EnumValue = enumValue;
            IntegerValue = integerValue;
            Key = key;
            Operator = @operator;
            StringValue = stringValue;
            Tag = tag;
        }
    }
}