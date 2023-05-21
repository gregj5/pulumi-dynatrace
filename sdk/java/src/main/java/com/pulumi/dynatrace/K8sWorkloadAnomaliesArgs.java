// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesContainerRestartsArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesDeploymentStuckArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesHighCpuThrottlingArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesHighCpuUsageArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesHighMemoryUsageArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesNotAllPodsReadyArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesPendingPodsArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesPodStuckInTerminatingArgs;
import com.pulumi.dynatrace.inputs.K8sWorkloadAnomaliesWorkloadWithoutReadyPodsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class K8sWorkloadAnomaliesArgs extends com.pulumi.resources.ResourceArgs {

    public static final K8sWorkloadAnomaliesArgs Empty = new K8sWorkloadAnomaliesArgs();

    /**
     * no documentation available
     * 
     */
    @Import(name="containerRestarts", required=true)
    private Output<K8sWorkloadAnomaliesContainerRestartsArgs> containerRestarts;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesContainerRestartsArgs> containerRestarts() {
        return this.containerRestarts;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="deploymentStuck", required=true)
    private Output<K8sWorkloadAnomaliesDeploymentStuckArgs> deploymentStuck;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesDeploymentStuckArgs> deploymentStuck() {
        return this.deploymentStuck;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highCpuThrottling", required=true)
    private Output<K8sWorkloadAnomaliesHighCpuThrottlingArgs> highCpuThrottling;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesHighCpuThrottlingArgs> highCpuThrottling() {
        return this.highCpuThrottling;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highCpuUsage", required=true)
    private Output<K8sWorkloadAnomaliesHighCpuUsageArgs> highCpuUsage;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesHighCpuUsageArgs> highCpuUsage() {
        return this.highCpuUsage;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="highMemoryUsage", required=true)
    private Output<K8sWorkloadAnomaliesHighMemoryUsageArgs> highMemoryUsage;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesHighMemoryUsageArgs> highMemoryUsage() {
        return this.highMemoryUsage;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="notAllPodsReady", required=true)
    private Output<K8sWorkloadAnomaliesNotAllPodsReadyArgs> notAllPodsReady;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesNotAllPodsReadyArgs> notAllPodsReady() {
        return this.notAllPodsReady;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="pendingPods", required=true)
    private Output<K8sWorkloadAnomaliesPendingPodsArgs> pendingPods;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesPendingPodsArgs> pendingPods() {
        return this.pendingPods;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="podStuckInTerminating", required=true)
    private Output<K8sWorkloadAnomaliesPodStuckInTerminatingArgs> podStuckInTerminating;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesPodStuckInTerminatingArgs> podStuckInTerminating() {
        return this.podStuckInTerminating;
    }

    /**
     * The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="workloadWithoutReadyPods", required=true)
    private Output<K8sWorkloadAnomaliesWorkloadWithoutReadyPodsArgs> workloadWithoutReadyPods;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sWorkloadAnomaliesWorkloadWithoutReadyPodsArgs> workloadWithoutReadyPods() {
        return this.workloadWithoutReadyPods;
    }

    private K8sWorkloadAnomaliesArgs() {}

    private K8sWorkloadAnomaliesArgs(K8sWorkloadAnomaliesArgs $) {
        this.containerRestarts = $.containerRestarts;
        this.deploymentStuck = $.deploymentStuck;
        this.highCpuThrottling = $.highCpuThrottling;
        this.highCpuUsage = $.highCpuUsage;
        this.highMemoryUsage = $.highMemoryUsage;
        this.notAllPodsReady = $.notAllPodsReady;
        this.pendingPods = $.pendingPods;
        this.podStuckInTerminating = $.podStuckInTerminating;
        this.scope = $.scope;
        this.workloadWithoutReadyPods = $.workloadWithoutReadyPods;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sWorkloadAnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sWorkloadAnomaliesArgs $;

        public Builder() {
            $ = new K8sWorkloadAnomaliesArgs();
        }

        public Builder(K8sWorkloadAnomaliesArgs defaults) {
            $ = new K8sWorkloadAnomaliesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerRestarts no documentation available
         * 
         * @return builder
         * 
         */
        public Builder containerRestarts(Output<K8sWorkloadAnomaliesContainerRestartsArgs> containerRestarts) {
            $.containerRestarts = containerRestarts;
            return this;
        }

        /**
         * @param containerRestarts no documentation available
         * 
         * @return builder
         * 
         */
        public Builder containerRestarts(K8sWorkloadAnomaliesContainerRestartsArgs containerRestarts) {
            return containerRestarts(Output.of(containerRestarts));
        }

        /**
         * @param deploymentStuck no documentation available
         * 
         * @return builder
         * 
         */
        public Builder deploymentStuck(Output<K8sWorkloadAnomaliesDeploymentStuckArgs> deploymentStuck) {
            $.deploymentStuck = deploymentStuck;
            return this;
        }

        /**
         * @param deploymentStuck no documentation available
         * 
         * @return builder
         * 
         */
        public Builder deploymentStuck(K8sWorkloadAnomaliesDeploymentStuckArgs deploymentStuck) {
            return deploymentStuck(Output.of(deploymentStuck));
        }

        /**
         * @param highCpuThrottling no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highCpuThrottling(Output<K8sWorkloadAnomaliesHighCpuThrottlingArgs> highCpuThrottling) {
            $.highCpuThrottling = highCpuThrottling;
            return this;
        }

        /**
         * @param highCpuThrottling no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highCpuThrottling(K8sWorkloadAnomaliesHighCpuThrottlingArgs highCpuThrottling) {
            return highCpuThrottling(Output.of(highCpuThrottling));
        }

        /**
         * @param highCpuUsage no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highCpuUsage(Output<K8sWorkloadAnomaliesHighCpuUsageArgs> highCpuUsage) {
            $.highCpuUsage = highCpuUsage;
            return this;
        }

        /**
         * @param highCpuUsage no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highCpuUsage(K8sWorkloadAnomaliesHighCpuUsageArgs highCpuUsage) {
            return highCpuUsage(Output.of(highCpuUsage));
        }

        /**
         * @param highMemoryUsage no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highMemoryUsage(Output<K8sWorkloadAnomaliesHighMemoryUsageArgs> highMemoryUsage) {
            $.highMemoryUsage = highMemoryUsage;
            return this;
        }

        /**
         * @param highMemoryUsage no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highMemoryUsage(K8sWorkloadAnomaliesHighMemoryUsageArgs highMemoryUsage) {
            return highMemoryUsage(Output.of(highMemoryUsage));
        }

        /**
         * @param notAllPodsReady no documentation available
         * 
         * @return builder
         * 
         */
        public Builder notAllPodsReady(Output<K8sWorkloadAnomaliesNotAllPodsReadyArgs> notAllPodsReady) {
            $.notAllPodsReady = notAllPodsReady;
            return this;
        }

        /**
         * @param notAllPodsReady no documentation available
         * 
         * @return builder
         * 
         */
        public Builder notAllPodsReady(K8sWorkloadAnomaliesNotAllPodsReadyArgs notAllPodsReady) {
            return notAllPodsReady(Output.of(notAllPodsReady));
        }

        /**
         * @param pendingPods no documentation available
         * 
         * @return builder
         * 
         */
        public Builder pendingPods(Output<K8sWorkloadAnomaliesPendingPodsArgs> pendingPods) {
            $.pendingPods = pendingPods;
            return this;
        }

        /**
         * @param pendingPods no documentation available
         * 
         * @return builder
         * 
         */
        public Builder pendingPods(K8sWorkloadAnomaliesPendingPodsArgs pendingPods) {
            return pendingPods(Output.of(pendingPods));
        }

        /**
         * @param podStuckInTerminating no documentation available
         * 
         * @return builder
         * 
         */
        public Builder podStuckInTerminating(Output<K8sWorkloadAnomaliesPodStuckInTerminatingArgs> podStuckInTerminating) {
            $.podStuckInTerminating = podStuckInTerminating;
            return this;
        }

        /**
         * @param podStuckInTerminating no documentation available
         * 
         * @return builder
         * 
         */
        public Builder podStuckInTerminating(K8sWorkloadAnomaliesPodStuckInTerminatingArgs podStuckInTerminating) {
            return podStuckInTerminating(Output.of(podStuckInTerminating));
        }

        /**
         * @param scope The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (CLOUD*APPLICATION*NAMESPACE, KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param workloadWithoutReadyPods no documentation available
         * 
         * @return builder
         * 
         */
        public Builder workloadWithoutReadyPods(Output<K8sWorkloadAnomaliesWorkloadWithoutReadyPodsArgs> workloadWithoutReadyPods) {
            $.workloadWithoutReadyPods = workloadWithoutReadyPods;
            return this;
        }

        /**
         * @param workloadWithoutReadyPods no documentation available
         * 
         * @return builder
         * 
         */
        public Builder workloadWithoutReadyPods(K8sWorkloadAnomaliesWorkloadWithoutReadyPodsArgs workloadWithoutReadyPods) {
            return workloadWithoutReadyPods(Output.of(workloadWithoutReadyPods));
        }

        public K8sWorkloadAnomaliesArgs build() {
            $.containerRestarts = Objects.requireNonNull($.containerRestarts, "expected parameter 'containerRestarts' to be non-null");
            $.deploymentStuck = Objects.requireNonNull($.deploymentStuck, "expected parameter 'deploymentStuck' to be non-null");
            $.highCpuThrottling = Objects.requireNonNull($.highCpuThrottling, "expected parameter 'highCpuThrottling' to be non-null");
            $.highCpuUsage = Objects.requireNonNull($.highCpuUsage, "expected parameter 'highCpuUsage' to be non-null");
            $.highMemoryUsage = Objects.requireNonNull($.highMemoryUsage, "expected parameter 'highMemoryUsage' to be non-null");
            $.notAllPodsReady = Objects.requireNonNull($.notAllPodsReady, "expected parameter 'notAllPodsReady' to be non-null");
            $.pendingPods = Objects.requireNonNull($.pendingPods, "expected parameter 'pendingPods' to be non-null");
            $.podStuckInTerminating = Objects.requireNonNull($.podStuckInTerminating, "expected parameter 'podStuckInTerminating' to be non-null");
            $.workloadWithoutReadyPods = Objects.requireNonNull($.workloadWithoutReadyPods, "expected parameter 'workloadWithoutReadyPods' to be non-null");
            return $;
        }
    }

}