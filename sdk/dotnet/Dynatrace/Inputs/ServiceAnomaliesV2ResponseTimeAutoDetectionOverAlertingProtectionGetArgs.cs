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

    public sealed class ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("minutesAbnormalState", required: true)]
        public Input<int> MinutesAbnormalState { get; set; } = null!;

        [Input("requestsPerMinute", required: true)]
        public Input<double> RequestsPerMinute { get; set; } = null!;

        public ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionGetArgs()
        {
        }
        public static new ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionGetArgs Empty => new ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionGetArgs();
    }
}