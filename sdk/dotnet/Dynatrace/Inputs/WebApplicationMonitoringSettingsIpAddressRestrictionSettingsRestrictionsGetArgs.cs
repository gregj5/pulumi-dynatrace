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

    public sealed class WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ranges", required: true)]
        private InputList<Inputs.WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsRangeGetArgs>? _ranges;
        public InputList<Inputs.WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsRangeGetArgs> Ranges
        {
            get => _ranges ?? (_ranges = new InputList<Inputs.WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsRangeGetArgs>());
            set => _ranges = value;
        }

        public WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsGetArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsGetArgs Empty => new WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsGetArgs();
    }
}