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

    public sealed class CloudappWorkloaddetectionKubernetesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Define rules to merge similar Kubernetes workloads into process groups. 
        /// 
        ///  You can use workload properties like namespace name, base pod name or container name as well as the [environment variables DT_RELEASE_STAGE and DT_RELEASE_PRODUCT](https://dt-url.net/sb02v2a) for grouping processes of similar workloads. The first applicable rule will be applied. If no rule matches, “Namespace name” + “Base pod name” + “Container name” is used as fallback.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.CloudappWorkloaddetectionKubernetesFiltersGetArgs>? Filters { get; set; }

        public CloudappWorkloaddetectionKubernetesGetArgs()
        {
        }
        public static new CloudappWorkloaddetectionKubernetesGetArgs Empty => new CloudappWorkloaddetectionKubernetesGetArgs();
    }
}