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

    public sealed class MaintenanceFiltersArgs : global::Pulumi.ResourceArgs
    {
        [Input("filters", required: true)]
        private InputList<Inputs.MaintenanceFiltersFilterArgs>? _filters;
        public InputList<Inputs.MaintenanceFiltersFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.MaintenanceFiltersFilterArgs>());
            set => _filters = value;
        }

        public MaintenanceFiltersArgs()
        {
        }
        public static new MaintenanceFiltersArgs Empty => new MaintenanceFiltersArgs();
    }
}