// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "dynatrace:index/alerting:Alerting":
		r = &Alerting{}
	case "dynatrace:index/alertingProfile:AlertingProfile":
		r = &AlertingProfile{}
	case "dynatrace:index/applicationAnomalies:ApplicationAnomalies":
		r = &ApplicationAnomalies{}
	case "dynatrace:index/applicationDataPrivacy:ApplicationDataPrivacy":
		r = &ApplicationDataPrivacy{}
	case "dynatrace:index/applicationDetectionRule:ApplicationDetectionRule":
		r = &ApplicationDetectionRule{}
	case "dynatrace:index/applicationErrorRules:ApplicationErrorRules":
		r = &ApplicationErrorRules{}
	case "dynatrace:index/autotag:Autotag":
		r = &Autotag{}
	case "dynatrace:index/awsCredentials:AwsCredentials":
		r = &AwsCredentials{}
	case "dynatrace:index/azureCredentials:AzureCredentials":
		r = &AzureCredentials{}
	case "dynatrace:index/browserMonitor:BrowserMonitor":
		r = &BrowserMonitor{}
	case "dynatrace:index/calculatedServiceMetric:CalculatedServiceMetric":
		r = &CalculatedServiceMetric{}
	case "dynatrace:index/cloudfoundaryCredentials:CloudfoundaryCredentials":
		r = &CloudfoundaryCredentials{}
	case "dynatrace:index/customAnomalies:CustomAnomalies":
		r = &CustomAnomalies{}
	case "dynatrace:index/customService:CustomService":
		r = &CustomService{}
	case "dynatrace:index/dashboard:Dashboard":
		r = &Dashboard{}
	case "dynatrace:index/dashboardSharing:DashboardSharing":
		r = &DashboardSharing{}
	case "dynatrace:index/databaseAnomalies:DatabaseAnomalies":
		r = &DatabaseAnomalies{}
	case "dynatrace:index/diskAnomalies:DiskAnomalies":
		r = &DiskAnomalies{}
	case "dynatrace:index/environment:Environment":
		r = &Environment{}
	case "dynatrace:index/hostAnomalies:HostAnomalies":
		r = &HostAnomalies{}
	case "dynatrace:index/hostNaming:HostNaming":
		r = &HostNaming{}
	case "dynatrace:index/httpMonitor:HttpMonitor":
		r = &HttpMonitor{}
	case "dynatrace:index/ibmMqFilters:IbmMqFilters":
		r = &IbmMqFilters{}
	case "dynatrace:index/imsBridges:ImsBridges":
		r = &ImsBridges{}
	case "dynatrace:index/k8sCredentials:K8sCredentials":
		r = &K8sCredentials{}
	case "dynatrace:index/keyRequests:KeyRequests":
		r = &KeyRequests{}
	case "dynatrace:index/maintenanceWindow:MaintenanceWindow":
		r = &MaintenanceWindow{}
	case "dynatrace:index/managementZone:ManagementZone":
		r = &ManagementZone{}
	case "dynatrace:index/mobileApplication:MobileApplication":
		r = &MobileApplication{}
	case "dynatrace:index/networkZones:NetworkZones":
		r = &NetworkZones{}
	case "dynatrace:index/notification:Notification":
		r = &Notification{}
	case "dynatrace:index/processgroupNaming:ProcessgroupNaming":
		r = &ProcessgroupNaming{}
	case "dynatrace:index/queueManager:QueueManager":
		r = &QueueManager{}
	case "dynatrace:index/queueSharingGroups:QueueSharingGroups":
		r = &QueueSharingGroups{}
	case "dynatrace:index/requestAttribute:RequestAttribute":
		r = &RequestAttribute{}
	case "dynatrace:index/requestNaming:RequestNaming":
		r = &RequestNaming{}
	case "dynatrace:index/requestNamings:RequestNamings":
		r = &RequestNamings{}
	case "dynatrace:index/resourceAttributes:ResourceAttributes":
		r = &ResourceAttributes{}
	case "dynatrace:index/serviceAnomalies:ServiceAnomalies":
		r = &ServiceAnomalies{}
	case "dynatrace:index/serviceNaming:ServiceNaming":
		r = &ServiceNaming{}
	case "dynatrace:index/slo:Slo":
		r = &Slo{}
	case "dynatrace:index/spanAttributed:SpanAttributed":
		r = &SpanAttributed{}
	case "dynatrace:index/spanCaptureRule:SpanCaptureRule":
		r = &SpanCaptureRule{}
	case "dynatrace:index/spanContextPropagation:SpanContextPropagation":
		r = &SpanContextPropagation{}
	case "dynatrace:index/spanEntryPoint:SpanEntryPoint":
		r = &SpanEntryPoint{}
	case "dynatrace:index/user:User":
		r = &User{}
	case "dynatrace:index/userGroup:UserGroup":
		r = &UserGroup{}
	case "dynatrace:index/webApplication:WebApplication":
		r = &WebApplication{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:dynatrace" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/alerting",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/alertingProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/applicationAnomalies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/applicationDataPrivacy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/applicationDetectionRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/applicationErrorRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/autotag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/awsCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/azureCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/browserMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/calculatedServiceMetric",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/cloudfoundaryCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/customAnomalies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/customService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/dashboard",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/dashboardSharing",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/databaseAnomalies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/diskAnomalies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/environment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/hostAnomalies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/hostNaming",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/httpMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/ibmMqFilters",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/imsBridges",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/k8sCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/keyRequests",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/maintenanceWindow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/managementZone",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/mobileApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/networkZones",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/notification",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/processgroupNaming",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/queueManager",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/queueSharingGroups",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/requestAttribute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/requestNaming",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/requestNamings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/resourceAttributes",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/serviceAnomalies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/serviceNaming",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/slo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/spanAttributed",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/spanCaptureRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/spanContextPropagation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/spanEntryPoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/userGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"dynatrace",
		"index/webApplication",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"dynatrace",
		&pkg{version},
	)
}