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

    public sealed class HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of affected locations to trigger an alert
        /// </summary>
        [Input("affectedLocations", required: true)]
        public Input<int> AffectedLocations { get; set; } = null!;

        /// <summary>
        /// The number of consecutive fails to trigger an alert
        /// </summary>
        [Input("consecutiveRuns", required: true)]
        public Input<int> ConsecutiveRuns { get; set; } = null!;

        public HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs()
        {
        }
        public static new HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs Empty => new HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs();
    }
}