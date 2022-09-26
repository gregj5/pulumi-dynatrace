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
    public sealed class WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings
    {
        public readonly int InstrumentationDelay;
        public readonly bool? NonW3cResourceTimings;
        public readonly string? ResourceTimingCaptureType;
        public readonly int? ResourceTimingsDomainLimit;
        public readonly bool? W3cResourceTimings;

        [OutputConstructor]
        private WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings(
            int instrumentationDelay,

            bool? nonW3cResourceTimings,

            string? resourceTimingCaptureType,

            int? resourceTimingsDomainLimit,

            bool? w3cResourceTimings)
        {
            InstrumentationDelay = instrumentationDelay;
            NonW3cResourceTimings = nonW3cResourceTimings;
            ResourceTimingCaptureType = resourceTimingCaptureType;
            ResourceTimingsDomainLimit = resourceTimingsDomainLimit;
            W3cResourceTimings = w3cResourceTimings;
        }
    }
}