package com.disney.wdpro.ap_commerce_checkout.views;

import android.view.View;
import com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView;
import java.util.function.Consumer;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.views.c */
/* loaded from: classes23.dex */
public final /* synthetic */ class C8749c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ View f29277a;

    /* renamed from: b */
    public final /* synthetic */ SaveAndShareView.CreatePDFFileTask f29278b;

    public /* synthetic */ C8749c(View view, SaveAndShareView.CreatePDFFileTask createPDFFileTask) {
        view = view;
        createPDFFileTask = createPDFFileTask;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        view.post(new Runnable
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: INVOKE 
              (wrap:android.view.View:0x0000: IGET (r1v0 'this' com.disney.wdpro.ap_commerce_checkout.views.c A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] com.disney.wdpro.ap_commerce_checkout.views.c.a android.view.View)
              (wrap:java.lang.Runnable:0x0002: CONSTRUCTOR 
              (wrap:com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$CreatePDFFileTask:0x0002: IGET (r1v0 'this' com.disney.wdpro.ap_commerce_checkout.views.c A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] com.disney.wdpro.ap_commerce_checkout.views.c.b com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$CreatePDFFileTask)
              (wrap:java.lang.Integer:0x0004: CHECK_CAST (java.lang.Integer) (r2v0 'obj' java.lang.Object))
             A[MD:(com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$CreatePDFFileTask, java.lang.Integer):void (m), WRAPPED] call: com.disney.wdpro.ap_commerce_checkout.views.a.<init>(com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$CreatePDFFileTask, java.lang.Integer):void type: CONSTRUCTOR)
             VIRTUAL call: android.view.View.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] in method: com.disney.wdpro.ap_commerce_checkout.views.c.accept(java.lang.Object):void, file: classes23.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:311)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.disney.wdpro.ap_commerce_checkout.views.a.<init>(com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$CreatePDFFileTask, java.lang.Integer):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:829)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 35 more
            */
        /*
            this = this;
            android.view.View r0 = r1
            com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView$CreatePDFFileTask r1 = r2
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.m37551c(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.ap_commerce_checkout.views.C8749c.accept(java.lang.Object):void");
    }
}