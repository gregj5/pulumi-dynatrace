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
    public sealed class ProcessgroupNamingConditionConditionSimpleTechComparisonValue
    {
        /// <summary>
        /// Predefined technology, if technology is not predefined, then the verbatim type must be set.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Any attributes that aren't yet supported by this provider
        /// </summary>
        public readonly string? Unknowns;
        /// <summary>
        /// Non-predefined technology, use for custom technologies
        /// </summary>
        public readonly string? VerbatimType;

        [OutputConstructor]
        private ProcessgroupNamingConditionConditionSimpleTechComparisonValue(
            string? type,

            string? unknowns,

            string? verbatimType)
        {
            Type = type;
            Unknowns = unknowns;
            VerbatimType = verbatimType;
        }
    }
}