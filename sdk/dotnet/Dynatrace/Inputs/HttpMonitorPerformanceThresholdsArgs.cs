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

    public sealed class HttpMonitorPerformanceThresholdsArgs : global::Pulumi.ResourceArgs
    {
        [Input("thresholds", required: true)]
        private InputList<Inputs.HttpMonitorPerformanceThresholdsThresholdArgs>? _thresholds;
        public InputList<Inputs.HttpMonitorPerformanceThresholdsThresholdArgs> Thresholds
        {
            get => _thresholds ?? (_thresholds = new InputList<Inputs.HttpMonitorPerformanceThresholdsThresholdArgs>());
            set => _thresholds = value;
        }

        public HttpMonitorPerformanceThresholdsArgs()
        {
        }
        public static new HttpMonitorPerformanceThresholdsArgs Empty => new HttpMonitorPerformanceThresholdsArgs();
    }
}