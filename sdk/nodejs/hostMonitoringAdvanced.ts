// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class HostMonitoringAdvanced extends pulumi.CustomResource {
    /**
     * Get an existing HostMonitoringAdvanced resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostMonitoringAdvancedState, opts?: pulumi.CustomResourceOptions): HostMonitoringAdvanced {
        return new HostMonitoringAdvanced(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/hostMonitoringAdvanced:HostMonitoringAdvanced';

    /**
     * Returns true if the given object is an instance of HostMonitoringAdvanced.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HostMonitoringAdvanced {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HostMonitoringAdvanced.__pulumiType;
    }

    /**
     * Inject CodeModules in Discovery mode.
     */
    public readonly codeModuleInjection!: pulumi.Output<boolean | undefined>;
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    public readonly hostId!: pulumi.Output<string>;
    /**
     * Disabling this via [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
     */
    public readonly processAgentInjection!: pulumi.Output<boolean>;

    /**
     * Create a HostMonitoringAdvanced resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostMonitoringAdvancedArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostMonitoringAdvancedArgs | HostMonitoringAdvancedState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostMonitoringAdvancedState | undefined;
            resourceInputs["codeModuleInjection"] = state ? state.codeModuleInjection : undefined;
            resourceInputs["hostId"] = state ? state.hostId : undefined;
            resourceInputs["processAgentInjection"] = state ? state.processAgentInjection : undefined;
        } else {
            const args = argsOrState as HostMonitoringAdvancedArgs | undefined;
            if ((!args || args.hostId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostId'");
            }
            if ((!args || args.processAgentInjection === undefined) && !opts.urn) {
                throw new Error("Missing required property 'processAgentInjection'");
            }
            resourceInputs["codeModuleInjection"] = args ? args.codeModuleInjection : undefined;
            resourceInputs["hostId"] = args ? args.hostId : undefined;
            resourceInputs["processAgentInjection"] = args ? args.processAgentInjection : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HostMonitoringAdvanced.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HostMonitoringAdvanced resources.
 */
export interface HostMonitoringAdvancedState {
    /**
     * Inject CodeModules in Discovery mode.
     */
    codeModuleInjection?: pulumi.Input<boolean>;
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    hostId?: pulumi.Input<string>;
    /**
     * Disabling this via [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
     */
    processAgentInjection?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a HostMonitoringAdvanced resource.
 */
export interface HostMonitoringAdvancedArgs {
    /**
     * Inject CodeModules in Discovery mode.
     */
    codeModuleInjection?: pulumi.Input<boolean>;
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    hostId: pulumi.Input<string>;
    /**
     * Disabling this via [oneagentctl](https://dt-url.net/oneagentctl) takes precedence over this setting and cannot be changed from the Dynatrace web UI.
     */
    processAgentInjection: pulumi.Input<boolean>;
}