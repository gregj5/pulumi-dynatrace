// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ImsBridgesQueueManagerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImsBridgesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImsBridgesArgs Empty = new ImsBridgesArgs();

    /**
     * The name of the IMS bridge
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the IMS bridge
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Queue manager(s) that belong to the IMS bridge
     * 
     */
    @Import(name="queueManagers")
    private @Nullable Output<List<ImsBridgesQueueManagerArgs>> queueManagers;

    /**
     * @return Queue manager(s) that belong to the IMS bridge
     * 
     */
    public Optional<Output<List<ImsBridgesQueueManagerArgs>>> queueManagers() {
        return Optional.ofNullable(this.queueManagers);
    }

    private ImsBridgesArgs() {}

    private ImsBridgesArgs(ImsBridgesArgs $) {
        this.name = $.name;
        this.queueManagers = $.queueManagers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImsBridgesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImsBridgesArgs $;

        public Builder() {
            $ = new ImsBridgesArgs();
        }

        public Builder(ImsBridgesArgs defaults) {
            $ = new ImsBridgesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the IMS bridge
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the IMS bridge
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queueManagers Queue manager(s) that belong to the IMS bridge
         * 
         * @return builder
         * 
         */
        public Builder queueManagers(@Nullable Output<List<ImsBridgesQueueManagerArgs>> queueManagers) {
            $.queueManagers = queueManagers;
            return this;
        }

        /**
         * @param queueManagers Queue manager(s) that belong to the IMS bridge
         * 
         * @return builder
         * 
         */
        public Builder queueManagers(List<ImsBridgesQueueManagerArgs> queueManagers) {
            return queueManagers(Output.of(queueManagers));
        }

        /**
         * @param queueManagers Queue manager(s) that belong to the IMS bridge
         * 
         * @return builder
         * 
         */
        public Builder queueManagers(ImsBridgesQueueManagerArgs... queueManagers) {
            return queueManagers(List.of(queueManagers));
        }

        public ImsBridgesArgs build() {
            return $;
        }
    }

}