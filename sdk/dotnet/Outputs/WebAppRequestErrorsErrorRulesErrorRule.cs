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
    public sealed class WebAppRequestErrorsErrorRulesErrorRule
    {
        /// <summary>
        /// Capture settings
        /// </summary>
        public readonly Outputs.WebAppRequestErrorsErrorRulesErrorRuleCaptureSettings CaptureSettings;
        /// <summary>
        /// Match by errors that have CSP violations
        /// </summary>
        public readonly bool ConsiderCspViolations;
        /// <summary>
        /// Match by errors that have failed image requests
        /// </summary>
        public readonly bool ConsiderFailedImages;
        /// <summary>
        /// Match by error code
        /// </summary>
        public readonly string? ErrorCodes;
        /// <summary>
        /// Filter settings
        /// </summary>
        public readonly Outputs.WebAppRequestErrorsErrorRulesErrorRuleFilterSettings FilterSettings;

        [OutputConstructor]
        private WebAppRequestErrorsErrorRulesErrorRule(
            Outputs.WebAppRequestErrorsErrorRulesErrorRuleCaptureSettings captureSettings,

            bool considerCspViolations,

            bool considerFailedImages,

            string? errorCodes,

            Outputs.WebAppRequestErrorsErrorRulesErrorRuleFilterSettings filterSettings)
        {
            CaptureSettings = captureSettings;
            ConsiderCspViolations = considerCspViolations;
            ConsiderFailedImages = considerFailedImages;
            ErrorCodes = errorCodes;
            FilterSettings = filterSettings;
        }
    }
}