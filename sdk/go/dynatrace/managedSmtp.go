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

type ManagedSmtp struct {
	pulumi.CustomResourceState

	// If true, we will send e-mails via Mission Control in case of problems with SMTP server.
	AllowFallbackViaMissionControl pulumi.BoolPtrOutput `pulumi:"allowFallbackViaMissionControl"`
	// Connection security, possible values: `NO_ENCRYPTION`, `OPTIONAL_STARTTLS`, `REQUIRE_STARTTLS`, `TLS`. Default: `NO_ENCRYPTION`
	ConnectionSecurity pulumi.StringPtrOutput `pulumi:"connectionSecurity"`
	// Host Name
	HostName pulumi.StringOutput `pulumi:"hostName"`
	// If true, a password has been configured. Default: `false`.
	IsPasswordConfigured pulumi.BoolPtrOutput `pulumi:"isPasswordConfigured"`
	// Password
	Password pulumi.StringOutput `pulumi:"password"`
	// Integer value of port. Default: `25`
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// Sender email address
	SenderEmailAddress pulumi.StringOutput `pulumi:"senderEmailAddress"`
	// If true, we will send e-mails via SMTP server.
	UseSmtpServer pulumi.BoolPtrOutput `pulumi:"useSmtpServer"`
	// User Name
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewManagedSmtp registers a new resource with the given unique name, arguments, and options.
func NewManagedSmtp(ctx *pulumi.Context,
	name string, args *ManagedSmtpArgs, opts ...pulumi.ResourceOption) (*ManagedSmtp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HostName == nil {
		return nil, errors.New("invalid value for required argument 'HostName'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.SenderEmailAddress == nil {
		return nil, errors.New("invalid value for required argument 'SenderEmailAddress'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedSmtp
	err := ctx.RegisterResource("dynatrace:index/managedSmtp:ManagedSmtp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedSmtp gets an existing ManagedSmtp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedSmtp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedSmtpState, opts ...pulumi.ResourceOption) (*ManagedSmtp, error) {
	var resource ManagedSmtp
	err := ctx.ReadResource("dynatrace:index/managedSmtp:ManagedSmtp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedSmtp resources.
type managedSmtpState struct {
	// If true, we will send e-mails via Mission Control in case of problems with SMTP server.
	AllowFallbackViaMissionControl *bool `pulumi:"allowFallbackViaMissionControl"`
	// Connection security, possible values: `NO_ENCRYPTION`, `OPTIONAL_STARTTLS`, `REQUIRE_STARTTLS`, `TLS`. Default: `NO_ENCRYPTION`
	ConnectionSecurity *string `pulumi:"connectionSecurity"`
	// Host Name
	HostName *string `pulumi:"hostName"`
	// If true, a password has been configured. Default: `false`.
	IsPasswordConfigured *bool `pulumi:"isPasswordConfigured"`
	// Password
	Password *string `pulumi:"password"`
	// Integer value of port. Default: `25`
	Port *int `pulumi:"port"`
	// Sender email address
	SenderEmailAddress *string `pulumi:"senderEmailAddress"`
	// If true, we will send e-mails via SMTP server.
	UseSmtpServer *bool `pulumi:"useSmtpServer"`
	// User Name
	UserName *string `pulumi:"userName"`
}

type ManagedSmtpState struct {
	// If true, we will send e-mails via Mission Control in case of problems with SMTP server.
	AllowFallbackViaMissionControl pulumi.BoolPtrInput
	// Connection security, possible values: `NO_ENCRYPTION`, `OPTIONAL_STARTTLS`, `REQUIRE_STARTTLS`, `TLS`. Default: `NO_ENCRYPTION`
	ConnectionSecurity pulumi.StringPtrInput
	// Host Name
	HostName pulumi.StringPtrInput
	// If true, a password has been configured. Default: `false`.
	IsPasswordConfigured pulumi.BoolPtrInput
	// Password
	Password pulumi.StringPtrInput
	// Integer value of port. Default: `25`
	Port pulumi.IntPtrInput
	// Sender email address
	SenderEmailAddress pulumi.StringPtrInput
	// If true, we will send e-mails via SMTP server.
	UseSmtpServer pulumi.BoolPtrInput
	// User Name
	UserName pulumi.StringPtrInput
}

func (ManagedSmtpState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedSmtpState)(nil)).Elem()
}

type managedSmtpArgs struct {
	// If true, we will send e-mails via Mission Control in case of problems with SMTP server.
	AllowFallbackViaMissionControl *bool `pulumi:"allowFallbackViaMissionControl"`
	// Connection security, possible values: `NO_ENCRYPTION`, `OPTIONAL_STARTTLS`, `REQUIRE_STARTTLS`, `TLS`. Default: `NO_ENCRYPTION`
	ConnectionSecurity *string `pulumi:"connectionSecurity"`
	// Host Name
	HostName string `pulumi:"hostName"`
	// If true, a password has been configured. Default: `false`.
	IsPasswordConfigured *bool `pulumi:"isPasswordConfigured"`
	// Password
	Password string `pulumi:"password"`
	// Integer value of port. Default: `25`
	Port *int `pulumi:"port"`
	// Sender email address
	SenderEmailAddress string `pulumi:"senderEmailAddress"`
	// If true, we will send e-mails via SMTP server.
	UseSmtpServer *bool `pulumi:"useSmtpServer"`
	// User Name
	UserName string `pulumi:"userName"`
}

// The set of arguments for constructing a ManagedSmtp resource.
type ManagedSmtpArgs struct {
	// If true, we will send e-mails via Mission Control in case of problems with SMTP server.
	AllowFallbackViaMissionControl pulumi.BoolPtrInput
	// Connection security, possible values: `NO_ENCRYPTION`, `OPTIONAL_STARTTLS`, `REQUIRE_STARTTLS`, `TLS`. Default: `NO_ENCRYPTION`
	ConnectionSecurity pulumi.StringPtrInput
	// Host Name
	HostName pulumi.StringInput
	// If true, a password has been configured. Default: `false`.
	IsPasswordConfigured pulumi.BoolPtrInput
	// Password
	Password pulumi.StringInput
	// Integer value of port. Default: `25`
	Port pulumi.IntPtrInput
	// Sender email address
	SenderEmailAddress pulumi.StringInput
	// If true, we will send e-mails via SMTP server.
	UseSmtpServer pulumi.BoolPtrInput
	// User Name
	UserName pulumi.StringInput
}

func (ManagedSmtpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedSmtpArgs)(nil)).Elem()
}

type ManagedSmtpInput interface {
	pulumi.Input

	ToManagedSmtpOutput() ManagedSmtpOutput
	ToManagedSmtpOutputWithContext(ctx context.Context) ManagedSmtpOutput
}

func (*ManagedSmtp) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedSmtp)(nil)).Elem()
}

func (i *ManagedSmtp) ToManagedSmtpOutput() ManagedSmtpOutput {
	return i.ToManagedSmtpOutputWithContext(context.Background())
}

func (i *ManagedSmtp) ToManagedSmtpOutputWithContext(ctx context.Context) ManagedSmtpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedSmtpOutput)
}

// ManagedSmtpArrayInput is an input type that accepts ManagedSmtpArray and ManagedSmtpArrayOutput values.
// You can construct a concrete instance of `ManagedSmtpArrayInput` via:
//
//	ManagedSmtpArray{ ManagedSmtpArgs{...} }
type ManagedSmtpArrayInput interface {
	pulumi.Input

	ToManagedSmtpArrayOutput() ManagedSmtpArrayOutput
	ToManagedSmtpArrayOutputWithContext(context.Context) ManagedSmtpArrayOutput
}

type ManagedSmtpArray []ManagedSmtpInput

func (ManagedSmtpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedSmtp)(nil)).Elem()
}

func (i ManagedSmtpArray) ToManagedSmtpArrayOutput() ManagedSmtpArrayOutput {
	return i.ToManagedSmtpArrayOutputWithContext(context.Background())
}

func (i ManagedSmtpArray) ToManagedSmtpArrayOutputWithContext(ctx context.Context) ManagedSmtpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedSmtpArrayOutput)
}

// ManagedSmtpMapInput is an input type that accepts ManagedSmtpMap and ManagedSmtpMapOutput values.
// You can construct a concrete instance of `ManagedSmtpMapInput` via:
//
//	ManagedSmtpMap{ "key": ManagedSmtpArgs{...} }
type ManagedSmtpMapInput interface {
	pulumi.Input

	ToManagedSmtpMapOutput() ManagedSmtpMapOutput
	ToManagedSmtpMapOutputWithContext(context.Context) ManagedSmtpMapOutput
}

type ManagedSmtpMap map[string]ManagedSmtpInput

func (ManagedSmtpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedSmtp)(nil)).Elem()
}

func (i ManagedSmtpMap) ToManagedSmtpMapOutput() ManagedSmtpMapOutput {
	return i.ToManagedSmtpMapOutputWithContext(context.Background())
}

func (i ManagedSmtpMap) ToManagedSmtpMapOutputWithContext(ctx context.Context) ManagedSmtpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedSmtpMapOutput)
}

type ManagedSmtpOutput struct{ *pulumi.OutputState }

func (ManagedSmtpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedSmtp)(nil)).Elem()
}

func (o ManagedSmtpOutput) ToManagedSmtpOutput() ManagedSmtpOutput {
	return o
}

func (o ManagedSmtpOutput) ToManagedSmtpOutputWithContext(ctx context.Context) ManagedSmtpOutput {
	return o
}

// If true, we will send e-mails via Mission Control in case of problems with SMTP server.
func (o ManagedSmtpOutput) AllowFallbackViaMissionControl() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.BoolPtrOutput { return v.AllowFallbackViaMissionControl }).(pulumi.BoolPtrOutput)
}

// Connection security, possible values: `NO_ENCRYPTION`, `OPTIONAL_STARTTLS`, `REQUIRE_STARTTLS`, `TLS`. Default: `NO_ENCRYPTION`
func (o ManagedSmtpOutput) ConnectionSecurity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.StringPtrOutput { return v.ConnectionSecurity }).(pulumi.StringPtrOutput)
}

// Host Name
func (o ManagedSmtpOutput) HostName() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.StringOutput { return v.HostName }).(pulumi.StringOutput)
}

// If true, a password has been configured. Default: `false`.
func (o ManagedSmtpOutput) IsPasswordConfigured() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.BoolPtrOutput { return v.IsPasswordConfigured }).(pulumi.BoolPtrOutput)
}

// Password
func (o ManagedSmtpOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// Integer value of port. Default: `25`
func (o ManagedSmtpOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// Sender email address
func (o ManagedSmtpOutput) SenderEmailAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.StringOutput { return v.SenderEmailAddress }).(pulumi.StringOutput)
}

// If true, we will send e-mails via SMTP server.
func (o ManagedSmtpOutput) UseSmtpServer() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.BoolPtrOutput { return v.UseSmtpServer }).(pulumi.BoolPtrOutput)
}

// User Name
func (o ManagedSmtpOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedSmtp) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type ManagedSmtpArrayOutput struct{ *pulumi.OutputState }

func (ManagedSmtpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedSmtp)(nil)).Elem()
}

func (o ManagedSmtpArrayOutput) ToManagedSmtpArrayOutput() ManagedSmtpArrayOutput {
	return o
}

func (o ManagedSmtpArrayOutput) ToManagedSmtpArrayOutputWithContext(ctx context.Context) ManagedSmtpArrayOutput {
	return o
}

func (o ManagedSmtpArrayOutput) Index(i pulumi.IntInput) ManagedSmtpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedSmtp {
		return vs[0].([]*ManagedSmtp)[vs[1].(int)]
	}).(ManagedSmtpOutput)
}

type ManagedSmtpMapOutput struct{ *pulumi.OutputState }

func (ManagedSmtpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedSmtp)(nil)).Elem()
}

func (o ManagedSmtpMapOutput) ToManagedSmtpMapOutput() ManagedSmtpMapOutput {
	return o
}

func (o ManagedSmtpMapOutput) ToManagedSmtpMapOutputWithContext(ctx context.Context) ManagedSmtpMapOutput {
	return o
}

func (o ManagedSmtpMapOutput) MapIndex(k pulumi.StringInput) ManagedSmtpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedSmtp {
		return vs[0].(map[string]*ManagedSmtp)[vs[1].(string)]
	}).(ManagedSmtpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedSmtpInput)(nil)).Elem(), &ManagedSmtp{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedSmtpArrayInput)(nil)).Elem(), ManagedSmtpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedSmtpMapInput)(nil)).Elem(), ManagedSmtpMap{})
	pulumi.RegisterOutputType(ManagedSmtpOutput{})
	pulumi.RegisterOutputType(ManagedSmtpArrayOutput{})
	pulumi.RegisterOutputType(ManagedSmtpMapOutput{})
}