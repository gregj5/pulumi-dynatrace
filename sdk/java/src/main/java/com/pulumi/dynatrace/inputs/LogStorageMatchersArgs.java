// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.LogStorageMatchersMatcherArgs;
import java.util.List;
import java.util.Objects;


public final class LogStorageMatchersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogStorageMatchersArgs Empty = new LogStorageMatchersArgs();

    @Import(name="matchers", required=true)
    private Output<List<LogStorageMatchersMatcherArgs>> matchers;

    public Output<List<LogStorageMatchersMatcherArgs>> matchers() {
        return this.matchers;
    }

    private LogStorageMatchersArgs() {}

    private LogStorageMatchersArgs(LogStorageMatchersArgs $) {
        this.matchers = $.matchers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogStorageMatchersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogStorageMatchersArgs $;

        public Builder() {
            $ = new LogStorageMatchersArgs();
        }

        public Builder(LogStorageMatchersArgs defaults) {
            $ = new LogStorageMatchersArgs(Objects.requireNonNull(defaults));
        }

        public Builder matchers(Output<List<LogStorageMatchersMatcherArgs>> matchers) {
            $.matchers = matchers;
            return this;
        }

        public Builder matchers(List<LogStorageMatchersMatcherArgs> matchers) {
            return matchers(Output.of(matchers));
        }

        public Builder matchers(LogStorageMatchersMatcherArgs... matchers) {
            return matchers(List.of(matchers));
        }

        public LogStorageMatchersArgs build() {
            $.matchers = Objects.requireNonNull($.matchers, "expected parameter 'matchers' to be non-null");
            return $;
        }
    }

}