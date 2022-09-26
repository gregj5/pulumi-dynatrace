// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.EnvironmentQuotasDdus;
import com.pulumi.dynatrace.outputs.EnvironmentQuotasDemUnits;
import com.pulumi.dynatrace.outputs.EnvironmentQuotasLogs;
import com.pulumi.dynatrace.outputs.EnvironmentQuotasSynthetic;
import com.pulumi.dynatrace.outputs.EnvironmentQuotasUserSessions;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentQuotas {
    /**
     * @return Davis Data Units consumption and quota information on environment level. Not set (and not editable) if Davis data units is not enabled
     * 
     */
    private @Nullable EnvironmentQuotasDdus ddus;
    /**
     * @return DEM units consumption and quota information on environment level
     * 
     */
    private @Nullable EnvironmentQuotasDemUnits demUnits;
    /**
     * @return Host units consumption and quota information on environment level
     * 
     */
    private @Nullable Integer hostUnits;
    /**
     * @return Log Monitoring consumption and quota information on environment level. Not set (and not editable) if Log monitoring is not enabled. Not set (and not editable) if Log monitoring is migrated to Davis data on license level
     * 
     */
    private @Nullable EnvironmentQuotasLogs logs;
    /**
     * @return Synthetic monitors consumption and quota information on environment level. Not set (and not editable) if neither Synthetic nor DEM units is enabled
     * 
     */
    private @Nullable EnvironmentQuotasSynthetic synthetic;
    /**
     * @return User sessions consumption and quota information on environment level
     * 
     */
    private @Nullable EnvironmentQuotasUserSessions userSessions;

    private EnvironmentQuotas() {}
    /**
     * @return Davis Data Units consumption and quota information on environment level. Not set (and not editable) if Davis data units is not enabled
     * 
     */
    public Optional<EnvironmentQuotasDdus> ddus() {
        return Optional.ofNullable(this.ddus);
    }
    /**
     * @return DEM units consumption and quota information on environment level
     * 
     */
    public Optional<EnvironmentQuotasDemUnits> demUnits() {
        return Optional.ofNullable(this.demUnits);
    }
    /**
     * @return Host units consumption and quota information on environment level
     * 
     */
    public Optional<Integer> hostUnits() {
        return Optional.ofNullable(this.hostUnits);
    }
    /**
     * @return Log Monitoring consumption and quota information on environment level. Not set (and not editable) if Log monitoring is not enabled. Not set (and not editable) if Log monitoring is migrated to Davis data on license level
     * 
     */
    public Optional<EnvironmentQuotasLogs> logs() {
        return Optional.ofNullable(this.logs);
    }
    /**
     * @return Synthetic monitors consumption and quota information on environment level. Not set (and not editable) if neither Synthetic nor DEM units is enabled
     * 
     */
    public Optional<EnvironmentQuotasSynthetic> synthetic() {
        return Optional.ofNullable(this.synthetic);
    }
    /**
     * @return User sessions consumption and quota information on environment level
     * 
     */
    public Optional<EnvironmentQuotasUserSessions> userSessions() {
        return Optional.ofNullable(this.userSessions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentQuotas defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable EnvironmentQuotasDdus ddus;
        private @Nullable EnvironmentQuotasDemUnits demUnits;
        private @Nullable Integer hostUnits;
        private @Nullable EnvironmentQuotasLogs logs;
        private @Nullable EnvironmentQuotasSynthetic synthetic;
        private @Nullable EnvironmentQuotasUserSessions userSessions;
        public Builder() {}
        public Builder(EnvironmentQuotas defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddus = defaults.ddus;
    	      this.demUnits = defaults.demUnits;
    	      this.hostUnits = defaults.hostUnits;
    	      this.logs = defaults.logs;
    	      this.synthetic = defaults.synthetic;
    	      this.userSessions = defaults.userSessions;
        }

        @CustomType.Setter
        public Builder ddus(@Nullable EnvironmentQuotasDdus ddus) {
            this.ddus = ddus;
            return this;
        }
        @CustomType.Setter
        public Builder demUnits(@Nullable EnvironmentQuotasDemUnits demUnits) {
            this.demUnits = demUnits;
            return this;
        }
        @CustomType.Setter
        public Builder hostUnits(@Nullable Integer hostUnits) {
            this.hostUnits = hostUnits;
            return this;
        }
        @CustomType.Setter
        public Builder logs(@Nullable EnvironmentQuotasLogs logs) {
            this.logs = logs;
            return this;
        }
        @CustomType.Setter
        public Builder synthetic(@Nullable EnvironmentQuotasSynthetic synthetic) {
            this.synthetic = synthetic;
            return this;
        }
        @CustomType.Setter
        public Builder userSessions(@Nullable EnvironmentQuotasUserSessions userSessions) {
            this.userSessions = userSessions;
            return this;
        }
        public EnvironmentQuotas build() {
            final var o = new EnvironmentQuotas();
            o.ddus = ddus;
            o.demUnits = demUnits;
            o.hostUnits = hostUnits;
            o.logs = logs;
            o.synthetic = synthetic;
            o.userSessions = userSessions;
            return o;
        }
    }
}