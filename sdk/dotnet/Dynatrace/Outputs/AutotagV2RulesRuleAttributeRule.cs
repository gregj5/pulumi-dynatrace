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
    public sealed class AutotagV2RulesRuleAttributeRule
    {
        public readonly bool? AzureToPgpropagation;
        public readonly bool? AzureToServicePropagation;
        public readonly Outputs.AutotagV2RulesRuleAttributeRuleConditions Conditions;
        public readonly string EntityType;
        public readonly bool? HostToPgpropagation;
        public readonly bool? PgToHostPropagation;
        public readonly bool? PgToServicePropagation;
        public readonly bool? ServiceToHostPropagation;
        public readonly bool? ServiceToPgpropagation;

        [OutputConstructor]
        private AutotagV2RulesRuleAttributeRule(
            bool? azureToPgpropagation,

            bool? azureToServicePropagation,

            Outputs.AutotagV2RulesRuleAttributeRuleConditions conditions,

            string entityType,

            bool? hostToPgpropagation,

            bool? pgToHostPropagation,

            bool? pgToServicePropagation,

            bool? serviceToHostPropagation,

            bool? serviceToPgpropagation)
        {
            AzureToPgpropagation = azureToPgpropagation;
            AzureToServicePropagation = azureToServicePropagation;
            Conditions = conditions;
            EntityType = entityType;
            HostToPgpropagation = hostToPgpropagation;
            PgToHostPropagation = pgToHostPropagation;
            PgToServicePropagation = pgToServicePropagation;
            ServiceToHostPropagation = serviceToHostPropagation;
            ServiceToPgpropagation = serviceToPgpropagation;
        }
    }
}