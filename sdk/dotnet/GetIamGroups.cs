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
    public static class GetIamGroups
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all_groups = Dynatrace.GetIamGroups.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["groups"] = all_groups,
        ///     };
        /// });
        /// ```
        /// 
        /// ### Example output
        /// ```
        /// Changes to Outputs:
        ///   + groups = {
        ///       + groups = {
        ///           + "########-3036-3ac2-5fa4-############" = "Group A"
        ///           + "########-4049-4241-ac2b-############" = "Group B"
        ///           + "########-5365-4450-89ab-############" = "Group C"
        ///         }
        ///       + id     = "iam-groups"
        ///     }
        /// ```
        /// </summary>
        public static Task<GetIamGroupsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIamGroupsResult>("dynatrace:index/getIamGroups:getIamGroups", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all_groups = Dynatrace.GetIamGroups.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["groups"] = all_groups,
        ///     };
        /// });
        /// ```
        /// 
        /// ### Example output
        /// ```
        /// Changes to Outputs:
        ///   + groups = {
        ///       + groups = {
        ///           + "########-3036-3ac2-5fa4-############" = "Group A"
        ///           + "########-4049-4241-ac2b-############" = "Group B"
        ///           + "########-5365-4450-89ab-############" = "Group C"
        ///         }
        ///       + id     = "iam-groups"
        ///     }
        /// ```
        /// </summary>
        public static Output<GetIamGroupsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamGroupsResult>("dynatrace:index/getIamGroups:getIamGroups", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIamGroupsResult
    {
        public readonly ImmutableDictionary<string, string> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetIamGroupsResult(
            ImmutableDictionary<string, string> groups,

            string id)
        {
            Groups = groups;
            Id = id;
        }
    }
}