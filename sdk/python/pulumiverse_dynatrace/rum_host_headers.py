# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RumHostHeadersArgs', 'RumHostHeaders']

@pulumi.input_type
class RumHostHeadersArgs:
    def __init__(__self__, *,
                 header_name: pulumi.Input[str],
                 insert_after: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RumHostHeaders resource.
        :param pulumi.Input[str] header_name: HTTP header format
        :param pulumi.Input[str] insert_after: Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        pulumi.set(__self__, "header_name", header_name)
        if insert_after is not None:
            pulumi.set(__self__, "insert_after", insert_after)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> pulumi.Input[str]:
        """
        HTTP header format
        """
        return pulumi.get(self, "header_name")

    @header_name.setter
    def header_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "header_name", value)

    @property
    @pulumi.getter(name="insertAfter")
    def insert_after(self) -> Optional[pulumi.Input[str]]:
        """
        Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        return pulumi.get(self, "insert_after")

    @insert_after.setter
    def insert_after(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "insert_after", value)


@pulumi.input_type
class _RumHostHeadersState:
    def __init__(__self__, *,
                 header_name: Optional[pulumi.Input[str]] = None,
                 insert_after: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RumHostHeaders resources.
        :param pulumi.Input[str] header_name: HTTP header format
        :param pulumi.Input[str] insert_after: Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        if header_name is not None:
            pulumi.set(__self__, "header_name", header_name)
        if insert_after is not None:
            pulumi.set(__self__, "insert_after", insert_after)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> Optional[pulumi.Input[str]]:
        """
        HTTP header format
        """
        return pulumi.get(self, "header_name")

    @header_name.setter
    def header_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "header_name", value)

    @property
    @pulumi.getter(name="insertAfter")
    def insert_after(self) -> Optional[pulumi.Input[str]]:
        """
        Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        return pulumi.get(self, "insert_after")

    @insert_after.setter
    def insert_after(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "insert_after", value)


class RumHostHeaders(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 header_name: Optional[pulumi.Input[str]] = None,
                 insert_after: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a RumHostHeaders resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] header_name: HTTP header format
        :param pulumi.Input[str] insert_after: Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RumHostHeadersArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a RumHostHeaders resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RumHostHeadersArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RumHostHeadersArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 header_name: Optional[pulumi.Input[str]] = None,
                 insert_after: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RumHostHeadersArgs.__new__(RumHostHeadersArgs)

            if header_name is None and not opts.urn:
                raise TypeError("Missing required property 'header_name'")
            __props__.__dict__["header_name"] = header_name
            __props__.__dict__["insert_after"] = insert_after
        super(RumHostHeaders, __self__).__init__(
            'dynatrace:index/rumHostHeaders:RumHostHeaders',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            header_name: Optional[pulumi.Input[str]] = None,
            insert_after: Optional[pulumi.Input[str]] = None) -> 'RumHostHeaders':
        """
        Get an existing RumHostHeaders resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] header_name: HTTP header format
        :param pulumi.Input[str] insert_after: Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RumHostHeadersState.__new__(_RumHostHeadersState)

        __props__.__dict__["header_name"] = header_name
        __props__.__dict__["insert_after"] = insert_after
        return RumHostHeaders(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> pulumi.Output[str]:
        """
        HTTP header format
        """
        return pulumi.get(self, "header_name")

    @property
    @pulumi.getter(name="insertAfter")
    def insert_after(self) -> pulumi.Output[str]:
        """
        Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
        """
        return pulumi.get(self, "insert_after")
