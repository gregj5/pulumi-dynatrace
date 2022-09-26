// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AlertingProfileEventTypeFilterCustomEventFilter;
import com.pulumi.dynatrace.outputs.AlertingProfileEventTypeFilterPredefinedEventFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertingProfileEventTypeFilter {
    /**
     * @return Configuration of a custom event filter. Filters custom events by title or description. If both specified, the AND logic applies
     * 
     */
    private @Nullable List<AlertingProfileEventTypeFilterCustomEventFilter> customEventFilters;
    /**
     * @return Configuration of a custom event filter. Filters custom events by title or description. If both specified, the AND logic applies
     * 
     */
    private @Nullable List<AlertingProfileEventTypeFilterPredefinedEventFilter> predefinedEventFilters;
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    private @Nullable String unknowns;

    private AlertingProfileEventTypeFilter() {}
    /**
     * @return Configuration of a custom event filter. Filters custom events by title or description. If both specified, the AND logic applies
     * 
     */
    public List<AlertingProfileEventTypeFilterCustomEventFilter> customEventFilters() {
        return this.customEventFilters == null ? List.of() : this.customEventFilters;
    }
    /**
     * @return Configuration of a custom event filter. Filters custom events by title or description. If both specified, the AND logic applies
     * 
     */
    public List<AlertingProfileEventTypeFilterPredefinedEventFilter> predefinedEventFilters() {
        return this.predefinedEventFilters == null ? List.of() : this.predefinedEventFilters;
    }
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingProfileEventTypeFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AlertingProfileEventTypeFilterCustomEventFilter> customEventFilters;
        private @Nullable List<AlertingProfileEventTypeFilterPredefinedEventFilter> predefinedEventFilters;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(AlertingProfileEventTypeFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEventFilters = defaults.customEventFilters;
    	      this.predefinedEventFilters = defaults.predefinedEventFilters;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder customEventFilters(@Nullable List<AlertingProfileEventTypeFilterCustomEventFilter> customEventFilters) {
            this.customEventFilters = customEventFilters;
            return this;
        }
        public Builder customEventFilters(AlertingProfileEventTypeFilterCustomEventFilter... customEventFilters) {
            return customEventFilters(List.of(customEventFilters));
        }
        @CustomType.Setter
        public Builder predefinedEventFilters(@Nullable List<AlertingProfileEventTypeFilterPredefinedEventFilter> predefinedEventFilters) {
            this.predefinedEventFilters = predefinedEventFilters;
            return this;
        }
        public Builder predefinedEventFilters(AlertingProfileEventTypeFilterPredefinedEventFilter... predefinedEventFilters) {
            return predefinedEventFilters(List.of(predefinedEventFilters));
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public AlertingProfileEventTypeFilter build() {
            final var o = new AlertingProfileEventTypeFilter();
            o.customEventFilters = customEventFilters;
            o.predefinedEventFilters = predefinedEventFilters;
            o.unknowns = unknowns;
            return o;
        }
    }
}