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

    public sealed class NetworkMonitorStepArgs : global::Pulumi.ResourceArgs
    {
        [Input("steps", required: true)]
        private InputList<Inputs.NetworkMonitorStepStepArgs>? _steps;

        /// <summary>
        /// The step of a network availability monitor
        /// </summary>
        public InputList<Inputs.NetworkMonitorStepStepArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.NetworkMonitorStepStepArgs>());
            set => _steps = value;
        }

        public NetworkMonitorStepArgs()
        {
        }
        public static new NetworkMonitorStepArgs Empty => new NetworkMonitorStepArgs();
    }
}