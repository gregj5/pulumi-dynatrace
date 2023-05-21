// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type DiskAnomalyRules struct {
	pulumi.CustomResourceState

	// Only apply to disks whose name matches
	DiskNameFilter DiskAnomalyRulesDiskNameFilterOutput `pulumi:"diskNameFilter"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId pulumi.StringPtrOutput `pulumi:"hostGroupId"`
	// Possible Values: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING`, `WRITE_TIME_EXCEEDING`
	Metric pulumi.StringOutput `pulumi:"metric"`
	// Name
	Name pulumi.StringOutput `pulumi:"name"`
	// Only alert if the threshold was violated in at least *n* of the last *m* samples
	SampleLimit DiskAnomalyRulesSampleLimitOutput `pulumi:"sampleLimit"`
	// Only apply to hosts that have the following tags
	TagFilters pulumi.StringArrayOutput `pulumi:"tagFilters"`
	// Alert if higher than
	ThresholdMilliseconds pulumi.Float64PtrOutput `pulumi:"thresholdMilliseconds"`
	// Alert if lower than
	ThresholdPercent pulumi.Float64PtrOutput `pulumi:"thresholdPercent"`
}

// NewDiskAnomalyRules registers a new resource with the given unique name, arguments, and options.
func NewDiskAnomalyRules(ctx *pulumi.Context,
	name string, args *DiskAnomalyRulesArgs, opts ...pulumi.ResourceOption) (*DiskAnomalyRules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DiskNameFilter == nil {
		return nil, errors.New("invalid value for required argument 'DiskNameFilter'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Metric == nil {
		return nil, errors.New("invalid value for required argument 'Metric'")
	}
	if args.SampleLimit == nil {
		return nil, errors.New("invalid value for required argument 'SampleLimit'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DiskAnomalyRules
	err := ctx.RegisterResource("dynatrace:index/diskAnomalyRules:DiskAnomalyRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskAnomalyRules gets an existing DiskAnomalyRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskAnomalyRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskAnomalyRulesState, opts ...pulumi.ResourceOption) (*DiskAnomalyRules, error) {
	var resource DiskAnomalyRules
	err := ctx.ReadResource("dynatrace:index/diskAnomalyRules:DiskAnomalyRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskAnomalyRules resources.
type diskAnomalyRulesState struct {
	// Only apply to disks whose name matches
	DiskNameFilter *DiskAnomalyRulesDiskNameFilter `pulumi:"diskNameFilter"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId *string `pulumi:"hostGroupId"`
	// Possible Values: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING`, `WRITE_TIME_EXCEEDING`
	Metric *string `pulumi:"metric"`
	// Name
	Name *string `pulumi:"name"`
	// Only alert if the threshold was violated in at least *n* of the last *m* samples
	SampleLimit *DiskAnomalyRulesSampleLimit `pulumi:"sampleLimit"`
	// Only apply to hosts that have the following tags
	TagFilters []string `pulumi:"tagFilters"`
	// Alert if higher than
	ThresholdMilliseconds *float64 `pulumi:"thresholdMilliseconds"`
	// Alert if lower than
	ThresholdPercent *float64 `pulumi:"thresholdPercent"`
}

type DiskAnomalyRulesState struct {
	// Only apply to disks whose name matches
	DiskNameFilter DiskAnomalyRulesDiskNameFilterPtrInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId pulumi.StringPtrInput
	// Possible Values: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING`, `WRITE_TIME_EXCEEDING`
	Metric pulumi.StringPtrInput
	// Name
	Name pulumi.StringPtrInput
	// Only alert if the threshold was violated in at least *n* of the last *m* samples
	SampleLimit DiskAnomalyRulesSampleLimitPtrInput
	// Only apply to hosts that have the following tags
	TagFilters pulumi.StringArrayInput
	// Alert if higher than
	ThresholdMilliseconds pulumi.Float64PtrInput
	// Alert if lower than
	ThresholdPercent pulumi.Float64PtrInput
}

func (DiskAnomalyRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskAnomalyRulesState)(nil)).Elem()
}

type diskAnomalyRulesArgs struct {
	// Only apply to disks whose name matches
	DiskNameFilter DiskAnomalyRulesDiskNameFilter `pulumi:"diskNameFilter"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId *string `pulumi:"hostGroupId"`
	// Possible Values: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING`, `WRITE_TIME_EXCEEDING`
	Metric string `pulumi:"metric"`
	// Name
	Name *string `pulumi:"name"`
	// Only alert if the threshold was violated in at least *n* of the last *m* samples
	SampleLimit DiskAnomalyRulesSampleLimit `pulumi:"sampleLimit"`
	// Only apply to hosts that have the following tags
	TagFilters []string `pulumi:"tagFilters"`
	// Alert if higher than
	ThresholdMilliseconds *float64 `pulumi:"thresholdMilliseconds"`
	// Alert if lower than
	ThresholdPercent *float64 `pulumi:"thresholdPercent"`
}

// The set of arguments for constructing a DiskAnomalyRules resource.
type DiskAnomalyRulesArgs struct {
	// Only apply to disks whose name matches
	DiskNameFilter DiskAnomalyRulesDiskNameFilterInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId pulumi.StringPtrInput
	// Possible Values: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING`, `WRITE_TIME_EXCEEDING`
	Metric pulumi.StringInput
	// Name
	Name pulumi.StringPtrInput
	// Only alert if the threshold was violated in at least *n* of the last *m* samples
	SampleLimit DiskAnomalyRulesSampleLimitInput
	// Only apply to hosts that have the following tags
	TagFilters pulumi.StringArrayInput
	// Alert if higher than
	ThresholdMilliseconds pulumi.Float64PtrInput
	// Alert if lower than
	ThresholdPercent pulumi.Float64PtrInput
}

func (DiskAnomalyRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskAnomalyRulesArgs)(nil)).Elem()
}

type DiskAnomalyRulesInput interface {
	pulumi.Input

	ToDiskAnomalyRulesOutput() DiskAnomalyRulesOutput
	ToDiskAnomalyRulesOutputWithContext(ctx context.Context) DiskAnomalyRulesOutput
}

func (*DiskAnomalyRules) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskAnomalyRules)(nil)).Elem()
}

func (i *DiskAnomalyRules) ToDiskAnomalyRulesOutput() DiskAnomalyRulesOutput {
	return i.ToDiskAnomalyRulesOutputWithContext(context.Background())
}

func (i *DiskAnomalyRules) ToDiskAnomalyRulesOutputWithContext(ctx context.Context) DiskAnomalyRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskAnomalyRulesOutput)
}

// DiskAnomalyRulesArrayInput is an input type that accepts DiskAnomalyRulesArray and DiskAnomalyRulesArrayOutput values.
// You can construct a concrete instance of `DiskAnomalyRulesArrayInput` via:
//
//	DiskAnomalyRulesArray{ DiskAnomalyRulesArgs{...} }
type DiskAnomalyRulesArrayInput interface {
	pulumi.Input

	ToDiskAnomalyRulesArrayOutput() DiskAnomalyRulesArrayOutput
	ToDiskAnomalyRulesArrayOutputWithContext(context.Context) DiskAnomalyRulesArrayOutput
}

type DiskAnomalyRulesArray []DiskAnomalyRulesInput

func (DiskAnomalyRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskAnomalyRules)(nil)).Elem()
}

func (i DiskAnomalyRulesArray) ToDiskAnomalyRulesArrayOutput() DiskAnomalyRulesArrayOutput {
	return i.ToDiskAnomalyRulesArrayOutputWithContext(context.Background())
}

func (i DiskAnomalyRulesArray) ToDiskAnomalyRulesArrayOutputWithContext(ctx context.Context) DiskAnomalyRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskAnomalyRulesArrayOutput)
}

// DiskAnomalyRulesMapInput is an input type that accepts DiskAnomalyRulesMap and DiskAnomalyRulesMapOutput values.
// You can construct a concrete instance of `DiskAnomalyRulesMapInput` via:
//
//	DiskAnomalyRulesMap{ "key": DiskAnomalyRulesArgs{...} }
type DiskAnomalyRulesMapInput interface {
	pulumi.Input

	ToDiskAnomalyRulesMapOutput() DiskAnomalyRulesMapOutput
	ToDiskAnomalyRulesMapOutputWithContext(context.Context) DiskAnomalyRulesMapOutput
}

type DiskAnomalyRulesMap map[string]DiskAnomalyRulesInput

func (DiskAnomalyRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskAnomalyRules)(nil)).Elem()
}

func (i DiskAnomalyRulesMap) ToDiskAnomalyRulesMapOutput() DiskAnomalyRulesMapOutput {
	return i.ToDiskAnomalyRulesMapOutputWithContext(context.Background())
}

func (i DiskAnomalyRulesMap) ToDiskAnomalyRulesMapOutputWithContext(ctx context.Context) DiskAnomalyRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskAnomalyRulesMapOutput)
}

type DiskAnomalyRulesOutput struct{ *pulumi.OutputState }

func (DiskAnomalyRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskAnomalyRules)(nil)).Elem()
}

func (o DiskAnomalyRulesOutput) ToDiskAnomalyRulesOutput() DiskAnomalyRulesOutput {
	return o
}

func (o DiskAnomalyRulesOutput) ToDiskAnomalyRulesOutputWithContext(ctx context.Context) DiskAnomalyRulesOutput {
	return o
}

// Only apply to disks whose name matches
func (o DiskAnomalyRulesOutput) DiskNameFilter() DiskAnomalyRulesDiskNameFilterOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) DiskAnomalyRulesDiskNameFilterOutput { return v.DiskNameFilter }).(DiskAnomalyRulesDiskNameFilterOutput)
}

// This setting is enabled (`true`) or disabled (`false`)
func (o DiskAnomalyRulesOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o DiskAnomalyRulesOutput) HostGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.StringPtrOutput { return v.HostGroupId }).(pulumi.StringPtrOutput)
}

// Possible Values: `LOW_DISK_SPACE`, `LOW_INODES`, `READ_TIME_EXCEEDING`, `WRITE_TIME_EXCEEDING`
func (o DiskAnomalyRulesOutput) Metric() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.StringOutput { return v.Metric }).(pulumi.StringOutput)
}

// Name
func (o DiskAnomalyRulesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Only alert if the threshold was violated in at least *n* of the last *m* samples
func (o DiskAnomalyRulesOutput) SampleLimit() DiskAnomalyRulesSampleLimitOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) DiskAnomalyRulesSampleLimitOutput { return v.SampleLimit }).(DiskAnomalyRulesSampleLimitOutput)
}

// Only apply to hosts that have the following tags
func (o DiskAnomalyRulesOutput) TagFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.StringArrayOutput { return v.TagFilters }).(pulumi.StringArrayOutput)
}

// Alert if higher than
func (o DiskAnomalyRulesOutput) ThresholdMilliseconds() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.Float64PtrOutput { return v.ThresholdMilliseconds }).(pulumi.Float64PtrOutput)
}

// Alert if lower than
func (o DiskAnomalyRulesOutput) ThresholdPercent() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *DiskAnomalyRules) pulumi.Float64PtrOutput { return v.ThresholdPercent }).(pulumi.Float64PtrOutput)
}

type DiskAnomalyRulesArrayOutput struct{ *pulumi.OutputState }

func (DiskAnomalyRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskAnomalyRules)(nil)).Elem()
}

func (o DiskAnomalyRulesArrayOutput) ToDiskAnomalyRulesArrayOutput() DiskAnomalyRulesArrayOutput {
	return o
}

func (o DiskAnomalyRulesArrayOutput) ToDiskAnomalyRulesArrayOutputWithContext(ctx context.Context) DiskAnomalyRulesArrayOutput {
	return o
}

func (o DiskAnomalyRulesArrayOutput) Index(i pulumi.IntInput) DiskAnomalyRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiskAnomalyRules {
		return vs[0].([]*DiskAnomalyRules)[vs[1].(int)]
	}).(DiskAnomalyRulesOutput)
}

type DiskAnomalyRulesMapOutput struct{ *pulumi.OutputState }

func (DiskAnomalyRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskAnomalyRules)(nil)).Elem()
}

func (o DiskAnomalyRulesMapOutput) ToDiskAnomalyRulesMapOutput() DiskAnomalyRulesMapOutput {
	return o
}

func (o DiskAnomalyRulesMapOutput) ToDiskAnomalyRulesMapOutputWithContext(ctx context.Context) DiskAnomalyRulesMapOutput {
	return o
}

func (o DiskAnomalyRulesMapOutput) MapIndex(k pulumi.StringInput) DiskAnomalyRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiskAnomalyRules {
		return vs[0].(map[string]*DiskAnomalyRules)[vs[1].(string)]
	}).(DiskAnomalyRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskAnomalyRulesInput)(nil)).Elem(), &DiskAnomalyRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskAnomalyRulesArrayInput)(nil)).Elem(), DiskAnomalyRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskAnomalyRulesMapInput)(nil)).Elem(), DiskAnomalyRulesMap{})
	pulumi.RegisterOutputType(DiskAnomalyRulesOutput{})
	pulumi.RegisterOutputType(DiskAnomalyRulesArrayOutput{})
	pulumi.RegisterOutputType(DiskAnomalyRulesMapOutput{})
}