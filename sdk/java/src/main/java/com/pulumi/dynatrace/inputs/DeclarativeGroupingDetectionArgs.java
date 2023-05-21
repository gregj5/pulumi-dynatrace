// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DeclarativeGroupingDetectionProcessDefinitionArgs;
import java.util.List;
import java.util.Objects;


public final class DeclarativeGroupingDetectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeclarativeGroupingDetectionArgs Empty = new DeclarativeGroupingDetectionArgs();

    @Import(name="processDefinitions", required=true)
    private Output<List<DeclarativeGroupingDetectionProcessDefinitionArgs>> processDefinitions;

    public Output<List<DeclarativeGroupingDetectionProcessDefinitionArgs>> processDefinitions() {
        return this.processDefinitions;
    }

    private DeclarativeGroupingDetectionArgs() {}

    private DeclarativeGroupingDetectionArgs(DeclarativeGroupingDetectionArgs $) {
        this.processDefinitions = $.processDefinitions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeclarativeGroupingDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeclarativeGroupingDetectionArgs $;

        public Builder() {
            $ = new DeclarativeGroupingDetectionArgs();
        }

        public Builder(DeclarativeGroupingDetectionArgs defaults) {
            $ = new DeclarativeGroupingDetectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder processDefinitions(Output<List<DeclarativeGroupingDetectionProcessDefinitionArgs>> processDefinitions) {
            $.processDefinitions = processDefinitions;
            return this;
        }

        public Builder processDefinitions(List<DeclarativeGroupingDetectionProcessDefinitionArgs> processDefinitions) {
            return processDefinitions(Output.of(processDefinitions));
        }

        public Builder processDefinitions(DeclarativeGroupingDetectionProcessDefinitionArgs... processDefinitions) {
            return processDefinitions(List.of(processDefinitions));
        }

        public DeclarativeGroupingDetectionArgs build() {
            $.processDefinitions = Objects.requireNonNull($.processDefinitions, "expected parameter 'processDefinitions' to be non-null");
            return $;
        }
    }

}