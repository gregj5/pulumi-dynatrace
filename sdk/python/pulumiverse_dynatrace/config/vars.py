# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('dynatrace')


class _ExportableConfig(types.ModuleType):
    @property
    def account_id(self) -> Optional[str]:
        return __config__.get('accountId')

    @property
    def automation_client_id(self) -> Optional[str]:
        return __config__.get('automationClientId')

    @property
    def automation_client_secret(self) -> Optional[str]:
        return __config__.get('automationClientSecret')

    @property
    def automation_env_url(self) -> Optional[str]:
        """
        The URL of the Dynatrace Environment with Platform capabilities turned on (`https://#####.apps.dynatrace.com)`. This is
        optional configuration when `dt_env_url` already specifies a SaaS Environment like `https://#####.live.dynatrace.com` or
        `https://#####.apps.dynatrace.com`
        """
        return __config__.get('automationEnvUrl')

    @property
    def automation_token_url(self) -> Optional[str]:
        """
        The URL that provides the Bearer tokens when accessing the Automation REST API. This is optional configuration when
        `dt_env_url` already specifies a SaaS Environment like `https://#####.live.dynatrace.com` or
        `https://#####.apps.dynatrace.com`
        """
        return __config__.get('automationTokenUrl')

    @property
    def client_id(self) -> Optional[str]:
        return __config__.get('clientId')

    @property
    def client_secret(self) -> Optional[str]:
        return __config__.get('clientSecret')

    @property
    def dt_api_token(self) -> Optional[str]:
        return __config__.get('dtApiToken') or _utilities.get_env('DYNATRACE_API_TOKEN', 'DT_API_TOKEN')

    @property
    def dt_cluster_api_token(self) -> Optional[str]:
        return __config__.get('dtClusterApiToken') or _utilities.get_env('DYNATRACE_CLUSTER_API_TOKEN', 'DT_CLUSTER_API_TOKEN')

    @property
    def dt_cluster_url(self) -> Optional[str]:
        return __config__.get('dtClusterUrl') or _utilities.get_env('DYNATRACE_CLUSTER_URL', 'DT_CLUSTER_URL')

    @property
    def dt_env_url(self) -> Optional[str]:
        return __config__.get('dtEnvUrl') or _utilities.get_env('DYNATRACE_ENV_URL', 'DT_ENV_URL')

    @property
    def iam_account_id(self) -> Optional[str]:
        return __config__.get('iamAccountId')

    @property
    def iam_client_id(self) -> Optional[str]:
        return __config__.get('iamClientId')

    @property
    def iam_client_secret(self) -> Optional[str]:
        return __config__.get('iamClientSecret')
