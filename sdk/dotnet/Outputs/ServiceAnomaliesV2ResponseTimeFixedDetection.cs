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
    public sealed class ServiceAnomaliesV2ResponseTimeFixedDetection
    {
        /// <summary>
        /// Avoid over-alerting
        /// </summary>
        public readonly Outputs.ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection OverAlertingProtection;
        /// <summary>
        /// Alert if the median response time of all requests degrades beyond this threshold:
        /// </summary>
        public readonly Outputs.ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll ResponseTimeAll;
        /// <summary>
        /// Alert if the response time of the slowest 10% of requests degrades beyond this threshold:
        /// </summary>
        public readonly Outputs.ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest ResponseTimeSlowest;
        /// <summary>
        /// Possible Values: `High`, `Low`, `Medium`
        /// </summary>
        public readonly string Sensitivity;

        [OutputConstructor]
        private ServiceAnomaliesV2ResponseTimeFixedDetection(
            Outputs.ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection overAlertingProtection,

            Outputs.ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll responseTimeAll,

            Outputs.ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest responseTimeSlowest,

            string sensitivity)
        {
            OverAlertingProtection = overAlertingProtection;
            ResponseTimeAll = responseTimeAll;
            ResponseTimeSlowest = responseTimeSlowest;
            Sensitivity = sensitivity;
        }
    }
}