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
    public sealed class K8sWorkloadAnomaliesContainerRestarts
    {
        /// <summary>
        /// Alert if
        /// </summary>
        public readonly Outputs.K8sWorkloadAnomaliesContainerRestartsConfiguration? Configuration;
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private K8sWorkloadAnomaliesContainerRestarts(
            Outputs.K8sWorkloadAnomaliesContainerRestartsConfiguration? configuration,

            bool enabled)
        {
            Configuration = configuration;
            Enabled = enabled;
        }
    }
}