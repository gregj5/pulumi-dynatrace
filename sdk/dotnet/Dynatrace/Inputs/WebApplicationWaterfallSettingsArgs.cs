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

    public sealed class WebApplicationWaterfallSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Warn about resources with a lower browser cache rate above *X*%. Values between 1 and 100 are allowed.
        /// </summary>
        [Input("resourceBrowserCachingThreshold", required: true)]
        public Input<int> ResourceBrowserCachingThreshold { get; set; } = null!;

        /// <summary>
        /// Warn about resources larger than *X* bytes. Values between 0 and 99999000 are allowed.
        /// </summary>
        [Input("resourcesThreshold", required: true)]
        public Input<int> ResourcesThreshold { get; set; } = null!;

        /// <summary>
        /// Warn about slow CDN resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
        /// </summary>
        [Input("slowCndResourcesThreshold", required: true)]
        public Input<int> SlowCndResourcesThreshold { get; set; } = null!;

        /// <summary>
        /// Warn about slow 1st party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
        /// </summary>
        [Input("slowFirstPartyResourcesThreshold", required: true)]
        public Input<int> SlowFirstPartyResourcesThreshold { get; set; } = null!;

        /// <summary>
        /// Warn about slow 3rd party resources with a response time above *X* ms. Values between 0 and 99999000 are allowed.
        /// </summary>
        [Input("slowThirdPartyResourcesThreshold", required: true)]
        public Input<int> SlowThirdPartyResourcesThreshold { get; set; } = null!;

        /// <summary>
        /// Warn if Speed index exceeds *X* % of Visually complete. Values between 1 and 99 are allowed.
        /// </summary>
        [Input("speedIndexVisuallyCompleteRatioThreshold", required: true)]
        public Input<int> SpeedIndexVisuallyCompleteRatioThreshold { get; set; } = null!;

        /// <summary>
        /// Warn about uncompressed resources larger than *X* bytes. Values between 0 and 99999 are allowed.
        /// </summary>
        [Input("uncompressedResourcesThreshold", required: true)]
        public Input<int> UncompressedResourcesThreshold { get; set; } = null!;

        public WebApplicationWaterfallSettingsArgs()
        {
        }
        public static new WebApplicationWaterfallSettingsArgs Empty => new WebApplicationWaterfallSettingsArgs();
    }
}