	.file	"Q321.cpp"
	.section .rdata,"dr"
_ZStL19piecewise_construct:
	.space 1
	.section	.text$_ZN9__gnu_cxx5__ops16__iter_less_iterEv,"x"
	.linkonce discard
	.globl	_ZN9__gnu_cxx5__ops16__iter_less_iterEv
	.def	_ZN9__gnu_cxx5__ops16__iter_less_iterEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx5__ops16__iter_less_iterEv
_ZN9__gnu_cxx5__ops16__iter_less_iterEv:
.LFB162:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZnwyPv,"x"
	.linkonce discard
	.globl	_ZnwyPv
	.def	_ZnwyPv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZnwyPv
_ZnwyPv:
.LFB300:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.text
	.def	_ZL6printfPKcz;	.scl	3;	.type	32;	.endef
	.seh_proc	_ZL6printfPKcz
_ZL6printfPKcz:
.LFB843:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rdx, -40(%rbp)
	movq	%r8, -32(%rbp)
	movq	%r9, -24(%rbp)
	movq	%rcx, -48(%rbp)
	leaq	-40(%rbp), %rax
	movq	%rax, -88(%rbp)
	movq	-88(%rbp), %rax
	movq	%rax, %rdx
	movq	-48(%rbp), %rcx
	call	__mingw_vprintf
	movl	%eax, %ebx
	movl	%ebx, %eax
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
.lcomm _ZStL8__ioinit,1,1
	.section	.text$_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i,"x"
	.linkonce discard
	.align 2
	.globl	_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i
	.def	_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i
_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i:
.LFB4704:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%r13
	.seh_pushreg	%r13
	pushq	%r12
	.seh_pushreg	%r12
	pushq	%rdi
	.seh_pushreg	%rdi
	pushq	%rsi
	.seh_pushreg	%rsi
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$360, %rsp
	.seh_stackalloc	360
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, 288(%rbp)
	movq	%rdx, 296(%rbp)
	movq	%r8, 304(%rbp)
	movq	%r9, 312(%rbp)
	movq	288(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEEC1Ev
	movq	312(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movl	%eax, %edx
	movl	320(%rbp), %eax
	subl	%edx, %eax
	testl	%eax, %eax
	js	.L8
	movq	312(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movl	%eax, %edx
	movl	320(%rbp), %eax
	subl	%edx, %eax
	jmp	.L9
.L8:
	movl	$0, %eax
.L9:
	movl	%eax, 220(%rbp)
	jmp	.L10
.L19:
	movl	320(%rbp), %eax
	subl	220(%rbp), %eax
	movl	%eax, 216(%rbp)
	movq	312(%rbp), %rdx
	movq	%rbp, %rax
	movq	%rax, %rcx
.LEHB0:
	call	_ZNSt6vectorIiSaIiEEC1ERKS1_
.LEHE0:
	leaq	-32(%rbp), %rax
	movl	216(%rbp), %r8d
	movq	%rbp, %rcx
	movq	296(%rbp), %rdx
	movl	%r8d, %r9d
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB1:
	call	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi
.LEHE1:
	movq	304(%rbp), %rdx
	leaq	64(%rbp), %rax
	movq	%rax, %rcx
.LEHB2:
	call	_ZNSt6vectorIiSaIiEEC1ERKS1_
.LEHE2:
	leaq	32(%rbp), %rax
	movl	220(%rbp), %r8d
	leaq	64(%rbp), %rcx
	movq	296(%rbp), %rdx
	movl	%r8d, %r9d
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB3:
	call	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi
.LEHE3:
	leaq	-64(%rbp), %rax
	leaq	-32(%rbp), %r8
	leaq	32(%rbp), %rcx
	movq	296(%rbp), %rdx
	movq	%r8, %r9
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB4:
	call	_ZN8Solution5mergeESt6vectorIiSaIiEES2_
.LEHE4:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdx
	movq	288(%rbp), %rcx
.LEHB5:
	call	_ZStgtIiSaIiEEbRKSt6vectorIT_T0_ES6_
.LEHE5:
	movl	$0, %ebx
	movl	$0, %esi
	movl	$0, %edi
	movl	$0, %r12d
	testb	%al, %al
	je	.L11
	leaq	-96(%rbp), %rax
	movq	288(%rbp), %rdx
	movq	%rax, %rcx
.LEHB6:
	call	_ZNSt6vectorIiSaIiEEC1ERKS1_
	jmp	.L12
.L11:
	movq	312(%rbp), %rdx
	leaq	128(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEC1ERKS1_
	movl	$1, %ebx
	leaq	96(%rbp), %rax
	movl	216(%rbp), %r8d
	leaq	128(%rbp), %rcx
	movq	296(%rbp), %rdx
	movl	%r8d, %r9d
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi
	movl	$1, %esi
	movq	304(%rbp), %rdx
	leaq	192(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEC1ERKS1_
	movl	$1, %edi
	leaq	160(%rbp), %rax
	movl	220(%rbp), %r8d
	leaq	192(%rbp), %rcx
	movq	296(%rbp), %rdx
	movl	%r8d, %r9d
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi
	movl	$1, %r12d
	leaq	-96(%rbp), %rax
	leaq	96(%rbp), %r8
	leaq	160(%rbp), %rcx
	movq	296(%rbp), %rdx
	movq	%r8, %r9
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZN8Solution5mergeESt6vectorIiSaIiEES2_
.LEHE6:
.L12:
	leaq	-96(%rbp), %rax
	movq	%rax, %rdx
	movq	288(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEEaSEOS1_
	leaq	-96(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	testb	%r12b, %r12b
	je	.L13
	leaq	160(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L13:
	testb	%dil, %dil
	je	.L14
	leaq	192(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L14:
	testb	%sil, %sil
	je	.L15
	leaq	96(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L15:
	testb	%bl, %bl
	je	.L16
	leaq	128(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L16:
	leaq	-64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	leaq	32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	leaq	64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	leaq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	movq	%rbp, %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	addl	$1, 220(%rbp)
.L10:
	movq	304(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpl	320(%rbp), %eax
	jge	.L17
	movq	304(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	jmp	.L18
.L17:
	movl	320(%rbp), %eax
.L18:
	cmpl	220(%rbp), %eax
	setge	%al
	testb	%al, %al
	jne	.L19
	jmp	.L39
.L38:
	movq	%rax, %r13
	testb	%r12b, %r12b
	je	.L22
	leaq	160(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L22:
	movq	%r13, %r12
	testb	%dil, %dil
	je	.L23
	leaq	192(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L23:
	movq	%r12, %rdi
	testb	%sil, %sil
	je	.L24
	leaq	96(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L24:
	movq	%rdi, %rsi
	testb	%bl, %bl
	je	.L25
	leaq	128(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L25:
	movq	%rsi, %rbx
	jmp	.L26
.L37:
	movq	%rax, %rbx
.L26:
	leaq	-64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	jmp	.L27
.L36:
	movq	%rax, %rbx
.L27:
	leaq	32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	jmp	.L28
.L35:
	movq	%rax, %rbx
.L28:
	leaq	64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	jmp	.L29
.L34:
	movq	%rax, %rbx
.L29:
	leaq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	jmp	.L30
.L33:
	movq	%rax, %rbx
.L30:
	movq	%rbp, %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	jmp	.L31
.L32:
	movq	%rax, %rbx
.L31:
	movq	288(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB7:
	call	_Unwind_Resume
.LEHE7:
.L39:
	movq	288(%rbp), %rax
	addq	$360, %rsp
	popq	%rbx
	popq	%rsi
	popq	%rdi
	popq	%r12
	popq	%r13
	popq	%rbp
	ret
	.def	__gxx_personality_seh0;	.scl	2;	.type	32;	.endef
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4704:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4704-.LLSDACSB4704
.LLSDACSB4704:
	.uleb128 .LEHB0-.LFB4704
	.uleb128 .LEHE0-.LEHB0
	.uleb128 .L32-.LFB4704
	.uleb128 0
	.uleb128 .LEHB1-.LFB4704
	.uleb128 .LEHE1-.LEHB1
	.uleb128 .L33-.LFB4704
	.uleb128 0
	.uleb128 .LEHB2-.LFB4704
	.uleb128 .LEHE2-.LEHB2
	.uleb128 .L34-.LFB4704
	.uleb128 0
	.uleb128 .LEHB3-.LFB4704
	.uleb128 .LEHE3-.LEHB3
	.uleb128 .L35-.LFB4704
	.uleb128 0
	.uleb128 .LEHB4-.LFB4704
	.uleb128 .LEHE4-.LEHB4
	.uleb128 .L36-.LFB4704
	.uleb128 0
	.uleb128 .LEHB5-.LFB4704
	.uleb128 .LEHE5-.LEHB5
	.uleb128 .L37-.LFB4704
	.uleb128 0
	.uleb128 .LEHB6-.LFB4704
	.uleb128 .LEHE6-.LEHB6
	.uleb128 .L38-.LFB4704
	.uleb128 0
	.uleb128 .LEHB7-.LFB4704
	.uleb128 .LEHE7-.LEHB7
	.uleb128 0
	.uleb128 0
.LLSDACSE4704:
	.section	.text$_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZN8Solution9maxNumberESt6vectorIiSaIiEEi,"x"
	.linkonce discard
	.align 2
	.globl	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi
	.def	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN8Solution9maxNumberESt6vectorIiSaIiEEi
_ZN8Solution9maxNumberESt6vectorIiSaIiEEi:
.LFB4708:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$88, %rsp
	.seh_stackalloc	88
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -16(%rbp)
	movq	%rdx, -8(%rbp)
	movq	%r8, 0(%rbp)
	movl	%r9d, 8(%rbp)
	movq	0(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movl	%eax, %edx
	movl	8(%rbp), %eax
	subl	%eax, %edx
	movl	%edx, %eax
	movl	%eax, -52(%rbp)
	movq	-16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEEC1Ev
	movq	0(%rbp), %rax
	movq	%rax, -64(%rbp)
	movq	-64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEE5beginEv
	movq	%rax, -80(%rbp)
	movq	-64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEE3endEv
	movq	%rax, -96(%rbp)
	jmp	.L41
.L46:
	leaq	-80(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv
	movl	(%rax), %eax
	movl	%eax, -68(%rbp)
	jmp	.L42
.L45:
	movq	-16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE8pop_backEv
	subl	$1, -52(%rbp)
.L42:
	cmpl	$0, -52(%rbp)
	je	.L43
	movq	-16(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	testq	%rax, %rax
	je	.L43
	movq	-16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE4backEv
	movl	(%rax), %edx
	movl	-68(%rbp), %eax
	cmpl	%eax, %edx
	jge	.L43
	movl	$1, %eax
	jmp	.L44
.L43:
	movl	$0, %eax
.L44:
	testb	%al, %al
	jne	.L45
	leaq	-68(%rbp), %rax
	movq	%rax, %rdx
	movq	-16(%rbp), %rcx
.LEHB8:
	call	_ZNSt6vectorIiSaIiEE9push_backERKi
	leaq	-80(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEppEv
.L41:
	leaq	-96(%rbp), %rdx
	leaq	-80(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxxneIPiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESA_
	testb	%al, %al
	jne	.L46
	movl	8(%rbp), %eax
	cltq
	movq	%rax, %rdx
	movq	-16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE6resizeEy
.LEHE8:
	jmp	.L50
.L49:
	movq	%rax, %rbx
	movq	-16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB9:
	call	_Unwind_Resume
.LEHE9:
.L50:
	movq	-16(%rbp), %rax
	addq	$88, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4708:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4708-.LLSDACSB4708
.LLSDACSB4708:
	.uleb128 .LEHB8-.LFB4708
	.uleb128 .LEHE8-.LEHB8
	.uleb128 .L49-.LFB4708
	.uleb128 0
	.uleb128 .LEHB9-.LFB4708
	.uleb128 .LEHE9-.LEHB9
	.uleb128 0
	.uleb128 0
.LLSDACSE4708:
	.section	.text$_ZN8Solution9maxNumberESt6vectorIiSaIiEEi,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZN8Solution5mergeESt6vectorIiSaIiEES2_,"x"
	.linkonce discard
	.align 2
	.globl	_ZN8Solution5mergeESt6vectorIiSaIiEES2_
	.def	_ZN8Solution5mergeESt6vectorIiSaIiEES2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN8Solution5mergeESt6vectorIiSaIiEES2_
_ZN8Solution5mergeESt6vectorIiSaIiEES2_:
.LFB4709:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rsi
	.seh_pushreg	%rsi
	pushq	%rbx
	.seh_pushreg	%rbx
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 32(%rbp)
	movq	%rdx, 40(%rbp)
	movq	%r8, 48(%rbp)
	movq	%r9, 56(%rbp)
	movq	32(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEEC1Ev
	movl	$0, -4(%rbp)
	movl	$0, -8(%rbp)
	jmp	.L52
.L59:
	movl	-4(%rbp), %eax
	movslq	%eax, %rbx
	movq	48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	%rax, %rbx
	jae	.L53
	movl	-8(%rbp), %eax
	movslq	%eax, %rbx
	movq	56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	%rax, %rbx
	jae	.L53
	movl	$1, %eax
	jmp	.L54
.L53:
	movl	$0, %eax
.L54:
	testb	%al, %al
	je	.L55
	movl	-4(%rbp), %eax
	movslq	%eax, %rdx
	movq	48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movl	(%rax), %ebx
	movl	-8(%rbp), %eax
	movslq	%eax, %rdx
	movq	56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movl	(%rax), %eax
	cmpl	%eax, %ebx
	setge	%al
	testb	%al, %al
	je	.L56
	movl	-4(%rbp), %eax
	leal	1(%rax), %edx
	movl	%edx, -4(%rbp)
	movslq	%eax, %rdx
	movq	48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movq	%rax, %rdx
	movq	32(%rbp), %rcx
.LEHB10:
	call	_ZNSt6vectorIiSaIiEE9push_backERKi
	jmp	.L52
.L56:
	movl	-8(%rbp), %eax
	leal	1(%rax), %edx
	movl	%edx, -8(%rbp)
	movslq	%eax, %rdx
	movq	56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movq	%rax, %rdx
	movq	32(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE9push_backERKi
	jmp	.L52
.L55:
	movl	-4(%rbp), %eax
	movslq	%eax, %rbx
	movq	48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	%rax, %rbx
	sete	%al
	testb	%al, %al
	je	.L58
	movl	-8(%rbp), %eax
	leal	1(%rax), %edx
	movl	%edx, -8(%rbp)
	movslq	%eax, %rdx
	movq	56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movq	%rax, %rdx
	movq	32(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE9push_backERKi
	jmp	.L52
.L58:
	movl	-4(%rbp), %eax
	leal	1(%rax), %edx
	movl	%edx, -4(%rbp)
	movslq	%eax, %rdx
	movq	48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movq	%rax, %rdx
	movq	32(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE9push_backERKi
.LEHE10:
.L52:
	movl	-4(%rbp), %edx
	movl	-8(%rbp), %eax
	addl	%edx, %eax
	movslq	%eax, %rbx
	movq	48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movq	%rax, %rsi
	movq	56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	addq	%rsi, %rax
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	jne	.L59
	jmp	.L63
.L62:
	movq	%rax, %rbx
	movq	32(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB11:
	call	_Unwind_Resume
.LEHE11:
.L63:
	movq	32(%rbp), %rax
	addq	$48, %rsp
	popq	%rbx
	popq	%rsi
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4709:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4709-.LLSDACSB4709
.LLSDACSB4709:
	.uleb128 .LEHB10-.LFB4709
	.uleb128 .LEHE10-.LEHB10
	.uleb128 .L62-.LFB4709
	.uleb128 0
	.uleb128 .LEHB11-.LFB4709
	.uleb128 .LEHE11-.LEHB11
	.uleb128 0
	.uleb128 0
.LLSDACSE4709:
	.section	.text$_ZN8Solution5mergeESt6vectorIiSaIiEES2_,"x"
	.linkonce discard
	.seh_endproc
	.def	__main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
.LC2:
	.ascii "%d\0"
	.data
	.align 64
.LC0:
	.long	6
	.long	4
	.long	7
	.long	8
	.long	6
	.long	5
	.long	5
	.long	3
	.long	1
	.long	7
	.long	4
	.long	9
	.long	9
	.long	5
	.long	9
	.long	6
	.long	1
	.long	7
	.long	1
	.long	3
	.long	6
	.long	3
	.long	0
	.long	8
	.long	2
	.long	1
	.long	8
	.long	0
	.long	0
	.long	7
	.long	3
	.long	9
	.long	3
	.long	1
	.long	3
	.long	7
	.long	5
	.long	9
	.long	4
	.long	3
	.long	5
	.long	8
	.long	1
	.long	9
	.long	5
	.long	6
	.long	5
	.long	7
	.long	8
	.long	6
	.long	6
	.long	2
	.long	0
	.long	9
	.long	7
	.long	1
	.long	2
	.long	1
	.long	7
	.long	0
	.long	6
	.long	8
	.long	5
	.long	8
	.long	1
	.long	6
	.long	1
	.long	5
	.long	8
	.long	4
	.align 64
.LC1:
	.long	3
	.long	0
	.long	0
	.long	1
	.long	4
	.long	3
	.long	4
	.long	0
	.long	8
	.long	5
	.long	9
	.long	1
	.long	5
	.long	9
	.long	4
	.long	4
	.long	4
	.long	8
	.long	0
	.long	5
	.long	5
	.long	8
	.long	4
	.long	9
	.long	8
	.long	3
	.long	1
	.long	3
	.long	4
	.long	8
	.long	9
	.long	4
	.long	9
	.long	9
	.long	6
	.long	6
	.long	2
	.long	8
	.long	9
	.long	0
	.long	8
	.long	0
	.long	0
	.long	0
	.long	1
	.long	4
	.long	8
	.long	9
	.long	7
	.long	6
	.long	2
	.long	1
	.long	8
	.long	7
	.long	0
	.long	6
	.long	4
	.long	1
	.long	8
	.long	1
	.long	3
	.long	2
	.long	4
	.long	5
	.long	7
	.long	7
	.long	0
	.long	4
	.long	8
	.long	4
	.text
	.globl	main
	.def	main;	.scl	2;	.type	32;	.endef
	.seh_proc	main
main:
.LFB4710:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rdi
	.seh_pushreg	%rdi
	pushq	%rsi
	.seh_pushreg	%rsi
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$792, %rsp
	.seh_stackalloc	792
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	call	__main
	movl	$3, 624(%rbp)
	movl	$4, 628(%rbp)
	movl	$6, 632(%rbp)
	movl	$5, 636(%rbp)
	movl	$9, 592(%rbp)
	movl	$1, 596(%rbp)
	movl	$2, 600(%rbp)
	movl	$5, 604(%rbp)
	movl	$8, 608(%rbp)
	movl	$3, 612(%rbp)
	leaq	-80(%rbp), %rax
	leaq	.LC0(%rip), %rdx
	movl	$35, %ecx
	movq	%rax, %rdi
	movq	%rdx, %rsi
	rep movsq
	leaq	208(%rbp), %rax
	leaq	.LC1(%rip), %rdx
	movl	$35, %ecx
	movq	%rax, %rdi
	movq	%rdx, %rsi
	rep movsq
	leaq	650(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiEC1Ev
	movl	$4, %eax
	leaq	0(,%rax,4), %rdx
	leaq	624(%rbp), %rax
	leaq	(%rax,%rdx), %r8
	leaq	650(%rbp), %rcx
	leaq	624(%rbp), %rdx
	leaq	560(%rbp), %rax
	movq	%rcx, %r9
	movq	%rax, %rcx
.LEHB12:
	call	_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_
.LEHE12:
	leaq	650(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	leaq	651(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiEC1Ev
	movl	$6, %eax
	leaq	0(,%rax,4), %rdx
	leaq	592(%rbp), %rax
	leaq	(%rax,%rdx), %r8
	leaq	651(%rbp), %rcx
	leaq	592(%rbp), %rdx
	leaq	528(%rbp), %rax
	movq	%rcx, %r9
	movq	%rax, %rcx
.LEHB13:
	call	_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_
.LEHE13:
	leaq	651(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	leaq	496(%rbp), %rax
	leaq	528(%rbp), %r8
	leaq	560(%rbp), %rcx
	leaq	527(%rbp), %rdx
	movl	$1, 32(%rsp)
	movq	%r8, %r9
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB14:
	call	_ZN8Solution9maxNumberERSt6vectorIiSaIiEES3_i
.LEHE14:
	movl	$0, 652(%rbp)
	jmp	.L65
.L66:
	movl	652(%rbp), %eax
	movslq	%eax, %rdx
	leaq	496(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movl	(%rax), %eax
	movl	%eax, %edx
	leaq	.LC2(%rip), %rcx
	call	_ZL6printfPKcz
	addl	$1, 652(%rbp)
.L65:
	movl	652(%rbp), %eax
	movslq	%eax, %rbx
	leaq	496(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	jne	.L66
	movl	$0, %ebx
	leaq	496(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	leaq	528(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	leaq	560(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	movl	%ebx, %eax
	jmp	.L75
.L72:
	movq	%rax, %rbx
	leaq	650(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB15:
	call	_Unwind_Resume
.L73:
	movq	%rax, %rbx
	leaq	651(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	jmp	.L70
.L74:
	movq	%rax, %rbx
	leaq	528(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
.L70:
	leaq	560(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
	call	_Unwind_Resume
.LEHE15:
.L75:
	addq	$792, %rsp
	popq	%rbx
	popq	%rsi
	popq	%rdi
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4710:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4710-.LLSDACSB4710
.LLSDACSB4710:
	.uleb128 .LEHB12-.LFB4710
	.uleb128 .LEHE12-.LEHB12
	.uleb128 .L72-.LFB4710
	.uleb128 0
	.uleb128 .LEHB13-.LFB4710
	.uleb128 .LEHE13-.LEHB13
	.uleb128 .L73-.LFB4710
	.uleb128 0
	.uleb128 .LEHB14-.LFB4710
	.uleb128 .LEHE14-.LEHB14
	.uleb128 .L74-.LFB4710
	.uleb128 0
	.uleb128 .LEHB15-.LFB4710
	.uleb128 .LEHE15-.LEHB15
	.uleb128 0
	.uleb128 0
.LLSDACSE4710:
	.text
	.seh_endproc
	.section .rdata,"dr"
.LC3:
	.ascii "\12\0"
	.text
	.globl	_Z11printVectorSt6vectorIiSaIiEE
	.def	_Z11printVectorSt6vectorIiSaIiEE;	.scl	2;	.type	32;	.endef
	.seh_proc	_Z11printVectorSt6vectorIiSaIiEE
_Z11printVectorSt6vectorIiSaIiEE:
.LFB4711:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movl	$0, -84(%rbp)
	jmp	.L77
.L78:
	movl	-84(%rbp), %eax
	cltq
	movq	%rax, %rdx
	movq	-48(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEEixEy
	movl	(%rax), %eax
	movl	%eax, %edx
	leaq	.LC2(%rip), %rcx
	call	_ZL6printfPKcz
	addl	$1, -84(%rbp)
.L77:
	movl	-84(%rbp), %eax
	movslq	%eax, %rbx
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	jne	.L78
	leaq	.LC3(%rip), %rcx
	call	_ZL6printfPKcz
	nop
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEEC1Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEEC1Ev
	.def	_ZNSt6vectorIiSaIiEEC1Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEEC1Ev
_ZNSt6vectorIiSaIiEEC1Ev:
.LFB4776:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEEC2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4776:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4776-.LLSDACSB4776
.LLSDACSB4776:
.LLSDACSE4776:
	.section	.text$_ZNSt6vectorIiSaIiEEC1Ev,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEED1Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEED1Ev
	.def	_ZNSt6vectorIiSaIiEED1Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEED1Ev
_ZNSt6vectorIiSaIiEED1Ev:
.LFB4779:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	16(%rbp), %rax
	movq	8(%rax), %rdx
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEED2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4779:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4779-.LLSDACSB4779
.LLSDACSB4779:
.LLSDACSE4779:
	.section	.text$_ZNSt6vectorIiSaIiEED1Ev,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZNKSt6vectorIiSaIiEE4sizeEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt6vectorIiSaIiEE4sizeEv
	.def	_ZNKSt6vectorIiSaIiEE4sizeEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt6vectorIiSaIiEE4sizeEv
_ZNKSt6vectorIiSaIiEE4sizeEv:
.LFB4780:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	8(%rax), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEEC1ERKS1_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEEC1ERKS1_
	.def	_ZNSt6vectorIiSaIiEEC1ERKS1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEEC1ERKS1_
_ZNSt6vectorIiSaIiEEC1ERKS1_:
.LFB4783:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rdi
	.seh_pushreg	%rdi
	pushq	%rsi
	.seh_pushreg	%rsi
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -32(%rbp)
	movq	%rdx, -24(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rdx
	leaq	-81(%rbp), %rax
	movq	%rax, %rcx
.LEHB16:
	call	_ZN9__gnu_cxx14__alloc_traitsISaIiEE17_S_select_on_copyERKS1_
.LEHE16:
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movq	%rax, %rcx
	movq	-32(%rbp), %rax
	leaq	-81(%rbp), %rdx
	movq	%rdx, %r8
	movq	%rcx, %rdx
	movq	%rax, %rcx
.LEHB17:
	call	_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_
.LEHE17:
	leaq	-81(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rdi
	movq	-32(%rbp), %rax
	movq	(%rax), %rbx
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE3endEv
	movq	%rax, %rsi
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE5beginEv
	movq	%rdi, %r9
	movq	%rbx, %r8
	movq	%rsi, %rdx
	movq	%rax, %rcx
.LEHB18:
	call	_ZSt22__uninitialized_copy_aIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiiET0_T_SA_S9_RSaIT1_E
.LEHE18:
	movq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	%rdx, 8(%rax)
	jmp	.L89
.L87:
	movq	%rax, %rbx
	leaq	-81(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB19:
	call	_Unwind_Resume
.L88:
	movq	%rax, %rbx
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEED2Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
	call	_Unwind_Resume
	nop
.LEHE19:
.L89:
	addq	$56, %rsp
	popq	%rbx
	popq	%rsi
	popq	%rdi
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4783:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4783-.LLSDACSB4783
.LLSDACSB4783:
	.uleb128 .LEHB16-.LFB4783
	.uleb128 .LEHE16-.LEHB16
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB17-.LFB4783
	.uleb128 .LEHE17-.LEHB17
	.uleb128 .L87-.LFB4783
	.uleb128 0
	.uleb128 .LEHB18-.LFB4783
	.uleb128 .LEHE18-.LEHB18
	.uleb128 .L88-.LFB4783
	.uleb128 0
	.uleb128 .LEHB19-.LFB4783
	.uleb128 .LEHE19-.LEHB19
	.uleb128 0
	.uleb128 0
.LLSDACSE4783:
	.section	.text$_ZNSt6vectorIiSaIiEEC1ERKS1_,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZSt4moveIRSt6vectorIiSaIiEEEONSt16remove_referenceIT_E4typeEOS5_,"x"
	.linkonce discard
	.globl	_ZSt4moveIRSt6vectorIiSaIiEEEONSt16remove_referenceIT_E4typeEOS5_
	.def	_ZSt4moveIRSt6vectorIiSaIiEEEONSt16remove_referenceIT_E4typeEOS5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt4moveIRSt6vectorIiSaIiEEEONSt16remove_referenceIT_E4typeEOS5_
_ZSt4moveIRSt6vectorIiSaIiEEEONSt16remove_referenceIT_E4typeEOS5_:
.LFB4785:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZStgtIiSaIiEEbRKSt6vectorIT_T0_ES6_,"x"
	.linkonce discard
	.globl	_ZStgtIiSaIiEEbRKSt6vectorIT_T0_ES6_
	.def	_ZStgtIiSaIiEEbRKSt6vectorIT_T0_ES6_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZStgtIiSaIiEEbRKSt6vectorIT_T0_ES6_
_ZStgtIiSaIiEEbRKSt6vectorIT_T0_ES6_:
.LFB4788:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	16(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZStltIiSaIiEEbRKSt6vectorIT_T0_ES6_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEEaSEOS1_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEEaSEOS1_
	.def	_ZNSt6vectorIiSaIiEEaSEOS1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEEaSEOS1_
_ZNSt6vectorIiSaIiEEaSEOS1_:
.LFB4789:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movb	$1, -81(%rbp)
	movq	-40(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt4moveIRSt6vectorIiSaIiEEEONSt16remove_referenceIT_E4typeEOS5_
	movl	%ebx, %r8d
	movq	%rax, %rdx
	movq	-48(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE
	movq	-48(%rbp), %rax
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE5beginEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE5beginEv
	.def	_ZNSt6vectorIiSaIiEE5beginEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE5beginEv
_ZNSt6vectorIiSaIiEE5beginEv:
.LFB4790:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rdx
	leaq	-16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_
	movq	-16(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE3endEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE3endEv
	.def	_ZNSt6vectorIiSaIiEE3endEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE3endEv
_ZNSt6vectorIiSaIiEE3endEv:
.LFB4791:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	leaq	8(%rax), %rdx
	leaq	-16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_
	movq	-16(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxxneIPiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESA_,"x"
	.linkonce discard
	.globl	_ZN9__gnu_cxxneIPiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESA_
	.def	_ZN9__gnu_cxxneIPiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESA_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxxneIPiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESA_
_ZN9__gnu_cxxneIPiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESA_:
.LFB4792:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-64(%rbp), %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv
	movq	(%rax), %rbx
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv
	movq	(%rax), %rax
	cmpq	%rax, %rbx
	setne	%al
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEppEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEppEv
	.def	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEppEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEppEv
_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEppEv:
.LFB4793:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	leaq	4(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv
	.def	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv
_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv:
.LFB4794:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE4backEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE4backEv
	.def	_ZNSt6vectorIiSaIiEE4backEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE4backEv
_ZNSt6vectorIiSaIiEE4backEv:
.LFB4795:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$64, %rsp
	.seh_stackalloc	64
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE3endEv
	movq	%rax, -16(%rbp)
	leaq	-16(%rbp), %rax
	movl	$1, %edx
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEmiEx
	movq	%rax, -32(%rbp)
	leaq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEdeEv
	addq	$64, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE8pop_backEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE8pop_backEv
	.def	_ZNSt6vectorIiSaIiEE8pop_backEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE8pop_backEv
_ZNSt6vectorIiSaIiEE8pop_backEv:
.LFB4796:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	8(%rax), %rax
	leaq	-4(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, 8(%rax)
	movq	16(%rbp), %rax
	movq	8(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4796:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4796-.LLSDACSB4796
.LLSDACSB4796:
.LLSDACSE4796:
	.section	.text$_ZNSt6vectorIiSaIiEE8pop_backEv,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE,"x"
	.linkonce discard
	.globl	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
	.def	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE:
.LFB4798:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE9push_backERKi,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE9push_backERKi
	.def	_ZNSt6vectorIiSaIiEE9push_backERKi;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE9push_backERKi
_ZNSt6vectorIiSaIiEE9push_backERKi:
.LFB4797:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	8(%rax), %rdx
	movq	16(%rbp), %rax
	movq	16(%rax), %rax
	cmpq	%rax, %rdx
	je	.L112
	movq	16(%rbp), %rax
	movq	8(%rax), %rdx
	movq	16(%rbp), %rax
	movq	24(%rbp), %rcx
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_
	movq	16(%rbp), %rax
	movq	8(%rax), %rax
	leaq	4(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, 8(%rax)
	jmp	.L111
.L112:
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_
	nop
.L111:
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE6resizeEy,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE6resizeEy
	.def	_ZNSt6vectorIiSaIiEE6resizeEy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE6resizeEy
_ZNSt6vectorIiSaIiEE6resizeEy:
.LFB4799:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	24(%rbp), %rax
	setb	%al
	testb	%al, %al
	je	.L115
	movq	16(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movq	%rax, %rdx
	movq	24(%rbp), %rax
	subq	%rdx, %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE17_M_default_appendEy
	jmp	.L114
.L115:
	movq	16(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	24(%rbp), %rax
	seta	%al
	testb	%al, %al
	je	.L114
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	24(%rbp), %rdx
	salq	$2, %rdx
	addq	%rdx, %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi
	nop
.L114:
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEEixEy,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEEixEy
	.def	_ZNSt6vectorIiSaIiEEixEy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEEixEy
_ZNSt6vectorIiSaIiEEixEy:
.LFB4800:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	24(%rbp), %rdx
	salq	$2, %rdx
	addq	%rdx, %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSaIiEC2Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSaIiEC2Ev
	.def	_ZNSaIiEC2Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSaIiEC2Ev
_ZNSaIiEC2Ev:
.LFB4802:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiEC2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSaIiEC1Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSaIiEC1Ev
	.def	_ZNSaIiEC1Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSaIiEC1Ev
_ZNSaIiEC1Ev:
.LFB4803:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiEC2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSaIiED2Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSaIiED2Ev
	.def	_ZNSaIiED2Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSaIiED2Ev
_ZNSaIiED2Ev:
.LFB4805:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiED2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSaIiED1Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSaIiED1Ev
	.def	_ZNSaIiED1Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSaIiED1Ev
_ZNSaIiED1Ev:
.LFB4806:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiED2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_
	.def	_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_
_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_:
.LFB4809:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movq	%r8, -32(%rbp)
	movq	%r9, -24(%rbp)
	movq	-48(%rbp), %rax
	movq	-24(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_
	movq	-32(%rbp), %rdx
	movq	-40(%rbp), %rax
	movl	%ebx, %r9d
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	-48(%rbp), %rcx
.LEHB20:
	call	_ZNSt6vectorIiSaIiEE22_M_initialize_dispatchIPiEEvT_S4_St12__false_type
.LEHE20:
	jmp	.L128
.L127:
	movq	%rax, %rbx
	movq	-48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEED2Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB21:
	call	_Unwind_Resume
	nop
.LEHE21:
.L128:
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4809:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4809-.LLSDACSB4809
.LLSDACSB4809:
	.uleb128 .LEHB20-.LFB4809
	.uleb128 .LEHE20-.LEHB20
	.uleb128 .L127-.LFB4809
	.uleb128 0
	.uleb128 .LEHB21-.LFB4809
	.uleb128 .LEHE21-.LEHB21
	.uleb128 0
	.uleb128 0
.LLSDACSE4809:
	.section	.text$_ZNSt6vectorIiSaIiEEC1IPivEET_S4_RKS0_,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev
	.def	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev
_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev:
.LFB4864:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNSaIiED2Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEEC2Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEEC2Ev
	.def	_ZNSt12_Vector_baseIiSaIiEEC2Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEEC2Ev
_ZNSt12_Vector_baseIiSaIiEEC2Ev:
.LFB4865:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEED2Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEED2Ev
	.def	_ZNSt12_Vector_baseIiSaIiEED2Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEED2Ev
_ZNSt12_Vector_baseIiSaIiEED2Ev:
.LFB4868:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	16(%rax), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4868:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4868-.LLSDACSB4868
.LLSDACSB4868:
.LLSDACSE4868:
	.section	.text$_ZNSt12_Vector_baseIiSaIiEED2Ev,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	.def	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv:
.LFB4870:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E,"x"
	.linkonce discard
	.globl	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
	.def	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E:
.LFB4871:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt8_DestroyIPiEvT_S1_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx14__alloc_traitsISaIiEE17_S_select_on_copyERKS1_,"x"
	.linkonce discard
	.globl	_ZN9__gnu_cxx14__alloc_traitsISaIiEE17_S_select_on_copyERKS1_
	.def	_ZN9__gnu_cxx14__alloc_traitsISaIiEE17_S_select_on_copyERKS1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx14__alloc_traitsISaIiEE17_S_select_on_copyERKS1_
_ZN9__gnu_cxx14__alloc_traitsISaIiEE17_S_select_on_copyERKS1_:
.LFB4872:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE37select_on_container_copy_constructionERKS0_
	movq	16(%rbp), %rax
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	.def	_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv:
.LFB4873:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_
	.def	_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_
_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_:
.LFB4875:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	%r8, -48(%rbp)
	movq	-64(%rbp), %rax
	movq	-48(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_
	movq	-56(%rbp), %rax
	movq	%rax, %rdx
	movq	-64(%rbp), %rcx
.LEHB22:
	call	_ZNSt12_Vector_baseIiSaIiEE17_M_create_storageEy
.LEHE22:
	jmp	.L144
.L143:
	movq	%rax, %rbx
	movq	-64(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB23:
	call	_Unwind_Resume
	nop
.LEHE23:
.L144:
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4875:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4875-.LLSDACSB4875
.LLSDACSB4875:
	.uleb128 .LEHB22-.LFB4875
	.uleb128 .LEHE22-.LEHB22
	.uleb128 .L143-.LFB4875
	.uleb128 0
	.uleb128 .LEHB23-.LFB4875
	.uleb128 .LEHE23-.LEHB23
	.uleb128 0
	.uleb128 0
.LLSDACSE4875:
	.section	.text$_ZNSt12_Vector_baseIiSaIiEEC2EyRKS0_,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZNKSt6vectorIiSaIiEE5beginEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt6vectorIiSaIiEE5beginEv
	.def	_ZNKSt6vectorIiSaIiEE5beginEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt6vectorIiSaIiEE5beginEv
_ZNKSt6vectorIiSaIiEE5beginEv:
.LFB4877:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	%rax, -8(%rbp)
	leaq	-8(%rbp), %rdx
	leaq	-16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_
	movq	-16(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNKSt6vectorIiSaIiEE3endEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt6vectorIiSaIiEE3endEv
	.def	_ZNKSt6vectorIiSaIiEE3endEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt6vectorIiSaIiEE3endEv
_ZNKSt6vectorIiSaIiEE3endEv:
.LFB4878:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	8(%rax), %rax
	movq	%rax, -8(%rbp)
	leaq	-8(%rbp), %rdx
	leaq	-16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_
	movq	-16(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt22__uninitialized_copy_aIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiiET0_T_SA_S9_RSaIT1_E,"x"
	.linkonce discard
	.globl	_ZSt22__uninitialized_copy_aIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiiET0_T_SA_S9_RSaIT1_E
	.def	_ZSt22__uninitialized_copy_aIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiiET0_T_SA_S9_RSaIT1_E;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt22__uninitialized_copy_aIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiiET0_T_SA_S9_RSaIT1_E
_ZSt22__uninitialized_copy_aIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiiET0_T_SA_S9_RSaIT1_E:
.LFB4879:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt18uninitialized_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiET0_T_SA_S9_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt4moveIRSaIiEEONSt16remove_referenceIT_E4typeEOS3_,"x"
	.linkonce discard
	.globl	_ZSt4moveIRSaIiEEONSt16remove_referenceIT_E4typeEOS3_
	.def	_ZSt4moveIRSaIiEEONSt16remove_referenceIT_E4typeEOS3_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt4moveIRSaIiEEONSt16remove_referenceIT_E4typeEOS3_
_ZSt4moveIRSaIiEEONSt16remove_referenceIT_E4typeEOS3_:
.LFB4881:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZStltIiSaIiEEbRKSt6vectorIT_T0_ES6_,"x"
	.linkonce discard
	.globl	_ZStltIiSaIiEEbRKSt6vectorIT_T0_ES6_
	.def	_ZStltIiSaIiEEbRKSt6vectorIT_T0_ES6_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZStltIiSaIiEEbRKSt6vectorIT_T0_ES6_
_ZStltIiSaIiEEbRKSt6vectorIT_T0_ES6_:
.LFB4884:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rdi
	.seh_pushreg	%rdi
	pushq	%rsi
	.seh_pushreg	%rsi
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movq	-40(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE3endEv
	movq	%rax, %rdi
	movq	-40(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt6vectorIiSaIiEE5beginEv
	movq	%rax, %rsi
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE3endEv
	movq	%rax, %rbx
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE5beginEv
	movq	%rdi, %r9
	movq	%rsi, %r8
	movq	%rbx, %rdx
	movq	%rax, %rcx
	call	_ZSt23lexicographical_compareIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEES7_EbT_S8_T0_S9_
	addq	$40, %rsp
	popq	%rbx
	popq	%rsi
	popq	%rdi
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE
	.def	_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE
_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE:
.LFB4885:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$72, %rsp
	.seh_stackalloc	72
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -32(%rbp)
	movq	%rdx, -24(%rbp)
	movb	%r8b, -16(%rbp)
	movq	-32(%rbp), %rdx
	leaq	-65(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt12_Vector_baseIiSaIiEE13get_allocatorEv
	leaq	-65(%rbp), %rdx
	leaq	-96(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEEC1ERKS0_
	leaq	-65(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSaIiED1Ev
	movq	-32(%rbp), %rax
	leaq	-96(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_
	movq	-24(%rbp), %rdx
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rbx
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rbx, %rdx
	movq	%rax, %rcx
	call	_ZSt15__alloc_on_moveISaIiEEvRT_S2_
	leaq	-96(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt6vectorIiSaIiEED1Ev
	nop
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4885:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4885-.LLSDACSB4885
.LLSDACSB4885:
.LLSDACSE4885:
	.section	.text$_ZNSt6vectorIiSaIiEE14_M_move_assignEOS1_St17integral_constantIbLb1EE,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_
	.def	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_
_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_:
.LFB4888:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv
	.def	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv
_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEE4baseEv:
.LFB4889:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEmiEx,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEmiEx
	.def	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEmiEx;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEmiEx
_ZNK9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEmiEx:
.LFB4890:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	24(%rbp), %rdx
	salq	$2, %rdx
	negq	%rdx
	addq	%rdx, %rax
	movq	%rax, -8(%rbp)
	leaq	-8(%rbp), %rdx
	leaq	-16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPiSt6vectorIiSaIiEEEC1ERKS1_
	movq	-16(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_
	.def	_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_
_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_:
.LFB4891:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_
	.def	_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_
_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_:
.LFB4892:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
	movq	%rax, %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZNSt16allocator_traitsISaIiEE9constructIiJRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_
	.def	_ZNSt16allocator_traitsISaIiEE9constructIiJRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_;	.scl	2;	.type	32;	.endef
	.set	_ZNSt16allocator_traitsISaIiEE9constructIiJRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_,_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_
	.section .rdata,"dr"
.LC4:
	.ascii "vector::_M_emplace_back_aux\0"
	.section	.text$_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_
	.def	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_
_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_:
.LFB4893:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$72, %rsp
	.seh_stackalloc	72
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -32(%rbp)
	movq	%rdx, -24(%rbp)
	leaq	.LC4(%rip), %r8
	movl	$1, %edx
	movq	-32(%rbp), %rcx
.LEHB24:
	call	_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc
	movq	%rax, -80(%rbp)
	movq	-32(%rbp), %rax
	movq	-80(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy
.LEHE24:
	movq	%rax, -88(%rbp)
	movq	-88(%rbp), %rax
	movq	%rax, -72(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
	movq	%rax, %rbx
	movq	-32(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	leaq	0(,%rax,4), %rdx
	movq	-88(%rbp), %rax
	addq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	%rbx, %r8
	movq	%rax, %rcx
.LEHB25:
	call	_ZNSt16allocator_traitsISaIiEE9constructIiIRKiEEEDTcl12_S_constructfp_fp0_spcl7forwardIT0_Efp1_EEERS0_PT_DpOS5_
	movq	$0, -72(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %r8
	movq	-32(%rbp), %rax
	movq	8(%rax), %rdx
	movq	-32(%rbp), %rax
	movq	(%rax), %rax
	movq	-88(%rbp), %rcx
	movq	%r8, %r9
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_
.LEHE25:
	movq	%rax, -72(%rbp)
	addq	$4, -72(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	-32(%rbp), %rax
	movq	8(%rax), %rdx
	movq	-32(%rbp), %rax
	movq	(%rax), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB26:
	call	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
	movq	-32(%rbp), %rax
	movq	16(%rax), %rax
	movq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	movq	%rax, %rcx
	movq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movq	-32(%rbp), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
.LEHE26:
	movq	-32(%rbp), %rax
	movq	-88(%rbp), %rdx
	movq	%rdx, (%rax)
	movq	-32(%rbp), %rax
	movq	-72(%rbp), %rdx
	movq	%rdx, 8(%rax)
	movq	-80(%rbp), %rax
	leaq	0(,%rax,4), %rdx
	movq	-88(%rbp), %rax
	addq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	%rdx, 16(%rax)
	jmp	.L170
.L169:
	movq	%rax, %rbx
	call	__cxa_end_catch
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB27:
	call	_Unwind_Resume
.LEHE27:
.L168:
	movq	%rax, %rcx
	call	__cxa_begin_catch
	cmpq	$0, -72(%rbp)
	jne	.L166
	movq	-32(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	leaq	0(,%rax,4), %rdx
	movq	-88(%rbp), %rax
	addq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
.LEHB28:
	call	_ZNSt16allocator_traitsISaIiEE7destroyIiEEvRS0_PT_
	jmp	.L167
.L166:
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	-72(%rbp), %rdx
	movq	-88(%rbp), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
.L167:
	movq	-32(%rbp), %rax
	movq	-80(%rbp), %rcx
	movq	-88(%rbp), %rdx
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
	call	__cxa_rethrow
.LEHE28:
	nop
.L170:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
	.align 4
.LLSDA4893:
	.byte	0xff
	.byte	0x9b
	.uleb128 .LLSDATT4893-.LLSDATTD4893
.LLSDATTD4893:
	.byte	0x1
	.uleb128 .LLSDACSE4893-.LLSDACSB4893
.LLSDACSB4893:
	.uleb128 .LEHB24-.LFB4893
	.uleb128 .LEHE24-.LEHB24
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB25-.LFB4893
	.uleb128 .LEHE25-.LEHB25
	.uleb128 .L168-.LFB4893
	.uleb128 0x1
	.uleb128 .LEHB26-.LFB4893
	.uleb128 .LEHE26-.LEHB26
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB27-.LFB4893
	.uleb128 .LEHE27-.LEHB27
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB28-.LFB4893
	.uleb128 .LEHE28-.LEHB28
	.uleb128 .L169-.LFB4893
	.uleb128 0
.LLSDACSE4893:
	.byte	0x1
	.byte	0
	.align 4
	.long	0

.LLSDATT4893:
	.section	.text$_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_,"x"
	.linkonce discard
	.seh_endproc
	.weak	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIJRKiEEEvDpOT_
	.def	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIJRKiEEEvDpOT_;	.scl	2;	.type	32;	.endef
	.set	_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIJRKiEEEvDpOT_,_ZNSt6vectorIiSaIiEE19_M_emplace_back_auxIIRKiEEEvDpOT_
	.section .rdata,"dr"
.LC5:
	.ascii "vector::_M_default_append\0"
	.section	.text$_ZNSt6vectorIiSaIiEE17_M_default_appendEy,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE17_M_default_appendEy
	.def	_ZNSt6vectorIiSaIiEE17_M_default_appendEy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE17_M_default_appendEy
_ZNSt6vectorIiSaIiEE17_M_default_appendEy:
.LFB4894:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$72, %rsp
	.seh_stackalloc	72
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -32(%rbp)
	movq	%rdx, -24(%rbp)
	cmpq	$0, -24(%rbp)
	je	.L179
	movq	-32(%rbp), %rax
	movq	16(%rax), %rax
	movq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	8(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	cmpq	-24(%rbp), %rax
	jb	.L173
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	-32(%rbp), %rax
	movq	8(%rax), %rax
	movq	-24(%rbp), %rdx
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB29:
	call	_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E
	movq	-32(%rbp), %rax
	movq	8(%rax), %rax
	movq	-24(%rbp), %rdx
	salq	$2, %rdx
	addq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	%rdx, 8(%rax)
	jmp	.L179
.L173:
	movq	-24(%rbp), %rax
	leaq	.LC5(%rip), %r8
	movq	%rax, %rdx
	movq	-32(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc
	movq	%rax, -80(%rbp)
	movq	-32(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movq	%rax, -88(%rbp)
	movq	-32(%rbp), %rax
	movq	-80(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy
.LEHE29:
	movq	%rax, -96(%rbp)
	movq	-96(%rbp), %rax
	movq	%rax, -72(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %r8
	movq	-32(%rbp), %rax
	movq	8(%rax), %rdx
	movq	-32(%rbp), %rax
	movq	(%rax), %rax
	movq	-96(%rbp), %rcx
	movq	%r8, %r9
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB30:
	call	_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_
	movq	%rax, -72(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	-24(%rbp), %rdx
	movq	-72(%rbp), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E
.LEHE30:
	movq	-24(%rbp), %rax
	salq	$2, %rax
	addq	%rax, -72(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	-32(%rbp), %rax
	movq	8(%rax), %rdx
	movq	-32(%rbp), %rax
	movq	(%rax), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB31:
	call	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
	movq	-32(%rbp), %rax
	movq	16(%rax), %rax
	movq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	movq	%rax, %rcx
	movq	-32(%rbp), %rax
	movq	(%rax), %rdx
	movq	-32(%rbp), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
.LEHE31:
	movq	-32(%rbp), %rax
	movq	-96(%rbp), %rdx
	movq	%rdx, (%rax)
	movq	-32(%rbp), %rax
	movq	-72(%rbp), %rdx
	movq	%rdx, 8(%rax)
	movq	-80(%rbp), %rax
	leaq	0(,%rax,4), %rdx
	movq	-96(%rbp), %rax
	addq	%rax, %rdx
	movq	-32(%rbp), %rax
	movq	%rdx, 16(%rax)
	jmp	.L179
.L178:
	movq	%rax, %rbx
	call	__cxa_end_catch
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB32:
	call	_Unwind_Resume
.LEHE32:
.L177:
	movq	%rax, %rcx
	call	__cxa_begin_catch
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	-72(%rbp), %rdx
	movq	-96(%rbp), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
.LEHB33:
	call	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
	movq	-32(%rbp), %rax
	movq	-80(%rbp), %rcx
	movq	-96(%rbp), %rdx
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
	call	__cxa_rethrow
.LEHE33:
	nop
.L179:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
	.align 4
.LLSDA4894:
	.byte	0xff
	.byte	0x9b
	.uleb128 .LLSDATT4894-.LLSDATTD4894
.LLSDATTD4894:
	.byte	0x1
	.uleb128 .LLSDACSE4894-.LLSDACSB4894
.LLSDACSB4894:
	.uleb128 .LEHB29-.LFB4894
	.uleb128 .LEHE29-.LEHB29
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB30-.LFB4894
	.uleb128 .LEHE30-.LEHB30
	.uleb128 .L177-.LFB4894
	.uleb128 0x1
	.uleb128 .LEHB31-.LFB4894
	.uleb128 .LEHE31-.LEHB31
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB32-.LFB4894
	.uleb128 .LEHE32-.LEHB32
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB33-.LFB4894
	.uleb128 .LEHE33-.LEHB33
	.uleb128 .L178-.LFB4894
	.uleb128 0
.LLSDACSE4894:
	.byte	0x1
	.byte	0
	.align 4
	.long	0

.LLSDATT4894:
	.section	.text$_ZNSt6vectorIiSaIiEE17_M_default_appendEy,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi
	.def	_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi
_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi:
.LFB4895:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	movq	16(%rbp), %rax
	movq	8(%rax), %rdx
	movq	24(%rbp), %rax
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movq	%rdx, 8(%rax)
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
.LLSDA4895:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE4895-.LLSDACSB4895
.LLSDACSB4895:
.LLSDACSE4895:
	.section	.text$_ZNSt6vectorIiSaIiEE15_M_erase_at_endEPi,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiEC2Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiEC2Ev
	.def	_ZN9__gnu_cxx13new_allocatorIiEC2Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiEC2Ev
_ZN9__gnu_cxx13new_allocatorIiEC2Ev:
.LFB4897:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiED2Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiED2Ev
	.def	_ZN9__gnu_cxx13new_allocatorIiED2Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiED2Ev
_ZN9__gnu_cxx13new_allocatorIiED2Ev:
.LFB4900:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_
	.def	_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_
_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_:
.LFB4903:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE22_M_initialize_dispatchIPiEEvT_S4_St12__false_type,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE22_M_initialize_dispatchIPiEEvT_S4_St12__false_type
	.def	_ZNSt6vectorIiSaIiEE22_M_initialize_dispatchIPiEEvT_S4_St12__false_type;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE22_M_initialize_dispatchIPiEEvT_S4_St12__false_type
_ZNSt6vectorIiSaIiEE22_M_initialize_dispatchIPiEEvT_S4_St12__false_type:
.LFB4905:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movb	%r9b, 40(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movl	%r10d, %r9d
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt6vectorIiSaIiEE19_M_range_initializeIPiEEvT_S4_St20forward_iterator_tag
	nop
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1Ev,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1Ev
	.def	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1Ev;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1Ev
_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1Ev:
.LFB4943:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNSaIiEC2Ev
	movq	16(%rbp), %rax
	movq	$0, (%rax)
	movq	16(%rbp), %rax
	movq	$0, 8(%rax)
	movq	16(%rbp), %rax
	movq	$0, 16(%rax)
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
	.def	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy
_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPiy:
.LFB4944:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	cmpq	$0, 24(%rbp)
	je	.L187
	movq	16(%rbp), %rax
	movq	32(%rbp), %rcx
	movq	24(%rbp), %rdx
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE10deallocateERS0_Piy
	nop
.L187:
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt8_DestroyIPiEvT_S1_,"x"
	.linkonce discard
	.globl	_ZSt8_DestroyIPiEvT_S1_
	.def	_ZSt8_DestroyIPiEvT_S1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt8_DestroyIPiEvT_S1_
_ZSt8_DestroyIPiEvT_S1_:
.LFB4945:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE37select_on_container_copy_constructionERKS0_,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE37select_on_container_copy_constructionERKS0_
	.def	_ZNSt16allocator_traitsISaIiEE37select_on_container_copy_constructionERKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE37select_on_container_copy_constructionERKS0_
_ZNSt16allocator_traitsISaIiEE37select_on_container_copy_constructionERKS0_:
.LFB4946:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movl	$0, %r8d
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE9_S_selectIKS0_vEET_RS4_z
	movq	16(%rbp), %rax
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSaIiEC2ERKS_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSaIiEC2ERKS_
	.def	_ZNSaIiEC2ERKS_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSaIiEC2ERKS_
_ZNSaIiEC2ERKS_:
.LFB4948:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSaIiEC1ERKS_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSaIiEC1ERKS_
	.def	_ZNSaIiEC1ERKS_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSaIiEC1ERKS_
_ZNSaIiEC1ERKS_:
.LFB4949:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_
	.def	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_
_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_:
.LFB4952:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSaIiEC2ERKS_
	movq	16(%rbp), %rax
	movq	$0, (%rax)
	movq	16(%rbp), %rax
	movq	$0, 8(%rax)
	movq	16(%rbp), %rax
	movq	$0, 16(%rax)
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE17_M_create_storageEy,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE17_M_create_storageEy
	.def	_ZNSt12_Vector_baseIiSaIiEE17_M_create_storageEy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE17_M_create_storageEy
_ZNSt12_Vector_baseIiSaIiEE17_M_create_storageEy:
.LFB4953:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy
	movq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	movq	16(%rbp), %rax
	movq	(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, 8(%rax)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	24(%rbp), %rdx
	salq	$2, %rdx
	addq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	%rdx, 16(%rax)
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_
	.def	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_
_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEC1ERKS2_:
.LFB4956:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt18uninitialized_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiET0_T_SA_S9_,"x"
	.linkonce discard
	.globl	_ZSt18uninitialized_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiET0_T_SA_S9_
	.def	_ZSt18uninitialized_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiET0_T_SA_S9_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt18uninitialized_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiET0_T_SA_S9_
_ZSt18uninitialized_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiET0_T_SA_S9_:
.LFB4957:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movb	$0, -1(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiEET0_T_SC_SB_
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_
	.def	_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_
_ZNSt12_Vector_baseIiSaIiEE12_Vector_impl12_M_swap_dataERS2_:
.LFB4961:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rdx
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt4swapIPiEvRT_S2_
	movq	24(%rbp), %rax
	leaq	8(%rax), %rdx
	movq	16(%rbp), %rax
	addq	$8, %rax
	movq	%rax, %rcx
	call	_ZSt4swapIPiEvRT_S2_
	movq	24(%rbp), %rax
	leaq	16(%rax), %rdx
	movq	16(%rbp), %rax
	addq	$16, %rax
	movq	%rax, %rcx
	call	_ZSt4swapIPiEvRT_S2_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt23lexicographical_compareIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEES7_EbT_S8_T0_S9_,"x"
	.linkonce discard
	.globl	_ZSt23lexicographical_compareIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEES7_EbT_S8_T0_S9_
	.def	_ZSt23lexicographical_compareIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEES7_EbT_S8_T0_S9_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt23lexicographical_compareIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEES7_EbT_S8_T0_S9_
_ZSt23lexicographical_compareIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEES7_EbT_S8_T0_S9_:
.LFB4962:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rdi
	.seh_pushreg	%rdi
	pushq	%rsi
	.seh_pushreg	%rsi
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movq	%r8, -32(%rbp)
	movq	%r9, -24(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_
	movq	%rax, %rdi
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_
	movq	%rax, %rsi
	movq	-40(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_
	movq	%rax, %rbx
	movq	-48(%rbp), %rcx
	call	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_
	movq	%rdi, %r9
	movq	%rsi, %r8
	movq	%rbx, %rdx
	movq	%rax, %rcx
	call	_ZSt29__lexicographical_compare_auxIPKiS1_EbT_S2_T0_S3_
	addq	$40, %rsp
	popq	%rbx
	popq	%rsi
	popq	%rdi
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNKSt12_Vector_baseIiSaIiEE13get_allocatorEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt12_Vector_baseIiSaIiEE13get_allocatorEv
	.def	_ZNKSt12_Vector_baseIiSaIiEE13get_allocatorEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt12_Vector_baseIiSaIiEE13get_allocatorEv
_ZNKSt12_Vector_baseIiSaIiEE13get_allocatorEv:
.LFB4963:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSaIiEC1ERKS_
	movq	16(%rbp), %rax
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEEC1ERKS0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEEC1ERKS0_
	.def	_ZNSt6vectorIiSaIiEEC1ERKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEEC1ERKS0_
_ZNSt6vectorIiSaIiEEC1ERKS0_:
.LFB4966:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEEC2ERKS0_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt15__alloc_on_moveISaIiEEvRT_S2_,"x"
	.linkonce discard
	.globl	_ZSt15__alloc_on_moveISaIiEEvRT_S2_
	.def	_ZSt15__alloc_on_moveISaIiEEvRT_S2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt15__alloc_on_moveISaIiEEvRT_S2_
_ZSt15__alloc_on_moveISaIiEEvRT_S2_:
.LFB4967:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt18__do_alloc_on_moveISaIiEEvRT_S2_St17integral_constantIbLb1EE
	nop
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_
	.def	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_
_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_:
.LFB4968:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiE7destroyIiEEvPT_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IJNS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_
	.def	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IJNS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_;	.scl	2;	.type	32;	.endef
	.set	_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IJNS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_,_ZNSt16allocator_traitsISaIiEE10_S_destroyIiEENSt9enable_ifIXsrSt6__and_IINS1_16__destroy_helperIT_E4typeEEE5valueEvE4typeERS0_PS6_
	.section	.text$_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_
	.def	_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_
_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_:
.LFB4969:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
	movq	%rax, %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZNSt16allocator_traitsISaIiEE12_S_constructIiJRKiEEENSt9enable_ifIXsrSt6__and_IJNS1_18__construct_helperIT_JDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_
	.def	_ZNSt16allocator_traitsISaIiEE12_S_constructIiJRKiEEENSt9enable_ifIXsrSt6__and_IJNS1_18__construct_helperIT_JDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_;	.scl	2;	.type	32;	.endef
	.set	_ZNSt16allocator_traitsISaIiEE12_S_constructIiJRKiEEENSt9enable_ifIXsrSt6__and_IJNS1_18__construct_helperIT_JDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_,_ZNSt16allocator_traitsISaIiEE12_S_constructIiIRKiEEENSt9enable_ifIXsrSt6__and_IINS1_18__construct_helperIT_IDpT0_EE4typeEEE5valueEvE4typeERS0_PS8_DpOS9_
	.section	.text$_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc
	.def	_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc
_ZNKSt6vectorIiSaIiEE12_M_check_lenEyPKc:
.LFB4970:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movq	%r8, -32(%rbp)
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE8max_sizeEv
	movq	%rax, %rbx
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	subq	%rax, %rbx
	movq	%rbx, %rdx
	movq	-40(%rbp), %rax
	cmpq	%rax, %rdx
	setb	%al
	testb	%al, %al
	je	.L209
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt20__throw_length_errorPKc
.L209:
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movq	%rax, %rbx
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	movq	%rax, -96(%rbp)
	leaq	-40(%rbp), %rdx
	leaq	-96(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt3maxIyERKT_S2_S2_
	movq	(%rax), %rax
	addq	%rbx, %rax
	movq	%rax, -88(%rbp)
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE4sizeEv
	cmpq	-88(%rbp), %rax
	ja	.L210
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE8max_sizeEv
	cmpq	-88(%rbp), %rax
	jae	.L211
.L210:
	movq	-48(%rbp), %rcx
	call	_ZNKSt6vectorIiSaIiEE8max_sizeEv
	jmp	.L213
.L211:
	movq	-88(%rbp), %rax
.L213:
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy
	.def	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy
_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy:
.LFB4971:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	cmpq	$0, 24(%rbp)
	je	.L215
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE8allocateERS0_y
	jmp	.L216
.L215:
	movl	$0, %eax
.L216:
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_,"x"
	.linkonce discard
	.globl	_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_
	.def	_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_
_ZSt34__uninitialized_move_if_noexcept_aIPiS0_SaIiEET0_T_S3_S2_RT1_:
.LFB4972:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	%r8, -48(%rbp)
	movq	%r9, -40(%rbp)
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_
	movq	%rax, %rbx
	movq	-64(%rbp), %rcx
	call	_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_
	movq	%rax, %rcx
	movq	-40(%rbp), %rdx
	movq	-48(%rbp), %rax
	movq	%rdx, %r9
	movq	%rax, %r8
	movq	%rbx, %rdx
	call	_ZSt22__uninitialized_copy_aISt13move_iteratorIPiES1_iET0_T_S4_S3_RSaIT1_E
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E,"x"
	.linkonce discard
	.globl	_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E
	.def	_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E
_ZSt27__uninitialized_default_n_aIPiyiEvT_T0_RSaIT1_E:
.LFB4973:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt25__uninitialized_default_nIPiyEvT_T0_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt6vectorIiSaIiEE19_M_range_initializeIPiEEvT_S4_St20forward_iterator_tag,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt6vectorIiSaIiEE19_M_range_initializeIPiEEvT_S4_St20forward_iterator_tag
	.def	_ZNSt6vectorIiSaIiEE19_M_range_initializeIPiEEvT_S4_St20forward_iterator_tag;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt6vectorIiSaIiEE19_M_range_initializeIPiEEvT_S4_St20forward_iterator_tag
_ZNSt6vectorIiSaIiEE19_M_range_initializeIPiEEvT_S4_St20forward_iterator_tag:
.LFB4974:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movb	%r9b, 40(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt8distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_
	movq	%rax, -8(%rbp)
	movq	16(%rbp), %rax
	movq	-8(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEy
	movq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	-8(%rbp), %rdx
	salq	$2, %rdx
	addq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	%rdx, 16(%rax)
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %r8
	movq	16(%rbp), %rax
	movq	(%rax), %rcx
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%r8, %r9
	movq	%rcx, %r8
	movq	%rax, %rcx
	call	_ZSt22__uninitialized_copy_aIPiS0_iET0_T_S2_S1_RSaIT1_E
	movq	%rax, %rdx
	movq	16(%rbp), %rax
	movq	%rdx, 8(%rax)
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE10deallocateERS0_Piy,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE10deallocateERS0_Piy
	.def	_ZNSt16allocator_traitsISaIiEE10deallocateERS0_Piy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE10deallocateERS0_Piy
_ZNSt16allocator_traitsISaIiEE10deallocateERS0_Piy:
.LFB4985:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPiy
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_,"x"
	.linkonce discard
	.globl	_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_
	.def	_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_
_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_:
.LFB4986:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE9_S_selectIKS0_vEET_RS4_z,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE9_S_selectIKS0_vEET_RS4_z
	.def	_ZNSt16allocator_traitsISaIiEE9_S_selectIKS0_vEET_RS4_z;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE9_S_selectIKS0_vEET_RS4_z
_ZNSt16allocator_traitsISaIiEE9_S_selectIKS0_vEET_RS4_z:
.LFB4987:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSaIiEC1ERKS_
	movq	16(%rbp), %rax
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_
	.def	_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_
_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_:
.LFB4989:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiEET0_T_SC_SB_,"x"
	.linkonce discard
	.globl	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiEET0_T_SC_SB_
	.def	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiEET0_T_SC_SB_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiEET0_T_SC_SB_
_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEPiEET0_T_SC_SB_:
.LFB4991:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movq	%r8, -32(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, -88(%rbp)
	jmp	.L228
.L229:
	leaq	-48(%rbp), %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEdeEv
	movq	%rax, %rbx
	movq	-88(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt11__addressofIiEPT_RS0_
	movq	%rbx, %rdx
	movq	%rax, %rcx
	call	_ZSt10_ConstructIiIRKiEEvPT_DpOT0_
	leaq	-48(%rbp), %rcx
	call	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEppEv
	addq	$4, -88(%rbp)
.L228:
	leaq	-40(%rbp), %rax
	movq	%rax, %rdx
	leaq	-48(%rbp), %rcx
	call	_ZN9__gnu_cxxneIPKiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESB_
	testb	%al, %al
	jne	.L229
	movq	-88(%rbp), %rax
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_,"x"
	.linkonce discard
	.globl	_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_
	.def	_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_
_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_:
.LFB4993:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt4swapIPiEvRT_S2_,"x"
	.linkonce discard
	.globl	_ZSt4swapIPiEvRT_S2_
	.def	_ZSt4swapIPiEvRT_S2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt4swapIPiEvRT_S2_
_ZSt4swapIPiEvRT_S2_:
.LFB4992:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rcx
	call	_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_
	movq	(%rax), %rax
	movq	%rax, -8(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_
	movq	(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	leaq	-8(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt4moveIRPiEONSt16remove_referenceIT_E4typeEOS3_
	movq	(%rax), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, (%rax)
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_,"x"
	.linkonce discard
	.globl	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_
	.def	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_
_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEEENSt11_Niter_baseIT_E13iterator_typeES9_:
.LFB4994:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEELb1EE7_S_baseES7_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt29__lexicographical_compare_auxIPKiS1_EbT_S2_T0_S3_,"x"
	.linkonce discard
	.globl	_ZSt29__lexicographical_compare_auxIPKiS1_EbT_S2_T0_S3_
	.def	_ZSt29__lexicographical_compare_auxIPKiS1_EbT_S2_T0_S3_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt29__lexicographical_compare_auxIPKiS1_EbT_S2_T0_S3_
_ZSt29__lexicographical_compare_auxIPKiS1_EbT_S2_T0_S3_:
.LFB4995:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movb	$0, -1(%rbp)
	movq	40(%rbp), %rcx
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rcx, %r9
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt25__lexicographical_compareILb0EE4__lcIPKiS3_EEbT_S4_T0_S5_
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt18__do_alloc_on_moveISaIiEEvRT_S2_St17integral_constantIbLb1EE,"x"
	.linkonce discard
	.globl	_ZSt18__do_alloc_on_moveISaIiEEvRT_S2_St17integral_constantIbLb1EE
	.def	_ZSt18__do_alloc_on_moveISaIiEEvRT_S2_St17integral_constantIbLb1EE;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt18__do_alloc_on_moveISaIiEEvRT_S2_St17integral_constantIbLb1EE
_ZSt18__do_alloc_on_moveISaIiEEvRT_S2_St17integral_constantIbLb1EE:
.LFB4996:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movb	%r8b, 32(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt4moveIRSaIiEEONSt16remove_referenceIT_E4typeEOS3_
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiE7destroyIiEEvPT_,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiE7destroyIiEEvPT_
	.def	_ZN9__gnu_cxx13new_allocatorIiE7destroyIiEEvPT_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiE7destroyIiEEvPT_
_ZN9__gnu_cxx13new_allocatorIiE7destroyIiEEvPT_:
.LFB4997:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_
	.def	_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_
_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_:
.LFB4998:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	%r8, -48(%rbp)
	movq	-48(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
	movl	(%rax), %ebx
	movq	-56(%rbp), %rax
	movq	%rax, %rdx
	movl	$4, %ecx
	call	_ZnwyPv
	testq	%rax, %rax
	je	.L240
	movl	%ebx, (%rax)
.L240:
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZN9__gnu_cxx13new_allocatorIiE9constructIiJRKiEEEvPT_DpOT0_
	.def	_ZN9__gnu_cxx13new_allocatorIiE9constructIiJRKiEEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.set	_ZN9__gnu_cxx13new_allocatorIiE9constructIiJRKiEEEvPT_DpOT0_,_ZN9__gnu_cxx13new_allocatorIiE9constructIiIRKiEEEvPT_DpOT0_
	.section	.text$_ZNKSt6vectorIiSaIiEE8max_sizeEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt6vectorIiSaIiEE8max_sizeEv
	.def	_ZNKSt6vectorIiSaIiEE8max_sizeEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt6vectorIiSaIiEE8max_sizeEv
_ZNKSt6vectorIiSaIiEE8max_sizeEv:
.LFB4999:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv
	movq	%rax, %rcx
	call	_ZNSt16allocator_traitsISaIiEE8max_sizeERKS0_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt3maxIyERKT_S2_S2_,"x"
	.linkonce discard
	.globl	_ZSt3maxIyERKT_S2_S2_
	.def	_ZSt3maxIyERKT_S2_S2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt3maxIyERKT_S2_S2_
_ZSt3maxIyERKT_S2_S2_:
.LFB5000:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rdx
	movq	24(%rbp), %rax
	movq	(%rax), %rax
	cmpq	%rax, %rdx
	jae	.L246
	movq	24(%rbp), %rax
	jmp	.L247
.L246:
	movq	16(%rbp), %rax
.L247:
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE8allocateERS0_y,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE8allocateERS0_y
	.def	_ZNSt16allocator_traitsISaIiEE8allocateERS0_y;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE8allocateERS0_y
_ZNSt16allocator_traitsISaIiEE8allocateERS0_y:
.LFB5001:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movl	$0, %r8d
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZN9__gnu_cxx13new_allocatorIiE8allocateEyPKv
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_,"x"
	.linkonce discard
	.globl	_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_
	.def	_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_
_ZSt32__make_move_if_noexcept_iteratorIPiSt13move_iteratorIS0_EET0_T_:
.LFB5002:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	leaq	-16(%rbp), %rax
	movq	16(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNSt13move_iteratorIPiEC1ES0_
	movq	-16(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt22__uninitialized_copy_aISt13move_iteratorIPiES1_iET0_T_S4_S3_RSaIT1_E,"x"
	.linkonce discard
	.globl	_ZSt22__uninitialized_copy_aISt13move_iteratorIPiES1_iET0_T_S4_S3_RSaIT1_E
	.def	_ZSt22__uninitialized_copy_aISt13move_iteratorIPiES1_iET0_T_S4_S3_RSaIT1_E;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt22__uninitialized_copy_aISt13move_iteratorIPiES1_iET0_T_S4_S3_RSaIT1_E
_ZSt22__uninitialized_copy_aISt13move_iteratorIPiES1_iET0_T_S4_S3_RSaIT1_E:
.LFB5003:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt18uninitialized_copyISt13move_iteratorIPiES1_ET0_T_S4_S3_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt25__uninitialized_default_nIPiyEvT_T0_,"x"
	.linkonce discard
	.globl	_ZSt25__uninitialized_default_nIPiyEvT_T0_
	.def	_ZSt25__uninitialized_default_nIPiyEvT_T0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt25__uninitialized_default_nIPiyEvT_T0_
_ZSt25__uninitialized_default_nIPiyEvT_T0_:
.LFB5004:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movb	$1, -1(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt27__uninitialized_default_n_1ILb1EE18__uninit_default_nIPiyEEvT_T0_
	nop
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt8distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_,"x"
	.linkonce discard
	.globl	_ZSt8distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_
	.def	_ZSt8distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt8distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_
_ZSt8distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_:
.LFB5005:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	leaq	-48(%rbp), %rcx
	call	_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_
	movq	-48(%rbp), %rax
	movq	-40(%rbp), %rdx
	movl	%ebx, %r8d
	movq	%rax, %rcx
	call	_ZSt10__distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt22__uninitialized_copy_aIPiS0_iET0_T_S2_S1_RSaIT1_E,"x"
	.linkonce discard
	.globl	_ZSt22__uninitialized_copy_aIPiS0_iET0_T_S2_S1_RSaIT1_E
	.def	_ZSt22__uninitialized_copy_aIPiS0_iET0_T_S2_S1_RSaIT1_E;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt22__uninitialized_copy_aIPiS0_iET0_T_S2_S1_RSaIT1_E
_ZSt22__uninitialized_copy_aIPiS0_iET0_T_S2_S1_RSaIT1_E:
.LFB5006:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt18uninitialized_copyIPiS0_ET0_T_S2_S1_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPiy,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPiy
	.def	_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPiy;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPiy
_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPiy:
.LFB5013:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rcx
	call	_ZdlPv
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxxneIPKiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESB_,"x"
	.linkonce discard
	.globl	_ZN9__gnu_cxxneIPKiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESB_
	.def	_ZN9__gnu_cxxneIPKiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESB_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxxneIPKiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESB_
_ZN9__gnu_cxxneIPKiSt6vectorIiSaIiEEEEbRKNS_17__normal_iteratorIT_T0_EESB_:
.LFB5014:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-64(%rbp), %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv
	movq	(%rax), %rbx
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv
	movq	(%rax), %rax
	cmpq	%rax, %rbx
	setne	%al
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEppEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEppEv
	.def	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEppEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEppEv
_ZN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEppEv:
.LFB5015:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	leaq	4(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt11__addressofIiEPT_RS0_,"x"
	.linkonce discard
	.globl	_ZSt11__addressofIiEPT_RS0_
	.def	_ZSt11__addressofIiEPT_RS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt11__addressofIiEPT_RS0_
_ZSt11__addressofIiEPT_RS0_:
.LFB5016:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEdeEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEdeEv
	.def	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEdeEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEdeEv
_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEdeEv:
.LFB5017:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt10_ConstructIiIRKiEEvPT_DpOT0_,"x"
	.linkonce discard
	.globl	_ZSt10_ConstructIiIRKiEEvPT_DpOT0_
	.def	_ZSt10_ConstructIiIRKiEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt10_ConstructIiIRKiEEvPT_DpOT0_
_ZSt10_ConstructIiIRKiEEvPT_DpOT0_:
.LFB5018:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIRKiEOT_RNSt16remove_referenceIS2_E4typeE
	movl	(%rax), %ebx
	movq	-64(%rbp), %rax
	movq	%rax, %rdx
	movl	$4, %ecx
	call	_ZnwyPv
	testq	%rax, %rax
	je	.L268
	movl	%ebx, (%rax)
.L268:
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZSt10_ConstructIiJRKiEEvPT_DpOT0_
	.def	_ZSt10_ConstructIiJRKiEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.set	_ZSt10_ConstructIiJRKiEEvPT_DpOT0_,_ZSt10_ConstructIiIRKiEEvPT_DpOT0_
	.section	.text$_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEELb1EE7_S_baseES7_,"x"
	.linkonce discard
	.globl	_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEELb1EE7_S_baseES7_
	.def	_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEELb1EE7_S_baseES7_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEELb1EE7_S_baseES7_
_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEEELb1EE7_S_baseES7_:
.LFB5019:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	leaq	16(%rbp), %rcx
	call	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv
	movq	(%rax), %rax
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt25__lexicographical_compareILb0EE4__lcIPKiS3_EEbT_S4_T0_S5_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt25__lexicographical_compareILb0EE4__lcIPKiS3_EEbT_S4_T0_S5_
	.def	_ZNSt25__lexicographical_compareILb0EE4__lcIPKiS3_EEbT_S4_T0_S5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt25__lexicographical_compareILb0EE4__lcIPKiS3_EEbT_S4_T0_S5_
_ZNSt25__lexicographical_compareILb0EE4__lcIPKiS3_EEbT_S4_T0_S5_:
.LFB5020:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$72, %rsp
	.seh_stackalloc	72
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -32(%rbp)
	movq	%rdx, -24(%rbp)
	movq	%r8, -16(%rbp)
	movq	%r9, -8(%rbp)
	call	_ZN9__gnu_cxx5__ops16__iter_less_iterEv
	movq	-8(%rbp), %rcx
	movq	-16(%rbp), %rdx
	movq	-24(%rbp), %rax
	movb	%bl, 32(%rsp)
	movq	%rcx, %r9
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	-32(%rbp), %rcx
	call	_ZSt30__lexicographical_compare_implIPKiS1_N9__gnu_cxx5__ops15_Iter_less_iterEEbT_S5_T0_S6_T1_
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE8max_sizeERKS0_,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE8max_sizeERKS0_
	.def	_ZNSt16allocator_traitsISaIiEE8max_sizeERKS0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE8max_sizeERKS0_
_ZNSt16allocator_traitsISaIiEE8max_sizeERKS0_:
.LFB5021:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movl	$0, %edx
	movq	16(%rbp), %rcx
	call	_ZNSt16allocator_traitsISaIiEE11_S_max_sizeIKS0_vEEyRT_i
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZN9__gnu_cxx13new_allocatorIiE8allocateEyPKv,"x"
	.linkonce discard
	.align 2
	.globl	_ZN9__gnu_cxx13new_allocatorIiE8allocateEyPKv
	.def	_ZN9__gnu_cxx13new_allocatorIiE8allocateEyPKv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZN9__gnu_cxx13new_allocatorIiE8allocateEyPKv
_ZN9__gnu_cxx13new_allocatorIiE8allocateEyPKv:
.LFB5022:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv
	cmpq	24(%rbp), %rax
	setb	%al
	testb	%al, %al
	je	.L278
	call	_ZSt17__throw_bad_allocv
.L278:
	movq	24(%rbp), %rax
	salq	$2, %rax
	movq	%rax, %rcx
	call	_Znwy
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt13move_iteratorIPiEC1ES0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt13move_iteratorIPiEC1ES0_
	.def	_ZNSt13move_iteratorIPiEC1ES0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt13move_iteratorIPiEC1ES0_
_ZNSt13move_iteratorIPiEC1ES0_:
.LFB5025:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	16(%rbp), %rax
	movq	24(%rbp), %rdx
	movq	%rdx, (%rax)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt18uninitialized_copyISt13move_iteratorIPiES1_ET0_T_S4_S3_,"x"
	.linkonce discard
	.globl	_ZSt18uninitialized_copyISt13move_iteratorIPiES1_ET0_T_S4_S3_
	.def	_ZSt18uninitialized_copyISt13move_iteratorIPiES1_ET0_T_S4_S3_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt18uninitialized_copyISt13move_iteratorIPiES1_ET0_T_S4_S3_
_ZSt18uninitialized_copyISt13move_iteratorIPiES1_ET0_T_S4_S3_:
.LFB5026:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movb	$0, -1(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt27__uninitialized_default_n_1ILb1EE18__uninit_default_nIPiyEEvT_T0_,"x"
	.linkonce discard
	.globl	_ZNSt27__uninitialized_default_n_1ILb1EE18__uninit_default_nIPiyEEvT_T0_
	.def	_ZNSt27__uninitialized_default_n_1ILb1EE18__uninit_default_nIPiyEEvT_T0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt27__uninitialized_default_n_1ILb1EE18__uninit_default_nIPiyEEvT_T0_
_ZNSt27__uninitialized_default_n_1ILb1EE18__uninit_default_nIPiyEEvT_T0_:
.LFB5027:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movl	$0, -4(%rbp)
	leaq	-4(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSt6fill_nIPiyiET_S1_T0_RKT1_
	nop
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_,"x"
	.linkonce discard
	.globl	_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_
	.def	_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_
_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_:
.LFB5028:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt10__distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag,"x"
	.linkonce discard
	.globl	_ZSt10__distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag
	.def	_ZSt10__distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt10__distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag
_ZSt10__distanceIPiENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag:
.LFB5029:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movb	%r8b, 32(%rbp)
	movq	24(%rbp), %rdx
	movq	16(%rbp), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt18uninitialized_copyIPiS0_ET0_T_S2_S1_,"x"
	.linkonce discard
	.globl	_ZSt18uninitialized_copyIPiS0_ET0_T_S2_S1_
	.def	_ZSt18uninitialized_copyIPiS0_ET0_T_S2_S1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt18uninitialized_copyIPiS0_ET0_T_S2_S1_
_ZSt18uninitialized_copyIPiS0_ET0_T_S2_S1_:
.LFB5030:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movb	$0, -1(%rbp)
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIPiS2_EET0_T_S4_S3_
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv
	.def	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv
_ZNK9__gnu_cxx17__normal_iteratorIPKiSt6vectorIiSaIiEEE4baseEv:
.LFB5041:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt30__lexicographical_compare_implIPKiS1_N9__gnu_cxx5__ops15_Iter_less_iterEEbT_S5_T0_S6_T1_,"x"
	.linkonce discard
	.globl	_ZSt30__lexicographical_compare_implIPKiS1_N9__gnu_cxx5__ops15_Iter_less_iterEEbT_S5_T0_S6_T1_
	.def	_ZSt30__lexicographical_compare_implIPKiS1_N9__gnu_cxx5__ops15_Iter_less_iterEEbT_S5_T0_S6_T1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt30__lexicographical_compare_implIPKiS1_N9__gnu_cxx5__ops15_Iter_less_iterEEbT_S5_T0_S6_T1_
_ZSt30__lexicographical_compare_implIPKiS1_N9__gnu_cxx5__ops15_Iter_less_iterEEbT_S5_T0_S6_T1_:
.LFB5042:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movq	40(%rbp), %rcx
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rcx, %r9
	movq	%rdx, %r8
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E10__newlast1IPKiS4_EET_S5_S5_T0_S6_
	movq	%rax, 24(%rbp)
	jmp	.L293
.L299:
	movq	32(%rbp), %rdx
	leaq	48(%rbp), %rax
	movq	%rdx, %r8
	movq	16(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_
	testb	%al, %al
	je	.L294
	movl	$1, %eax
	jmp	.L295
.L294:
	movq	32(%rbp), %rdx
	leaq	48(%rbp), %rax
	movq	16(%rbp), %r8
	movq	%rax, %rcx
	call	_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_
	testb	%al, %al
	je	.L296
	movl	$0, %eax
	jmp	.L295
.L296:
	addq	$4, 16(%rbp)
	addq	$4, 32(%rbp)
.L293:
	movq	16(%rbp), %rax
	cmpq	24(%rbp), %rax
	je	.L297
	movq	40(%rbp), %rdx
	movq	32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E6__cnd2IPKiEEbT_S5_
	testb	%al, %al
	je	.L297
	movl	$1, %eax
	jmp	.L298
.L297:
	movl	$0, %eax
.L298:
	testb	%al, %al
	jne	.L299
	movq	16(%rbp), %rax
	cmpq	24(%rbp), %rax
	jne	.L300
	movq	32(%rbp), %rax
	cmpq	40(%rbp), %rax
	je	.L300
	movl	$1, %eax
	jmp	.L295
.L300:
	movl	$0, %eax
.L295:
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt16allocator_traitsISaIiEE11_S_max_sizeIKS0_vEEyRT_i,"x"
	.linkonce discard
	.globl	_ZNSt16allocator_traitsISaIiEE11_S_max_sizeIKS0_vEEyRT_i
	.def	_ZNSt16allocator_traitsISaIiEE11_S_max_sizeIKS0_vEEyRT_i;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt16allocator_traitsISaIiEE11_S_max_sizeIKS0_vEEyRT_i
_ZNSt16allocator_traitsISaIiEE11_S_max_sizeIKS0_vEEyRT_i:
.LFB5043:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movl	%edx, 24(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv
	.def	_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv
_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv:
.LFB5044:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movabsq	$4611686018427387903, %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_,"x"
	.linkonce discard
	.globl	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_
	.def	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_
_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_:
.LFB5045:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$56, %rsp
	.seh_stackalloc	56
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -48(%rbp)
	movq	%rdx, -40(%rbp)
	movq	%r8, -32(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, -88(%rbp)
	jmp	.L307
.L308:
	leaq	-48(%rbp), %rcx
	call	_ZNKSt13move_iteratorIPiEdeEv
	movq	%rax, %rbx
	movq	-88(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt11__addressofIiEPT_RS0_
	movq	%rbx, %rdx
	movq	%rax, %rcx
	call	_ZSt10_ConstructIiIiEEvPT_DpOT0_
	leaq	-48(%rbp), %rcx
	call	_ZNSt13move_iteratorIPiEppEv
	addq	$4, -88(%rbp)
.L307:
	leaq	-40(%rbp), %rax
	movq	%rax, %rdx
	leaq	-48(%rbp), %rcx
.LEHB34:
	call	_ZStneIPiEbRKSt13move_iteratorIT_ES5_
.LEHE34:
	testb	%al, %al
	jne	.L308
	movq	-88(%rbp), %rax
	jmp	.L314
.L313:
	movq	%rax, %rbx
	call	__cxa_end_catch
	movq	%rbx, %rax
	movq	%rax, %rcx
.LEHB35:
	call	_Unwind_Resume
.LEHE35:
.L312:
	movq	%rax, %rcx
	call	__cxa_begin_catch
	movq	-88(%rbp), %rdx
	movq	-32(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt8_DestroyIPiEvT_S1_
.LEHB36:
	call	__cxa_rethrow
.LEHE36:
	nop
.L314:
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_handler	__gxx_personality_seh0, @unwind, @except
	.seh_handlerdata
	.align 4
.LLSDA5045:
	.byte	0xff
	.byte	0x9b
	.uleb128 .LLSDATT5045-.LLSDATTD5045
.LLSDATTD5045:
	.byte	0x1
	.uleb128 .LLSDACSE5045-.LLSDACSB5045
.LLSDACSB5045:
	.uleb128 .LEHB34-.LFB5045
	.uleb128 .LEHE34-.LEHB34
	.uleb128 .L312-.LFB5045
	.uleb128 0x1
	.uleb128 .LEHB35-.LFB5045
	.uleb128 .LEHE35-.LEHB35
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB36-.LFB5045
	.uleb128 .LEHE36-.LEHB36
	.uleb128 .L313-.LFB5045
	.uleb128 0
.LLSDACSE5045:
	.byte	0x1
	.byte	0
	.align 4
	.long	0

.LLSDATT5045:
	.section	.text$_ZNSt20__uninitialized_copyILb0EE13__uninit_copyISt13move_iteratorIPiES3_EET0_T_S6_S5_,"x"
	.linkonce discard
	.seh_endproc
	.section	.text$_ZSt6fill_nIPiyiET_S1_T0_RKT1_,"x"
	.linkonce discard
	.globl	_ZSt6fill_nIPiyiET_S1_T0_RKT1_
	.def	_ZSt6fill_nIPiyiET_S1_T0_RKT1_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt6fill_nIPiyiET_S1_T0_RKT1_
_ZSt6fill_nIPiyiET_S1_T0_RKT1_:
.LFB5046:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	16(%rbp), %rcx
	call	_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_
	movq	%rax, %rcx
	movq	32(%rbp), %rdx
	movq	24(%rbp), %rax
	movq	%rdx, %r8
	movq	%rax, %rdx
	call	_ZSt10__fill_n_aIPiyiEN9__gnu_cxx11__enable_ifIXsrSt11__is_scalarIT1_E7__valueET_E6__typeES6_T0_RKS4_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIPiS2_EET0_T_S4_S3_,"x"
	.linkonce discard
	.globl	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIPiS2_EET0_T_S4_S3_
	.def	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIPiS2_EET0_T_S4_S3_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIPiS2_EET0_T_S4_S3_
_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIPiS2_EET0_T_S4_S3_:
.LFB5047:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	32(%rbp), %rax
	movq	%rax, -8(%rbp)
	jmp	.L318
.L319:
	movq	-8(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt11__addressofIiEPT_RS0_
	movq	16(%rbp), %rdx
	movq	%rax, %rcx
	call	_ZSt10_ConstructIiIRiEEvPT_DpOT0_
	addq	$4, 16(%rbp)
	addq	$4, -8(%rbp)
.L318:
	movq	16(%rbp), %rax
	cmpq	24(%rbp), %rax
	jne	.L319
	movq	-8(%rbp), %rax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E10__newlast1IPKiS4_EET_S5_S5_T0_S6_,"x"
	.linkonce discard
	.globl	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E10__newlast1IPKiS4_EET_S5_S5_T0_S6_
	.def	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E10__newlast1IPKiS4_EET_S5_S5_T0_S6_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E10__newlast1IPKiS4_EET_S5_S5_T0_S6_
_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E10__newlast1IPKiS4_EET_S5_S5_T0_S6_:
.LFB5056:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$16, %rsp
	.seh_stackalloc	16
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	%r9, 40(%rbp)
	movq	24(%rbp), %rdx
	movq	16(%rbp), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	movq	%rax, -8(%rbp)
	movq	40(%rbp), %rdx
	movq	32(%rbp), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$2, %rax
	movq	%rax, -16(%rbp)
	movq	-16(%rbp), %rax
	cmpq	-8(%rbp), %rax
	jge	.L322
	movq	-16(%rbp), %rax
	leaq	0(,%rax,4), %rdx
	movq	16(%rbp), %rax
	addq	%rdx, %rax
	jmp	.L323
.L322:
	movq	24(%rbp), %rax
.L323:
	addq	$16, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E6__cnd2IPKiEEbT_S5_,"x"
	.linkonce discard
	.globl	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E6__cnd2IPKiEEbT_S5_
	.def	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E6__cnd2IPKiEEbT_S5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E6__cnd2IPKiEEbT_S5_
_ZNSt8__lc_raiISt26random_access_iterator_tagS0_E6__cnd2IPKiEEbT_S5_:
.LFB5057:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movl	$1, %eax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_,"x"
	.linkonce discard
	.align 2
	.globl	_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_
	.def	_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_
_ZNK9__gnu_cxx5__ops15_Iter_less_iterclIPKiS4_EEbT_T0_:
.LFB5058:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	24(%rbp), %rax
	movl	(%rax), %edx
	movq	32(%rbp), %rax
	movl	(%rax), %eax
	cmpl	%eax, %edx
	setl	%al
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZStneIPiEbRKSt13move_iteratorIT_ES5_,"x"
	.linkonce discard
	.globl	_ZStneIPiEbRKSt13move_iteratorIT_ES5_
	.def	_ZStneIPiEbRKSt13move_iteratorIT_ES5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZStneIPiEbRKSt13move_iteratorIT_ES5_
_ZStneIPiEbRKSt13move_iteratorIT_ES5_:
.LFB5059:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, %rdx
	movq	16(%rbp), %rcx
	call	_ZSteqIPiEbRKSt13move_iteratorIT_ES5_
	xorl	$1, %eax
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt13move_iteratorIPiEppEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNSt13move_iteratorIPiEppEv
	.def	_ZNSt13move_iteratorIPiEppEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt13move_iteratorIPiEppEv
_ZNSt13move_iteratorIPiEppEv:
.LFB5060:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	leaq	4(%rax), %rdx
	movq	16(%rbp), %rax
	movq	%rdx, (%rax)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_,"x"
	.linkonce discard
	.globl	_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
	.def	_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_:
.LFB5062:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNKSt13move_iteratorIPiEdeEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt13move_iteratorIPiEdeEv
	.def	_ZNKSt13move_iteratorIPiEdeEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt13move_iteratorIPiEdeEv
_ZNKSt13move_iteratorIPiEdeEv:
.LFB5061:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	movq	%rax, %rcx
	call	_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt7forwardIiEOT_RNSt16remove_referenceIS0_E4typeE,"x"
	.linkonce discard
	.globl	_ZSt7forwardIiEOT_RNSt16remove_referenceIS0_E4typeE
	.def	_ZSt7forwardIiEOT_RNSt16remove_referenceIS0_E4typeE;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt7forwardIiEOT_RNSt16remove_referenceIS0_E4typeE
_ZSt7forwardIiEOT_RNSt16remove_referenceIS0_E4typeE:
.LFB5064:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt10_ConstructIiIiEEvPT_DpOT0_,"x"
	.linkonce discard
	.globl	_ZSt10_ConstructIiIiEEvPT_DpOT0_
	.def	_ZSt10_ConstructIiIiEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt10_ConstructIiIiEEvPT_DpOT0_
_ZSt10_ConstructIiIiEEvPT_DpOT0_:
.LFB5063:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIiEOT_RNSt16remove_referenceIS0_E4typeE
	movl	(%rax), %ebx
	movq	-64(%rbp), %rax
	movq	%rax, %rdx
	movl	$4, %ecx
	call	_ZnwyPv
	testq	%rax, %rax
	je	.L339
	movl	%ebx, (%rax)
.L339:
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZSt10_ConstructIiJiEEvPT_DpOT0_
	.def	_ZSt10_ConstructIiJiEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.set	_ZSt10_ConstructIiJiEEvPT_DpOT0_,_ZSt10_ConstructIiIiEEvPT_DpOT0_
	.section	.text$_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_,"x"
	.linkonce discard
	.globl	_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_
	.def	_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_
_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_:
.LFB5065:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rcx
	call	_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt10__fill_n_aIPiyiEN9__gnu_cxx11__enable_ifIXsrSt11__is_scalarIT1_E7__valueET_E6__typeES6_T0_RKS4_,"x"
	.linkonce discard
	.globl	_ZSt10__fill_n_aIPiyiEN9__gnu_cxx11__enable_ifIXsrSt11__is_scalarIT1_E7__valueET_E6__typeES6_T0_RKS4_
	.def	_ZSt10__fill_n_aIPiyiEN9__gnu_cxx11__enable_ifIXsrSt11__is_scalarIT1_E7__valueET_E6__typeES6_T0_RKS4_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt10__fill_n_aIPiyiEN9__gnu_cxx11__enable_ifIXsrSt11__is_scalarIT1_E7__valueET_E6__typeES6_T0_RKS4_
_ZSt10__fill_n_aIPiyiEN9__gnu_cxx11__enable_ifIXsrSt11__is_scalarIT1_E7__valueET_E6__typeES6_T0_RKS4_:
.LFB5066:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$16, %rsp
	.seh_stackalloc	16
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	movq	%r8, 32(%rbp)
	movq	32(%rbp), %rax
	movl	(%rax), %eax
	movl	%eax, -12(%rbp)
	movq	24(%rbp), %rax
	movq	%rax, -8(%rbp)
	jmp	.L345
.L346:
	movq	16(%rbp), %rax
	movl	-12(%rbp), %edx
	movl	%edx, (%rax)
	subq	$1, -8(%rbp)
	addq	$4, 16(%rbp)
.L345:
	cmpq	$0, -8(%rbp)
	jne	.L346
	movq	16(%rbp), %rax
	addq	$16, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt7forwardIRiEOT_RNSt16remove_referenceIS1_E4typeE,"x"
	.linkonce discard
	.globl	_ZSt7forwardIRiEOT_RNSt16remove_referenceIS1_E4typeE
	.def	_ZSt7forwardIRiEOT_RNSt16remove_referenceIS1_E4typeE;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt7forwardIRiEOT_RNSt16remove_referenceIS1_E4typeE
_ZSt7forwardIRiEOT_RNSt16remove_referenceIS1_E4typeE:
.LFB5068:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZSt10_ConstructIiIRiEEvPT_DpOT0_,"x"
	.linkonce discard
	.globl	_ZSt10_ConstructIiIRiEEvPT_DpOT0_
	.def	_ZSt10_ConstructIiIRiEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSt10_ConstructIiIRiEEvPT_DpOT0_
_ZSt10_ConstructIiIRiEEvPT_DpOT0_:
.LFB5067:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZSt7forwardIRiEOT_RNSt16remove_referenceIS1_E4typeE
	movl	(%rax), %ebx
	movq	-64(%rbp), %rax
	movq	%rax, %rdx
	movl	$4, %ecx
	call	_ZnwyPv
	testq	%rax, %rax
	je	.L350
	movl	%ebx, (%rax)
.L350:
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.weak	_ZSt10_ConstructIiJRiEEvPT_DpOT0_
	.def	_ZSt10_ConstructIiJRiEEvPT_DpOT0_;	.scl	2;	.type	32;	.endef
	.set	_ZSt10_ConstructIiJRiEEvPT_DpOT0_,_ZSt10_ConstructIiIRiEEvPT_DpOT0_
	.section	.text$_ZSteqIPiEbRKSt13move_iteratorIT_ES5_,"x"
	.linkonce discard
	.globl	_ZSteqIPiEbRKSt13move_iteratorIT_ES5_
	.def	_ZSteqIPiEbRKSt13move_iteratorIT_ES5_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZSteqIPiEbRKSt13move_iteratorIT_ES5_
_ZSteqIPiEbRKSt13move_iteratorIT_ES5_:
.LFB5069:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$40, %rsp
	.seh_stackalloc	40
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movq	%rcx, -64(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-64(%rbp), %rcx
	call	_ZNKSt13move_iteratorIPiE4baseEv
	movq	%rax, %rbx
	movq	-56(%rbp), %rax
	movq	%rax, %rcx
	call	_ZNKSt13move_iteratorIPiE4baseEv
	cmpq	%rax, %rbx
	sete	%al
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_,"x"
	.linkonce discard
	.globl	_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_
	.def	_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_
_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_:
.LFB5070:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	popq	%rbp
	ret
	.seh_endproc
	.section	.text$_ZNKSt13move_iteratorIPiE4baseEv,"x"
	.linkonce discard
	.align 2
	.globl	_ZNKSt13move_iteratorIPiE4baseEv
	.def	_ZNKSt13move_iteratorIPiE4baseEv;	.scl	2;	.type	32;	.endef
	.seh_proc	_ZNKSt13move_iteratorIPiE4baseEv
_ZNKSt13move_iteratorIPiE4baseEv:
.LFB5071:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	.seh_endprologue
	movq	%rcx, 16(%rbp)
	movq	16(%rbp), %rax
	movq	(%rax), %rax
	popq	%rbp
	ret
	.seh_endproc
	.text
	.def	__tcf_0;	.scl	3;	.type	32;	.endef
	.seh_proc	__tcf_0
__tcf_0:
.LFB5073:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	leaq	_ZStL8__ioinit(%rip), %rcx
	call	_ZNSt8ios_base4InitD1Ev
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.def	_Z41__static_initialization_and_destruction_0ii;	.scl	3;	.type	32;	.endef
	.seh_proc	_Z41__static_initialization_and_destruction_0ii
_Z41__static_initialization_and_destruction_0ii:
.LFB5072:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movl	%ecx, 16(%rbp)
	movl	%edx, 24(%rbp)
	cmpl	$1, 16(%rbp)
	jne	.L360
	cmpl	$65535, 24(%rbp)
	jne	.L360
	leaq	_ZStL8__ioinit(%rip), %rcx
	call	_ZNSt8ios_base4InitC1Ev
	leaq	__tcf_0(%rip), %rcx
	call	atexit
	nop
.L360:
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.def	_GLOBAL__sub_I_main;	.scl	3;	.type	32;	.endef
	.seh_proc	_GLOBAL__sub_I_main
_GLOBAL__sub_I_main:
.LFB5074:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$32, %rsp
	.seh_stackalloc	32
	.seh_endprologue
	movl	$65535, %edx
	movl	$1, %ecx
	call	_Z41__static_initialization_and_destruction_0ii
	nop
	addq	$32, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section	.ctors,"w"
	.align 8
	.quad	_GLOBAL__sub_I_main
	.ident	"GCC: (tdm64-1) 4.9.2"
	.def	__mingw_vprintf;	.scl	2;	.type	32;	.endef
	.def	_Unwind_Resume;	.scl	2;	.type	32;	.endef
	.def	__cxa_end_catch;	.scl	2;	.type	32;	.endef
	.def	__cxa_begin_catch;	.scl	2;	.type	32;	.endef
	.def	__cxa_rethrow;	.scl	2;	.type	32;	.endef
	.def	_ZSt20__throw_length_errorPKc;	.scl	2;	.type	32;	.endef
	.def	_ZdlPv;	.scl	2;	.type	32;	.endef
	.def	_ZSt17__throw_bad_allocv;	.scl	2;	.type	32;	.endef
	.def	_Znwy;	.scl	2;	.type	32;	.endef
	.def	_ZNSt8ios_base4InitD1Ev;	.scl	2;	.type	32;	.endef
	.def	_ZNSt8ios_base4InitC1Ev;	.scl	2;	.type	32;	.endef
	.def	atexit;	.scl	2;	.type	32;	.endef
