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

    public sealed class ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("transformations", required: true)]
        private InputList<Inputs.ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs>? _transformations;
        public InputList<Inputs.ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs> Transformations
        {
            get => _transformations ?? (_transformations = new InputList<Inputs.ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs>());
            set => _transformations = value;
        }

        public ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs()
        {
        }
        public static new ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs Empty => new ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs();
    }
}