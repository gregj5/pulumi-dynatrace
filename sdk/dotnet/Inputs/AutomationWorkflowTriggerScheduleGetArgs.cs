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

    public sealed class AutomationWorkflowTriggerScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The trigger is enabled (`true`) or not (`false`). Default is `false`
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Advanced restrictions for the schedule to trigger executions
        /// </summary>
        [Input("filterParameters")]
        public Input<Inputs.AutomationWorkflowTriggerScheduleFilterParametersGetArgs>? FilterParameters { get; set; }

        /// <summary>
        /// Refers to a configured rule that determines at which days the schedule should be active. If not specified it implies that the schedule is valid every day
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        /// <summary>
        /// A time zone the scheduled times to align with. If not specified it will be chosen automatically based on the location of the Dynatrace Server
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        /// <summary>
        /// Detailed configuration about the timing constraints that trigger the execution
        /// </summary>
        [Input("trigger", required: true)]
        public Input<Inputs.AutomationWorkflowTriggerScheduleTriggerGetArgs> Trigger { get; set; } = null!;

        public AutomationWorkflowTriggerScheduleGetArgs()
        {
        }
        public static new AutomationWorkflowTriggerScheduleGetArgs Empty => new AutomationWorkflowTriggerScheduleGetArgs();
    }
}