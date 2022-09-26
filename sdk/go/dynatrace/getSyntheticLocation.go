// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetSyntheticLocation(ctx *pulumi.Context, args *GetSyntheticLocationArgs, opts ...pulumi.InvokeOption) (*GetSyntheticLocationResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetSyntheticLocationResult
	err := ctx.Invoke("dynatrace:index/getSyntheticLocation:getSyntheticLocation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSyntheticLocation.
type GetSyntheticLocationArgs struct {
	// The cloud provider where the location is hosted.
	CloudPlatform *string  `pulumi:"cloudPlatform"`
	Id            *string  `pulumi:"id"`
	Ips           []string `pulumi:"ips"`
	Name          *string  `pulumi:"name"`
	Stage         *string  `pulumi:"stage"`
	Status        *string  `pulumi:"status"`
	Type          *string  `pulumi:"type"`
}

// A collection of values returned by getSyntheticLocation.
type GetSyntheticLocationResult struct {
	// The cloud provider where the location is hosted.
	CloudPlatform string   `pulumi:"cloudPlatform"`
	Id            *string  `pulumi:"id"`
	Ips           []string `pulumi:"ips"`
	Name          *string  `pulumi:"name"`
	Stage         string   `pulumi:"stage"`
	Status        string   `pulumi:"status"`
	Type          *string  `pulumi:"type"`
}

func GetSyntheticLocationOutput(ctx *pulumi.Context, args GetSyntheticLocationOutputArgs, opts ...pulumi.InvokeOption) GetSyntheticLocationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSyntheticLocationResult, error) {
			args := v.(GetSyntheticLocationArgs)
			r, err := GetSyntheticLocation(ctx, &args, opts...)
			var s GetSyntheticLocationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSyntheticLocationResultOutput)
}

// A collection of arguments for invoking getSyntheticLocation.
type GetSyntheticLocationOutputArgs struct {
	// The cloud provider where the location is hosted.
	CloudPlatform pulumi.StringPtrInput   `pulumi:"cloudPlatform"`
	Id            pulumi.StringPtrInput   `pulumi:"id"`
	Ips           pulumi.StringArrayInput `pulumi:"ips"`
	Name          pulumi.StringPtrInput   `pulumi:"name"`
	Stage         pulumi.StringPtrInput   `pulumi:"stage"`
	Status        pulumi.StringPtrInput   `pulumi:"status"`
	Type          pulumi.StringPtrInput   `pulumi:"type"`
}

func (GetSyntheticLocationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSyntheticLocationArgs)(nil)).Elem()
}

// A collection of values returned by getSyntheticLocation.
type GetSyntheticLocationResultOutput struct{ *pulumi.OutputState }

func (GetSyntheticLocationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSyntheticLocationResult)(nil)).Elem()
}

func (o GetSyntheticLocationResultOutput) ToGetSyntheticLocationResultOutput() GetSyntheticLocationResultOutput {
	return o
}

func (o GetSyntheticLocationResultOutput) ToGetSyntheticLocationResultOutputWithContext(ctx context.Context) GetSyntheticLocationResultOutput {
	return o
}

// The cloud provider where the location is hosted.
func (o GetSyntheticLocationResultOutput) CloudPlatform() pulumi.StringOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) string { return v.CloudPlatform }).(pulumi.StringOutput)
}

func (o GetSyntheticLocationResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o GetSyntheticLocationResultOutput) Ips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) []string { return v.Ips }).(pulumi.StringArrayOutput)
}

func (o GetSyntheticLocationResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetSyntheticLocationResultOutput) Stage() pulumi.StringOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) string { return v.Stage }).(pulumi.StringOutput)
}

func (o GetSyntheticLocationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o GetSyntheticLocationResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSyntheticLocationResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSyntheticLocationResultOutput{})
}