// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Dynatrace.Outputs
{

    [OutputType]
    public sealed class WebApplicationConversionGoalsGoalVisitNumAction
    {
        /// <summary>
        /// The number of user actions to hit the conversion goal
        /// </summary>
        public readonly int? NumUserActions;

        [OutputConstructor]
        private WebApplicationConversionGoalsGoalVisitNumAction(int? numUserActions)
        {
            NumUserActions = numUserActions;
        }
    }
}