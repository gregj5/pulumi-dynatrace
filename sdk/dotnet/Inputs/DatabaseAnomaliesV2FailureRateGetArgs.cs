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

    public sealed class DatabaseAnomaliesV2FailureRateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert if the percentage of failing service calls increases by **both** the absolute and relative thresholds:
        /// </summary>
        [Input("autoDetection")]
        public Input<Inputs.DatabaseAnomaliesV2FailureRateAutoDetectionGetArgs>? AutoDetection { get; set; }

        /// <summary>
        /// Detection mode for increases in failure rate
        /// </summary>
        [Input("detectionMode")]
        public Input<string>? DetectionMode { get; set; }

        /// <summary>
        /// Detect increases in failure rate
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Alert if a given failure rate is exceeded during any 5-minute-period
        /// </summary>
        [Input("fixedDetection")]
        public Input<Inputs.DatabaseAnomaliesV2FailureRateFixedDetectionGetArgs>? FixedDetection { get; set; }

        public DatabaseAnomaliesV2FailureRateGetArgs()
        {
        }
        public static new DatabaseAnomaliesV2FailureRateGetArgs Empty => new DatabaseAnomaliesV2FailureRateGetArgs();
    }
}