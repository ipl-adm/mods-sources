/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelRenderer
 */
package net.divinerpg.client.render.block.model;

import net.divinerpg.client.model.DivineModel;
import net.divinerpg.client.model.DivineRenderer;
import net.minecraft.client.model.ModelRenderer;

public class ModelAyeracoStatue
extends DivineModel {
    ModelRenderer BodyLower = new DivineRenderer(this, 0, 0);
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Tail;
    ModelRenderer WingLB;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Shape1;
    ModelRenderer WingRB;
    ModelRenderer WingRF;
    ModelRenderer WingLF;
    ModelRenderer WingRExtB;
    ModelRenderer WingLExtB;
    ModelRenderer WingLExtF;
    ModelRenderer WingRExtF;
    ModelRenderer WingRM;
    ModelRenderer WingLM;
    ModelRenderer WingLExtM;
    ModelRenderer Mouth1;
    ModelRenderer Butt;
    ModelRenderer Head2;
    ModelRenderer Mouth2;
    ModelRenderer Support;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Body;

    public ModelAyeracoStatue() {
        super("statueAyeraco", 64, 32);
        this.BodyLower.addBox(0.0f, -1.0f, 0.0f, 10, 1, 12);
        this.BodyLower.setRotationPoint(-5.0f, 18.0f, -6.0f);
        this.BodyLower.setTextureSize(64, 32);
        this.BodyLower.mirror = true;
        this.setRotation(this.BodyLower, 0.0f, 0.0f, 0.0f);
        this.Neck = new DivineRenderer(this, 13, 16);
        this.Neck.addBox(0.0f, -1.0f, 0.0f, 12, 4, 2);
        this.Neck.setRotationPoint(-6.0f, 13.0f, -10.0f);
        this.Neck.setTextureSize(64, 32);
        this.Neck.mirror = true;
        this.setRotation(this.Neck, 0.0f, 0.0f, 0.0f);
        this.Head = new DivineRenderer(this, 0, 19);
        this.Head.addBox(0.0f, -1.0f, 0.0f, 6, 6, 7);
        this.Head.setRotationPoint(3.0f, 12.0f, -17.0f);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
        this.Tail = new DivineRenderer(this, 40, 0);
        this.Tail.addBox(-1.0f, 0.0f, 0.0f, 2, 1, 10);
        this.Tail.setRotationPoint(3.0f, 14.0f, 14.0f);
        this.Tail.setTextureSize(64, 32);
        this.Tail.mirror = true;
        this.setRotation(this.Tail, 0.3346075f, 0.0f, 0.0f);
        this.WingLB = new DivineRenderer(this, 28, 27);
        this.WingLB.addBox(0.0f, 0.0f, 2.0f, 8, 1, 4);
        this.WingLB.setRotationPoint(5.0f, 13.0f, 1.0f);
        this.WingLB.setTextureSize(64, 32);
        this.WingLB.mirror = true;
        this.setRotation(this.WingLB, 0.0f, 0.0f, 0.4461433f);
        this.Tail2 = new DivineRenderer(this, 40, 0);
        this.Tail2.addBox(-1.0f, 0.0f, 0.0f, 2, 1, 10);
        this.Tail2.setRotationPoint(0.0f, 14.0f, 14.0f);
        this.Tail2.setTextureSize(64, 32);
        this.Tail2.mirror = true;
        this.setRotation(this.Tail2, 0.3346075f, 0.0f, 0.0f);
        this.Tail3 = new DivineRenderer(this, 40, 0);
        this.Tail3.addBox(-1.0f, 0.0f, 0.0f, 2, 1, 10);
        this.Tail3.setRotationPoint(-3.0f, 14.0f, 14.0f);
        this.Tail3.setTextureSize(64, 32);
        this.Tail3.mirror = true;
        this.setRotation(this.Tail3, 0.3346075f, 0.0f, 0.0f);
        this.Shape1 = new DivineRenderer(this, 44, 20);
        this.Shape1.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape1.setRotationPoint(-2.0f, 9.0f, 14.0f);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.4089647f, 0.0f, 0.0f);
        this.WingRB = new DivineRenderer(this, 28, 27);
        this.WingRB.addBox(-7.0f, 0.0f, 2.0f, 8, 1, 4);
        this.WingRB.setRotationPoint(-6.0f, 13.0f, 1.0f);
        this.WingRB.setTextureSize(64, 32);
        this.WingRB.mirror = true;
        this.setRotation(this.WingRB, 0.0f, 0.0f, -0.4363323f);
        this.WingRF = new DivineRenderer(this, 28, 27);
        this.WingRF.addBox(-7.0f, 0.0f, -2.0f, 8, 1, 4);
        this.WingRF.setRotationPoint(-6.0f, 13.0f, -3.0f);
        this.WingRF.setTextureSize(64, 32);
        this.WingRF.mirror = true;
        this.setRotation(this.WingRF, 0.0f, 0.0f, -0.4363323f);
        this.WingLF = new DivineRenderer(this, 28, 27);
        this.WingLF.addBox(0.0f, 0.0f, -2.0f, 8, 1, 4);
        this.WingLF.setRotationPoint(5.0f, 13.0f, -3.0f);
        this.WingLF.setTextureSize(64, 32);
        this.WingLF.mirror = true;
        this.setRotation(this.WingLF, 0.0f, 0.0f, 0.4461433f);
        this.WingRExtB = new DivineRenderer(this, 28, 27);
        this.WingRExtB.addBox(-15.0f, 0.0f, 3.0f, 8, 1, 2);
        this.WingRExtB.setRotationPoint(-6.0f, 13.0f, 1.0f);
        this.WingRExtB.setTextureSize(64, 32);
        this.WingRExtB.mirror = true;
        this.setRotation(this.WingRExtB, 0.0f, 0.0f, -0.4363323f);
        this.WingLExtB = new DivineRenderer(this, 28, 27);
        this.WingLExtB.addBox(8.0f, 0.0f, 3.0f, 8, 1, 2);
        this.WingLExtB.setRotationPoint(5.0f, 13.0f, 1.0f);
        this.WingLExtB.setTextureSize(64, 32);
        this.WingLExtB.mirror = true;
        this.setRotation(this.WingLExtB, 0.0f, 0.0f, 0.4461433f);
        this.WingLExtF = new DivineRenderer(this, 28, 27);
        this.WingLExtF.addBox(8.0f, 0.0f, -1.0f, 8, 1, 2);
        this.WingLExtF.setRotationPoint(5.0f, 13.0f, -3.0f);
        this.WingLExtF.setTextureSize(64, 32);
        this.WingLExtF.mirror = true;
        this.setRotation(this.WingLExtF, 0.0f, 0.0f, 0.4461433f);
        this.WingRExtF = new DivineRenderer(this, 28, 27);
        this.WingRExtF.addBox(-15.0f, 0.0f, -1.0f, 8, 1, 2);
        this.WingRExtF.setRotationPoint(-6.0f, 13.0f, -3.0f);
        this.WingRExtF.setTextureSize(64, 32);
        this.WingRExtF.mirror = true;
        this.setRotation(this.WingRExtF, 0.0f, 0.0f, -0.4363323f);
        this.WingRM = new DivineRenderer(this, 28, 27);
        this.WingRM.addBox(-7.0f, 0.0f, 2.0f, 8, 1, 4);
        this.WingRM.setRotationPoint(-6.0f, 13.0f, -3.0f);
        this.WingRM.setTextureSize(64, 32);
        this.WingRM.mirror = true;
        this.setRotation(this.WingRM, 0.0f, 0.0f, -0.4363323f);
        this.WingLM = new DivineRenderer(this, 28, 27);
        this.WingLM.addBox(0.0f, 0.0f, 2.0f, 8, 1, 4);
        this.WingLM.setRotationPoint(5.0f, 13.0f, -3.0f);
        this.WingLM.setTextureSize(64, 32);
        this.WingLM.mirror = true;
        this.setRotation(this.WingLM, 0.0f, 0.0f, 0.4461433f);
        this.WingLExtM = new DivineRenderer(this, 28, 27);
        this.WingLExtM.addBox(8.0f, 0.0f, 3.0f, 8, 1, 2);
        this.WingLExtM.setRotationPoint(5.0f, 13.0f, -3.0f);
        this.WingLExtM.setTextureSize(64, 32);
        this.WingLExtM.mirror = true;
        this.setRotation(this.WingLExtM, 0.0f, 0.0f, 0.4461433f);
        this.Mouth1 = new DivineRenderer(this, 0, 19);
        this.Mouth1.addBox(0.0f, -1.0f, -7.0f, 6, 1, 7);
        this.Mouth1.setRotationPoint(3.0f, 18.0f, -10.0f);
        this.Mouth1.setTextureSize(64, 32);
        this.Mouth1.mirror = true;
        this.setRotation(this.Mouth1, 0.0743572f, 0.0f, 0.0f);
        this.Butt = new DivineRenderer(this, 10, 12);
        this.Butt.addBox(0.0f, -1.0f, 0.0f, 10, 4, 6);
        this.Butt.setRotationPoint(-5.0f, 13.0f, 8.0f);
        this.Butt.setTextureSize(64, 32);
        this.Butt.mirror = true;
        this.setRotation(this.Butt, 0.0f, 0.0f, 0.0f);
        this.Head2 = new DivineRenderer(this, 0, 19);
        this.Head2.addBox(0.0f, -1.0f, 0.0f, 6, 6, 7);
        this.Head2.setRotationPoint(-9.0f, 12.0f, -17.0f);
        this.Head2.setTextureSize(64, 32);
        this.Head2.mirror = true;
        this.setRotation(this.Head2, 0.0f, 0.0f, 0.0f);
        this.Mouth2 = new DivineRenderer(this, 0, 19);
        this.Mouth2.addBox(0.0f, -1.0f, -7.0f, 6, 1, 7);
        this.Mouth2.setRotationPoint(-9.0f, 18.0f, -10.0f);
        this.Mouth2.setTextureSize(64, 32);
        this.Mouth2.mirror = true;
        this.setRotation(this.Mouth2, 0.0743572f, 0.0f, 0.0f);
        this.Support = new DivineRenderer(this, 13, 11);
        this.Support.addBox(0.0f, -1.0f, 7.0f, 8, 6, 5);
        this.Support.setRotationPoint(-4.0f, 19.0f, -8.0f);
        this.Support.setTextureSize(64, 32);
        this.Support.mirror = true;
        this.setRotation(this.Support, 0.0f, 0.0f, 0.0f);
        this.Shape2 = new DivineRenderer(this, 44, 20);
        this.Shape2.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape2.setRotationPoint(-2.0f, 13.0f, 10.0f);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.7807508f, 0.0f, 0.0f);
        this.Shape3 = new DivineRenderer(this, 46, 20);
        this.Shape3.addBox(0.0f, -1.0f, 0.0f, 2, 1, 6);
        this.Shape3.setRotationPoint(5.0f, 12.0f, -16.0f);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.7807508f, 0.0f, 0.0f);
        this.Shape4 = new DivineRenderer(this, 46, 20);
        this.Shape4.addBox(0.0f, -1.0f, 0.0f, 2, 1, 6);
        this.Shape4.setRotationPoint(5.0f, 8.0f, -12.0f);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.4089647f, 0.0f, 0.0f);
        this.Shape5 = new DivineRenderer(this, 44, 20);
        this.Shape5.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape5.setRotationPoint(-2.0f, 12.0f, -2.0f);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.7807508f, 0.0f, 0.0f);
        this.Shape6 = new DivineRenderer(this, 44, 20);
        this.Shape6.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape6.setRotationPoint(-2.0f, 8.0f, 2.0f);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.4089647f, 0.0f, 0.0f);
        this.Shape7 = new DivineRenderer(this, 44, 20);
        this.Shape7.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape7.setRotationPoint(-2.0f, 12.0f, 3.0f);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.7807508f, 0.0f, 0.0f);
        this.Shape8 = new DivineRenderer(this, 44, 20);
        this.Shape8.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape8.setRotationPoint(-2.0f, 8.0f, 7.0f);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.4089647f, 0.0f, 0.0f);
        this.Shape9 = new DivineRenderer(this, 44, 20);
        this.Shape9.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape9.setRotationPoint(-2.0f, 12.0f, 7.0f);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.7807508f, 0.0f, 0.0f);
        this.Shape10 = new DivineRenderer(this, 44, 20);
        this.Shape10.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape10.setRotationPoint(-2.0f, 8.0f, 11.0f);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.4089647f, 0.0f, 0.0f);
        this.Shape11 = new DivineRenderer(this, 44, 20);
        this.Shape11.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape11.setRotationPoint(-2.0f, 12.0f, -7.0f);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, 0.7807508f, 0.0f, 0.0f);
        this.Shape12 = new DivineRenderer(this, 44, 20);
        this.Shape12.addBox(0.0f, -1.0f, 0.0f, 4, 1, 6);
        this.Shape12.setRotationPoint(-2.0f, 8.0f, -3.0f);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.4089647f, 0.0f, 0.0f);
        this.Shape13 = new DivineRenderer(this, 46, 20);
        this.Shape13.addBox(0.0f, -1.0f, 0.0f, 2, 1, 6);
        this.Shape13.setRotationPoint(-7.0f, 12.0f, -16.0f);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 0.7807508f, 0.0f, 0.0f);
        this.Shape14 = new DivineRenderer(this, 46, 20);
        this.Shape14.addBox(0.0f, -1.0f, 0.0f, 2, 1, 6);
        this.Shape14.setRotationPoint(-7.0f, 8.0f, -12.0f);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, 0.4089647f, 0.0f, 0.0f);
        this.Body = new DivineRenderer(this, 0, 0);
        this.Body.addBox(0.0f, -1.0f, 0.0f, 10, 6, 16);
        this.Body.setRotationPoint(-5.0f, 12.0f, -8.0f);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
    }
}
