// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Slo struct {
	pulumi.CustomResourceState

	// The total count metric (the denominator in rate calculation)
	Denominator pulumi.StringPtrOutput `pulumi:"denominator"`
	// The custom description of the SLO (optional)
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The SLO is enabled (`false`) or disabled (`true`)
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// The evaluation type of the SLO. Currently only `AGGREGATE` is supported
	Evaluation pulumi.StringOutput `pulumi:"evaluation"`
	// The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// The percentage-based metric expression for the calculation of the SLO
	MetricExpression pulumi.StringPtrOutput `pulumi:"metricExpression"`
	// The name of the rule
	Name pulumi.StringOutput `pulumi:"name"`
	// The metric for the count of successes (the numerator in rate calculation)
	//
	// Deprecated: `numerator` and `denominator` have been replaced by `metric_expression`
	Numerator pulumi.StringPtrOutput `pulumi:"numerator"`
	// The percentage-based metric for the calculation of the SLO
	Rate pulumi.StringPtrOutput `pulumi:"rate"`
	// The target value of the SLO
	Target pulumi.Float64Output `pulumi:"target"`
	// The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
	Timeframe pulumi.StringOutput `pulumi:"timeframe"`
	// The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
	Warning pulumi.Float64Output `pulumi:"warning"`
}

// NewSlo registers a new resource with the given unique name, arguments, and options.
func NewSlo(ctx *pulumi.Context,
	name string, args *SloArgs, opts ...pulumi.ResourceOption) (*Slo, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Evaluation == nil {
		return nil, errors.New("invalid value for required argument 'Evaluation'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	if args.Timeframe == nil {
		return nil, errors.New("invalid value for required argument 'Timeframe'")
	}
	if args.Warning == nil {
		return nil, errors.New("invalid value for required argument 'Warning'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Slo
	err := ctx.RegisterResource("dynatrace:index/slo:Slo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSlo gets an existing Slo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSlo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SloState, opts ...pulumi.ResourceOption) (*Slo, error) {
	var resource Slo
	err := ctx.ReadResource("dynatrace:index/slo:Slo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Slo resources.
type sloState struct {
	// The total count metric (the denominator in rate calculation)
	Denominator *string `pulumi:"denominator"`
	// The custom description of the SLO (optional)
	Description *string `pulumi:"description"`
	// The SLO is enabled (`false`) or disabled (`true`)
	Disabled *bool `pulumi:"disabled"`
	// The evaluation type of the SLO. Currently only `AGGREGATE` is supported
	Evaluation *string `pulumi:"evaluation"`
	// The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
	Filter *string `pulumi:"filter"`
	// The percentage-based metric expression for the calculation of the SLO
	MetricExpression *string `pulumi:"metricExpression"`
	// The name of the rule
	Name *string `pulumi:"name"`
	// The metric for the count of successes (the numerator in rate calculation)
	//
	// Deprecated: `numerator` and `denominator` have been replaced by `metric_expression`
	Numerator *string `pulumi:"numerator"`
	// The percentage-based metric for the calculation of the SLO
	Rate *string `pulumi:"rate"`
	// The target value of the SLO
	Target *float64 `pulumi:"target"`
	// The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
	Timeframe *string `pulumi:"timeframe"`
	// The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
	Warning *float64 `pulumi:"warning"`
}

type SloState struct {
	// The total count metric (the denominator in rate calculation)
	Denominator pulumi.StringPtrInput
	// The custom description of the SLO (optional)
	Description pulumi.StringPtrInput
	// The SLO is enabled (`false`) or disabled (`true`)
	Disabled pulumi.BoolPtrInput
	// The evaluation type of the SLO. Currently only `AGGREGATE` is supported
	Evaluation pulumi.StringPtrInput
	// The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
	Filter pulumi.StringPtrInput
	// The percentage-based metric expression for the calculation of the SLO
	MetricExpression pulumi.StringPtrInput
	// The name of the rule
	Name pulumi.StringPtrInput
	// The metric for the count of successes (the numerator in rate calculation)
	//
	// Deprecated: `numerator` and `denominator` have been replaced by `metric_expression`
	Numerator pulumi.StringPtrInput
	// The percentage-based metric for the calculation of the SLO
	Rate pulumi.StringPtrInput
	// The target value of the SLO
	Target pulumi.Float64PtrInput
	// The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
	Timeframe pulumi.StringPtrInput
	// The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
	Warning pulumi.Float64PtrInput
}

func (SloState) ElementType() reflect.Type {
	return reflect.TypeOf((*sloState)(nil)).Elem()
}

type sloArgs struct {
	// The total count metric (the denominator in rate calculation)
	Denominator *string `pulumi:"denominator"`
	// The custom description of the SLO (optional)
	Description *string `pulumi:"description"`
	// The SLO is enabled (`false`) or disabled (`true`)
	Disabled *bool `pulumi:"disabled"`
	// The evaluation type of the SLO. Currently only `AGGREGATE` is supported
	Evaluation string `pulumi:"evaluation"`
	// The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
	Filter *string `pulumi:"filter"`
	// The percentage-based metric expression for the calculation of the SLO
	MetricExpression *string `pulumi:"metricExpression"`
	// The name of the rule
	Name *string `pulumi:"name"`
	// The metric for the count of successes (the numerator in rate calculation)
	//
	// Deprecated: `numerator` and `denominator` have been replaced by `metric_expression`
	Numerator *string `pulumi:"numerator"`
	// The percentage-based metric for the calculation of the SLO
	Rate *string `pulumi:"rate"`
	// The target value of the SLO
	Target float64 `pulumi:"target"`
	// The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
	Timeframe string `pulumi:"timeframe"`
	// The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
	Warning float64 `pulumi:"warning"`
}

// The set of arguments for constructing a Slo resource.
type SloArgs struct {
	// The total count metric (the denominator in rate calculation)
	Denominator pulumi.StringPtrInput
	// The custom description of the SLO (optional)
	Description pulumi.StringPtrInput
	// The SLO is enabled (`false`) or disabled (`true`)
	Disabled pulumi.BoolPtrInput
	// The evaluation type of the SLO. Currently only `AGGREGATE` is supported
	Evaluation pulumi.StringInput
	// The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
	Filter pulumi.StringPtrInput
	// The percentage-based metric expression for the calculation of the SLO
	MetricExpression pulumi.StringPtrInput
	// The name of the rule
	Name pulumi.StringPtrInput
	// The metric for the count of successes (the numerator in rate calculation)
	//
	// Deprecated: `numerator` and `denominator` have been replaced by `metric_expression`
	Numerator pulumi.StringPtrInput
	// The percentage-based metric for the calculation of the SLO
	Rate pulumi.StringPtrInput
	// The target value of the SLO
	Target pulumi.Float64Input
	// The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
	Timeframe pulumi.StringInput
	// The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
	Warning pulumi.Float64Input
}

func (SloArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sloArgs)(nil)).Elem()
}

type SloInput interface {
	pulumi.Input

	ToSloOutput() SloOutput
	ToSloOutputWithContext(ctx context.Context) SloOutput
}

func (*Slo) ElementType() reflect.Type {
	return reflect.TypeOf((**Slo)(nil)).Elem()
}

func (i *Slo) ToSloOutput() SloOutput {
	return i.ToSloOutputWithContext(context.Background())
}

func (i *Slo) ToSloOutputWithContext(ctx context.Context) SloOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SloOutput)
}

// SloArrayInput is an input type that accepts SloArray and SloArrayOutput values.
// You can construct a concrete instance of `SloArrayInput` via:
//
//	SloArray{ SloArgs{...} }
type SloArrayInput interface {
	pulumi.Input

	ToSloArrayOutput() SloArrayOutput
	ToSloArrayOutputWithContext(context.Context) SloArrayOutput
}

type SloArray []SloInput

func (SloArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Slo)(nil)).Elem()
}

func (i SloArray) ToSloArrayOutput() SloArrayOutput {
	return i.ToSloArrayOutputWithContext(context.Background())
}

func (i SloArray) ToSloArrayOutputWithContext(ctx context.Context) SloArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SloArrayOutput)
}

// SloMapInput is an input type that accepts SloMap and SloMapOutput values.
// You can construct a concrete instance of `SloMapInput` via:
//
//	SloMap{ "key": SloArgs{...} }
type SloMapInput interface {
	pulumi.Input

	ToSloMapOutput() SloMapOutput
	ToSloMapOutputWithContext(context.Context) SloMapOutput
}

type SloMap map[string]SloInput

func (SloMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Slo)(nil)).Elem()
}

func (i SloMap) ToSloMapOutput() SloMapOutput {
	return i.ToSloMapOutputWithContext(context.Background())
}

func (i SloMap) ToSloMapOutputWithContext(ctx context.Context) SloMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SloMapOutput)
}

type SloOutput struct{ *pulumi.OutputState }

func (SloOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Slo)(nil)).Elem()
}

func (o SloOutput) ToSloOutput() SloOutput {
	return o
}

func (o SloOutput) ToSloOutputWithContext(ctx context.Context) SloOutput {
	return o
}

// The total count metric (the denominator in rate calculation)
func (o SloOutput) Denominator() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringPtrOutput { return v.Denominator }).(pulumi.StringPtrOutput)
}

// The custom description of the SLO (optional)
func (o SloOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The SLO is enabled (`false`) or disabled (`true`)
func (o SloOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// The evaluation type of the SLO. Currently only `AGGREGATE` is supported
func (o SloOutput) Evaluation() pulumi.StringOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringOutput { return v.Evaluation }).(pulumi.StringOutput)
}

// The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
func (o SloOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// The percentage-based metric expression for the calculation of the SLO
func (o SloOutput) MetricExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringPtrOutput { return v.MetricExpression }).(pulumi.StringPtrOutput)
}

// The name of the rule
func (o SloOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The metric for the count of successes (the numerator in rate calculation)
//
// Deprecated: `numerator` and `denominator` have been replaced by `metric_expression`
func (o SloOutput) Numerator() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringPtrOutput { return v.Numerator }).(pulumi.StringPtrOutput)
}

// The percentage-based metric for the calculation of the SLO
func (o SloOutput) Rate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringPtrOutput { return v.Rate }).(pulumi.StringPtrOutput)
}

// The target value of the SLO
func (o SloOutput) Target() pulumi.Float64Output {
	return o.ApplyT(func(v *Slo) pulumi.Float64Output { return v.Target }).(pulumi.Float64Output)
}

// The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
func (o SloOutput) Timeframe() pulumi.StringOutput {
	return o.ApplyT(func(v *Slo) pulumi.StringOutput { return v.Timeframe }).(pulumi.StringOutput)
}

// The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
func (o SloOutput) Warning() pulumi.Float64Output {
	return o.ApplyT(func(v *Slo) pulumi.Float64Output { return v.Warning }).(pulumi.Float64Output)
}

type SloArrayOutput struct{ *pulumi.OutputState }

func (SloArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Slo)(nil)).Elem()
}

func (o SloArrayOutput) ToSloArrayOutput() SloArrayOutput {
	return o
}

func (o SloArrayOutput) ToSloArrayOutputWithContext(ctx context.Context) SloArrayOutput {
	return o
}

func (o SloArrayOutput) Index(i pulumi.IntInput) SloOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Slo {
		return vs[0].([]*Slo)[vs[1].(int)]
	}).(SloOutput)
}

type SloMapOutput struct{ *pulumi.OutputState }

func (SloMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Slo)(nil)).Elem()
}

func (o SloMapOutput) ToSloMapOutput() SloMapOutput {
	return o
}

func (o SloMapOutput) ToSloMapOutputWithContext(ctx context.Context) SloMapOutput {
	return o
}

func (o SloMapOutput) MapIndex(k pulumi.StringInput) SloOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Slo {
		return vs[0].(map[string]*Slo)[vs[1].(string)]
	}).(SloOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SloInput)(nil)).Elem(), &Slo{})
	pulumi.RegisterInputType(reflect.TypeOf((*SloArrayInput)(nil)).Elem(), SloArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SloMapInput)(nil)).Elem(), SloMap{})
	pulumi.RegisterOutputType(SloOutput{})
	pulumi.RegisterOutputType(SloArrayOutput{})
	pulumi.RegisterOutputType(SloMapOutput{})
}