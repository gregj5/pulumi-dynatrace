// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/webAppKeyPerformanceXhr:WebAppKeyPerformanceXhr")]
    public partial class WebAppKeyPerformanceXhr : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
        /// </summary>
        [Output("fallbackThresholds")]
        public Output<Outputs.WebAppKeyPerformanceXhrFallbackThresholds?> FallbackThresholds { get; private set; } = null!;

        /// <summary>
        /// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
        /// </summary>
        [Output("kpm")]
        public Output<string> Kpm { get; private set; } = null!;

        /// <summary>
        /// The scope of this setting (APPLICATION_METHOD, APPLICATION)
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;

        /// <summary>
        /// Set the Tolerating and Frustrated performance thresholds for this action type.
        /// </summary>
        [Output("thresholds")]
        public Output<Outputs.WebAppKeyPerformanceXhrThresholds> Thresholds { get; private set; } = null!;


        /// <summary>
        /// Create a WebAppKeyPerformanceXhr resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebAppKeyPerformanceXhr(string name, WebAppKeyPerformanceXhrArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/webAppKeyPerformanceXhr:WebAppKeyPerformanceXhr", name, args ?? new WebAppKeyPerformanceXhrArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebAppKeyPerformanceXhr(string name, Input<string> id, WebAppKeyPerformanceXhrState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/webAppKeyPerformanceXhr:WebAppKeyPerformanceXhr", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumiverse",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WebAppKeyPerformanceXhr resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebAppKeyPerformanceXhr Get(string name, Input<string> id, WebAppKeyPerformanceXhrState? state = null, CustomResourceOptions? options = null)
        {
            return new WebAppKeyPerformanceXhr(name, id, state, options);
        }
    }

    public sealed class WebAppKeyPerformanceXhrArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
        /// </summary>
        [Input("fallbackThresholds")]
        public Input<Inputs.WebAppKeyPerformanceXhrFallbackThresholdsArgs>? FallbackThresholds { get; set; }

        /// <summary>
        /// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
        /// </summary>
        [Input("kpm", required: true)]
        public Input<string> Kpm { get; set; } = null!;

        /// <summary>
        /// The scope of this setting (APPLICATION_METHOD, APPLICATION)
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        /// <summary>
        /// Set the Tolerating and Frustrated performance thresholds for this action type.
        /// </summary>
        [Input("thresholds", required: true)]
        public Input<Inputs.WebAppKeyPerformanceXhrThresholdsArgs> Thresholds { get; set; } = null!;

        public WebAppKeyPerformanceXhrArgs()
        {
        }
        public static new WebAppKeyPerformanceXhrArgs Empty => new WebAppKeyPerformanceXhrArgs();
    }

    public sealed class WebAppKeyPerformanceXhrState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
        /// </summary>
        [Input("fallbackThresholds")]
        public Input<Inputs.WebAppKeyPerformanceXhrFallbackThresholdsGetArgs>? FallbackThresholds { get; set; }

        /// <summary>
        /// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
        /// </summary>
        [Input("kpm")]
        public Input<string>? Kpm { get; set; }

        /// <summary>
        /// The scope of this setting (APPLICATION_METHOD, APPLICATION)
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// Set the Tolerating and Frustrated performance thresholds for this action type.
        /// </summary>
        [Input("thresholds")]
        public Input<Inputs.WebAppKeyPerformanceXhrThresholdsGetArgs>? Thresholds { get; set; }

        public WebAppKeyPerformanceXhrState()
        {
        }
        public static new WebAppKeyPerformanceXhrState Empty => new WebAppKeyPerformanceXhrState();
    }
}