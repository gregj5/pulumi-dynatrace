// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > This resource requires the API token scopes **Read configuration** (`ReadConfig`) and **Write configuration** (`WriteConfig`)
 *
 * ## Dynatrace Documentation
 *
 * - Subscribe to Dynatrace dashboard reports - https://docs.dynatrace.com/docs/observe-and-explore/dashboards-classic/dashboards/subscribe-to-dashboard-reports
 *
 * - Reports API - https://docs.dynatrace.com/docs/dynatrace-api/configuration-api/reports-api
 */
export class Report extends pulumi.CustomResource {
    /**
     * Get an existing Report resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReportState, opts?: pulumi.CustomResourceOptions): Report {
        return new Report(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/report:Report';

    /**
     * Returns true if the given object is an instance of Report.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Report {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Report.__pulumiType;
    }

    /**
     * The ID of the associated dashboard
     */
    public readonly dashboardId!: pulumi.Output<string>;
    /**
     * The email notifications for the dashboard report are enabled (true) or disabled (false).
     */
    public readonly emailNotifications!: pulumi.Output<boolean | undefined>;
    /**
     * A list of the report subscribers
     */
    public readonly subscriptions!: pulumi.Output<outputs.ReportSubscriptions | undefined>;
    /**
     * The type of report
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a Report resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReportArgs | ReportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReportState | undefined;
            resourceInputs["dashboardId"] = state ? state.dashboardId : undefined;
            resourceInputs["emailNotifications"] = state ? state.emailNotifications : undefined;
            resourceInputs["subscriptions"] = state ? state.subscriptions : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ReportArgs | undefined;
            if ((!args || args.dashboardId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dashboardId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["dashboardId"] = args ? args.dashboardId : undefined;
            resourceInputs["emailNotifications"] = args ? args.emailNotifications : undefined;
            resourceInputs["subscriptions"] = args ? args.subscriptions : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Report.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Report resources.
 */
export interface ReportState {
    /**
     * The ID of the associated dashboard
     */
    dashboardId?: pulumi.Input<string>;
    /**
     * The email notifications for the dashboard report are enabled (true) or disabled (false).
     */
    emailNotifications?: pulumi.Input<boolean>;
    /**
     * A list of the report subscribers
     */
    subscriptions?: pulumi.Input<inputs.ReportSubscriptions>;
    /**
     * The type of report
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Report resource.
 */
export interface ReportArgs {
    /**
     * The ID of the associated dashboard
     */
    dashboardId: pulumi.Input<string>;
    /**
     * The email notifications for the dashboard report are enabled (true) or disabled (false).
     */
    emailNotifications?: pulumi.Input<boolean>;
    /**
     * A list of the report subscribers
     */
    subscriptions?: pulumi.Input<inputs.ReportSubscriptions>;
    /**
     * The type of report
     */
    type: pulumi.Input<string>;
}