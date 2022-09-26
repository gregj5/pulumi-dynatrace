// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type RequestNamings struct {
	pulumi.CustomResourceState

	// The IDs of the request namings in the order they should be taken into consideration
	Ids pulumi.StringArrayOutput `pulumi:"ids"`
}

// NewRequestNamings registers a new resource with the given unique name, arguments, and options.
func NewRequestNamings(ctx *pulumi.Context,
	name string, args *RequestNamingsArgs, opts ...pulumi.ResourceOption) (*RequestNamings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ids == nil {
		return nil, errors.New("invalid value for required argument 'Ids'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RequestNamings
	err := ctx.RegisterResource("dynatrace:index/requestNamings:RequestNamings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRequestNamings gets an existing RequestNamings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRequestNamings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RequestNamingsState, opts ...pulumi.ResourceOption) (*RequestNamings, error) {
	var resource RequestNamings
	err := ctx.ReadResource("dynatrace:index/requestNamings:RequestNamings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RequestNamings resources.
type requestNamingsState struct {
	// The IDs of the request namings in the order they should be taken into consideration
	Ids []string `pulumi:"ids"`
}

type RequestNamingsState struct {
	// The IDs of the request namings in the order they should be taken into consideration
	Ids pulumi.StringArrayInput
}

func (RequestNamingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*requestNamingsState)(nil)).Elem()
}

type requestNamingsArgs struct {
	// The IDs of the request namings in the order they should be taken into consideration
	Ids []string `pulumi:"ids"`
}

// The set of arguments for constructing a RequestNamings resource.
type RequestNamingsArgs struct {
	// The IDs of the request namings in the order they should be taken into consideration
	Ids pulumi.StringArrayInput
}

func (RequestNamingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*requestNamingsArgs)(nil)).Elem()
}

type RequestNamingsInput interface {
	pulumi.Input

	ToRequestNamingsOutput() RequestNamingsOutput
	ToRequestNamingsOutputWithContext(ctx context.Context) RequestNamingsOutput
}

func (*RequestNamings) ElementType() reflect.Type {
	return reflect.TypeOf((**RequestNamings)(nil)).Elem()
}

func (i *RequestNamings) ToRequestNamingsOutput() RequestNamingsOutput {
	return i.ToRequestNamingsOutputWithContext(context.Background())
}

func (i *RequestNamings) ToRequestNamingsOutputWithContext(ctx context.Context) RequestNamingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RequestNamingsOutput)
}

// RequestNamingsArrayInput is an input type that accepts RequestNamingsArray and RequestNamingsArrayOutput values.
// You can construct a concrete instance of `RequestNamingsArrayInput` via:
//
//	RequestNamingsArray{ RequestNamingsArgs{...} }
type RequestNamingsArrayInput interface {
	pulumi.Input

	ToRequestNamingsArrayOutput() RequestNamingsArrayOutput
	ToRequestNamingsArrayOutputWithContext(context.Context) RequestNamingsArrayOutput
}

type RequestNamingsArray []RequestNamingsInput

func (RequestNamingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RequestNamings)(nil)).Elem()
}

func (i RequestNamingsArray) ToRequestNamingsArrayOutput() RequestNamingsArrayOutput {
	return i.ToRequestNamingsArrayOutputWithContext(context.Background())
}

func (i RequestNamingsArray) ToRequestNamingsArrayOutputWithContext(ctx context.Context) RequestNamingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RequestNamingsArrayOutput)
}

// RequestNamingsMapInput is an input type that accepts RequestNamingsMap and RequestNamingsMapOutput values.
// You can construct a concrete instance of `RequestNamingsMapInput` via:
//
//	RequestNamingsMap{ "key": RequestNamingsArgs{...} }
type RequestNamingsMapInput interface {
	pulumi.Input

	ToRequestNamingsMapOutput() RequestNamingsMapOutput
	ToRequestNamingsMapOutputWithContext(context.Context) RequestNamingsMapOutput
}

type RequestNamingsMap map[string]RequestNamingsInput

func (RequestNamingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RequestNamings)(nil)).Elem()
}

func (i RequestNamingsMap) ToRequestNamingsMapOutput() RequestNamingsMapOutput {
	return i.ToRequestNamingsMapOutputWithContext(context.Background())
}

func (i RequestNamingsMap) ToRequestNamingsMapOutputWithContext(ctx context.Context) RequestNamingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RequestNamingsMapOutput)
}

type RequestNamingsOutput struct{ *pulumi.OutputState }

func (RequestNamingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RequestNamings)(nil)).Elem()
}

func (o RequestNamingsOutput) ToRequestNamingsOutput() RequestNamingsOutput {
	return o
}

func (o RequestNamingsOutput) ToRequestNamingsOutputWithContext(ctx context.Context) RequestNamingsOutput {
	return o
}

// The IDs of the request namings in the order they should be taken into consideration
func (o RequestNamingsOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RequestNamings) pulumi.StringArrayOutput { return v.Ids }).(pulumi.StringArrayOutput)
}

type RequestNamingsArrayOutput struct{ *pulumi.OutputState }

func (RequestNamingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RequestNamings)(nil)).Elem()
}

func (o RequestNamingsArrayOutput) ToRequestNamingsArrayOutput() RequestNamingsArrayOutput {
	return o
}

func (o RequestNamingsArrayOutput) ToRequestNamingsArrayOutputWithContext(ctx context.Context) RequestNamingsArrayOutput {
	return o
}

func (o RequestNamingsArrayOutput) Index(i pulumi.IntInput) RequestNamingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RequestNamings {
		return vs[0].([]*RequestNamings)[vs[1].(int)]
	}).(RequestNamingsOutput)
}

type RequestNamingsMapOutput struct{ *pulumi.OutputState }

func (RequestNamingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RequestNamings)(nil)).Elem()
}

func (o RequestNamingsMapOutput) ToRequestNamingsMapOutput() RequestNamingsMapOutput {
	return o
}

func (o RequestNamingsMapOutput) ToRequestNamingsMapOutputWithContext(ctx context.Context) RequestNamingsMapOutput {
	return o
}

func (o RequestNamingsMapOutput) MapIndex(k pulumi.StringInput) RequestNamingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RequestNamings {
		return vs[0].(map[string]*RequestNamings)[vs[1].(string)]
	}).(RequestNamingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RequestNamingsInput)(nil)).Elem(), &RequestNamings{})
	pulumi.RegisterInputType(reflect.TypeOf((*RequestNamingsArrayInput)(nil)).Elem(), RequestNamingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RequestNamingsMapInput)(nil)).Elem(), RequestNamingsMap{})
	pulumi.RegisterOutputType(RequestNamingsOutput{})
	pulumi.RegisterOutputType(RequestNamingsArrayOutput{})
	pulumi.RegisterOutputType(RequestNamingsMapOutput{})
}