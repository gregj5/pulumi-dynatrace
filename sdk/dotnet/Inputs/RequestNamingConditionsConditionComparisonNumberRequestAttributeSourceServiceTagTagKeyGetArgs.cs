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

    public sealed class RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagTagKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// has no documentation
        /// </summary>
        [Input("context")]
        public Input<string>? Context { get; set; }

        /// <summary>
        /// has no documentation
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        public RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagTagKeyGetArgs()
        {
        }
        public static new RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagTagKeyGetArgs Empty => new RequestNamingConditionsConditionComparisonNumberRequestAttributeSourceServiceTagTagKeyGetArgs();
    }
}