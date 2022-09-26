// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export class QueueManager extends pulumi.CustomResource {
    /**
     * Get an existing QueueManager resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QueueManagerState, opts?: pulumi.CustomResourceOptions): QueueManager {
        return new QueueManager(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/queueManager:QueueManager';

    /**
     * Returns true if the given object is an instance of QueueManager.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QueueManager {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QueueManager.__pulumiType;
    }

    /**
     * The alias queues in the queue manager
     */
    public readonly aliasQueues!: pulumi.Output<outputs.QueueManagerAliasQueue[] | undefined>;
    /**
     * The alias queues in the queue manager
     */
    public readonly clusterQueues!: pulumi.Output<outputs.QueueManagerClusterQueue[] | undefined>;
    /**
     * Name of the cluster(s) this queue manager is part of
     */
    public readonly clusters!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the queue manager
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The alias queues in the queue manager
     */
    public readonly remoteQueues!: pulumi.Output<outputs.QueueManagerRemoteQueue[] | undefined>;

    /**
     * Create a QueueManager resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: QueueManagerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QueueManagerArgs | QueueManagerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QueueManagerState | undefined;
            resourceInputs["aliasQueues"] = state ? state.aliasQueues : undefined;
            resourceInputs["clusterQueues"] = state ? state.clusterQueues : undefined;
            resourceInputs["clusters"] = state ? state.clusters : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["remoteQueues"] = state ? state.remoteQueues : undefined;
        } else {
            const args = argsOrState as QueueManagerArgs | undefined;
            resourceInputs["aliasQueues"] = args ? args.aliasQueues : undefined;
            resourceInputs["clusterQueues"] = args ? args.clusterQueues : undefined;
            resourceInputs["clusters"] = args ? args.clusters : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["remoteQueues"] = args ? args.remoteQueues : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(QueueManager.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QueueManager resources.
 */
export interface QueueManagerState {
    /**
     * The alias queues in the queue manager
     */
    aliasQueues?: pulumi.Input<pulumi.Input<inputs.QueueManagerAliasQueue>[]>;
    /**
     * The alias queues in the queue manager
     */
    clusterQueues?: pulumi.Input<pulumi.Input<inputs.QueueManagerClusterQueue>[]>;
    /**
     * Name of the cluster(s) this queue manager is part of
     */
    clusters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the queue manager
     */
    name?: pulumi.Input<string>;
    /**
     * The alias queues in the queue manager
     */
    remoteQueues?: pulumi.Input<pulumi.Input<inputs.QueueManagerRemoteQueue>[]>;
}

/**
 * The set of arguments for constructing a QueueManager resource.
 */
export interface QueueManagerArgs {
    /**
     * The alias queues in the queue manager
     */
    aliasQueues?: pulumi.Input<pulumi.Input<inputs.QueueManagerAliasQueue>[]>;
    /**
     * The alias queues in the queue manager
     */
    clusterQueues?: pulumi.Input<pulumi.Input<inputs.QueueManagerClusterQueue>[]>;
    /**
     * Name of the cluster(s) this queue manager is part of
     */
    clusters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the queue manager
     */
    name?: pulumi.Input<string>;
    /**
     * The alias queues in the queue manager
     */
    remoteQueues?: pulumi.Input<pulumi.Input<inputs.QueueManagerRemoteQueue>[]>;
}