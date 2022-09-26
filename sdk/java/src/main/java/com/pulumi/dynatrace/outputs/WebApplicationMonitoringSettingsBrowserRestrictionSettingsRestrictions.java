// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestriction;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions {
    private List<WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestriction> restrictions;

    private WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions() {}
    public List<WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestriction> restrictions() {
        return this.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestriction> restrictions;
        public Builder() {}
        public Builder(WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restrictions = defaults.restrictions;
        }

        @CustomType.Setter
        public Builder restrictions(List<WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestriction> restrictions) {
            this.restrictions = Objects.requireNonNull(restrictions);
            return this;
        }
        public Builder restrictions(WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestriction... restrictions) {
            return restrictions(List.of(restrictions));
        }
        public WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions build() {
            final var o = new WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions();
            o.restrictions = restrictions;
            return o;
        }
    }
}