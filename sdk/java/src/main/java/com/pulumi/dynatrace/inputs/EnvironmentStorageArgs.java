// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.EnvironmentStorageLimitsArgs;
import com.pulumi.dynatrace.inputs.EnvironmentStorageRetentionArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentStorageArgs Empty = new EnvironmentStorageArgs();

    @Import(name="limits")
    private @Nullable Output<EnvironmentStorageLimitsArgs> limits;

    public Optional<Output<EnvironmentStorageLimitsArgs>> limits() {
        return Optional.ofNullable(this.limits);
    }

    @Import(name="retention")
    private @Nullable Output<EnvironmentStorageRetentionArgs> retention;

    public Optional<Output<EnvironmentStorageRetentionArgs>> retention() {
        return Optional.ofNullable(this.retention);
    }

    /**
     * Maximum number of newly monitored entry point PurePaths captured per process/minute on environment level. Can be set to any value from 100 to 100000
     * 
     */
    @Import(name="transactions", required=true)
    private Output<Integer> transactions;

    /**
     * @return Maximum number of newly monitored entry point PurePaths captured per process/minute on environment level. Can be set to any value from 100 to 100000
     * 
     */
    public Output<Integer> transactions() {
        return this.transactions;
    }

    /**
     * Maximum number of user actions generated per minute on environment level. Can be set to any value from 1 to 2147483646 or left unlimited by omitting this property
     * 
     */
    @Import(name="userActions")
    private @Nullable Output<Integer> userActions;

    /**
     * @return Maximum number of user actions generated per minute on environment level. Can be set to any value from 1 to 2147483646 or left unlimited by omitting this property
     * 
     */
    public Optional<Output<Integer>> userActions() {
        return Optional.ofNullable(this.userActions);
    }

    private EnvironmentStorageArgs() {}

    private EnvironmentStorageArgs(EnvironmentStorageArgs $) {
        this.limits = $.limits;
        this.retention = $.retention;
        this.transactions = $.transactions;
        this.userActions = $.userActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentStorageArgs $;

        public Builder() {
            $ = new EnvironmentStorageArgs();
        }

        public Builder(EnvironmentStorageArgs defaults) {
            $ = new EnvironmentStorageArgs(Objects.requireNonNull(defaults));
        }

        public Builder limits(@Nullable Output<EnvironmentStorageLimitsArgs> limits) {
            $.limits = limits;
            return this;
        }

        public Builder limits(EnvironmentStorageLimitsArgs limits) {
            return limits(Output.of(limits));
        }

        public Builder retention(@Nullable Output<EnvironmentStorageRetentionArgs> retention) {
            $.retention = retention;
            return this;
        }

        public Builder retention(EnvironmentStorageRetentionArgs retention) {
            return retention(Output.of(retention));
        }

        /**
         * @param transactions Maximum number of newly monitored entry point PurePaths captured per process/minute on environment level. Can be set to any value from 100 to 100000
         * 
         * @return builder
         * 
         */
        public Builder transactions(Output<Integer> transactions) {
            $.transactions = transactions;
            return this;
        }

        /**
         * @param transactions Maximum number of newly monitored entry point PurePaths captured per process/minute on environment level. Can be set to any value from 100 to 100000
         * 
         * @return builder
         * 
         */
        public Builder transactions(Integer transactions) {
            return transactions(Output.of(transactions));
        }

        /**
         * @param userActions Maximum number of user actions generated per minute on environment level. Can be set to any value from 1 to 2147483646 or left unlimited by omitting this property
         * 
         * @return builder
         * 
         */
        public Builder userActions(@Nullable Output<Integer> userActions) {
            $.userActions = userActions;
            return this;
        }

        /**
         * @param userActions Maximum number of user actions generated per minute on environment level. Can be set to any value from 1 to 2147483646 or left unlimited by omitting this property
         * 
         * @return builder
         * 
         */
        public Builder userActions(Integer userActions) {
            return userActions(Output.of(userActions));
        }

        public EnvironmentStorageArgs build() {
            $.transactions = Objects.requireNonNull($.transactions, "expected parameter 'transactions' to be non-null");
            return $;
        }
    }

}