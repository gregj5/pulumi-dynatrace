// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MaintenanceWindowScopeMatchTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowScopeMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowScopeMatchArgs Empty = new MaintenanceWindowScopeMatchArgs();

    @Import(name="mzId")
    private @Nullable Output<String> mzId;

    public Optional<Output<String>> mzId() {
        return Optional.ofNullable(this.mzId);
    }

    @Import(name="tagCombination")
    private @Nullable Output<String> tagCombination;

    public Optional<Output<String>> tagCombination() {
        return Optional.ofNullable(this.tagCombination);
    }

    @Import(name="tags")
    private @Nullable Output<List<MaintenanceWindowScopeMatchTagArgs>> tags;

    public Optional<Output<List<MaintenanceWindowScopeMatchTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the maintenance: planned or unplanned
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the maintenance: planned or unplanned
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private MaintenanceWindowScopeMatchArgs() {}

    private MaintenanceWindowScopeMatchArgs(MaintenanceWindowScopeMatchArgs $) {
        this.mzId = $.mzId;
        this.tagCombination = $.tagCombination;
        this.tags = $.tags;
        this.type = $.type;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowScopeMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowScopeMatchArgs $;

        public Builder() {
            $ = new MaintenanceWindowScopeMatchArgs();
        }

        public Builder(MaintenanceWindowScopeMatchArgs defaults) {
            $ = new MaintenanceWindowScopeMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder mzId(@Nullable Output<String> mzId) {
            $.mzId = mzId;
            return this;
        }

        public Builder mzId(String mzId) {
            return mzId(Output.of(mzId));
        }

        public Builder tagCombination(@Nullable Output<String> tagCombination) {
            $.tagCombination = tagCombination;
            return this;
        }

        public Builder tagCombination(String tagCombination) {
            return tagCombination(Output.of(tagCombination));
        }

        public Builder tags(@Nullable Output<List<MaintenanceWindowScopeMatchTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<MaintenanceWindowScopeMatchTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(MaintenanceWindowScopeMatchTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of the maintenance: planned or unplanned
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the maintenance: planned or unplanned
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public MaintenanceWindowScopeMatchArgs build() {
            return $;
        }
    }

}