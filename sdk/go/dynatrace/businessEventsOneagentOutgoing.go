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

type BusinessEventsOneagentOutgoing struct {
	pulumi.CustomResourceState

	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Event meta data
	Event BusinessEventsOneagentOutgoingEventOutput `pulumi:"event"`
	// Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
	InsertAfter pulumi.StringOutput `pulumi:"insertAfter"`
	// Rule name
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope pulumi.StringPtrOutput `pulumi:"scope"`
	// Define conditions to trigger business events from incoming web requests. Triggers are connected by AND logic per capture rule. If you set multiple trigger rules, all of them need to be fulfilled to capture a business event.
	Triggers BusinessEventsOneagentOutgoingTriggersOutput `pulumi:"triggers"`
}

// NewBusinessEventsOneagentOutgoing registers a new resource with the given unique name, arguments, and options.
func NewBusinessEventsOneagentOutgoing(ctx *pulumi.Context,
	name string, args *BusinessEventsOneagentOutgoingArgs, opts ...pulumi.ResourceOption) (*BusinessEventsOneagentOutgoing, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Event == nil {
		return nil, errors.New("invalid value for required argument 'Event'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	if args.Triggers == nil {
		return nil, errors.New("invalid value for required argument 'Triggers'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BusinessEventsOneagentOutgoing
	err := ctx.RegisterResource("dynatrace:index/businessEventsOneagentOutgoing:BusinessEventsOneagentOutgoing", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBusinessEventsOneagentOutgoing gets an existing BusinessEventsOneagentOutgoing resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBusinessEventsOneagentOutgoing(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BusinessEventsOneagentOutgoingState, opts ...pulumi.ResourceOption) (*BusinessEventsOneagentOutgoing, error) {
	var resource BusinessEventsOneagentOutgoing
	err := ctx.ReadResource("dynatrace:index/businessEventsOneagentOutgoing:BusinessEventsOneagentOutgoing", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BusinessEventsOneagentOutgoing resources.
type businessEventsOneagentOutgoingState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Event meta data
	Event *BusinessEventsOneagentOutgoingEvent `pulumi:"event"`
	// Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
	InsertAfter *string `pulumi:"insertAfter"`
	// Rule name
	RuleName *string `pulumi:"ruleName"`
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope *string `pulumi:"scope"`
	// Define conditions to trigger business events from incoming web requests. Triggers are connected by AND logic per capture rule. If you set multiple trigger rules, all of them need to be fulfilled to capture a business event.
	Triggers *BusinessEventsOneagentOutgoingTriggers `pulumi:"triggers"`
}

type BusinessEventsOneagentOutgoingState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Event meta data
	Event BusinessEventsOneagentOutgoingEventPtrInput
	// Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
	InsertAfter pulumi.StringPtrInput
	// Rule name
	RuleName pulumi.StringPtrInput
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope pulumi.StringPtrInput
	// Define conditions to trigger business events from incoming web requests. Triggers are connected by AND logic per capture rule. If you set multiple trigger rules, all of them need to be fulfilled to capture a business event.
	Triggers BusinessEventsOneagentOutgoingTriggersPtrInput
}

func (BusinessEventsOneagentOutgoingState) ElementType() reflect.Type {
	return reflect.TypeOf((*businessEventsOneagentOutgoingState)(nil)).Elem()
}

type businessEventsOneagentOutgoingArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Event meta data
	Event BusinessEventsOneagentOutgoingEvent `pulumi:"event"`
	// Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
	InsertAfter *string `pulumi:"insertAfter"`
	// Rule name
	RuleName string `pulumi:"ruleName"`
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope *string `pulumi:"scope"`
	// Define conditions to trigger business events from incoming web requests. Triggers are connected by AND logic per capture rule. If you set multiple trigger rules, all of them need to be fulfilled to capture a business event.
	Triggers BusinessEventsOneagentOutgoingTriggers `pulumi:"triggers"`
}

// The set of arguments for constructing a BusinessEventsOneagentOutgoing resource.
type BusinessEventsOneagentOutgoingArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Event meta data
	Event BusinessEventsOneagentOutgoingEventInput
	// Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
	InsertAfter pulumi.StringPtrInput
	// Rule name
	RuleName pulumi.StringInput
	// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
	Scope pulumi.StringPtrInput
	// Define conditions to trigger business events from incoming web requests. Triggers are connected by AND logic per capture rule. If you set multiple trigger rules, all of them need to be fulfilled to capture a business event.
	Triggers BusinessEventsOneagentOutgoingTriggersInput
}

func (BusinessEventsOneagentOutgoingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*businessEventsOneagentOutgoingArgs)(nil)).Elem()
}

type BusinessEventsOneagentOutgoingInput interface {
	pulumi.Input

	ToBusinessEventsOneagentOutgoingOutput() BusinessEventsOneagentOutgoingOutput
	ToBusinessEventsOneagentOutgoingOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingOutput
}

func (*BusinessEventsOneagentOutgoing) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessEventsOneagentOutgoing)(nil)).Elem()
}

func (i *BusinessEventsOneagentOutgoing) ToBusinessEventsOneagentOutgoingOutput() BusinessEventsOneagentOutgoingOutput {
	return i.ToBusinessEventsOneagentOutgoingOutputWithContext(context.Background())
}

func (i *BusinessEventsOneagentOutgoing) ToBusinessEventsOneagentOutgoingOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessEventsOneagentOutgoingOutput)
}

// BusinessEventsOneagentOutgoingArrayInput is an input type that accepts BusinessEventsOneagentOutgoingArray and BusinessEventsOneagentOutgoingArrayOutput values.
// You can construct a concrete instance of `BusinessEventsOneagentOutgoingArrayInput` via:
//
//	BusinessEventsOneagentOutgoingArray{ BusinessEventsOneagentOutgoingArgs{...} }
type BusinessEventsOneagentOutgoingArrayInput interface {
	pulumi.Input

	ToBusinessEventsOneagentOutgoingArrayOutput() BusinessEventsOneagentOutgoingArrayOutput
	ToBusinessEventsOneagentOutgoingArrayOutputWithContext(context.Context) BusinessEventsOneagentOutgoingArrayOutput
}

type BusinessEventsOneagentOutgoingArray []BusinessEventsOneagentOutgoingInput

func (BusinessEventsOneagentOutgoingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessEventsOneagentOutgoing)(nil)).Elem()
}

func (i BusinessEventsOneagentOutgoingArray) ToBusinessEventsOneagentOutgoingArrayOutput() BusinessEventsOneagentOutgoingArrayOutput {
	return i.ToBusinessEventsOneagentOutgoingArrayOutputWithContext(context.Background())
}

func (i BusinessEventsOneagentOutgoingArray) ToBusinessEventsOneagentOutgoingArrayOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessEventsOneagentOutgoingArrayOutput)
}

// BusinessEventsOneagentOutgoingMapInput is an input type that accepts BusinessEventsOneagentOutgoingMap and BusinessEventsOneagentOutgoingMapOutput values.
// You can construct a concrete instance of `BusinessEventsOneagentOutgoingMapInput` via:
//
//	BusinessEventsOneagentOutgoingMap{ "key": BusinessEventsOneagentOutgoingArgs{...} }
type BusinessEventsOneagentOutgoingMapInput interface {
	pulumi.Input

	ToBusinessEventsOneagentOutgoingMapOutput() BusinessEventsOneagentOutgoingMapOutput
	ToBusinessEventsOneagentOutgoingMapOutputWithContext(context.Context) BusinessEventsOneagentOutgoingMapOutput
}

type BusinessEventsOneagentOutgoingMap map[string]BusinessEventsOneagentOutgoingInput

func (BusinessEventsOneagentOutgoingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessEventsOneagentOutgoing)(nil)).Elem()
}

func (i BusinessEventsOneagentOutgoingMap) ToBusinessEventsOneagentOutgoingMapOutput() BusinessEventsOneagentOutgoingMapOutput {
	return i.ToBusinessEventsOneagentOutgoingMapOutputWithContext(context.Background())
}

func (i BusinessEventsOneagentOutgoingMap) ToBusinessEventsOneagentOutgoingMapOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessEventsOneagentOutgoingMapOutput)
}

type BusinessEventsOneagentOutgoingOutput struct{ *pulumi.OutputState }

func (BusinessEventsOneagentOutgoingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessEventsOneagentOutgoing)(nil)).Elem()
}

func (o BusinessEventsOneagentOutgoingOutput) ToBusinessEventsOneagentOutgoingOutput() BusinessEventsOneagentOutgoingOutput {
	return o
}

func (o BusinessEventsOneagentOutgoingOutput) ToBusinessEventsOneagentOutgoingOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingOutput {
	return o
}

// This setting is enabled (`true`) or disabled (`false`)
func (o BusinessEventsOneagentOutgoingOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *BusinessEventsOneagentOutgoing) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Event meta data
func (o BusinessEventsOneagentOutgoingOutput) Event() BusinessEventsOneagentOutgoingEventOutput {
	return o.ApplyT(func(v *BusinessEventsOneagentOutgoing) BusinessEventsOneagentOutgoingEventOutput { return v.Event }).(BusinessEventsOneagentOutgoingEventOutput)
}

// Because this resource allows for ordering you may specify the ID of the resource instance that comes before this instance regarding order. If not specified when creating the setting will be added to the end of the list. If not specified during update the order will remain untouched
func (o BusinessEventsOneagentOutgoingOutput) InsertAfter() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessEventsOneagentOutgoing) pulumi.StringOutput { return v.InsertAfter }).(pulumi.StringOutput)
}

// Rule name
func (o BusinessEventsOneagentOutgoingOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessEventsOneagentOutgoing) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

// The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
func (o BusinessEventsOneagentOutgoingOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BusinessEventsOneagentOutgoing) pulumi.StringPtrOutput { return v.Scope }).(pulumi.StringPtrOutput)
}

// Define conditions to trigger business events from incoming web requests. Triggers are connected by AND logic per capture rule. If you set multiple trigger rules, all of them need to be fulfilled to capture a business event.
func (o BusinessEventsOneagentOutgoingOutput) Triggers() BusinessEventsOneagentOutgoingTriggersOutput {
	return o.ApplyT(func(v *BusinessEventsOneagentOutgoing) BusinessEventsOneagentOutgoingTriggersOutput {
		return v.Triggers
	}).(BusinessEventsOneagentOutgoingTriggersOutput)
}

type BusinessEventsOneagentOutgoingArrayOutput struct{ *pulumi.OutputState }

func (BusinessEventsOneagentOutgoingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessEventsOneagentOutgoing)(nil)).Elem()
}

func (o BusinessEventsOneagentOutgoingArrayOutput) ToBusinessEventsOneagentOutgoingArrayOutput() BusinessEventsOneagentOutgoingArrayOutput {
	return o
}

func (o BusinessEventsOneagentOutgoingArrayOutput) ToBusinessEventsOneagentOutgoingArrayOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingArrayOutput {
	return o
}

func (o BusinessEventsOneagentOutgoingArrayOutput) Index(i pulumi.IntInput) BusinessEventsOneagentOutgoingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BusinessEventsOneagentOutgoing {
		return vs[0].([]*BusinessEventsOneagentOutgoing)[vs[1].(int)]
	}).(BusinessEventsOneagentOutgoingOutput)
}

type BusinessEventsOneagentOutgoingMapOutput struct{ *pulumi.OutputState }

func (BusinessEventsOneagentOutgoingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessEventsOneagentOutgoing)(nil)).Elem()
}

func (o BusinessEventsOneagentOutgoingMapOutput) ToBusinessEventsOneagentOutgoingMapOutput() BusinessEventsOneagentOutgoingMapOutput {
	return o
}

func (o BusinessEventsOneagentOutgoingMapOutput) ToBusinessEventsOneagentOutgoingMapOutputWithContext(ctx context.Context) BusinessEventsOneagentOutgoingMapOutput {
	return o
}

func (o BusinessEventsOneagentOutgoingMapOutput) MapIndex(k pulumi.StringInput) BusinessEventsOneagentOutgoingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BusinessEventsOneagentOutgoing {
		return vs[0].(map[string]*BusinessEventsOneagentOutgoing)[vs[1].(string)]
	}).(BusinessEventsOneagentOutgoingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessEventsOneagentOutgoingInput)(nil)).Elem(), &BusinessEventsOneagentOutgoing{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessEventsOneagentOutgoingArrayInput)(nil)).Elem(), BusinessEventsOneagentOutgoingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessEventsOneagentOutgoingMapInput)(nil)).Elem(), BusinessEventsOneagentOutgoingMap{})
	pulumi.RegisterOutputType(BusinessEventsOneagentOutgoingOutput{})
	pulumi.RegisterOutputType(BusinessEventsOneagentOutgoingArrayOutput{})
	pulumi.RegisterOutputType(BusinessEventsOneagentOutgoingMapOutput{})
}