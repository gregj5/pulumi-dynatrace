// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Dynatrace.Inputs
{

    public sealed class AutotagEntitySelectorBasedRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The rule is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Changes applied to the value after applying the value format. Possible values are `LEAVE_TEXT_AS_IS`, `TO_LOWER_CASE` and `TO_UPPER_CASE`. Default is `LEAVE_TEXT_AS_IS`
        /// </summary>
        [Input("normalization")]
        public Input<string>? Normalization { get; set; }

        /// <summary>
        /// The entity selector string, by which the entities are selected
        /// </summary>
        [Input("selector")]
        public Input<string>? Selector { get; set; }

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        /// <summary>
        /// The value of the entity-selector-based auto-tag. If specified, the tag is used in the `name:valueFormat` format. 
        /// 
        /// For example, you can extend the `Infrastructure` tag to `Infrastructure:Windows` and `Infrastructure:Linux`
        /// </summary>
        [Input("valueFormat")]
        public Input<string>? ValueFormat { get; set; }

        public AutotagEntitySelectorBasedRuleGetArgs()
        {
        }
        public static new AutotagEntitySelectorBasedRuleGetArgs Empty => new AutotagEntitySelectorBasedRuleGetArgs();
    }
}