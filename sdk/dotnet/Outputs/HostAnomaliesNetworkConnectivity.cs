// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Dynatrace.Outputs
{

    [OutputType]
    public sealed class HostAnomaliesNetworkConnectivity
    {
        /// <summary>
        /// The detection is enabled (`true`) or disabled (`false`)
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Custom thresholds for TCP connection problems. If not set, automatic mode is used.   **All** of these conditions must be met to trigger an alert
        /// </summary>
        public readonly Outputs.HostAnomaliesNetworkConnectivityThresholds? Thresholds;

        [OutputConstructor]
        private HostAnomaliesNetworkConnectivity(
            bool enabled,

            Outputs.HostAnomaliesNetworkConnectivityThresholds? thresholds)
        {
            Enabled = enabled;
            Thresholds = thresholds;
        }
    }
}