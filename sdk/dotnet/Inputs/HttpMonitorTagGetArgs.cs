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

    public sealed class HttpMonitorTagGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags")]
        private InputList<Inputs.HttpMonitorTagTagGetArgs>? _tags;

        /// <summary>
        /// Tag with source of a Dynatrace entity.
        /// </summary>
        public InputList<Inputs.HttpMonitorTagTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.HttpMonitorTagTagGetArgs>());
            set => _tags = value;
        }

        public HttpMonitorTagGetArgs()
        {
        }
        public static new HttpMonitorTagGetArgs Empty => new HttpMonitorTagGetArgs();
    }
}