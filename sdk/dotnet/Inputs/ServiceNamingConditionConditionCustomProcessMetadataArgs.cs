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

    public sealed class ServiceNamingConditionConditionCustomProcessMetadataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attribute to be used for comparision
        /// </summary>
        [Input("attribute", required: true)]
        public Input<string> Attribute { get; set; } = null!;

        /// <summary>
        /// The key of the attribute, which need dynamic keys. Not applicable otherwise, as the attibute itself acts as a key
        /// </summary>
        [Input("dynamicKey", required: true)]
        public Input<Inputs.ServiceNamingConditionConditionCustomProcessMetadataDynamicKeyArgs> DynamicKey { get; set; } = null!;

        /// <summary>
        /// Any attributes that aren't yet supported by this provider but have meanwhile gotten introduced by a newer version of the Dynatrace REST API
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public ServiceNamingConditionConditionCustomProcessMetadataArgs()
        {
        }
        public static new ServiceNamingConditionConditionCustomProcessMetadataArgs Empty => new ServiceNamingConditionConditionCustomProcessMetadataArgs();
    }
}