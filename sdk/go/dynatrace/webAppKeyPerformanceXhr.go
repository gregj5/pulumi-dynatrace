// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumiverse/pulumi-dynatrace/sdk/go/dynatrace/internal"
)

type WebAppKeyPerformanceXhr struct {
	pulumi.CustomResourceState

	// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
	FallbackThresholds WebAppKeyPerformanceXhrFallbackThresholdsPtrOutput `pulumi:"fallbackThresholds"`
	// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
	Kpm pulumi.StringOutput `pulumi:"kpm"`
	// The scope of this setting (APPLICATION_METHOD, APPLICATION)
	Scope pulumi.StringOutput `pulumi:"scope"`
	// Set the Tolerating and Frustrated performance thresholds for this action type.
	Thresholds WebAppKeyPerformanceXhrThresholdsOutput `pulumi:"thresholds"`
}

// NewWebAppKeyPerformanceXhr registers a new resource with the given unique name, arguments, and options.
func NewWebAppKeyPerformanceXhr(ctx *pulumi.Context,
	name string, args *WebAppKeyPerformanceXhrArgs, opts ...pulumi.ResourceOption) (*WebAppKeyPerformanceXhr, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Kpm == nil {
		return nil, errors.New("invalid value for required argument 'Kpm'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.Thresholds == nil {
		return nil, errors.New("invalid value for required argument 'Thresholds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WebAppKeyPerformanceXhr
	err := ctx.RegisterResource("dynatrace:index/webAppKeyPerformanceXhr:WebAppKeyPerformanceXhr", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebAppKeyPerformanceXhr gets an existing WebAppKeyPerformanceXhr resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebAppKeyPerformanceXhr(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebAppKeyPerformanceXhrState, opts ...pulumi.ResourceOption) (*WebAppKeyPerformanceXhr, error) {
	var resource WebAppKeyPerformanceXhr
	err := ctx.ReadResource("dynatrace:index/webAppKeyPerformanceXhr:WebAppKeyPerformanceXhr", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebAppKeyPerformanceXhr resources.
type webAppKeyPerformanceXhrState struct {
	// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
	FallbackThresholds *WebAppKeyPerformanceXhrFallbackThresholds `pulumi:"fallbackThresholds"`
	// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
	Kpm *string `pulumi:"kpm"`
	// The scope of this setting (APPLICATION_METHOD, APPLICATION)
	Scope *string `pulumi:"scope"`
	// Set the Tolerating and Frustrated performance thresholds for this action type.
	Thresholds *WebAppKeyPerformanceXhrThresholds `pulumi:"thresholds"`
}

type WebAppKeyPerformanceXhrState struct {
	// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
	FallbackThresholds WebAppKeyPerformanceXhrFallbackThresholdsPtrInput
	// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
	Kpm pulumi.StringPtrInput
	// The scope of this setting (APPLICATION_METHOD, APPLICATION)
	Scope pulumi.StringPtrInput
	// Set the Tolerating and Frustrated performance thresholds for this action type.
	Thresholds WebAppKeyPerformanceXhrThresholdsPtrInput
}

func (WebAppKeyPerformanceXhrState) ElementType() reflect.Type {
	return reflect.TypeOf((*webAppKeyPerformanceXhrState)(nil)).Elem()
}

type webAppKeyPerformanceXhrArgs struct {
	// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
	FallbackThresholds *WebAppKeyPerformanceXhrFallbackThresholds `pulumi:"fallbackThresholds"`
	// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
	Kpm string `pulumi:"kpm"`
	// The scope of this setting (APPLICATION_METHOD, APPLICATION)
	Scope string `pulumi:"scope"`
	// Set the Tolerating and Frustrated performance thresholds for this action type.
	Thresholds WebAppKeyPerformanceXhrThresholds `pulumi:"thresholds"`
}

// The set of arguments for constructing a WebAppKeyPerformanceXhr resource.
type WebAppKeyPerformanceXhrArgs struct {
	// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
	FallbackThresholds WebAppKeyPerformanceXhrFallbackThresholdsPtrInput
	// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
	Kpm pulumi.StringInput
	// The scope of this setting (APPLICATION_METHOD, APPLICATION)
	Scope pulumi.StringInput
	// Set the Tolerating and Frustrated performance thresholds for this action type.
	Thresholds WebAppKeyPerformanceXhrThresholdsInput
}

func (WebAppKeyPerformanceXhrArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webAppKeyPerformanceXhrArgs)(nil)).Elem()
}

type WebAppKeyPerformanceXhrInput interface {
	pulumi.Input

	ToWebAppKeyPerformanceXhrOutput() WebAppKeyPerformanceXhrOutput
	ToWebAppKeyPerformanceXhrOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrOutput
}

func (*WebAppKeyPerformanceXhr) ElementType() reflect.Type {
	return reflect.TypeOf((**WebAppKeyPerformanceXhr)(nil)).Elem()
}

func (i *WebAppKeyPerformanceXhr) ToWebAppKeyPerformanceXhrOutput() WebAppKeyPerformanceXhrOutput {
	return i.ToWebAppKeyPerformanceXhrOutputWithContext(context.Background())
}

func (i *WebAppKeyPerformanceXhr) ToWebAppKeyPerformanceXhrOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAppKeyPerformanceXhrOutput)
}

// WebAppKeyPerformanceXhrArrayInput is an input type that accepts WebAppKeyPerformanceXhrArray and WebAppKeyPerformanceXhrArrayOutput values.
// You can construct a concrete instance of `WebAppKeyPerformanceXhrArrayInput` via:
//
//	WebAppKeyPerformanceXhrArray{ WebAppKeyPerformanceXhrArgs{...} }
type WebAppKeyPerformanceXhrArrayInput interface {
	pulumi.Input

	ToWebAppKeyPerformanceXhrArrayOutput() WebAppKeyPerformanceXhrArrayOutput
	ToWebAppKeyPerformanceXhrArrayOutputWithContext(context.Context) WebAppKeyPerformanceXhrArrayOutput
}

type WebAppKeyPerformanceXhrArray []WebAppKeyPerformanceXhrInput

func (WebAppKeyPerformanceXhrArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebAppKeyPerformanceXhr)(nil)).Elem()
}

func (i WebAppKeyPerformanceXhrArray) ToWebAppKeyPerformanceXhrArrayOutput() WebAppKeyPerformanceXhrArrayOutput {
	return i.ToWebAppKeyPerformanceXhrArrayOutputWithContext(context.Background())
}

func (i WebAppKeyPerformanceXhrArray) ToWebAppKeyPerformanceXhrArrayOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAppKeyPerformanceXhrArrayOutput)
}

// WebAppKeyPerformanceXhrMapInput is an input type that accepts WebAppKeyPerformanceXhrMap and WebAppKeyPerformanceXhrMapOutput values.
// You can construct a concrete instance of `WebAppKeyPerformanceXhrMapInput` via:
//
//	WebAppKeyPerformanceXhrMap{ "key": WebAppKeyPerformanceXhrArgs{...} }
type WebAppKeyPerformanceXhrMapInput interface {
	pulumi.Input

	ToWebAppKeyPerformanceXhrMapOutput() WebAppKeyPerformanceXhrMapOutput
	ToWebAppKeyPerformanceXhrMapOutputWithContext(context.Context) WebAppKeyPerformanceXhrMapOutput
}

type WebAppKeyPerformanceXhrMap map[string]WebAppKeyPerformanceXhrInput

func (WebAppKeyPerformanceXhrMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebAppKeyPerformanceXhr)(nil)).Elem()
}

func (i WebAppKeyPerformanceXhrMap) ToWebAppKeyPerformanceXhrMapOutput() WebAppKeyPerformanceXhrMapOutput {
	return i.ToWebAppKeyPerformanceXhrMapOutputWithContext(context.Background())
}

func (i WebAppKeyPerformanceXhrMap) ToWebAppKeyPerformanceXhrMapOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAppKeyPerformanceXhrMapOutput)
}

type WebAppKeyPerformanceXhrOutput struct{ *pulumi.OutputState }

func (WebAppKeyPerformanceXhrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebAppKeyPerformanceXhr)(nil)).Elem()
}

func (o WebAppKeyPerformanceXhrOutput) ToWebAppKeyPerformanceXhrOutput() WebAppKeyPerformanceXhrOutput {
	return o
}

func (o WebAppKeyPerformanceXhrOutput) ToWebAppKeyPerformanceXhrOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrOutput {
	return o
}

// If the selected key performance metric is not detected, the **User action duration** metric is used instead.
func (o WebAppKeyPerformanceXhrOutput) FallbackThresholds() WebAppKeyPerformanceXhrFallbackThresholdsPtrOutput {
	return o.ApplyT(func(v *WebAppKeyPerformanceXhr) WebAppKeyPerformanceXhrFallbackThresholdsPtrOutput {
		return v.FallbackThresholds
	}).(WebAppKeyPerformanceXhrFallbackThresholdsPtrOutput)
}

// Possible Values: `RESPONSE_END`, `RESPONSE_START`, `USER_ACTION_DURATION`, `VISUALLY_COMPLETE`
func (o WebAppKeyPerformanceXhrOutput) Kpm() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAppKeyPerformanceXhr) pulumi.StringOutput { return v.Kpm }).(pulumi.StringOutput)
}

// The scope of this setting (APPLICATION_METHOD, APPLICATION)
func (o WebAppKeyPerformanceXhrOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAppKeyPerformanceXhr) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// Set the Tolerating and Frustrated performance thresholds for this action type.
func (o WebAppKeyPerformanceXhrOutput) Thresholds() WebAppKeyPerformanceXhrThresholdsOutput {
	return o.ApplyT(func(v *WebAppKeyPerformanceXhr) WebAppKeyPerformanceXhrThresholdsOutput { return v.Thresholds }).(WebAppKeyPerformanceXhrThresholdsOutput)
}

type WebAppKeyPerformanceXhrArrayOutput struct{ *pulumi.OutputState }

func (WebAppKeyPerformanceXhrArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebAppKeyPerformanceXhr)(nil)).Elem()
}

func (o WebAppKeyPerformanceXhrArrayOutput) ToWebAppKeyPerformanceXhrArrayOutput() WebAppKeyPerformanceXhrArrayOutput {
	return o
}

func (o WebAppKeyPerformanceXhrArrayOutput) ToWebAppKeyPerformanceXhrArrayOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrArrayOutput {
	return o
}

func (o WebAppKeyPerformanceXhrArrayOutput) Index(i pulumi.IntInput) WebAppKeyPerformanceXhrOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebAppKeyPerformanceXhr {
		return vs[0].([]*WebAppKeyPerformanceXhr)[vs[1].(int)]
	}).(WebAppKeyPerformanceXhrOutput)
}

type WebAppKeyPerformanceXhrMapOutput struct{ *pulumi.OutputState }

func (WebAppKeyPerformanceXhrMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebAppKeyPerformanceXhr)(nil)).Elem()
}

func (o WebAppKeyPerformanceXhrMapOutput) ToWebAppKeyPerformanceXhrMapOutput() WebAppKeyPerformanceXhrMapOutput {
	return o
}

func (o WebAppKeyPerformanceXhrMapOutput) ToWebAppKeyPerformanceXhrMapOutputWithContext(ctx context.Context) WebAppKeyPerformanceXhrMapOutput {
	return o
}

func (o WebAppKeyPerformanceXhrMapOutput) MapIndex(k pulumi.StringInput) WebAppKeyPerformanceXhrOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebAppKeyPerformanceXhr {
		return vs[0].(map[string]*WebAppKeyPerformanceXhr)[vs[1].(string)]
	}).(WebAppKeyPerformanceXhrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebAppKeyPerformanceXhrInput)(nil)).Elem(), &WebAppKeyPerformanceXhr{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAppKeyPerformanceXhrArrayInput)(nil)).Elem(), WebAppKeyPerformanceXhrArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAppKeyPerformanceXhrMapInput)(nil)).Elem(), WebAppKeyPerformanceXhrMap{})
	pulumi.RegisterOutputType(WebAppKeyPerformanceXhrOutput{})
	pulumi.RegisterOutputType(WebAppKeyPerformanceXhrArrayOutput{})
	pulumi.RegisterOutputType(WebAppKeyPerformanceXhrMapOutput{})
}