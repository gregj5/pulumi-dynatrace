// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type SyntheticLocation struct {
	pulumi.CustomResourceState

	// Auto upgrade of Chromium is enabled (`true`) or disabled (`false`)
	AutoUpdateChromium pulumi.BoolPtrOutput `pulumi:"autoUpdateChromium"`
	// The alerting of location outage is enabled (`true`) or disabled (`false`)
	AvailabilityLocationOutage pulumi.BoolPtrOutput `pulumi:"availabilityLocationOutage"`
	// The alerting of node outage is enabled (`true`) or disabled (`false`).
	AvailabilityNodeOutage pulumi.BoolPtrOutput `pulumi:"availabilityNodeOutage"`
	// The notifications of location and node outage is enabled (`true`) or disabled (`false`)
	AvailabilityNotificationsEnabled pulumi.BoolPtrOutput `pulumi:"availabilityNotificationsEnabled"`
	// The city of the location
	City pulumi.StringPtrOutput `pulumi:"city"`
	// The country code of the location. Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for
	// example, `AT` for Austria or `PL` for Poland)
	CountryCode pulumi.StringPtrOutput `pulumi:"countryCode"`
	// The deployment type of the location: * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The
	// location is deployed on Kubernetes
	DeploymentType pulumi.StringPtrOutput `pulumi:"deploymentType"`
	// The latitude of the location in `DDD.dddd` format
	Latitude pulumi.Float64Output `pulumi:"latitude"`
	// Alert if the location or node outage lasts longer than *X* minutes. Only applicable when
	// **availability_location_outage** or **availability_node_outage** is set to `true`
	LocationNodeOutageDelayInMinutes pulumi.IntPtrOutput `pulumi:"locationNodeOutageDelayInMinutes"`
	// The longitude of the location in `DDD.dddd` format
	Longitude pulumi.Float64Output `pulumi:"longitude"`
	// The name of the location
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of synthetic nodes belonging to the location. You can retrieve the list of available nodes with the [GET all
	// nodes](https://dt-url.net/miy3rpl) call
	Nodes pulumi.StringArrayOutput `pulumi:"nodes"`
	// The region code of the location. For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca)
	// use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon. For the
	// rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes)
	RegionCode pulumi.StringPtrOutput `pulumi:"regionCode"`
}

// NewSyntheticLocation registers a new resource with the given unique name, arguments, and options.
func NewSyntheticLocation(ctx *pulumi.Context,
	name string, args *SyntheticLocationArgs, opts ...pulumi.ResourceOption) (*SyntheticLocation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Latitude == nil {
		return nil, errors.New("invalid value for required argument 'Latitude'")
	}
	if args.Longitude == nil {
		return nil, errors.New("invalid value for required argument 'Longitude'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SyntheticLocation
	err := ctx.RegisterResource("dynatrace:index/syntheticLocation:SyntheticLocation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSyntheticLocation gets an existing SyntheticLocation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSyntheticLocation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SyntheticLocationState, opts ...pulumi.ResourceOption) (*SyntheticLocation, error) {
	var resource SyntheticLocation
	err := ctx.ReadResource("dynatrace:index/syntheticLocation:SyntheticLocation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SyntheticLocation resources.
type syntheticLocationState struct {
	// Auto upgrade of Chromium is enabled (`true`) or disabled (`false`)
	AutoUpdateChromium *bool `pulumi:"autoUpdateChromium"`
	// The alerting of location outage is enabled (`true`) or disabled (`false`)
	AvailabilityLocationOutage *bool `pulumi:"availabilityLocationOutage"`
	// The alerting of node outage is enabled (`true`) or disabled (`false`).
	AvailabilityNodeOutage *bool `pulumi:"availabilityNodeOutage"`
	// The notifications of location and node outage is enabled (`true`) or disabled (`false`)
	AvailabilityNotificationsEnabled *bool `pulumi:"availabilityNotificationsEnabled"`
	// The city of the location
	City *string `pulumi:"city"`
	// The country code of the location. Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for
	// example, `AT` for Austria or `PL` for Poland)
	CountryCode *string `pulumi:"countryCode"`
	// The deployment type of the location: * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The
	// location is deployed on Kubernetes
	DeploymentType *string `pulumi:"deploymentType"`
	// The latitude of the location in `DDD.dddd` format
	Latitude *float64 `pulumi:"latitude"`
	// Alert if the location or node outage lasts longer than *X* minutes. Only applicable when
	// **availability_location_outage** or **availability_node_outage** is set to `true`
	LocationNodeOutageDelayInMinutes *int `pulumi:"locationNodeOutageDelayInMinutes"`
	// The longitude of the location in `DDD.dddd` format
	Longitude *float64 `pulumi:"longitude"`
	// The name of the location
	Name *string `pulumi:"name"`
	// A list of synthetic nodes belonging to the location. You can retrieve the list of available nodes with the [GET all
	// nodes](https://dt-url.net/miy3rpl) call
	Nodes []string `pulumi:"nodes"`
	// The region code of the location. For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca)
	// use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon. For the
	// rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes)
	RegionCode *string `pulumi:"regionCode"`
}

type SyntheticLocationState struct {
	// Auto upgrade of Chromium is enabled (`true`) or disabled (`false`)
	AutoUpdateChromium pulumi.BoolPtrInput
	// The alerting of location outage is enabled (`true`) or disabled (`false`)
	AvailabilityLocationOutage pulumi.BoolPtrInput
	// The alerting of node outage is enabled (`true`) or disabled (`false`).
	AvailabilityNodeOutage pulumi.BoolPtrInput
	// The notifications of location and node outage is enabled (`true`) or disabled (`false`)
	AvailabilityNotificationsEnabled pulumi.BoolPtrInput
	// The city of the location
	City pulumi.StringPtrInput
	// The country code of the location. Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for
	// example, `AT` for Austria or `PL` for Poland)
	CountryCode pulumi.StringPtrInput
	// The deployment type of the location: * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The
	// location is deployed on Kubernetes
	DeploymentType pulumi.StringPtrInput
	// The latitude of the location in `DDD.dddd` format
	Latitude pulumi.Float64PtrInput
	// Alert if the location or node outage lasts longer than *X* minutes. Only applicable when
	// **availability_location_outage** or **availability_node_outage** is set to `true`
	LocationNodeOutageDelayInMinutes pulumi.IntPtrInput
	// The longitude of the location in `DDD.dddd` format
	Longitude pulumi.Float64PtrInput
	// The name of the location
	Name pulumi.StringPtrInput
	// A list of synthetic nodes belonging to the location. You can retrieve the list of available nodes with the [GET all
	// nodes](https://dt-url.net/miy3rpl) call
	Nodes pulumi.StringArrayInput
	// The region code of the location. For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca)
	// use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon. For the
	// rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes)
	RegionCode pulumi.StringPtrInput
}

func (SyntheticLocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*syntheticLocationState)(nil)).Elem()
}

type syntheticLocationArgs struct {
	// Auto upgrade of Chromium is enabled (`true`) or disabled (`false`)
	AutoUpdateChromium *bool `pulumi:"autoUpdateChromium"`
	// The alerting of location outage is enabled (`true`) or disabled (`false`)
	AvailabilityLocationOutage *bool `pulumi:"availabilityLocationOutage"`
	// The alerting of node outage is enabled (`true`) or disabled (`false`).
	AvailabilityNodeOutage *bool `pulumi:"availabilityNodeOutage"`
	// The notifications of location and node outage is enabled (`true`) or disabled (`false`)
	AvailabilityNotificationsEnabled *bool `pulumi:"availabilityNotificationsEnabled"`
	// The city of the location
	City *string `pulumi:"city"`
	// The country code of the location. Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for
	// example, `AT` for Austria or `PL` for Poland)
	CountryCode *string `pulumi:"countryCode"`
	// The deployment type of the location: * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The
	// location is deployed on Kubernetes
	DeploymentType *string `pulumi:"deploymentType"`
	// The latitude of the location in `DDD.dddd` format
	Latitude float64 `pulumi:"latitude"`
	// Alert if the location or node outage lasts longer than *X* minutes. Only applicable when
	// **availability_location_outage** or **availability_node_outage** is set to `true`
	LocationNodeOutageDelayInMinutes *int `pulumi:"locationNodeOutageDelayInMinutes"`
	// The longitude of the location in `DDD.dddd` format
	Longitude float64 `pulumi:"longitude"`
	// The name of the location
	Name *string `pulumi:"name"`
	// A list of synthetic nodes belonging to the location. You can retrieve the list of available nodes with the [GET all
	// nodes](https://dt-url.net/miy3rpl) call
	Nodes []string `pulumi:"nodes"`
	// The region code of the location. For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca)
	// use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon. For the
	// rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes)
	RegionCode *string `pulumi:"regionCode"`
}

// The set of arguments for constructing a SyntheticLocation resource.
type SyntheticLocationArgs struct {
	// Auto upgrade of Chromium is enabled (`true`) or disabled (`false`)
	AutoUpdateChromium pulumi.BoolPtrInput
	// The alerting of location outage is enabled (`true`) or disabled (`false`)
	AvailabilityLocationOutage pulumi.BoolPtrInput
	// The alerting of node outage is enabled (`true`) or disabled (`false`).
	AvailabilityNodeOutage pulumi.BoolPtrInput
	// The notifications of location and node outage is enabled (`true`) or disabled (`false`)
	AvailabilityNotificationsEnabled pulumi.BoolPtrInput
	// The city of the location
	City pulumi.StringPtrInput
	// The country code of the location. Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for
	// example, `AT` for Austria or `PL` for Poland)
	CountryCode pulumi.StringPtrInput
	// The deployment type of the location: * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The
	// location is deployed on Kubernetes
	DeploymentType pulumi.StringPtrInput
	// The latitude of the location in `DDD.dddd` format
	Latitude pulumi.Float64Input
	// Alert if the location or node outage lasts longer than *X* minutes. Only applicable when
	// **availability_location_outage** or **availability_node_outage** is set to `true`
	LocationNodeOutageDelayInMinutes pulumi.IntPtrInput
	// The longitude of the location in `DDD.dddd` format
	Longitude pulumi.Float64Input
	// The name of the location
	Name pulumi.StringPtrInput
	// A list of synthetic nodes belonging to the location. You can retrieve the list of available nodes with the [GET all
	// nodes](https://dt-url.net/miy3rpl) call
	Nodes pulumi.StringArrayInput
	// The region code of the location. For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca)
	// use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon. For the
	// rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes)
	RegionCode pulumi.StringPtrInput
}

func (SyntheticLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*syntheticLocationArgs)(nil)).Elem()
}

type SyntheticLocationInput interface {
	pulumi.Input

	ToSyntheticLocationOutput() SyntheticLocationOutput
	ToSyntheticLocationOutputWithContext(ctx context.Context) SyntheticLocationOutput
}

func (*SyntheticLocation) ElementType() reflect.Type {
	return reflect.TypeOf((**SyntheticLocation)(nil)).Elem()
}

func (i *SyntheticLocation) ToSyntheticLocationOutput() SyntheticLocationOutput {
	return i.ToSyntheticLocationOutputWithContext(context.Background())
}

func (i *SyntheticLocation) ToSyntheticLocationOutputWithContext(ctx context.Context) SyntheticLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyntheticLocationOutput)
}

// SyntheticLocationArrayInput is an input type that accepts SyntheticLocationArray and SyntheticLocationArrayOutput values.
// You can construct a concrete instance of `SyntheticLocationArrayInput` via:
//
//	SyntheticLocationArray{ SyntheticLocationArgs{...} }
type SyntheticLocationArrayInput interface {
	pulumi.Input

	ToSyntheticLocationArrayOutput() SyntheticLocationArrayOutput
	ToSyntheticLocationArrayOutputWithContext(context.Context) SyntheticLocationArrayOutput
}

type SyntheticLocationArray []SyntheticLocationInput

func (SyntheticLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SyntheticLocation)(nil)).Elem()
}

func (i SyntheticLocationArray) ToSyntheticLocationArrayOutput() SyntheticLocationArrayOutput {
	return i.ToSyntheticLocationArrayOutputWithContext(context.Background())
}

func (i SyntheticLocationArray) ToSyntheticLocationArrayOutputWithContext(ctx context.Context) SyntheticLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyntheticLocationArrayOutput)
}

// SyntheticLocationMapInput is an input type that accepts SyntheticLocationMap and SyntheticLocationMapOutput values.
// You can construct a concrete instance of `SyntheticLocationMapInput` via:
//
//	SyntheticLocationMap{ "key": SyntheticLocationArgs{...} }
type SyntheticLocationMapInput interface {
	pulumi.Input

	ToSyntheticLocationMapOutput() SyntheticLocationMapOutput
	ToSyntheticLocationMapOutputWithContext(context.Context) SyntheticLocationMapOutput
}

type SyntheticLocationMap map[string]SyntheticLocationInput

func (SyntheticLocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SyntheticLocation)(nil)).Elem()
}

func (i SyntheticLocationMap) ToSyntheticLocationMapOutput() SyntheticLocationMapOutput {
	return i.ToSyntheticLocationMapOutputWithContext(context.Background())
}

func (i SyntheticLocationMap) ToSyntheticLocationMapOutputWithContext(ctx context.Context) SyntheticLocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyntheticLocationMapOutput)
}

type SyntheticLocationOutput struct{ *pulumi.OutputState }

func (SyntheticLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SyntheticLocation)(nil)).Elem()
}

func (o SyntheticLocationOutput) ToSyntheticLocationOutput() SyntheticLocationOutput {
	return o
}

func (o SyntheticLocationOutput) ToSyntheticLocationOutputWithContext(ctx context.Context) SyntheticLocationOutput {
	return o
}

// Auto upgrade of Chromium is enabled (`true`) or disabled (`false`)
func (o SyntheticLocationOutput) AutoUpdateChromium() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.BoolPtrOutput { return v.AutoUpdateChromium }).(pulumi.BoolPtrOutput)
}

// The alerting of location outage is enabled (`true`) or disabled (`false`)
func (o SyntheticLocationOutput) AvailabilityLocationOutage() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.BoolPtrOutput { return v.AvailabilityLocationOutage }).(pulumi.BoolPtrOutput)
}

// The alerting of node outage is enabled (`true`) or disabled (`false`).
func (o SyntheticLocationOutput) AvailabilityNodeOutage() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.BoolPtrOutput { return v.AvailabilityNodeOutage }).(pulumi.BoolPtrOutput)
}

// The notifications of location and node outage is enabled (`true`) or disabled (`false`)
func (o SyntheticLocationOutput) AvailabilityNotificationsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.BoolPtrOutput { return v.AvailabilityNotificationsEnabled }).(pulumi.BoolPtrOutput)
}

// The city of the location
func (o SyntheticLocationOutput) City() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.StringPtrOutput { return v.City }).(pulumi.StringPtrOutput)
}

// The country code of the location. Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for
// example, `AT` for Austria or `PL` for Poland)
func (o SyntheticLocationOutput) CountryCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.StringPtrOutput { return v.CountryCode }).(pulumi.StringPtrOutput)
}

// The deployment type of the location: * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The
// location is deployed on Kubernetes
func (o SyntheticLocationOutput) DeploymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.StringPtrOutput { return v.DeploymentType }).(pulumi.StringPtrOutput)
}

// The latitude of the location in `DDD.dddd` format
func (o SyntheticLocationOutput) Latitude() pulumi.Float64Output {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.Float64Output { return v.Latitude }).(pulumi.Float64Output)
}

// Alert if the location or node outage lasts longer than *X* minutes. Only applicable when
// **availability_location_outage** or **availability_node_outage** is set to `true`
func (o SyntheticLocationOutput) LocationNodeOutageDelayInMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.IntPtrOutput { return v.LocationNodeOutageDelayInMinutes }).(pulumi.IntPtrOutput)
}

// The longitude of the location in `DDD.dddd` format
func (o SyntheticLocationOutput) Longitude() pulumi.Float64Output {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.Float64Output { return v.Longitude }).(pulumi.Float64Output)
}

// The name of the location
func (o SyntheticLocationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of synthetic nodes belonging to the location. You can retrieve the list of available nodes with the [GET all
// nodes](https://dt-url.net/miy3rpl) call
func (o SyntheticLocationOutput) Nodes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.StringArrayOutput { return v.Nodes }).(pulumi.StringArrayOutput)
}

// The region code of the location. For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca)
// use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon. For the
// rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes)
func (o SyntheticLocationOutput) RegionCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SyntheticLocation) pulumi.StringPtrOutput { return v.RegionCode }).(pulumi.StringPtrOutput)
}

type SyntheticLocationArrayOutput struct{ *pulumi.OutputState }

func (SyntheticLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SyntheticLocation)(nil)).Elem()
}

func (o SyntheticLocationArrayOutput) ToSyntheticLocationArrayOutput() SyntheticLocationArrayOutput {
	return o
}

func (o SyntheticLocationArrayOutput) ToSyntheticLocationArrayOutputWithContext(ctx context.Context) SyntheticLocationArrayOutput {
	return o
}

func (o SyntheticLocationArrayOutput) Index(i pulumi.IntInput) SyntheticLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SyntheticLocation {
		return vs[0].([]*SyntheticLocation)[vs[1].(int)]
	}).(SyntheticLocationOutput)
}

type SyntheticLocationMapOutput struct{ *pulumi.OutputState }

func (SyntheticLocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SyntheticLocation)(nil)).Elem()
}

func (o SyntheticLocationMapOutput) ToSyntheticLocationMapOutput() SyntheticLocationMapOutput {
	return o
}

func (o SyntheticLocationMapOutput) ToSyntheticLocationMapOutputWithContext(ctx context.Context) SyntheticLocationMapOutput {
	return o
}

func (o SyntheticLocationMapOutput) MapIndex(k pulumi.StringInput) SyntheticLocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SyntheticLocation {
		return vs[0].(map[string]*SyntheticLocation)[vs[1].(string)]
	}).(SyntheticLocationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SyntheticLocationInput)(nil)).Elem(), &SyntheticLocation{})
	pulumi.RegisterInputType(reflect.TypeOf((*SyntheticLocationArrayInput)(nil)).Elem(), SyntheticLocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SyntheticLocationMapInput)(nil)).Elem(), SyntheticLocationMap{})
	pulumi.RegisterOutputType(SyntheticLocationOutput{})
	pulumi.RegisterOutputType(SyntheticLocationArrayOutput{})
	pulumi.RegisterOutputType(SyntheticLocationMapOutput{})
}