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

    public sealed class WebAppKeyPerformanceCustomThresholdsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If **User action duration** is above this value, the action is assigned to the Frustrated performance zone.
        /// </summary>
        [Input("frustratingThresholdSeconds", required: true)]
        public Input<double> FrustratingThresholdSeconds { get; set; } = null!;

        /// <summary>
        /// If **User action duration** is below this value, the action is assigned to the Satisfied performance zone.
        /// </summary>
        [Input("toleratedThresholdSeconds", required: true)]
        public Input<double> ToleratedThresholdSeconds { get; set; } = null!;

        public WebAppKeyPerformanceCustomThresholdsArgs()
        {
        }
        public static new WebAppKeyPerformanceCustomThresholdsArgs Empty => new WebAppKeyPerformanceCustomThresholdsArgs();
    }
}