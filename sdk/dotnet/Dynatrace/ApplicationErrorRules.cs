// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/applicationErrorRules:ApplicationErrorRules")]
    public partial class ApplicationErrorRules : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An ordered list of HTTP errors.
        /// </summary>
        [Output("customErrors")]
        public Output<Outputs.ApplicationErrorRulesCustomErrors?> CustomErrors { get; private set; } = null!;

        /// <summary>
        /// An ordered list of HTTP errors. Rules are evaluated from top to bottom; the first matching rule applies
        /// </summary>
        [Output("httpErrors")]
        public Output<Outputs.ApplicationErrorRulesHttpErrors?> HttpErrors { get; private set; } = null!;

        /// <summary>
        /// Exclude (`true`) or include (`false`) custom errors listed in **customErrorRules** in Apdex calculation
        /// </summary>
        [Output("ignoreCustomErrorsApdex")]
        public Output<bool?> IgnoreCustomErrorsApdex { get; private set; } = null!;

        /// <summary>
        /// Exclude (`true`) or include (`false`) HTTP errors listed in **httpErrorRules** in Apdex calculation
        /// </summary>
        [Output("ignoreHttpErrorsApdex")]
        public Output<bool?> IgnoreHttpErrorsApdex { get; private set; } = null!;

        /// <summary>
        /// Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
        /// </summary>
        [Output("ignoreJsErrorsApdex")]
        public Output<bool?> IgnoreJsErrorsApdex { get; private set; } = null!;

        /// <summary>
        /// The EntityID of the the WebApplication
        /// </summary>
        [Output("webApplicationId")]
        public Output<string?> WebApplicationId { get; private set; } = null!;


        /// <summary>
        /// Create a ApplicationErrorRules resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplicationErrorRules(string name, ApplicationErrorRulesArgs? args = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/applicationErrorRules:ApplicationErrorRules", name, args ?? new ApplicationErrorRulesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplicationErrorRules(string name, Input<string> id, ApplicationErrorRulesState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/applicationErrorRules:ApplicationErrorRules", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApplicationErrorRules resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplicationErrorRules Get(string name, Input<string> id, ApplicationErrorRulesState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplicationErrorRules(name, id, state, options);
        }
    }

    public sealed class ApplicationErrorRulesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An ordered list of HTTP errors.
        /// </summary>
        [Input("customErrors")]
        public Input<Inputs.ApplicationErrorRulesCustomErrorsArgs>? CustomErrors { get; set; }

        /// <summary>
        /// An ordered list of HTTP errors. Rules are evaluated from top to bottom; the first matching rule applies
        /// </summary>
        [Input("httpErrors")]
        public Input<Inputs.ApplicationErrorRulesHttpErrorsArgs>? HttpErrors { get; set; }

        /// <summary>
        /// Exclude (`true`) or include (`false`) custom errors listed in **customErrorRules** in Apdex calculation
        /// </summary>
        [Input("ignoreCustomErrorsApdex")]
        public Input<bool>? IgnoreCustomErrorsApdex { get; set; }

        /// <summary>
        /// Exclude (`true`) or include (`false`) HTTP errors listed in **httpErrorRules** in Apdex calculation
        /// </summary>
        [Input("ignoreHttpErrorsApdex")]
        public Input<bool>? IgnoreHttpErrorsApdex { get; set; }

        /// <summary>
        /// Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
        /// </summary>
        [Input("ignoreJsErrorsApdex")]
        public Input<bool>? IgnoreJsErrorsApdex { get; set; }

        /// <summary>
        /// The EntityID of the the WebApplication
        /// </summary>
        [Input("webApplicationId")]
        public Input<string>? WebApplicationId { get; set; }

        public ApplicationErrorRulesArgs()
        {
        }
        public static new ApplicationErrorRulesArgs Empty => new ApplicationErrorRulesArgs();
    }

    public sealed class ApplicationErrorRulesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An ordered list of HTTP errors.
        /// </summary>
        [Input("customErrors")]
        public Input<Inputs.ApplicationErrorRulesCustomErrorsGetArgs>? CustomErrors { get; set; }

        /// <summary>
        /// An ordered list of HTTP errors. Rules are evaluated from top to bottom; the first matching rule applies
        /// </summary>
        [Input("httpErrors")]
        public Input<Inputs.ApplicationErrorRulesHttpErrorsGetArgs>? HttpErrors { get; set; }

        /// <summary>
        /// Exclude (`true`) or include (`false`) custom errors listed in **customErrorRules** in Apdex calculation
        /// </summary>
        [Input("ignoreCustomErrorsApdex")]
        public Input<bool>? IgnoreCustomErrorsApdex { get; set; }

        /// <summary>
        /// Exclude (`true`) or include (`false`) HTTP errors listed in **httpErrorRules** in Apdex calculation
        /// </summary>
        [Input("ignoreHttpErrorsApdex")]
        public Input<bool>? IgnoreHttpErrorsApdex { get; set; }

        /// <summary>
        /// Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
        /// </summary>
        [Input("ignoreJsErrorsApdex")]
        public Input<bool>? IgnoreJsErrorsApdex { get; set; }

        /// <summary>
        /// The EntityID of the the WebApplication
        /// </summary>
        [Input("webApplicationId")]
        public Input<string>? WebApplicationId { get; set; }

        public ApplicationErrorRulesState()
        {
        }
        public static new ApplicationErrorRulesState Empty => new ApplicationErrorRulesState();
    }
}