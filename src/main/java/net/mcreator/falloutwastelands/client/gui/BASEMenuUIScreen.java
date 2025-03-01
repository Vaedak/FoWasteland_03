package net.mcreator.falloutwastelands.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.falloutwastelands.world.inventory.BASEMenuUIMenu;
import net.mcreator.falloutwastelands.procedures.DisplayCapsStoredProcedure;
import net.mcreator.falloutwastelands.procedures.DisplayBaseNameStoredProcedure;
import net.mcreator.falloutwastelands.network.BASEMenuUIButtonMessage;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BASEMenuUIScreen extends AbstractContainerScreen<BASEMenuUIMenu> {
	private final static HashMap<String, Object> guistate = BASEMenuUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox NameInput;
	ImageButton imagebutton_locker_storage;
	ImageButton imagebutton_buttonplaceholdertexture;
	ImageButton imagebutton_buttonplaceholdertexture1;
	ImageButton imagebutton_buttonplaceholdertexture2;

	public BASEMenuUIScreen(BASEMenuUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		NameInput.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("fallout_wastelands_:textures/screens/base_main_menu.png"), this.leftPos + -84, this.topPos + -37, 0, 0, 340, 240, 340, 240);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (NameInput.isFocused())
			return NameInput.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		NameInput.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String NameInputValue = NameInput.getValue();
		super.resize(minecraft, width, height);
		NameInput.setValue(NameInputValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_inventory"), 6, 34, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_empty"), 295, 109, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_d"), 284, 121, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_done"), -68, 184, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_done1"), 169, -29, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_done2"), 286, 92, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_caps"), 291, 20, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_input_caps"), 290, 77, -3368704, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_caps_expense"), 268, 55, -6750208, false);
		guiGraphics.drawString(this.font,

				DisplayBaseNameStoredProcedure.execute(world, x, y, z, entity), -75, -26, -16724992, false);
		guiGraphics.drawString(this.font,

				DisplayCapsStoredProcedure.execute(world, x, y, z, entity), 272, 43, -16711936, false);
	}

	@Override
	public void init() {
		super.init();
		NameInput = new EditBox(this.font, this.leftPos + 47, this.topPos + -33, 118, 18, Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput").getString());
				else
					setSuggestion(null);
			}
		};
		NameInput.setSuggestion(Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput").getString());
		NameInput.setMaxLength(32767);
		guistate.put("text:NameInput", NameInput);
		this.addWidget(this.NameInput);
		imagebutton_locker_storage = new ImageButton(this.leftPos + -13, this.topPos + 33, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_locker_storage.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(0, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_locker_storage", imagebutton_locker_storage);
		this.addRenderableWidget(imagebutton_locker_storage);
		imagebutton_buttonplaceholdertexture = new ImageButton(this.leftPos + -83, this.topPos + 181, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(1, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonplaceholdertexture", imagebutton_buttonplaceholdertexture);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture);
		imagebutton_buttonplaceholdertexture1 = new ImageButton(this.leftPos + 190, this.topPos + -32, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture1.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(2, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonplaceholdertexture1", imagebutton_buttonplaceholdertexture1);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture1);
		imagebutton_buttonplaceholdertexture2 = new ImageButton(this.leftPos + -87, this.topPos + 68, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture2.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(3, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonplaceholdertexture2", imagebutton_buttonplaceholdertexture2);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture2);
	}
}
