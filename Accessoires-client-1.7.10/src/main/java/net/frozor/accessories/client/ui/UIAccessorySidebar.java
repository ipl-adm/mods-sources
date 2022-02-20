/*
 * Decompiled with CFR 0.152.
 */
package net.frozor.accessories.client.ui;

import java.util.ArrayList;
import java.util.List;
import net.frozor.accessories.AccessoriesCore;
import net.frozor.accessories.client.ClientProxy;
import net.frozor.accessories.client.RenderHelper;
import net.frozor.accessories.client.item.CategoryType;
import net.frozor.accessories.client.network.NetworkHandler;
import net.frozor.accessories.client.network.packet.CPacketCapeSetting;
import net.frozor.accessories.client.ui.IPage;
import net.frozor.accessories.client.ui.Resources;
import net.frozor.accessories.client.ui.UIButton;
import net.frozor.accessories.client.ui.UICategoryPage;
import net.frozor.accessories.client.ui.UICheckBox;
import net.frozor.accessories.client.ui.UIItem;
import net.frozor.accessories.client.ui.UIScroll;
import net.frozor.accessories.client.ui.UIViewerPage;
import net.frozor.accessories.utils.Util;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public class UIAccessorySidebar
extends GuiScreen {
    private List<UIButton> category = new ArrayList<UIButton>();
    public float marginTop;
    private UICheckBox showMyCapeButton;
    public IPage page;
    public ScaledResolution resolution;
    private float guiLeft;
    public float scaleFactor;
    private float guiTop;
    public float marginLeft;
    private UICheckBox showAccessoriesButton;

    public void handleMouseInput() {
        super.handleMouseInput();
        if (this.page != null) {
            this.page.handleMouseInput();
        }
    }

    public void drawDebug(int mouseX, int mouseY) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)5.0f, (float)5.0f, (float)0.0f);
        GL11.glScalef((float)0.64f, (float)0.64f, (float)0.64f);
        this.mc.fontRenderer.drawStringWithShadow(UIScroll.l("\u0475\u008c\u0001x\u000fD\u0010\u000b]\u000b\u0475\u008c\u0002") + AccessoriesCore.SHOW_ACCESSORIES_SETTING, 0, 0, -16777216);
        this.mc.fontRenderer.drawStringWithShadow(String.format(UIItem.l("\u0437\u00edC\u0007J?V/}p\u0005\u0458\u0082/\u0000.\u0437\u00edCf\u0005\u0007J?V/|p\u0005\u0458\u0082/\u0000."), mouseX, mouseY), 0, 14, -16777216);
        this.mc.fontRenderer.drawStringWithShadow(String.format(UIScroll.l("\u0439\u00c0M5N\u0014\u0007G|\u000eO\u0013C]\u000b\u0475\u008c\u0002\u000e\u0003\u0439\u00c0MK\u000b/N\u000eL\u000f_]\u000b\u0475\u008c\u0002\u000e\u0003"), this.resolution.getScaledWidth(), this.resolution.getScaledHeight()), 0, 28, -16777216);
        this.mc.fontRenderer.drawStringWithShadow(String.format(UIItem.l("\u0437\u00edC'D8B#K\u0006@,Qp\u0005\u0458\u0082/\u0000d\u0015,"), Float.valueOf(this.marginLeft)), 0, 42, -16777216);
        this.mc.fontRenderer.drawStringWithShadow(String.format(UIScroll.l("\u0475\u008c\u0001F\u0006Y\u0000B\t\u007f\b[]\u000b\u0475\u008c\u0002\u000eI\u001b\u0001"), Float.valueOf(this.marginTop)), 0, 56, -16777216);
        this.mc.fontRenderer.drawStringWithShadow(String.format(UIItem.l("\u0458\u0082,v)D&@9\u001fj\u0437\u00ed@oA\u0458\u0082,\tj\u0437\u00ed@o\u000bz\u0014,"), this.resolution.getScaleFactor(), Float.valueOf(this.scaleFactor)), 0, 80, -16777216);
        GL11.glPopMatrix();
    }

    protected void actionPerformed(UIButton button) {
        if (button.getCategoryType() != null) {
            this.page = new UICategoryPage(button.getCategoryType(), this);
            this.marginLeft = (float)(this.resolution.getScaledWidth() / 2) - (float)this.page.getMarginLeft() * this.scaleFactor;
            this.page.init(this.marginLeft, this.marginTop, this.scaleFactor);
            for (UIButton uiButton : this.category) {
                uiButton.visible = false;
            }
        }
    }

    private /* synthetic */ void drawEntityOnScreen(int posX, int posY, int scale, float mouseX, float mouseY, EntityLivingBase ent) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)posX, (float)posY, (float)50.0f);
        GL11.glScalef((float)(-scale), (float)scale, (float)scale);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f = ent.renderYawOffset;
        float f1 = ent.rotationYaw;
        float f2 = ent.rotationPitch;
        float f3 = ent.prevRotationYawHead;
        float f4 = ent.rotationYawHead;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        net.minecraft.client.renderer.RenderHelper.enableStandardItemLighting();
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-((float)Math.atan(mouseY / 40.0f)) * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        ent.renderYawOffset = (float)Math.atan(mouseX / 40.0f) * 20.0f;
        int leftSideWidth = this.resolution.getScaledWidth() / 2 - posX;
        float rotate = mouseX / (float)leftSideWidth * 200.0f;
        GL11.glRotatef((float)(mouseX > 0.0f ? -rotate : 0.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        ent.rotationYaw = (float)Math.atan(mouseX / 40.0f) * 40.0f;
        ent.rotationPitch = -((float)Math.atan(mouseY / 40.0f)) * 20.0f;
        ent.rotationYawHead = ent.rotationYaw;
        ent.prevRotationYawHead = ent.rotationYaw;
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)ent, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        ent.renderYawOffset = f;
        ent.rotationYaw = f1;
        ent.rotationPitch = f2;
        ent.prevRotationYawHead = f3;
        ent.rotationYawHead = f4;
        GL11.glPopMatrix();
        net.minecraft.client.renderer.RenderHelper.disableStandardItemLighting();
        GL11.glDisable((int)32826);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glDisable((int)3553);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    protected void mouseClicked(int mouseX, int mouseY, int click) {
        if (click != 0) {
            return;
        }
        for (UIButton button : this.category) {
            if (!button.mousePressed(this.mc, mouseX, mouseY)) continue;
            button.func_146113_a(this.mc.getSoundHandler());
            this.actionPerformed(button);
        }
        if (this.showAccessoriesButton.mousePressed(this.mc, mouseX, mouseY)) {
            this.showAccessoriesButton.func_146113_a(this.mc.getSoundHandler());
            AccessoriesCore.SHOW_ACCESSORIES_SETTING = !AccessoriesCore.SHOW_ACCESSORIES_SETTING;
            AccessoriesCore.instance.changeValue("accessories", AccessoriesCore.SHOW_ACCESSORIES_SETTING + "");
            this.showAccessoriesButton.changeValue(AccessoriesCore.SHOW_ACCESSORIES_SETTING);
            return;
        }
        if (this.showMyCapeButton.mousePressed(this.mc, mouseX, mouseY)) {
            this.showMyCapeButton.func_146113_a(this.mc.getSoundHandler());
            AccessoriesCore.SHOW_MY_CAPE_SETTING = !AccessoriesCore.SHOW_MY_CAPE_SETTING;
            AccessoriesCore.instance.changeValue(UIScroll.l("X\u000fD\u0010t\nR8H\u0006[\u0002"), AccessoriesCore.SHOW_MY_CAPE_SETTING + "");
            this.showMyCapeButton.changeValue(AccessoriesCore.SHOW_MY_CAPE_SETTING);
            ClientProxy.equipManager.getEquipData().setShowCape(AccessoriesCore.SHOW_MY_CAPE_SETTING);
            CPacketCapeSetting packet = new CPacketCapeSetting(AccessoriesCore.SHOW_MY_CAPE_SETTING, false);
            NetworkHandler.sendPacket(packet);
            return;
        }
        if (this.page != null) {
            switch (this.page.mouseClicked(mouseX, mouseY, click)) {
                case BACK: {
                    this.page = this.page instanceof UIViewerPage ? new UICategoryPage(((UIViewerPage)this.page).getItem().getType(), this, ((UIViewerPage)this.page).getLastStagePage()) : null;
                }
            }
            this.initGui();
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawGradientRect(0, 0, this.resolution.getScaledWidth(), this.resolution.getScaledHeight(), 0x26000000, -872415232);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.marginLeft, (float)this.marginTop, (float)0.0f);
        GL11.glScalef((float)this.scaleFactor, (float)this.scaleFactor, (float)this.scaleFactor);
        this.drawSidebar(mouseX, mouseY, partialTicks, this.page == null);
        GL11.glPopMatrix();
        if (this.page != null) {
            this.page.drawPage(this.mc, this.marginLeft, this.marginTop, mouseX, mouseY, partialTicks);
        }
        for (UIButton button : this.category) {
            button.drawButton(this.mc, mouseX, mouseY);
        }
        this.showAccessoriesButton.drawButton(this.mc, mouseX, mouseY);
        this.showMyCapeButton.drawButton(this.mc, mouseX, mouseY);
    }

    private /* synthetic */ void drawSidebar(int mouseX, int mouseY, float partialTicks, boolean shift) {
        RenderHelper.drawRect(80.0, 0.0, 0.0, 130.0, 0x59000000);
        RenderHelper.drawRect(81.0, 0.0, 0.0, 131.0, 0x59000000);
        RenderHelper.drawGradientLeftToRight(80, 14, -872415232, 0);
        this.mc.fontRenderer.drawStringWithShadow(UIItem.l("\u0435\u0470\u0464\u047f\u0464\u040b\u0466\u047a\u0465\u0401"), 3, 3, -1);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)132.0f, (float)0.0f);
        RenderHelper.drawRect(80.0, 0.0, 0.0, 14.0, 0x64000000);
        RenderHelper.drawRect(81.0, 0.0, 0.0, 15.0, 0x64000000);
        GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
        this.mc.fontRenderer.drawString(Util.formattingBalance(ClientProxy.equipManager.getUserBalance()) + UIScroll.l("\u000bC"), 16, 5, -18379, true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glScalef((float)0.9f, (float)0.9f, (float)0.9f);
        this.mc.getTextureManager().bindTexture(Resources.GOLDEN_COIN);
        RenderHelper.drawCustomSizedTexture(2, 4, 12, 12);
        GL11.glPopMatrix();
        this.drawEntityOnScreen(shift ? 25 : 40, 40, 40, this.marginLeft + 51.0f - (float)mouseX, this.marginTop + 75.0f - 15.0f - (float)mouseY, (EntityLivingBase)this.mc.thePlayer);
    }

    public void initGui() {
        super.initGui();
        this.resolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        switch (this.resolution.getScaleFactor()) {
            case 1: {
                this.scaleFactor = 3.5f;
                break;
            }
            case 2: {
                this.scaleFactor = 1.5f;
                break;
            }
            case 3: 
            case 4: {
                this.scaleFactor = 1.0f;
                break;
            }
            default: {
                this.scaleFactor = 1.0f;
            }
        }
        this.marginLeft = (float)(this.resolution.getScaledWidth() / 2) - 50.0f * this.scaleFactor;
        this.marginTop = (float)(this.resolution.getScaledHeight() / 2) - 80.0f * this.scaleFactor;
        this.category.clear();
        if (this.page != null) {
            this.marginLeft = (float)(this.resolution.getScaledWidth() / 2) - (float)this.page.getMarginLeft() * this.scaleFactor;
            this.page.init(this.marginLeft, this.marginTop, this.scaleFactor);
        } else {
            for (int i = 0; i < CategoryType.values().length; ++i) {
                this.category.add(new UIButton(CategoryType.values()[i], CategoryType.values()[i].getName(), (int)this.marginLeft + (int)(55.0f * this.scaleFactor), (int)this.marginTop + (int)((float)(30 + 18 * i) * this.scaleFactor), 50, 16, this.scaleFactor));
            }
        }
        this.showAccessoriesButton = new UICheckBox((int)this.marginLeft, (int)(this.marginTop + 109.0f * this.scaleFactor), Util.rus(UIItem.l("\u046a\u042b\u046a\u0471\u046b\u0427\u046b\u201c\u046b\u203f\u046b\u042fj\u0405\u0442\u0405\u041e\u0404\u0448\u0405\u00fa\u0404\u20e6\u0405\u00ff\u0405\u044f\u0405\u041b\u0404\u0445")), this.scaleFactor, AccessoriesCore.SHOW_ACCESSORIES_SETTING);
        this.showMyCapeButton = new UICheckBox((int)this.marginLeft, (int)(this.marginTop + 120.0f * this.scaleFactor), Util.rus(UIScroll.l("\u040b\u043b\u040b\u00d2\u000b\u0447\u047c\u0447\u047e\u0447\u047f\u0447\u009b\u0447\u009c\u0446\u2012\u0447\u042d\u0447\u009b\u0446\u2031\u0446\u0421G\u040b\u0430\u040b\u00dc\u040b\u00d7\u040a\u2057")), this.scaleFactor, AccessoriesCore.SHOW_MY_CAPE_SETTING);
    }

    public void onGuiClosed() {
        ClientProxy.equipManager.getPreviewData().clear();
    }

    public void updateButtons() {
        if (this.page instanceof UIViewerPage) {
            ((UIViewerPage)this.page).updateButton();
        }
    }
}
