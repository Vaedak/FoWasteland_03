package net.mcreator.falloutwastelands.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.falloutwastelands.world.inventory.BASEInventoryMenu;
import net.mcreator.falloutwastelands.network.BASEInventoryButtonMessage;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BASEInventoryScreen extends AbstractContainerScreen<BASEInventoryMenu> {
	private final static HashMap<String, Object> guistate = BASEInventoryMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_buttonplaceholdertexture;

	public BASEInventoryScreen(BASEInventoryMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 112;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("fallout_wastelands_:textures/screens/base_inventory.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("fallout_wastelands_:textures/screens/t_base_inventory.png"), this.leftPos + -116, this.topPos + -66, 0, 0, 340, 240, 340, 240);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_inventory.label_inventory"), -80, -57, -16711936, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_inventory.label_note_to_make_the_white_ui_disap"), -154, 105, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_inventory.label_a"), -154, 121, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_buttonplaceholdertexture = new ImageButton(this.leftPos + 194, this.topPos + -55, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEInventoryButtonMessage(0, x, y, z));
				BASEInventoryButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonplaceholdertexture", imagebutton_buttonplaceholdertexture);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture);
	}
}
