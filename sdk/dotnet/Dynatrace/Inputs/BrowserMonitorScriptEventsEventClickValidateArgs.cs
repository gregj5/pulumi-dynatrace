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

    public sealed class BrowserMonitorScriptEventsEventClickValidateArgs : global::Pulumi.ResourceArgs
    {
        [Input("validations", required: true)]
        private InputList<Inputs.BrowserMonitorScriptEventsEventClickValidateValidationArgs>? _validations;
        public InputList<Inputs.BrowserMonitorScriptEventsEventClickValidateValidationArgs> Validations
        {
            get => _validations ?? (_validations = new InputList<Inputs.BrowserMonitorScriptEventsEventClickValidateValidationArgs>());
            set => _validations = value;
        }

        public BrowserMonitorScriptEventsEventClickValidateArgs()
        {
        }
        public static new BrowserMonitorScriptEventsEventClickValidateArgs Empty => new BrowserMonitorScriptEventsEventClickValidateArgs();
    }
}