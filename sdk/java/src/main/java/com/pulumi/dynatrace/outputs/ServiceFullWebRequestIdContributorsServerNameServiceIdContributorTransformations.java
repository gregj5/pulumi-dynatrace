// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformationsTransformation;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformations {
    private List<ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations;

    private ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformations() {}
    public List<ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations() {
        return this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations;
        public Builder() {}
        public Builder(ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        @CustomType.Setter
        public Builder transformations(List<ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public Builder transformations(ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformationsTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformations build() {
            final var o = new ServiceFullWebRequestIdContributorsServerNameServiceIdContributorTransformations();
            o.transformations = transformations;
            return o;
        }
    }
}