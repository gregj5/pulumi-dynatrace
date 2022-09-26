// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class ManagementZoneRuleConditionIntegerComparisonArgs : global::Pulumi.ResourceArgs
    {
        [Input("negate")]
        public Input<bool>? Negate { get; set; }

        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        [Input("value")]
        public Input<int>? Value { get; set; }

        public ManagementZoneRuleConditionIntegerComparisonArgs()
        {
        }
        public static new ManagementZoneRuleConditionIntegerComparisonArgs Empty => new ManagementZoneRuleConditionIntegerComparisonArgs();
    }
}