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
    [DynatraceResourceType("dynatrace:index/dbAppFeatureFlags:DbAppFeatureFlags")]
    public partial class DbAppFeatureFlags : global::Pulumi.CustomResource
    {
        /// <summary>
        /// State of boolean feature flag
        /// </summary>
        [Output("booleanValue")]
        public Output<bool?> BooleanValue { get; private set; } = null!;

        /// <summary>
        /// Name of the feature
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// State of numeric feature flag
        /// </summary>
        [Output("numberValue")]
        public Output<int?> NumberValue { get; private set; } = null!;

        /// <summary>
        /// State of textual feature flag
        /// </summary>
        [Output("stringValue")]
        public Output<string?> StringValue { get; private set; } = null!;

        /// <summary>
        /// Possible Values: `Boolean`, `Number`, `String`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DbAppFeatureFlags resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DbAppFeatureFlags(string name, DbAppFeatureFlagsArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/dbAppFeatureFlags:DbAppFeatureFlags", name, args ?? new DbAppFeatureFlagsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DbAppFeatureFlags(string name, Input<string> id, DbAppFeatureFlagsState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/dbAppFeatureFlags:DbAppFeatureFlags", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DbAppFeatureFlags resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DbAppFeatureFlags Get(string name, Input<string> id, DbAppFeatureFlagsState? state = null, CustomResourceOptions? options = null)
        {
            return new DbAppFeatureFlags(name, id, state, options);
        }
    }

    public sealed class DbAppFeatureFlagsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// State of boolean feature flag
        /// </summary>
        [Input("booleanValue")]
        public Input<bool>? BooleanValue { get; set; }

        /// <summary>
        /// Name of the feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// State of numeric feature flag
        /// </summary>
        [Input("numberValue")]
        public Input<int>? NumberValue { get; set; }

        /// <summary>
        /// State of textual feature flag
        /// </summary>
        [Input("stringValue")]
        public Input<string>? StringValue { get; set; }

        /// <summary>
        /// Possible Values: `Boolean`, `Number`, `String`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DbAppFeatureFlagsArgs()
        {
        }
        public static new DbAppFeatureFlagsArgs Empty => new DbAppFeatureFlagsArgs();
    }

    public sealed class DbAppFeatureFlagsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// State of boolean feature flag
        /// </summary>
        [Input("booleanValue")]
        public Input<bool>? BooleanValue { get; set; }

        /// <summary>
        /// Name of the feature
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// State of numeric feature flag
        /// </summary>
        [Input("numberValue")]
        public Input<int>? NumberValue { get; set; }

        /// <summary>
        /// State of textual feature flag
        /// </summary>
        [Input("stringValue")]
        public Input<string>? StringValue { get; set; }

        /// <summary>
        /// Possible Values: `Boolean`, `Number`, `String`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DbAppFeatureFlagsState()
        {
        }
        public static new DbAppFeatureFlagsState Empty => new DbAppFeatureFlagsState();
    }
}