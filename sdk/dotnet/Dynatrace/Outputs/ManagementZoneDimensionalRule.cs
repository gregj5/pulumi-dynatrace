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
    public sealed class ManagementZoneDimensionalRule
    {
        public readonly string AppliesTo;
        public readonly ImmutableArray<Outputs.ManagementZoneDimensionalRuleCondition> Conditions;
        public readonly bool? Enabled;
        public readonly string? Unknowns;

        [OutputConstructor]
        private ManagementZoneDimensionalRule(
            string appliesTo,

            ImmutableArray<Outputs.ManagementZoneDimensionalRuleCondition> conditions,

            bool? enabled,

            string? unknowns)
        {
            AppliesTo = appliesTo;
            Conditions = conditions;
            Enabled = enabled;
            Unknowns = unknowns;
        }
    }
}