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
    public sealed class VmwareAnomaliesEsxiHighMemoryDetectionCustomThresholds
    {
        /// <summary>
        /// ESXi host swap IN/OUT or compression/decompression rate is higher than
        /// </summary>
        public readonly double CompressionDecompressionRate;

        [OutputConstructor]
        private VmwareAnomaliesEsxiHighMemoryDetectionCustomThresholds(double compressionDecompressionRate)
        {
            CompressionDecompressionRate = compressionDecompressionRate;
        }
    }
}