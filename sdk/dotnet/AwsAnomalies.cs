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
    [DynatraceResourceType("dynatrace:index/awsAnomalies:AwsAnomalies")]
    public partial class AwsAnomalies : global::Pulumi.CustomResource
    {
        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("ec2CandidateHighCpuDetection")]
        public Output<Outputs.AwsAnomaliesEc2CandidateHighCpuDetection> Ec2CandidateHighCpuDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("elbHighConnectionErrorsDetection")]
        public Output<Outputs.AwsAnomaliesElbHighConnectionErrorsDetection> ElbHighConnectionErrorsDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("lambdaHighErrorRateDetection")]
        public Output<Outputs.AwsAnomaliesLambdaHighErrorRateDetection> LambdaHighErrorRateDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("rdsHighCpuDetection")]
        public Output<Outputs.AwsAnomaliesRdsHighCpuDetection> RdsHighCpuDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("rdsHighMemoryDetection")]
        public Output<Outputs.AwsAnomaliesRdsHighMemoryDetection> RdsHighMemoryDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("rdsHighWriteReadLatencyDetection")]
        public Output<Outputs.AwsAnomaliesRdsHighWriteReadLatencyDetection> RdsHighWriteReadLatencyDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("rdsLowStorageDetection")]
        public Output<Outputs.AwsAnomaliesRdsLowStorageDetection> RdsLowStorageDetection { get; private set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Output("rdsRestartsSequenceDetection")]
        public Output<Outputs.AwsAnomaliesRdsRestartsSequenceDetection> RdsRestartsSequenceDetection { get; private set; } = null!;


        /// <summary>
        /// Create a AwsAnomalies resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsAnomalies(string name, AwsAnomaliesArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/awsAnomalies:AwsAnomalies", name, args ?? new AwsAnomaliesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsAnomalies(string name, Input<string> id, AwsAnomaliesState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/awsAnomalies:AwsAnomalies", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AwsAnomalies resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsAnomalies Get(string name, Input<string> id, AwsAnomaliesState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsAnomalies(name, id, state, options);
        }
    }

    public sealed class AwsAnomaliesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("ec2CandidateHighCpuDetection", required: true)]
        public Input<Inputs.AwsAnomaliesEc2CandidateHighCpuDetectionArgs> Ec2CandidateHighCpuDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("elbHighConnectionErrorsDetection", required: true)]
        public Input<Inputs.AwsAnomaliesElbHighConnectionErrorsDetectionArgs> ElbHighConnectionErrorsDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("lambdaHighErrorRateDetection", required: true)]
        public Input<Inputs.AwsAnomaliesLambdaHighErrorRateDetectionArgs> LambdaHighErrorRateDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsHighCpuDetection", required: true)]
        public Input<Inputs.AwsAnomaliesRdsHighCpuDetectionArgs> RdsHighCpuDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsHighMemoryDetection", required: true)]
        public Input<Inputs.AwsAnomaliesRdsHighMemoryDetectionArgs> RdsHighMemoryDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsHighWriteReadLatencyDetection", required: true)]
        public Input<Inputs.AwsAnomaliesRdsHighWriteReadLatencyDetectionArgs> RdsHighWriteReadLatencyDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsLowStorageDetection", required: true)]
        public Input<Inputs.AwsAnomaliesRdsLowStorageDetectionArgs> RdsLowStorageDetection { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsRestartsSequenceDetection", required: true)]
        public Input<Inputs.AwsAnomaliesRdsRestartsSequenceDetectionArgs> RdsRestartsSequenceDetection { get; set; } = null!;

        public AwsAnomaliesArgs()
        {
        }
        public static new AwsAnomaliesArgs Empty => new AwsAnomaliesArgs();
    }

    public sealed class AwsAnomaliesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("ec2CandidateHighCpuDetection")]
        public Input<Inputs.AwsAnomaliesEc2CandidateHighCpuDetectionGetArgs>? Ec2CandidateHighCpuDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("elbHighConnectionErrorsDetection")]
        public Input<Inputs.AwsAnomaliesElbHighConnectionErrorsDetectionGetArgs>? ElbHighConnectionErrorsDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("lambdaHighErrorRateDetection")]
        public Input<Inputs.AwsAnomaliesLambdaHighErrorRateDetectionGetArgs>? LambdaHighErrorRateDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsHighCpuDetection")]
        public Input<Inputs.AwsAnomaliesRdsHighCpuDetectionGetArgs>? RdsHighCpuDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsHighMemoryDetection")]
        public Input<Inputs.AwsAnomaliesRdsHighMemoryDetectionGetArgs>? RdsHighMemoryDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsHighWriteReadLatencyDetection")]
        public Input<Inputs.AwsAnomaliesRdsHighWriteReadLatencyDetectionGetArgs>? RdsHighWriteReadLatencyDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsLowStorageDetection")]
        public Input<Inputs.AwsAnomaliesRdsLowStorageDetectionGetArgs>? RdsLowStorageDetection { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("rdsRestartsSequenceDetection")]
        public Input<Inputs.AwsAnomaliesRdsRestartsSequenceDetectionGetArgs>? RdsRestartsSequenceDetection { get; set; }

        public AwsAnomaliesState()
        {
        }
        public static new AwsAnomaliesState Empty => new AwsAnomaliesState();
    }
}