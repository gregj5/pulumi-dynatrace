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
    public sealed class ApplicationDataPrivacySessionReplayDataPrivacy
    {
        /// <summary>
        /// (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Content masking settings for Session Replay.
        /// </summary>
        public readonly Outputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettings ContentMaskingSettings;
        /// <summary>
        /// (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) If `true`, session recording is disabled until JavaScriptAPI `dtrum.enableSessionReplay()` is called
        /// </summary>
        public readonly bool? OptIn;
        /// <summary>
        /// (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) A list of URLs to be excluded from recording
        /// </summary>
        public readonly ImmutableArray<string> UrlExclusionRules;

        [OutputConstructor]
        private ApplicationDataPrivacySessionReplayDataPrivacy(
            Outputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettings contentMaskingSettings,

            bool? optIn,

            ImmutableArray<string> urlExclusionRules)
        {
            ContentMaskingSettings = contentMaskingSettings;
            OptIn = optIn;
            UrlExclusionRules = urlExclusionRules;
        }
    }
}