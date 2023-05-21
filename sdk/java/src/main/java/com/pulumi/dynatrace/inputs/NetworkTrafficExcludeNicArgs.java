// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.NetworkTrafficExcludeNicNicFormArgs;
import java.util.List;
import java.util.Objects;


public final class NetworkTrafficExcludeNicArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkTrafficExcludeNicArgs Empty = new NetworkTrafficExcludeNicArgs();

    @Import(name="nicForms", required=true)
    private Output<List<NetworkTrafficExcludeNicNicFormArgs>> nicForms;

    public Output<List<NetworkTrafficExcludeNicNicFormArgs>> nicForms() {
        return this.nicForms;
    }

    private NetworkTrafficExcludeNicArgs() {}

    private NetworkTrafficExcludeNicArgs(NetworkTrafficExcludeNicArgs $) {
        this.nicForms = $.nicForms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkTrafficExcludeNicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkTrafficExcludeNicArgs $;

        public Builder() {
            $ = new NetworkTrafficExcludeNicArgs();
        }

        public Builder(NetworkTrafficExcludeNicArgs defaults) {
            $ = new NetworkTrafficExcludeNicArgs(Objects.requireNonNull(defaults));
        }

        public Builder nicForms(Output<List<NetworkTrafficExcludeNicNicFormArgs>> nicForms) {
            $.nicForms = nicForms;
            return this;
        }

        public Builder nicForms(List<NetworkTrafficExcludeNicNicFormArgs> nicForms) {
            return nicForms(Output.of(nicForms));
        }

        public Builder nicForms(NetworkTrafficExcludeNicNicFormArgs... nicForms) {
            return nicForms(List.of(nicForms));
        }

        public NetworkTrafficExcludeNicArgs build() {
            $.nicForms = Objects.requireNonNull($.nicForms, "expected parameter 'nicForms' to be non-null");
            return $;
        }
    }

}