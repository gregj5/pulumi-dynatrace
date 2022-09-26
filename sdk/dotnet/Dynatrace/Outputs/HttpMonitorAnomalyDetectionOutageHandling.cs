// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class HttpMonitorAnomalyDetectionOutageHandling
    {
        public readonly bool? GlobalOutage;
        public readonly bool? LocalOutage;
        public readonly ImmutableArray<Outputs.HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicy> LocalOutagePolicies;
        public readonly bool? RetryOnError;

        [OutputConstructor]
        private HttpMonitorAnomalyDetectionOutageHandling(
            bool? globalOutage,

            bool? localOutage,

            ImmutableArray<Outputs.HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicy> localOutagePolicies,

            bool? retryOnError)
        {
            GlobalOutage = globalOutage;
            LocalOutage = localOutage;
            LocalOutagePolicies = localOutagePolicies;
            RetryOnError = retryOnError;
        }
    }
}