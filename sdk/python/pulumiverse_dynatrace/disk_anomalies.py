# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DiskAnomaliesArgs', 'DiskAnomalies']

@pulumi.input_type
class DiskAnomaliesArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 metric: pulumi.Input[str],
                 samples: pulumi.Input[int],
                 threshold: pulumi.Input[float],
                 violating_samples: pulumi.Input[int],
                 disk_name: Optional[pulumi.Input['DiskAnomaliesDiskNameArgs']] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input['DiskAnomaliesTagsArgs']] = None):
        """
        The set of arguments for constructing a DiskAnomalies resource.
        :param pulumi.Input[bool] enabled: Disk event rule enabled/disabled
        :param pulumi.Input[str] metric: The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        :param pulumi.Input[int] samples: The number of samples to evaluate
        :param pulumi.Input[float] threshold: The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        :param pulumi.Input[int] violating_samples: The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        :param pulumi.Input['DiskAnomaliesDiskNameArgs'] disk_name: Narrows the rule usage down to disks, matching the specified criteria
        :param pulumi.Input[str] host_group_id: Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        :param pulumi.Input[str] name: The name of the disk event rule
        :param pulumi.Input['DiskAnomaliesTagsArgs'] tags: Narrows the rule usage down to the hosts matching the specified tags
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "metric", metric)
        pulumi.set(__self__, "samples", samples)
        pulumi.set(__self__, "threshold", threshold)
        pulumi.set(__self__, "violating_samples", violating_samples)
        if disk_name is not None:
            pulumi.set(__self__, "disk_name", disk_name)
        if host_group_id is not None:
            pulumi.set(__self__, "host_group_id", host_group_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Disk event rule enabled/disabled
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def metric(self) -> pulumi.Input[str]:
        """
        The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        """
        return pulumi.get(self, "metric")

    @metric.setter
    def metric(self, value: pulumi.Input[str]):
        pulumi.set(self, "metric", value)

    @property
    @pulumi.getter
    def samples(self) -> pulumi.Input[int]:
        """
        The number of samples to evaluate
        """
        return pulumi.get(self, "samples")

    @samples.setter
    def samples(self, value: pulumi.Input[int]):
        pulumi.set(self, "samples", value)

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Input[float]:
        """
        The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: pulumi.Input[float]):
        pulumi.set(self, "threshold", value)

    @property
    @pulumi.getter(name="violatingSamples")
    def violating_samples(self) -> pulumi.Input[int]:
        """
        The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        """
        return pulumi.get(self, "violating_samples")

    @violating_samples.setter
    def violating_samples(self, value: pulumi.Input[int]):
        pulumi.set(self, "violating_samples", value)

    @property
    @pulumi.getter(name="diskName")
    def disk_name(self) -> Optional[pulumi.Input['DiskAnomaliesDiskNameArgs']]:
        """
        Narrows the rule usage down to disks, matching the specified criteria
        """
        return pulumi.get(self, "disk_name")

    @disk_name.setter
    def disk_name(self, value: Optional[pulumi.Input['DiskAnomaliesDiskNameArgs']]):
        pulumi.set(self, "disk_name", value)

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        """
        return pulumi.get(self, "host_group_id")

    @host_group_id.setter
    def host_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_group_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the disk event rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input['DiskAnomaliesTagsArgs']]:
        """
        Narrows the rule usage down to the hosts matching the specified tags
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input['DiskAnomaliesTagsArgs']]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DiskAnomaliesState:
    def __init__(__self__, *,
                 disk_name: Optional[pulumi.Input['DiskAnomaliesDiskNameArgs']] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 samples: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input['DiskAnomaliesTagsArgs']] = None,
                 threshold: Optional[pulumi.Input[float]] = None,
                 violating_samples: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DiskAnomalies resources.
        :param pulumi.Input['DiskAnomaliesDiskNameArgs'] disk_name: Narrows the rule usage down to disks, matching the specified criteria
        :param pulumi.Input[bool] enabled: Disk event rule enabled/disabled
        :param pulumi.Input[str] host_group_id: Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        :param pulumi.Input[str] metric: The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        :param pulumi.Input[str] name: The name of the disk event rule
        :param pulumi.Input[int] samples: The number of samples to evaluate
        :param pulumi.Input['DiskAnomaliesTagsArgs'] tags: Narrows the rule usage down to the hosts matching the specified tags
        :param pulumi.Input[float] threshold: The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        :param pulumi.Input[int] violating_samples: The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        """
        if disk_name is not None:
            pulumi.set(__self__, "disk_name", disk_name)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if host_group_id is not None:
            pulumi.set(__self__, "host_group_id", host_group_id)
        if metric is not None:
            pulumi.set(__self__, "metric", metric)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if samples is not None:
            pulumi.set(__self__, "samples", samples)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if threshold is not None:
            pulumi.set(__self__, "threshold", threshold)
        if violating_samples is not None:
            pulumi.set(__self__, "violating_samples", violating_samples)

    @property
    @pulumi.getter(name="diskName")
    def disk_name(self) -> Optional[pulumi.Input['DiskAnomaliesDiskNameArgs']]:
        """
        Narrows the rule usage down to disks, matching the specified criteria
        """
        return pulumi.get(self, "disk_name")

    @disk_name.setter
    def disk_name(self, value: Optional[pulumi.Input['DiskAnomaliesDiskNameArgs']]):
        pulumi.set(self, "disk_name", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Disk event rule enabled/disabled
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        """
        return pulumi.get(self, "host_group_id")

    @host_group_id.setter
    def host_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_group_id", value)

    @property
    @pulumi.getter
    def metric(self) -> Optional[pulumi.Input[str]]:
        """
        The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        """
        return pulumi.get(self, "metric")

    @metric.setter
    def metric(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the disk event rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def samples(self) -> Optional[pulumi.Input[int]]:
        """
        The number of samples to evaluate
        """
        return pulumi.get(self, "samples")

    @samples.setter
    def samples(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "samples", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input['DiskAnomaliesTagsArgs']]:
        """
        Narrows the rule usage down to the hosts matching the specified tags
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input['DiskAnomaliesTagsArgs']]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def threshold(self) -> Optional[pulumi.Input[float]]:
        """
        The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "threshold", value)

    @property
    @pulumi.getter(name="violatingSamples")
    def violating_samples(self) -> Optional[pulumi.Input[int]]:
        """
        The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        """
        return pulumi.get(self, "violating_samples")

    @violating_samples.setter
    def violating_samples(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "violating_samples", value)


class DiskAnomalies(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disk_name: Optional[pulumi.Input[pulumi.InputType['DiskAnomaliesDiskNameArgs']]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 samples: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[pulumi.InputType['DiskAnomaliesTagsArgs']]] = None,
                 threshold: Optional[pulumi.Input[float]] = None,
                 violating_samples: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a DiskAnomalies resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DiskAnomaliesDiskNameArgs']] disk_name: Narrows the rule usage down to disks, matching the specified criteria
        :param pulumi.Input[bool] enabled: Disk event rule enabled/disabled
        :param pulumi.Input[str] host_group_id: Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        :param pulumi.Input[str] metric: The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        :param pulumi.Input[str] name: The name of the disk event rule
        :param pulumi.Input[int] samples: The number of samples to evaluate
        :param pulumi.Input[pulumi.InputType['DiskAnomaliesTagsArgs']] tags: Narrows the rule usage down to the hosts matching the specified tags
        :param pulumi.Input[float] threshold: The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        :param pulumi.Input[int] violating_samples: The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DiskAnomaliesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a DiskAnomalies resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param DiskAnomaliesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DiskAnomaliesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disk_name: Optional[pulumi.Input[pulumi.InputType['DiskAnomaliesDiskNameArgs']]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 samples: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[pulumi.InputType['DiskAnomaliesTagsArgs']]] = None,
                 threshold: Optional[pulumi.Input[float]] = None,
                 violating_samples: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DiskAnomaliesArgs.__new__(DiskAnomaliesArgs)

            __props__.__dict__["disk_name"] = disk_name
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["host_group_id"] = host_group_id
            if metric is None and not opts.urn:
                raise TypeError("Missing required property 'metric'")
            __props__.__dict__["metric"] = metric
            __props__.__dict__["name"] = name
            if samples is None and not opts.urn:
                raise TypeError("Missing required property 'samples'")
            __props__.__dict__["samples"] = samples
            __props__.__dict__["tags"] = tags
            if threshold is None and not opts.urn:
                raise TypeError("Missing required property 'threshold'")
            __props__.__dict__["threshold"] = threshold
            if violating_samples is None and not opts.urn:
                raise TypeError("Missing required property 'violating_samples'")
            __props__.__dict__["violating_samples"] = violating_samples
        super(DiskAnomalies, __self__).__init__(
            'dynatrace:index/diskAnomalies:DiskAnomalies',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            disk_name: Optional[pulumi.Input[pulumi.InputType['DiskAnomaliesDiskNameArgs']]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            host_group_id: Optional[pulumi.Input[str]] = None,
            metric: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            samples: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[pulumi.InputType['DiskAnomaliesTagsArgs']]] = None,
            threshold: Optional[pulumi.Input[float]] = None,
            violating_samples: Optional[pulumi.Input[int]] = None) -> 'DiskAnomalies':
        """
        Get an existing DiskAnomalies resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DiskAnomaliesDiskNameArgs']] disk_name: Narrows the rule usage down to disks, matching the specified criteria
        :param pulumi.Input[bool] enabled: Disk event rule enabled/disabled
        :param pulumi.Input[str] host_group_id: Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        :param pulumi.Input[str] metric: The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        :param pulumi.Input[str] name: The name of the disk event rule
        :param pulumi.Input[int] samples: The number of samples to evaluate
        :param pulumi.Input[pulumi.InputType['DiskAnomaliesTagsArgs']] tags: Narrows the rule usage down to the hosts matching the specified tags
        :param pulumi.Input[float] threshold: The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        :param pulumi.Input[int] violating_samples: The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DiskAnomaliesState.__new__(_DiskAnomaliesState)

        __props__.__dict__["disk_name"] = disk_name
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["host_group_id"] = host_group_id
        __props__.__dict__["metric"] = metric
        __props__.__dict__["name"] = name
        __props__.__dict__["samples"] = samples
        __props__.__dict__["tags"] = tags
        __props__.__dict__["threshold"] = threshold
        __props__.__dict__["violating_samples"] = violating_samples
        return DiskAnomalies(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="diskName")
    def disk_name(self) -> pulumi.Output[Optional['outputs.DiskAnomaliesDiskName']]:
        """
        Narrows the rule usage down to disks, matching the specified criteria
        """
        return pulumi.get(self, "disk_name")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Disk event rule enabled/disabled
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group
        """
        return pulumi.get(self, "host_group_id")

    @property
    @pulumi.getter
    def metric(self) -> pulumi.Output[str]:
        """
        The metric to monitor. Possible values are: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING` and `WRITE_TIME_EXCEEDING`
        """
        return pulumi.get(self, "metric")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the disk event rule
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def samples(self) -> pulumi.Output[int]:
        """
        The number of samples to evaluate
        """
        return pulumi.get(self, "samples")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional['outputs.DiskAnomaliesTags']]:
        """
        Narrows the rule usage down to the hosts matching the specified tags
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Output[float]:
        """
        The threshold to trigger disk event.   * A percentage for `LowDiskSpace` or `LowInodes` metrics.   * In milliseconds for `ReadTimeExceeding` or `WriteTimeExceeding` metrics
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter(name="violatingSamples")
    def violating_samples(self) -> pulumi.Output[int]:
        """
        The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples
        """
        return pulumi.get(self, "violating_samples")
