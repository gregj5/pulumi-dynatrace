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

    public sealed class WebApplicationConversionGoalsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("goals", required: true)]
        private InputList<Inputs.WebApplicationConversionGoalsGoalGetArgs>? _goals;

        /// <summary>
        /// A conversion goal of the application
        /// </summary>
        public InputList<Inputs.WebApplicationConversionGoalsGoalGetArgs> Goals
        {
            get => _goals ?? (_goals = new InputList<Inputs.WebApplicationConversionGoalsGoalGetArgs>());
            set => _goals = value;
        }

        public WebApplicationConversionGoalsGetArgs()
        {
        }
        public static new WebApplicationConversionGoalsGetArgs Empty => new WebApplicationConversionGoalsGetArgs();
    }
}