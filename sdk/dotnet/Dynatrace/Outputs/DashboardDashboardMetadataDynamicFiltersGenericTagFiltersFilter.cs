// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilter
    {
        public readonly ImmutableArray<string> EntityTypes;
        public readonly string? Name;
        public readonly string? SuggestionsFromEntityType;
        public readonly string? TagKey;

        [OutputConstructor]
        private DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilter(
            ImmutableArray<string> entityTypes,

            string? name,

            string? suggestionsFromEntityType,

            string? tagKey)
        {
            EntityTypes = entityTypes;
            Name = name;
            SuggestionsFromEntityType = suggestionsFromEntityType;
            TagKey = tagKey;
        }
    }
}