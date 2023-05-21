// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.OwnershipTeamsAdditionalInformationAdditionalInformation;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OwnershipTeamsAdditionalInformation {
    /**
     * @return Define key/value pairs that further describe this team — for example, cost center, solution type, or business unit assignments.
     * 
     */
    private List<OwnershipTeamsAdditionalInformationAdditionalInformation> additionalInformations;

    private OwnershipTeamsAdditionalInformation() {}
    /**
     * @return Define key/value pairs that further describe this team — for example, cost center, solution type, or business unit assignments.
     * 
     */
    public List<OwnershipTeamsAdditionalInformationAdditionalInformation> additionalInformations() {
        return this.additionalInformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnershipTeamsAdditionalInformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OwnershipTeamsAdditionalInformationAdditionalInformation> additionalInformations;
        public Builder() {}
        public Builder(OwnershipTeamsAdditionalInformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInformations = defaults.additionalInformations;
        }

        @CustomType.Setter
        public Builder additionalInformations(List<OwnershipTeamsAdditionalInformationAdditionalInformation> additionalInformations) {
            this.additionalInformations = Objects.requireNonNull(additionalInformations);
            return this;
        }
        public Builder additionalInformations(OwnershipTeamsAdditionalInformationAdditionalInformation... additionalInformations) {
            return additionalInformations(List.of(additionalInformations));
        }
        public OwnershipTeamsAdditionalInformation build() {
            final var o = new OwnershipTeamsAdditionalInformation();
            o.additionalInformations = additionalInformations;
            return o;
        }
    }
}