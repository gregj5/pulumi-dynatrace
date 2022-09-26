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
    public sealed class WebApplicationUserActionNamingSettingsCustomActionNamingRulesRule
    {
        public readonly Outputs.WebApplicationUserActionNamingSettingsCustomActionNamingRulesRuleConditions? Conditions;
        public readonly string Template;
        public readonly bool? UseOrConditions;

        [OutputConstructor]
        private WebApplicationUserActionNamingSettingsCustomActionNamingRulesRule(
            Outputs.WebApplicationUserActionNamingSettingsCustomActionNamingRulesRuleConditions? conditions,

            string template,

            bool? useOrConditions)
        {
            Conditions = conditions;
            Template = template;
            UseOrConditions = useOrConditions;
        }
    }
}