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

    public sealed class OwnershipTeamsSupplementaryIdentifiersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("supplementaryIdentifiers", required: true)]
        private InputList<Inputs.OwnershipTeamsSupplementaryIdentifiersSupplementaryIdentifierGetArgs>? _supplementaryIdentifiers;
        public InputList<Inputs.OwnershipTeamsSupplementaryIdentifiersSupplementaryIdentifierGetArgs> SupplementaryIdentifiers
        {
            get => _supplementaryIdentifiers ?? (_supplementaryIdentifiers = new InputList<Inputs.OwnershipTeamsSupplementaryIdentifiersSupplementaryIdentifierGetArgs>());
            set => _supplementaryIdentifiers = value;
        }

        public OwnershipTeamsSupplementaryIdentifiersGetArgs()
        {
        }
        public static new OwnershipTeamsSupplementaryIdentifiersGetArgs Empty => new OwnershipTeamsSupplementaryIdentifiersGetArgs();
    }
}