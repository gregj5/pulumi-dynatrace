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

    public sealed class WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsGlobalEventCaptureSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalEventCapturedAsUserInput")]
        public Input<string>? AdditionalEventCapturedAsUserInput { get; set; }

        [Input("click")]
        public Input<bool>? Click { get; set; }

        [Input("doubleclick")]
        public Input<bool>? Doubleclick { get; set; }

        [Input("keydown")]
        public Input<bool>? Keydown { get; set; }

        [Input("keyup")]
        public Input<bool>? Keyup { get; set; }

        [Input("mousedown")]
        public Input<bool>? Mousedown { get; set; }

        [Input("mouseup")]
        public Input<bool>? Mouseup { get; set; }

        [Input("scroll")]
        public Input<bool>? Scroll { get; set; }

        public WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsGlobalEventCaptureSettingsGetArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsGlobalEventCaptureSettingsGetArgs Empty => new WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsGlobalEventCaptureSettingsGetArgs();
    }
}