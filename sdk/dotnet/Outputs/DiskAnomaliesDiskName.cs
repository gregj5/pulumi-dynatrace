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
    public sealed class DiskAnomaliesDiskName
    {
        /// <summary>
        /// Possible values are: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS` and `STARTS_WITH`
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Value to compare to
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private DiskAnomaliesDiskName(
            string @operator,

            string value)
        {
            Operator = @operator;
            Value = value;
        }
    }
}