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
    public sealed class ServiceExternalWebRequestIdContributorsContextRoot
    {
        /// <summary>
        /// Transform this value before letting it contribute to the Service Id
        /// </summary>
        public readonly bool EnableIdContributor;
        /// <summary>
        /// no documentation available
        /// </summary>
        public readonly Outputs.ServiceExternalWebRequestIdContributorsContextRootServiceIdContributor? ServiceIdContributor;

        [OutputConstructor]
        private ServiceExternalWebRequestIdContributorsContextRoot(
            bool enableIdContributor,

            Outputs.ServiceExternalWebRequestIdContributorsContextRootServiceIdContributor? serviceIdContributor)
        {
            EnableIdContributor = enableIdContributor;
            ServiceIdContributor = serviceIdContributor;
        }
    }
}