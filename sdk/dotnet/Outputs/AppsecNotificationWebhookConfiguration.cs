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
    public sealed class AppsecNotificationWebhookConfiguration
    {
        /// <summary>
        /// Accept any SSL certificate (including self-signed and invalid certificates)
        /// </summary>
        public readonly bool AcceptAnyCertificate;
        /// <summary>
        /// Use additional HTTP headers to attach any additional information, for example, configuration, authorization, or metadata.  
        ///   
        /// Note that JSON-based webhook endpoints require the addition of the **Content-Type: application/json** header to enable escaping of special characters and to avoid malformed JSON content.
        /// </summary>
        public readonly Outputs.AppsecNotificationWebhookConfigurationHeaders? Headers;
        /// <summary>
        /// Webhook endpoint URL
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private AppsecNotificationWebhookConfiguration(
            bool acceptAnyCertificate,

            Outputs.AppsecNotificationWebhookConfigurationHeaders? headers,

            string url)
        {
            AcceptAnyCertificate = acceptAnyCertificate;
            Headers = headers;
            Url = url;
        }
    }
}