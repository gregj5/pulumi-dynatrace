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

    public sealed class HostNamingConditionConditionTechValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Predefined technology, if technology is not predefined, then the verbatim type must be set.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Any attributes that aren't yet supported by this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        /// <summary>
        /// Non-predefined technology, use for custom technologies
        /// </summary>
        [Input("verbatimType")]
        public Input<string>? VerbatimType { get; set; }

        public HostNamingConditionConditionTechValueGetArgs()
        {
        }
        public static new HostNamingConditionConditionTechValueGetArgs Empty => new HostNamingConditionConditionTechValueGetArgs();
    }
}