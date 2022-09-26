// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MaintenanceWindowScopeMatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowScopeArgs Empty = new MaintenanceWindowScopeArgs();

    /**
     * A list of Dynatrace entities (for example, hosts or services) to be included in the scope.  Allowed values are Dynatrace entity IDs
     * 
     */
    @Import(name="entities")
    private @Nullable Output<List<String>> entities;

    /**
     * @return A list of Dynatrace entities (for example, hosts or services) to be included in the scope.  Allowed values are Dynatrace entity IDs
     * 
     */
    public Optional<Output<List<String>>> entities() {
        return Optional.ofNullable(this.entities);
    }

    /**
     * A list of matching rules for dynamic scope formation.  If several rules are set, the OR logic applies
     * 
     */
    @Import(name="matches")
    private @Nullable Output<List<MaintenanceWindowScopeMatchArgs>> matches;

    /**
     * @return A list of matching rules for dynamic scope formation.  If several rules are set, the OR logic applies
     * 
     */
    public Optional<Output<List<MaintenanceWindowScopeMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
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

    private MaintenanceWindowScopeArgs() {}

    private MaintenanceWindowScopeArgs(MaintenanceWindowScopeArgs $) {
        this.entities = $.entities;
        this.matches = $.matches;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowScopeArgs $;

        public Builder() {
            $ = new MaintenanceWindowScopeArgs();
        }

        public Builder(MaintenanceWindowScopeArgs defaults) {
            $ = new MaintenanceWindowScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entities A list of Dynatrace entities (for example, hosts or services) to be included in the scope.  Allowed values are Dynatrace entity IDs
         * 
         * @return builder
         * 
         */
        public Builder entities(@Nullable Output<List<String>> entities) {
            $.entities = entities;
            return this;
        }

        /**
         * @param entities A list of Dynatrace entities (for example, hosts or services) to be included in the scope.  Allowed values are Dynatrace entity IDs
         * 
         * @return builder
         * 
         */
        public Builder entities(List<String> entities) {
            return entities(Output.of(entities));
        }

        /**
         * @param entities A list of Dynatrace entities (for example, hosts or services) to be included in the scope.  Allowed values are Dynatrace entity IDs
         * 
         * @return builder
         * 
         */
        public Builder entities(String... entities) {
            return entities(List.of(entities));
        }

        /**
         * @param matches A list of matching rules for dynamic scope formation.  If several rules are set, the OR logic applies
         * 
         * @return builder
         * 
         */
        public Builder matches(@Nullable Output<List<MaintenanceWindowScopeMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches A list of matching rules for dynamic scope formation.  If several rules are set, the OR logic applies
         * 
         * @return builder
         * 
         */
        public Builder matches(List<MaintenanceWindowScopeMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches A list of matching rules for dynamic scope formation.  If several rules are set, the OR logic applies
         * 
         * @return builder
         * 
         */
        public Builder matches(MaintenanceWindowScopeMatchArgs... matches) {
            return matches(List.of(matches));
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

        public MaintenanceWindowScopeArgs build() {
            return $;
        }
    }

}