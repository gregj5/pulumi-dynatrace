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

    public sealed class RequestNamingPlaceholdersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("placeholders")]
        private InputList<Inputs.RequestNamingPlaceholdersPlaceholderGetArgs>? _placeholders;
        public InputList<Inputs.RequestNamingPlaceholdersPlaceholderGetArgs> Placeholders
        {
            get => _placeholders ?? (_placeholders = new InputList<Inputs.RequestNamingPlaceholdersPlaceholderGetArgs>());
            set => _placeholders = value;
        }

        public RequestNamingPlaceholdersGetArgs()
        {
        }
        public static new RequestNamingPlaceholdersGetArgs Empty => new RequestNamingPlaceholdersGetArgs();
    }
}