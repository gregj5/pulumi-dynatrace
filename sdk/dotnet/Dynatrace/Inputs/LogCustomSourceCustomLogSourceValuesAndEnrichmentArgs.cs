// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.PulumiPackage.Dynatrace.Inputs
{

    public sealed class LogCustomSourceCustomLogSourceValuesAndEnrichmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("customLogSourceWithEnrichments", required: true)]
        private InputList<Inputs.LogCustomSourceCustomLogSourceValuesAndEnrichmentCustomLogSourceWithEnrichmentArgs>? _customLogSourceWithEnrichments;
        public InputList<Inputs.LogCustomSourceCustomLogSourceValuesAndEnrichmentCustomLogSourceWithEnrichmentArgs> CustomLogSourceWithEnrichments
        {
            get => _customLogSourceWithEnrichments ?? (_customLogSourceWithEnrichments = new InputList<Inputs.LogCustomSourceCustomLogSourceValuesAndEnrichmentCustomLogSourceWithEnrichmentArgs>());
            set => _customLogSourceWithEnrichments = value;
        }

        public LogCustomSourceCustomLogSourceValuesAndEnrichmentArgs()
        {
        }
        public static new LogCustomSourceCustomLogSourceValuesAndEnrichmentArgs Empty => new LogCustomSourceCustomLogSourceValuesAndEnrichmentArgs();
    }
}