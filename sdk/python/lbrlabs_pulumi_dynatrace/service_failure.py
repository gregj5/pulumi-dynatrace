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

__all__ = ['ServiceFailureArgs', 'ServiceFailure']

@pulumi.input_type
class ServiceFailureArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 service_id: pulumi.Input[str],
                 exception_rules: Optional[pulumi.Input['ServiceFailureExceptionRulesArgs']] = None):
        """
        The set of arguments for constructing a ServiceFailure resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] service_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        :param pulumi.Input['ServiceFailureExceptionRulesArgs'] exception_rules: Customize failure detection for specific exceptions and errors
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "service_id", service_id)
        if exception_rules is not None:
            pulumi.set(__self__, "exception_rules", exception_rules)

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
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="exceptionRules")
    def exception_rules(self) -> Optional[pulumi.Input['ServiceFailureExceptionRulesArgs']]:
        """
        Customize failure detection for specific exceptions and errors
        """
        return pulumi.get(self, "exception_rules")

    @exception_rules.setter
    def exception_rules(self, value: Optional[pulumi.Input['ServiceFailureExceptionRulesArgs']]):
        pulumi.set(self, "exception_rules", value)


@pulumi.input_type
class _ServiceFailureState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 exception_rules: Optional[pulumi.Input['ServiceFailureExceptionRulesArgs']] = None,
                 service_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceFailure resources.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input['ServiceFailureExceptionRulesArgs'] exception_rules: Customize failure detection for specific exceptions and errors
        :param pulumi.Input[str] service_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if exception_rules is not None:
            pulumi.set(__self__, "exception_rules", exception_rules)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)

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
    @pulumi.getter(name="exceptionRules")
    def exception_rules(self) -> Optional[pulumi.Input['ServiceFailureExceptionRulesArgs']]:
        """
        Customize failure detection for specific exceptions and errors
        """
        return pulumi.get(self, "exception_rules")

    @exception_rules.setter
    def exception_rules(self, value: Optional[pulumi.Input['ServiceFailureExceptionRulesArgs']]):
        pulumi.set(self, "exception_rules", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)


class ServiceFailure(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 exception_rules: Optional[pulumi.Input[pulumi.InputType['ServiceFailureExceptionRulesArgs']]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a ServiceFailure resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['ServiceFailureExceptionRulesArgs']] exception_rules: Customize failure detection for specific exceptions and errors
        :param pulumi.Input[str] service_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceFailureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ServiceFailure resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ServiceFailureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceFailureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 exception_rules: Optional[pulumi.Input[pulumi.InputType['ServiceFailureExceptionRulesArgs']]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceFailureArgs.__new__(ServiceFailureArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["exception_rules"] = exception_rules
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
        super(ServiceFailure, __self__).__init__(
            'dynatrace:index/serviceFailure:ServiceFailure',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            exception_rules: Optional[pulumi.Input[pulumi.InputType['ServiceFailureExceptionRulesArgs']]] = None,
            service_id: Optional[pulumi.Input[str]] = None) -> 'ServiceFailure':
        """
        Get an existing ServiceFailure resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['ServiceFailureExceptionRulesArgs']] exception_rules: Customize failure detection for specific exceptions and errors
        :param pulumi.Input[str] service_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceFailureState.__new__(_ServiceFailureState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["exception_rules"] = exception_rules
        __props__.__dict__["service_id"] = service_id
        return ServiceFailure(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="exceptionRules")
    def exception_rules(self) -> pulumi.Output[Optional['outputs.ServiceFailureExceptionRules']]:
        """
        Customize failure detection for specific exceptions and errors
        """
        return pulumi.get(self, "exception_rules")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        return pulumi.get(self, "service_id")
