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
    public sealed class EnvironmentStorage
    {
        public readonly Outputs.EnvironmentStorageLimits? Limits;
        public readonly Outputs.EnvironmentStorageRetention? Retention;
        /// <summary>
        /// Maximum number of newly monitored entry point PurePaths captured per process/minute on environment level. Can be set to any value from 100 to 100000
        /// </summary>
        public readonly int Transactions;
        /// <summary>
        /// Maximum number of user actions generated per minute on environment level. Can be set to any value from 1 to 2147483646 or left unlimited by omitting this property
        /// </summary>
        public readonly int? UserActions;

        [OutputConstructor]
        private EnvironmentStorage(
            Outputs.EnvironmentStorageLimits? limits,

            Outputs.EnvironmentStorageRetention? retention,

            int transactions,

            int? userActions)
        {
            Limits = limits;
            Retention = retention;
            Transactions = transactions;
            UserActions = userActions;
        }
    }
}