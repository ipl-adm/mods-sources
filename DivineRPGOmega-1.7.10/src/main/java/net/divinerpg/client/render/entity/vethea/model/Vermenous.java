/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package net.divinerpg.client.render.entity.vethea.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Vermenous
extends ModelBase {
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part10;
    ModelRenderer part12;
    ModelRenderer part11;
    ModelRenderer part13;
    ModelRenderer part14;
    ModelRenderer part15;
    ModelRenderer part16;
    ModelRenderer part18;
    ModelRenderer part17;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm5;
    ModelRenderer leftleg2;
    ModelRenderer rightleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer leftleg4;
    ModelRenderer rightleg4;
    ModelRenderer leftarm3;
    ModelRenderer rightarm4;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;

    public Vermenous() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer((ModelBase)this, 0, 16);
        this.part1.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.part1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.part1.setTextureSize(64, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, 0.0f, 0.0f, 0.0f);
        this.part2 = new ModelRenderer((ModelBase)this, 16, 16);
        this.part2.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
        this.part2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.part2.setTextureSize(64, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 0.0f, 0.0f, 0.0f);
        this.rightarm1 = new ModelRenderer((ModelBase)this, 42, 20);
        this.rightarm1.addBox(-4.0f, 10.0f, -1.0f, 2, 10, 2);
        this.rightarm1.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarm1.setTextureSize(64, 32);
        this.rightarm1.mirror = true;
        this.setRotation(this.rightarm1, 0.0f, 0.0f, 0.0f);
        this.leftarm1 = new ModelRenderer((ModelBase)this, 42, 20);
        this.leftarm1.addBox(2.0f, 10.0f, -1.0f, 2, 10, 2);
        this.leftarm1.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarm1.setTextureSize(64, 32);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, 0.0f, 0.0f, 0.0f);
        this.rightleg1 = new ModelRenderer((ModelBase)this, 0, 26);
        this.rightleg1.addBox(1.0f, 10.0f, -8.0f, 1, 2, 2);
        this.rightleg1.setRotationPoint(-3.0f, 12.0f, 0.0f);
        this.rightleg1.setTextureSize(64, 32);
        this.rightleg1.mirror = true;
        this.setRotation(this.rightleg1, 0.0f, 0.0f, 0.0f);
        this.leftleg1 = new ModelRenderer((ModelBase)this, 0, 26);
        this.leftleg1.addBox(1.0f, 10.0f, -8.0f, 1, 2, 2);
        this.leftleg1.setRotationPoint(3.0f, 12.0f, 0.0f);
        this.leftleg1.setTextureSize(64, 32);
        this.leftleg1.mirror = true;
        this.setRotation(this.leftleg1, 0.0f, 0.0f, 0.0f);
        this.part3 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part3.addBox(0.0f, 0.0f, 0.0f, 4, 2, 3);
        this.part3.setRotationPoint(4.0f, -12.0f, -13.0f);
        this.part3.setTextureSize(64, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 1.570796f, -1.570796f, 0.0f);
        this.part4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.part4.addBox(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.part4.setRotationPoint(-4.0f, -23.0f, -14.0f);
        this.part4.setTextureSize(64, 32);
        this.part4.mirror = true;
        this.setRotation(this.part4, 0.0f, 0.0f, 0.0f);
        this.part5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.part5.addBox(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.part5.setRotationPoint(8.0f, -8.0f, -14.0f);
        this.part5.setTextureSize(64, 32);
        this.part5.mirror = true;
        this.setRotation(this.part5, 0.0f, 0.0f, 0.0f);
        this.part6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.part6.addBox(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.part6.setRotationPoint(-16.0f, -8.0f, -14.0f);
        this.part6.setTextureSize(64, 32);
        this.part6.mirror = true;
        this.setRotation(this.part6, 0.0f, 0.0f, 0.0f);
        this.part8 = new ModelRenderer((ModelBase)this, 32, 0);
        this.part8.addBox(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.part8.setRotationPoint(-13.0f, -17.0f, -14.0f);
        this.part8.setTextureSize(64, 32);
        this.part8.mirror = true;
        this.setRotation(this.part8, 0.0f, 0.0f, 0.0f);
        this.part9 = new ModelRenderer((ModelBase)this, 32, 0);
        this.part9.addBox(0.0f, 0.0f, 0.0f, 8, 8, 8);
        this.part9.setRotationPoint(5.0f, -17.0f, -14.0f);
        this.part9.setTextureSize(64, 32);
        this.part9.mirror = true;
        this.setRotation(this.part9, 0.0f, 0.0f, 0.0f);
        this.part10 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part10.addBox(0.0f, 0.0f, 0.0f, 4, 4, 6);
        this.part10.setRotationPoint(-2.0f, -6.0f, -7.0f);
        this.part10.setTextureSize(64, 32);
        this.part10.mirror = true;
        this.setRotation(this.part10, 0.0f, 0.0f, 0.0f);
        this.part12 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part12.addBox(0.0f, 0.0f, 0.0f, 4, 4, 6);
        this.part12.setRotationPoint(-2.0f, -6.0f, -13.0f);
        this.part12.setTextureSize(64, 32);
        this.part12.mirror = true;
        this.setRotation(this.part12, 0.0f, 0.0f, 0.0f);
        this.part11 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part11.addBox(0.0f, 0.0f, 0.0f, 4, 4, 6);
        this.part11.setRotationPoint(-2.0f, -6.0f, -13.0f);
        this.part11.setTextureSize(64, 32);
        this.part11.mirror = true;
        this.setRotation(this.part11, 0.0f, -1.570796f, 0.0f);
        this.part13 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part13.addBox(0.0f, 0.0f, 0.0f, 4, 4, 2);
        this.part13.setRotationPoint(-4.0f, -15.0f, -13.0f);
        this.part13.setTextureSize(64, 32);
        this.part13.mirror = true;
        this.setRotation(this.part13, 0.0f, -1.570796f, 0.0f);
        this.part14 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part14.addBox(0.0f, 0.0f, 0.0f, 4, 2, 6);
        this.part14.setRotationPoint(4.0f, -6.0f, -13.0f);
        this.part14.setTextureSize(64, 32);
        this.part14.mirror = true;
        this.setRotation(this.part14, 1.570796f, -1.570796f, 0.0f);
        this.part15 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part15.addBox(0.0f, 0.0f, 0.0f, 4, 2, 3);
        this.part15.setRotationPoint(-2.0f, -12.0f, -13.0f);
        this.part15.setTextureSize(64, 32);
        this.part15.mirror = true;
        this.setRotation(this.part15, 1.570796f, -1.570796f, 0.0f);
        this.part16 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part16.addBox(0.0f, 0.0f, 0.0f, 4, 2, 6);
        this.part16.setRotationPoint(-2.0f, -6.0f, -13.0f);
        this.part16.setTextureSize(64, 32);
        this.part16.mirror = true;
        this.setRotation(this.part16, 1.570796f, -1.570796f, 0.0f);
        this.part18 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part18.addBox(0.0f, 0.0f, 0.0f, 4, 4, 6);
        this.part18.setRotationPoint(8.0f, -6.0f, -13.0f);
        this.part18.setTextureSize(64, 32);
        this.part18.mirror = true;
        this.setRotation(this.part18, 0.0f, -1.570796f, 0.0f);
        this.part17 = new ModelRenderer((ModelBase)this, 0, 20);
        this.part17.addBox(0.0f, 0.0f, 0.0f, 4, 4, 2);
        this.part17.setRotationPoint(6.0f, -15.0f, -13.0f);
        this.part17.setTextureSize(64, 32);
        this.part17.mirror = true;
        this.setRotation(this.part17, 0.0f, -1.570796f, 0.0f);
        this.rightarm2 = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm2.addBox(-1.0f, -2.0f, -2.0f, 2, 3, 4);
        this.rightarm2.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarm2.setTextureSize(64, 32);
        this.rightarm2.mirror = true;
        this.setRotation(this.rightarm2, 0.0f, 0.0f, 0.0f);
        this.leftarm2 = new ModelRenderer((ModelBase)this, 42, 16);
        this.leftarm2.addBox(-1.0f, -2.0f, -2.0f, 2, 3, 4);
        this.leftarm2.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarm2.setTextureSize(64, 32);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, 0.0f, 0.0f, 0.0f);
        this.rightarm3 = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm3.addBox(-5.0f, -2.0f, -2.0f, 4, 12, 4);
        this.rightarm3.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarm3.setTextureSize(64, 32);
        this.rightarm3.mirror = true;
        this.setRotation(this.rightarm3, 0.0f, 0.0f, 0.0f);
        this.rightarm5 = new ModelRenderer((ModelBase)this, 40, 23);
        this.rightarm5.addBox(-9.0f, 5.0f, -1.0f, 4, 3, 2);
        this.rightarm5.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarm5.setTextureSize(64, 32);
        this.rightarm5.mirror = true;
        this.setRotation(this.rightarm5, 0.0f, 0.0f, 0.0f);
        this.leftleg2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.leftleg2.setRotationPoint(3.0f, 12.0f, 0.0f);
        this.leftleg2.setTextureSize(64, 32);
        this.leftleg2.mirror = true;
        this.setRotation(this.leftleg2, 0.0f, 0.0f, 0.0f);
        this.rightleg2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.rightleg2.setRotationPoint(-3.0f, 12.0f, 0.0f);
        this.rightleg2.setTextureSize(64, 32);
        this.rightleg2.mirror = true;
        this.setRotation(this.rightleg2, 0.0f, 0.0f, 0.0f);
        this.leftleg3 = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg3.addBox(-2.0f, 10.0f, -6.0f, 4, 2, 4);
        this.leftleg3.setRotationPoint(3.0f, 12.0f, 0.0f);
        this.leftleg3.setTextureSize(64, 32);
        this.leftleg3.mirror = true;
        this.setRotation(this.leftleg3, 0.0f, 0.0f, 0.0f);
        this.rightleg3 = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg3.addBox(-2.0f, 10.0f, -6.0f, 4, 2, 4);
        this.rightleg3.setRotationPoint(-3.0f, 12.0f, 0.0f);
        this.rightleg3.setTextureSize(64, 32);
        this.rightleg3.mirror = true;
        this.setRotation(this.rightleg3, 0.0f, 0.0f, 0.0f);
        this.leftleg4 = new ModelRenderer((ModelBase)this, 0, 26);
        this.leftleg4.addBox(-2.0f, 10.0f, -8.0f, 1, 2, 2);
        this.leftleg4.setRotationPoint(3.0f, 12.0f, 0.0f);
        this.leftleg4.setTextureSize(64, 32);
        this.leftleg4.mirror = true;
        this.setRotation(this.leftleg4, 0.0f, 0.0f, 0.0f);
        this.rightleg4 = new ModelRenderer((ModelBase)this, 0, 26);
        this.rightleg4.addBox(-2.0f, 10.0f, -8.0f, 1, 2, 2);
        this.rightleg4.setRotationPoint(-3.0f, 12.0f, 0.0f);
        this.rightleg4.setTextureSize(64, 32);
        this.rightleg4.mirror = true;
        this.setRotation(this.rightleg4, 0.0f, 0.0f, 0.0f);
        this.leftarm3 = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm3.addBox(1.0f, -2.0f, -2.0f, 4, 12, 4);
        this.leftarm3.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarm3.setTextureSize(64, 32);
        this.leftarm3.mirror = true;
        this.setRotation(this.leftarm3, 0.0f, 0.0f, 0.0f);
        this.rightarm4 = new ModelRenderer((ModelBase)this, 40, 23);
        this.rightarm4.addBox(-9.0f, 0.0f, -1.0f, 4, 3, 2);
        this.rightarm4.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarm4.setTextureSize(64, 32);
        this.rightarm4.mirror = true;
        this.setRotation(this.rightarm4, 0.0f, 0.0f, 0.0f);
        this.leftarm4 = new ModelRenderer((ModelBase)this, 40, 23);
        this.leftarm4.addBox(5.0f, 5.0f, -1.0f, 4, 3, 2);
        this.leftarm4.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarm4.setTextureSize(64, 32);
        this.leftarm4.mirror = true;
        this.setRotation(this.leftarm4, 0.0f, 0.0f, 0.0f);
        this.leftarm5 = new ModelRenderer((ModelBase)this, 40, 23);
        this.leftarm5.addBox(5.0f, 0.0f, -1.0f, 4, 3, 2);
        this.leftarm5.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarm5.setTextureSize(64, 32);
        this.leftarm5.mirror = true;
        this.setRotation(this.leftarm5, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.part1.render(f5);
        this.part2.render(f5);
        this.rightarm1.render(f5);
        this.leftarm1.render(f5);
        this.rightleg1.render(f5);
        this.leftleg1.render(f5);
        this.part3.render(f5);
        this.part4.render(f5);
        this.part5.render(f5);
        this.part6.render(f5);
        this.part8.render(f5);
        this.part9.render(f5);
        this.part10.render(f5);
        this.part12.render(f5);
        this.part11.render(f5);
        this.part13.render(f5);
        this.part14.render(f5);
        this.part15.render(f5);
        this.part16.render(f5);
        this.part18.render(f5);
        this.part17.render(f5);
        this.rightarm2.render(f5);
        this.leftarm2.render(f5);
        this.rightarm3.render(f5);
        this.rightarm5.render(f5);
        this.leftleg2.render(f5);
        this.rightleg2.render(f5);
        this.leftleg3.render(f5);
        this.rightleg3.render(f5);
        this.leftleg4.render(f5);
        this.rightleg4.render(f5);
        this.leftarm3.render(f5);
        this.rightarm4.render(f5);
        this.leftarm4.render(f5);
        this.leftarm5.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        this.leftleg1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.4f * f1;
        this.rightleg1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * f1;
        this.rightarm1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 2.0f * f1 * 0.5f;
        this.rightarm2.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 2.0f * f1 * 0.5f;
        this.rightarm3.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 2.0f * f1 * 0.5f;
        this.rightarm4.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 2.0f * f1 * 0.5f;
        this.rightarm5.rotateAngleX = MathHelper.cos((float)(f * 0.6662f + (float)Math.PI)) * 2.0f * f1 * 0.5f;
        this.leftarm1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 2.0f * f1 * 0.5f;
        this.leftarm2.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 2.0f * f1 * 0.5f;
        this.leftarm3.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 2.0f * f1 * 0.5f;
        this.leftarm4.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 2.0f * f1 * 0.5f;
        this.leftarm5.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 2.0f * f1 * 0.5f;
    }
}
