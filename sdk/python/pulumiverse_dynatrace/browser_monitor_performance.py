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

__all__ = ['BrowserMonitorPerformanceArgs', 'BrowserMonitorPerformance']

@pulumi.input_type
class BrowserMonitorPerformanceArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 scope: pulumi.Input[str],
                 thresholds: Optional[pulumi.Input['BrowserMonitorPerformanceThresholdsArgs']] = None):
        """
        The set of arguments for constructing a BrowserMonitorPerformance resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] scope: The scope of this setting (SYNTHETIC_TEST)
        :param pulumi.Input['BrowserMonitorPerformanceThresholdsArgs'] thresholds: Performance thresholds
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "scope", scope)
        if thresholds is not None:
            pulumi.set(__self__, "thresholds", thresholds)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Input[str]:
        """
        The scope of this setting (SYNTHETIC_TEST)
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: pulumi.Input[str]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def thresholds(self) -> Optional[pulumi.Input['BrowserMonitorPerformanceThresholdsArgs']]:
        """
        Performance thresholds
        """
        return pulumi.get(self, "thresholds")

    @thresholds.setter
    def thresholds(self, value: Optional[pulumi.Input['BrowserMonitorPerformanceThresholdsArgs']]):
        pulumi.set(self, "thresholds", value)


@pulumi.input_type
class _BrowserMonitorPerformanceState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 thresholds: Optional[pulumi.Input['BrowserMonitorPerformanceThresholdsArgs']] = None):
        """
        Input properties used for looking up and filtering BrowserMonitorPerformance resources.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] scope: The scope of this setting (SYNTHETIC_TEST)
        :param pulumi.Input['BrowserMonitorPerformanceThresholdsArgs'] thresholds: Performance thresholds
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if thresholds is not None:
            pulumi.set(__self__, "thresholds", thresholds)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (SYNTHETIC_TEST)
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def thresholds(self) -> Optional[pulumi.Input['BrowserMonitorPerformanceThresholdsArgs']]:
        """
        Performance thresholds
        """
        return pulumi.get(self, "thresholds")

    @thresholds.setter
    def thresholds(self, value: Optional[pulumi.Input['BrowserMonitorPerformanceThresholdsArgs']]):
        pulumi.set(self, "thresholds", value)


class BrowserMonitorPerformance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 thresholds: Optional[pulumi.Input[pulumi.InputType['BrowserMonitorPerformanceThresholdsArgs']]] = None,
                 __props__=None):
        """
        Create a BrowserMonitorPerformance resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] scope: The scope of this setting (SYNTHETIC_TEST)
        :param pulumi.Input[pulumi.InputType['BrowserMonitorPerformanceThresholdsArgs']] thresholds: Performance thresholds
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BrowserMonitorPerformanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a BrowserMonitorPerformance resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param BrowserMonitorPerformanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BrowserMonitorPerformanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 thresholds: Optional[pulumi.Input[pulumi.InputType['BrowserMonitorPerformanceThresholdsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BrowserMonitorPerformanceArgs.__new__(BrowserMonitorPerformanceArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if scope is None and not opts.urn:
                raise TypeError("Missing required property 'scope'")
            __props__.__dict__["scope"] = scope
            __props__.__dict__["thresholds"] = thresholds
        super(BrowserMonitorPerformance, __self__).__init__(
            'dynatrace:index/browserMonitorPerformance:BrowserMonitorPerformance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            thresholds: Optional[pulumi.Input[pulumi.InputType['BrowserMonitorPerformanceThresholdsArgs']]] = None) -> 'BrowserMonitorPerformance':
        """
        Get an existing BrowserMonitorPerformance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] scope: The scope of this setting (SYNTHETIC_TEST)
        :param pulumi.Input[pulumi.InputType['BrowserMonitorPerformanceThresholdsArgs']] thresholds: Performance thresholds
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BrowserMonitorPerformanceState.__new__(_BrowserMonitorPerformanceState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["scope"] = scope
        __props__.__dict__["thresholds"] = thresholds
        return BrowserMonitorPerformance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[str]:
        """
        The scope of this setting (SYNTHETIC_TEST)
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def thresholds(self) -> pulumi.Output[Optional['outputs.BrowserMonitorPerformanceThresholds']]:
        """
        Performance thresholds
        """
        return pulumi.get(self, "thresholds")
