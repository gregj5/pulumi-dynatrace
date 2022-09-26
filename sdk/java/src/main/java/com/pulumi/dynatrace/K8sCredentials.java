// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.K8sCredentialsArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.K8sCredentialsState;
import com.pulumi.dynatrace.outputs.K8sCredentialsEventsFieldSelector;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/k8sCredentials:K8sCredentials")
public class K8sCredentials extends com.pulumi.resources.CustomResource {
    /**
     * Monitoring is enabled (`true`) or disabled (`false`) for given credentials configuration.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Monitoring is enabled (`true`) or disabled (`false`) for given credentials configuration.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * The service account bearer token for the Kubernetes API server.  Submit your token on creation or update of the configuration. For security reasons, GET requests return this field as `null`.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    @Export(name="authToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> authToken;

    /**
     * @return The service account bearer token for the Kubernetes API server.  Submit your token on creation or update of the configuration. For security reasons, GET requests return this field as `null`.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    public Output<Optional<String>> authToken() {
        return Codegen.optional(this.authToken);
    }
    /**
     * The check of SSL certificates is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    @Export(name="certificateCheckEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> certificateCheckEnabled;

    /**
     * @return The check of SSL certificates is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    public Output<Optional<Boolean>> certificateCheckEnabled() {
        return Codegen.optional(this.certificateCheckEnabled);
    }
    /**
     * Inclusion of all Davis relevant events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected
     * 
     */
    @Export(name="davisEventsIntegrationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> davisEventsIntegrationEnabled;

    /**
     * @return Inclusion of all Davis relevant events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected
     * 
     */
    public Output<Optional<Boolean>> davisEventsIntegrationEnabled() {
        return Codegen.optional(this.davisEventsIntegrationEnabled);
    }
    /**
     * The URL of the Kubernetes API server.  It must be unique within a Dynatrace environment.  The URL must valid according to RFC 2396. Leading or trailing whitespaces are not allowed.
     * 
     */
    @Export(name="endpointUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointUrl;

    /**
     * @return The URL of the Kubernetes API server.  It must be unique within a Dynatrace environment.  The URL must valid according to RFC 2396. Leading or trailing whitespaces are not allowed.
     * 
     */
    public Output<Optional<String>> endpointUrl() {
        return Codegen.optional(this.endpointUrl);
    }
    /**
     * Event analysis and alerting is (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    @Export(name="eventAnalysisAndAlertingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventAnalysisAndAlertingEnabled;

    /**
     * @return Event analysis and alerting is (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    public Output<Optional<Boolean>> eventAnalysisAndAlertingEnabled() {
        return Codegen.optional(this.eventAnalysisAndAlertingEnabled);
    }
    /**
     * Kubernetes event filters based on field-selectors. If set to `null` on creation, no events field selectors are subscribed. If set to `null` on update, no change of stored events field selectors is applied. Set an empty list to clear all events field selectors.
     * 
     */
    @Export(name="eventsFieldSelectors", type=List.class, parameters={K8sCredentialsEventsFieldSelector.class})
    private Output</* @Nullable */ List<K8sCredentialsEventsFieldSelector>> eventsFieldSelectors;

    /**
     * @return Kubernetes event filters based on field-selectors. If set to `null` on creation, no events field selectors are subscribed. If set to `null` on update, no change of stored events field selectors is applied. Set an empty list to clear all events field selectors.
     * 
     */
    public Output<Optional<List<K8sCredentialsEventsFieldSelector>>> eventsFieldSelectors() {
        return Codegen.optional(this.eventsFieldSelectors);
    }
    /**
     * Monitoring of events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. Event monitoring depends on the active state of this configuration to be true.  If not set on creation, the `false` value is used.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    @Export(name="eventsIntegrationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventsIntegrationEnabled;

    /**
     * @return Monitoring of events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. Event monitoring depends on the active state of this configuration to be true.  If not set on creation, the `false` value is used.  If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    public Output<Optional<Boolean>> eventsIntegrationEnabled() {
        return Codegen.optional(this.eventsIntegrationEnabled);
    }
    /**
     * Verify hostname in certificate against Kubernetes API URL
     * 
     */
    @Export(name="hostnameVerification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hostnameVerification;

    /**
     * @return Verify hostname in certificate against Kubernetes API URL
     * 
     */
    public Output<Optional<Boolean>> hostnameVerification() {
        return Codegen.optional(this.hostnameVerification);
    }
    /**
     * The name of the Kubernetes credentials configuration.  Allowed characters are letters, numbers, whitespaces, and the following characters: `.+-_`. Leading or trailing whitespace is not allowed.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output<String> label;

    /**
     * @return The name of the Kubernetes credentials configuration.  Allowed characters are letters, numbers, whitespaces, and the following characters: `.+-_`. Leading or trailing whitespace is not allowed.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * Prometheus exporters integration is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.If the field is omitted during an update, the old value remains unaffected
     * 
     */
    @Export(name="prometheusExporters", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> prometheusExporters;

    /**
     * @return Prometheus exporters integration is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.If the field is omitted during an update, the old value remains unaffected
     * 
     */
    public Output<Optional<Boolean>> prometheusExporters() {
        return Codegen.optional(this.prometheusExporters);
    }
    /**
     * Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    @Export(name="unknowns", type=String.class, parameters={})
    private Output</* @Nullable */ String> unknowns;

    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    public Output<Optional<String>> unknowns() {
        return Codegen.optional(this.unknowns);
    }
    /**
     * Workload and cloud application processing is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    @Export(name="workloadIntegrationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> workloadIntegrationEnabled;

    /**
     * @return Workload and cloud application processing is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     * 
     */
    public Output<Optional<Boolean>> workloadIntegrationEnabled() {
        return Codegen.optional(this.workloadIntegrationEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public K8sCredentials(String name) {
        this(name, K8sCredentialsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public K8sCredentials(String name, K8sCredentialsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public K8sCredentials(String name, K8sCredentialsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/k8sCredentials:K8sCredentials", name, args == null ? K8sCredentialsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private K8sCredentials(String name, Output<String> id, @Nullable K8sCredentialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/k8sCredentials:K8sCredentials", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static K8sCredentials get(String name, Output<String> id, @Nullable K8sCredentialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new K8sCredentials(name, id, state, options);
    }
}