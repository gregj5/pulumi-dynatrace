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

__all__ = ['WebAppEnablementArgs', 'WebAppEnablement']

@pulumi.input_type
class WebAppEnablementArgs:
    def __init__(__self__, *,
                 rum: pulumi.Input['WebAppEnablementRumArgs'],
                 session_replay: pulumi.Input['WebAppEnablementSessionReplayArgs'],
                 application_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WebAppEnablement resource.
        :param pulumi.Input['WebAppEnablementRumArgs'] rum: Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        :param pulumi.Input['WebAppEnablementSessionReplayArgs'] session_replay: [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        :param pulumi.Input[str] application_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        pulumi.set(__self__, "rum", rum)
        pulumi.set(__self__, "session_replay", session_replay)
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)

    @property
    @pulumi.getter
    def rum(self) -> pulumi.Input['WebAppEnablementRumArgs']:
        """
        Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        """
        return pulumi.get(self, "rum")

    @rum.setter
    def rum(self, value: pulumi.Input['WebAppEnablementRumArgs']):
        pulumi.set(self, "rum", value)

    @property
    @pulumi.getter(name="sessionReplay")
    def session_replay(self) -> pulumi.Input['WebAppEnablementSessionReplayArgs']:
        """
        [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        """
        return pulumi.get(self, "session_replay")

    @session_replay.setter
    def session_replay(self, value: pulumi.Input['WebAppEnablementSessionReplayArgs']):
        pulumi.set(self, "session_replay", value)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)


@pulumi.input_type
class _WebAppEnablementState:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 rum: Optional[pulumi.Input['WebAppEnablementRumArgs']] = None,
                 session_replay: Optional[pulumi.Input['WebAppEnablementSessionReplayArgs']] = None):
        """
        Input properties used for looking up and filtering WebAppEnablement resources.
        :param pulumi.Input[str] application_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        :param pulumi.Input['WebAppEnablementRumArgs'] rum: Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        :param pulumi.Input['WebAppEnablementSessionReplayArgs'] session_replay: [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if rum is not None:
            pulumi.set(__self__, "rum", rum)
        if session_replay is not None:
            pulumi.set(__self__, "session_replay", session_replay)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter
    def rum(self) -> Optional[pulumi.Input['WebAppEnablementRumArgs']]:
        """
        Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        """
        return pulumi.get(self, "rum")

    @rum.setter
    def rum(self, value: Optional[pulumi.Input['WebAppEnablementRumArgs']]):
        pulumi.set(self, "rum", value)

    @property
    @pulumi.getter(name="sessionReplay")
    def session_replay(self) -> Optional[pulumi.Input['WebAppEnablementSessionReplayArgs']]:
        """
        [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        """
        return pulumi.get(self, "session_replay")

    @session_replay.setter
    def session_replay(self, value: Optional[pulumi.Input['WebAppEnablementSessionReplayArgs']]):
        pulumi.set(self, "session_replay", value)


class WebAppEnablement(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 rum: Optional[pulumi.Input[pulumi.InputType['WebAppEnablementRumArgs']]] = None,
                 session_replay: Optional[pulumi.Input[pulumi.InputType['WebAppEnablementSessionReplayArgs']]] = None,
                 __props__=None):
        """
        Create a WebAppEnablement resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        :param pulumi.Input[pulumi.InputType['WebAppEnablementRumArgs']] rum: Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        :param pulumi.Input[pulumi.InputType['WebAppEnablementSessionReplayArgs']] session_replay: [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebAppEnablementArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a WebAppEnablement resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param WebAppEnablementArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebAppEnablementArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 rum: Optional[pulumi.Input[pulumi.InputType['WebAppEnablementRumArgs']]] = None,
                 session_replay: Optional[pulumi.Input[pulumi.InputType['WebAppEnablementSessionReplayArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebAppEnablementArgs.__new__(WebAppEnablementArgs)

            __props__.__dict__["application_id"] = application_id
            if rum is None and not opts.urn:
                raise TypeError("Missing required property 'rum'")
            __props__.__dict__["rum"] = rum
            if session_replay is None and not opts.urn:
                raise TypeError("Missing required property 'session_replay'")
            __props__.__dict__["session_replay"] = session_replay
        super(WebAppEnablement, __self__).__init__(
            'dynatrace:index/webAppEnablement:WebAppEnablement',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            rum: Optional[pulumi.Input[pulumi.InputType['WebAppEnablementRumArgs']]] = None,
            session_replay: Optional[pulumi.Input[pulumi.InputType['WebAppEnablementSessionReplayArgs']]] = None) -> 'WebAppEnablement':
        """
        Get an existing WebAppEnablement resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        :param pulumi.Input[pulumi.InputType['WebAppEnablementRumArgs']] rum: Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        :param pulumi.Input[pulumi.InputType['WebAppEnablementSessionReplayArgs']] session_replay: [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebAppEnablementState.__new__(_WebAppEnablementState)

        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["rum"] = rum
        __props__.__dict__["session_replay"] = session_replay
        return WebAppEnablement(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[Optional[str]]:
        """
        The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def rum(self) -> pulumi.Output['outputs.WebAppEnablementRum']:
        """
        Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application's performance, identify errors, and gain insight into your user's behavior and experience.
        """
        return pulumi.get(self, "rum")

    @property
    @pulumi.getter(name="sessionReplay")
    def session_replay(self) -> pulumi.Output['outputs.WebAppEnablementSessionReplay']:
        """
        [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
        """
        return pulumi.get(self, "session_replay")
