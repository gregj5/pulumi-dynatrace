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
    public sealed class NotificationJira
    {
        /// <summary>
        /// The configuration is enabled (`true`) or disabled (`false`)
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// The ID of the associated alerting profile
        /// </summary>
        public readonly string AlertingProfile;
        /// <summary>
        /// The description of the Jira issue to be created by this notification.   You can use same placeholders as in issue summary
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The type of the Jira issue to be created by this notification
        /// </summary>
        public readonly string IssueType;
        /// <summary>
        /// The name of the notification configuration
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The password for the Jira profile
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The project key of the Jira issue to be created by this notification
        /// </summary>
        public readonly string ProjectKey;
        /// <summary>
        /// The summary of the Jira issue to be created by this notification.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        /// </summary>
        public readonly string Summary;
        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        public readonly string? Unknowns;
        /// <summary>
        /// The URL of the Jira API endpoint
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The username of the Jira profile
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private NotificationJira(
            bool active,

            string alertingProfile,

            string description,

            string issueType,

            string name,

            string? password,

            string projectKey,

            string summary,

            string? unknowns,

            string url,

            string username)
        {
            Active = active;
            AlertingProfile = alertingProfile;
            Description = description;
            IssueType = issueType;
            Name = name;
            Password = password;
            ProjectKey = projectKey;
            Summary = summary;
            Unknowns = unknowns;
            Url = url;
            Username = username;
        }
    }
}