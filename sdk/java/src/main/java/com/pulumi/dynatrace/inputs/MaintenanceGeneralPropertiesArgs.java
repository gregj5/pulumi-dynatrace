// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceGeneralPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceGeneralPropertiesArgs Empty = new MaintenanceGeneralPropertiesArgs();

    /**
     * A short description of the maintenance purpose
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of the maintenance purpose
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Suppress execution of synthetic monitors during the maintenance
     * 
     */
    @Import(name="disableSynthetic")
    private @Nullable Output<Boolean> disableSynthetic;

    /**
     * @return Suppress execution of synthetic monitors during the maintenance
     * 
     */
    public Optional<Output<Boolean>> disableSynthetic() {
        return Optional.ofNullable(this.disableSynthetic);
    }

    /**
     * The name of the maintenance window, displayed in the UI
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the maintenance window, displayed in the UI
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of suppression of alerting and problem detection during the maintenance
     * 
     */
    @Import(name="suppression", required=true)
    private Output<String> suppression;

    /**
     * @return The type of suppression of alerting and problem detection during the maintenance
     * 
     */
    public Output<String> suppression() {
        return this.suppression;
    }

    /**
     * The type of the maintenance: planned or unplanned
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the maintenance: planned or unplanned
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private MaintenanceGeneralPropertiesArgs() {}

    private MaintenanceGeneralPropertiesArgs(MaintenanceGeneralPropertiesArgs $) {
        this.description = $.description;
        this.disableSynthetic = $.disableSynthetic;
        this.name = $.name;
        this.suppression = $.suppression;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceGeneralPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceGeneralPropertiesArgs $;

        public Builder() {
            $ = new MaintenanceGeneralPropertiesArgs();
        }

        public Builder(MaintenanceGeneralPropertiesArgs defaults) {
            $ = new MaintenanceGeneralPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A short description of the maintenance purpose
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of the maintenance purpose
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disableSynthetic Suppress execution of synthetic monitors during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder disableSynthetic(@Nullable Output<Boolean> disableSynthetic) {
            $.disableSynthetic = disableSynthetic;
            return this;
        }

        /**
         * @param disableSynthetic Suppress execution of synthetic monitors during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder disableSynthetic(Boolean disableSynthetic) {
            return disableSynthetic(Output.of(disableSynthetic));
        }

        /**
         * @param name The name of the maintenance window, displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the maintenance window, displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param suppression The type of suppression of alerting and problem detection during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder suppression(Output<String> suppression) {
            $.suppression = suppression;
            return this;
        }

        /**
         * @param suppression The type of suppression of alerting and problem detection during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder suppression(String suppression) {
            return suppression(Output.of(suppression));
        }

        /**
         * @param type The type of the maintenance: planned or unplanned
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
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

        public MaintenanceGeneralPropertiesArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.suppression = Objects.requireNonNull($.suppression, "expected parameter 'suppression' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}