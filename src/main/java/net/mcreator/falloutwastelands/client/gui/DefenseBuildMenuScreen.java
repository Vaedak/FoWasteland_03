package net.mcreator.falloutwastelands.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.falloutwastelands.world.inventory.DefenseBuildMenuMenu;
import net.mcreator.falloutwastelands.procedures.DisplayMK1TurretProcedure;
import net.mcreator.falloutwastelands.network.DefenseBuildMenuButtonMessage;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DefenseBuildMenuScreen extends AbstractContainerScreen<DefenseBuildMenuMenu> {
	private final static HashMap<String, Object> guistate = DefenseBuildMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_build;

	public DefenseBuildMenuScreen(DefenseBuildMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 421;
		this.imageHeight = 217;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (DisplayMK1TurretProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 44, this.topPos + 64, 30, 0f + (float) Math.atan((this.leftPos + 44 - mouseX) / 40.0), (float) Math.atan((this.topPos + 15 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
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
	}

	@Override
	public void init() {
		super.init();
		button_build = Button.builder(Component.translatable("gui.fallout_wastelands_.defense_build_menu.button_build"), e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new DefenseBuildMenuButtonMessage(0, x, y, z));
				DefenseBuildMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 21, this.topPos + 86, 51, 20).build();
		guistate.put("button:button_build", button_build);
		this.addRenderableWidget(button_build);
	}
}
