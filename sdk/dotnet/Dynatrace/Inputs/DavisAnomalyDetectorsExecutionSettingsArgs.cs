// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.PulumiPackage.Dynatrace.Inputs
{

    public sealed class DavisAnomalyDetectorsExecutionSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Minute offset of sliding evaluation window for metrics with latency
        /// </summary>
        [Input("queryOffset")]
        public Input<int>? QueryOffset { get; set; }

        public DavisAnomalyDetectorsExecutionSettingsArgs()
        {
        }
        public static new DavisAnomalyDetectorsExecutionSettingsArgs Empty => new DavisAnomalyDetectorsExecutionSettingsArgs();
    }
}