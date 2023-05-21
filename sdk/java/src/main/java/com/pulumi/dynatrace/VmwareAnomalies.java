// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.VmwareAnomaliesArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesState;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesDroppedPacketsDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesEsxiHighCpuDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesEsxiHighMemoryDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesGuestCpuLimitDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesLowDatastoreSpaceDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesOverloadedStorageDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesSlowPhysicalStorageDetection;
import com.pulumi.dynatrace.outputs.VmwareAnomaliesUndersizedStorageDetection;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/vmwareAnomalies:VmwareAnomalies")
public class VmwareAnomalies extends com.pulumi.resources.CustomResource {
    /**
     * no documentation available
     * 
     */
    @Export(name="droppedPacketsDetection", refs={VmwareAnomaliesDroppedPacketsDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesDroppedPacketsDetection> droppedPacketsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesDroppedPacketsDetection> droppedPacketsDetection() {
        return this.droppedPacketsDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="esxiHighCpuDetection", refs={VmwareAnomaliesEsxiHighCpuDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesEsxiHighCpuDetection> esxiHighCpuDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesEsxiHighCpuDetection> esxiHighCpuDetection() {
        return this.esxiHighCpuDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="esxiHighMemoryDetection", refs={VmwareAnomaliesEsxiHighMemoryDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesEsxiHighMemoryDetection> esxiHighMemoryDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesEsxiHighMemoryDetection> esxiHighMemoryDetection() {
        return this.esxiHighMemoryDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="guestCpuLimitDetection", refs={VmwareAnomaliesGuestCpuLimitDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesGuestCpuLimitDetection> guestCpuLimitDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesGuestCpuLimitDetection> guestCpuLimitDetection() {
        return this.guestCpuLimitDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="lowDatastoreSpaceDetection", refs={VmwareAnomaliesLowDatastoreSpaceDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesLowDatastoreSpaceDetection> lowDatastoreSpaceDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesLowDatastoreSpaceDetection> lowDatastoreSpaceDetection() {
        return this.lowDatastoreSpaceDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="overloadedStorageDetection", refs={VmwareAnomaliesOverloadedStorageDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesOverloadedStorageDetection> overloadedStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesOverloadedStorageDetection> overloadedStorageDetection() {
        return this.overloadedStorageDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="slowPhysicalStorageDetection", refs={VmwareAnomaliesSlowPhysicalStorageDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesSlowPhysicalStorageDetection> slowPhysicalStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesSlowPhysicalStorageDetection> slowPhysicalStorageDetection() {
        return this.slowPhysicalStorageDetection;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="undersizedStorageDetection", refs={VmwareAnomaliesUndersizedStorageDetection.class}, tree="[0]")
    private Output<VmwareAnomaliesUndersizedStorageDetection> undersizedStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<VmwareAnomaliesUndersizedStorageDetection> undersizedStorageDetection() {
        return this.undersizedStorageDetection;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VmwareAnomalies(String name) {
        this(name, VmwareAnomaliesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VmwareAnomalies(String name, VmwareAnomaliesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VmwareAnomalies(String name, VmwareAnomaliesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/vmwareAnomalies:VmwareAnomalies", name, args == null ? VmwareAnomaliesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VmwareAnomalies(String name, Output<String> id, @Nullable VmwareAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/vmwareAnomalies:VmwareAnomalies", name, state, makeResourceOptions(options, id));
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
    public static VmwareAnomalies get(String name, Output<String> id, @Nullable VmwareAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VmwareAnomalies(name, id, state, options);
    }
}