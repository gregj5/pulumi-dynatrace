// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class MetricMetadata extends pulumi.CustomResource {
    /**
     * Get an existing MetricMetadata resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MetricMetadataState, opts?: pulumi.CustomResourceOptions): MetricMetadata {
        return new MetricMetadata(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/metricMetadata:MetricMetadata';

    /**
     * Returns true if the given object is an instance of MetricMetadata.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MetricMetadata {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MetricMetadata.__pulumiType;
    }

    /**
     * Description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Define metadata per metric dimension.
     */
    public readonly dimensions!: pulumi.Output<outputs.MetricMetadataDimensions | undefined>;
    /**
     * Display name
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The scope of this setting (metric)
     */
    public readonly metricId!: pulumi.Output<string>;
    /**
     * Metric properties
     */
    public readonly metricProperties!: pulumi.Output<outputs.MetricMetadataMetricProperties | undefined>;
    /**
     * Specifies which entity dimension should be used as the primary dimension. The property can only be configured for metrics ingested with the Metrics API.
     */
    public readonly sourceEntityType!: pulumi.Output<string | undefined>;
    /**
     * Tags
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Unit
     */
    public readonly unit!: pulumi.Output<string>;
    /**
     * The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:
     */
    public readonly unitDisplayFormat!: pulumi.Output<string | undefined>;

    /**
     * Create a MetricMetadata resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MetricMetadataArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MetricMetadataArgs | MetricMetadataState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MetricMetadataState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dimensions"] = state ? state.dimensions : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["metricId"] = state ? state.metricId : undefined;
            resourceInputs["metricProperties"] = state ? state.metricProperties : undefined;
            resourceInputs["sourceEntityType"] = state ? state.sourceEntityType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["unit"] = state ? state.unit : undefined;
            resourceInputs["unitDisplayFormat"] = state ? state.unitDisplayFormat : undefined;
        } else {
            const args = argsOrState as MetricMetadataArgs | undefined;
            if ((!args || args.metricId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricId'");
            }
            if ((!args || args.unit === undefined) && !opts.urn) {
                throw new Error("Missing required property 'unit'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dimensions"] = args ? args.dimensions : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["metricId"] = args ? args.metricId : undefined;
            resourceInputs["metricProperties"] = args ? args.metricProperties : undefined;
            resourceInputs["sourceEntityType"] = args ? args.sourceEntityType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["unit"] = args ? args.unit : undefined;
            resourceInputs["unitDisplayFormat"] = args ? args.unitDisplayFormat : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MetricMetadata.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MetricMetadata resources.
 */
export interface MetricMetadataState {
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * Define metadata per metric dimension.
     */
    dimensions?: pulumi.Input<inputs.MetricMetadataDimensions>;
    /**
     * Display name
     */
    displayName?: pulumi.Input<string>;
    /**
     * The scope of this setting (metric)
     */
    metricId?: pulumi.Input<string>;
    /**
     * Metric properties
     */
    metricProperties?: pulumi.Input<inputs.MetricMetadataMetricProperties>;
    /**
     * Specifies which entity dimension should be used as the primary dimension. The property can only be configured for metrics ingested with the Metrics API.
     */
    sourceEntityType?: pulumi.Input<string>;
    /**
     * Tags
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unit
     */
    unit?: pulumi.Input<string>;
    /**
     * The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:
     */
    unitDisplayFormat?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MetricMetadata resource.
 */
export interface MetricMetadataArgs {
    /**
     * Description
     */
    description?: pulumi.Input<string>;
    /**
     * Define metadata per metric dimension.
     */
    dimensions?: pulumi.Input<inputs.MetricMetadataDimensions>;
    /**
     * Display name
     */
    displayName?: pulumi.Input<string>;
    /**
     * The scope of this setting (metric)
     */
    metricId: pulumi.Input<string>;
    /**
     * Metric properties
     */
    metricProperties?: pulumi.Input<inputs.MetricMetadataMetricProperties>;
    /**
     * Specifies which entity dimension should be used as the primary dimension. The property can only be configured for metrics ingested with the Metrics API.
     */
    sourceEntityType?: pulumi.Input<string>;
    /**
     * Tags
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unit
     */
    unit: pulumi.Input<string>;
    /**
     * The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:
     */
    unitDisplayFormat?: pulumi.Input<string>;
}