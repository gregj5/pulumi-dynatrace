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
    public sealed class MaintenanceWindowSchedule
    {
        /// <summary>
        /// The end date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format
        /// </summary>
        public readonly string End;
        /// <summary>
        /// The recurrence of the maintenance window
        /// </summary>
        public readonly Outputs.MaintenanceWindowScheduleRecurrence? Recurrence;
        /// <summary>
        /// The type of the schedule recurrence. Possible values are `DAILY`, `MONTHLY`, `ONCE` and `WEEKLY`
        /// </summary>
        public readonly string RecurrenceType;
        /// <summary>
        /// The start date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format
        /// </summary>
        public readonly string Start;
        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        public readonly string? Unknowns;
        /// <summary>
        /// The time zone of the start and end time. Default time zone is UTC. You can use either UTC offset `UTC+01:00` format or the IANA Time Zone Database format (for example, `Europe/Vienna`)
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private MaintenanceWindowSchedule(
            string end,

            Outputs.MaintenanceWindowScheduleRecurrence? recurrence,

            string recurrenceType,

            string start,

            string? unknowns,

            string zoneId)
        {
            End = end;
            Recurrence = recurrence;
            RecurrenceType = recurrenceType;
            Start = start;
            Unknowns = unknowns;
            ZoneId = zoneId;
        }
    }
}