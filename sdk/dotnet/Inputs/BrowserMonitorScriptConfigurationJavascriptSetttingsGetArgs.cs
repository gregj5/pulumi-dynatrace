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

    public sealed class BrowserMonitorScriptConfigurationJavascriptSetttingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional Javascript Agent Properties
        /// </summary>
        [Input("customProperties")]
        public Input<string>? CustomProperties { get; set; }

        /// <summary>
        /// Custom JavaScript Agent settings
        /// </summary>
        [Input("timeoutSettings")]
        public Input<Inputs.BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettingsGetArgs>? TimeoutSettings { get; set; }

        /// <summary>
        /// Parameters for Visually complete and Speed index calculation
        /// </summary>
        [Input("visuallyCompleteOptions")]
        public Input<Inputs.BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptionsGetArgs>? VisuallyCompleteOptions { get; set; }

        public BrowserMonitorScriptConfigurationJavascriptSetttingsGetArgs()
        {
        }
        public static new BrowserMonitorScriptConfigurationJavascriptSetttingsGetArgs Empty => new BrowserMonitorScriptConfigurationJavascriptSetttingsGetArgs();
    }
}