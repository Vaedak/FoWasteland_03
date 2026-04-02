package net.mcreator.falloutwastelands.client.gui;

public class BASEUpgradeGUIScreen extends AbstractContainerScreen<BASEUpgradeGUIMenu> {

	private final static HashMap<String, Object> guistate = BASEUpgradeGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_upgrade_tier;

	public BASEUpgradeGUIScreen(BASEUpgradeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 173;
		this.imageHeight = 202;
	}

	private static final ResourceLocation texture = new ResourceLocation("fallout_wastelands_:textures/screens/base_upgrade_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_upgrade_gui.label_cost"), 77, 43, -16711936, false);
		guiGraphics.drawString(this.font,

				UpgradeDisplayTierProcedure.execute(world, x, y, z), 50, 7, -16711936, false);
	}

	@Override
	public void init() {
		super.init();

		button_upgrade_tier = Button.builder(Component.translatable("gui.fallout_wastelands_.base_upgrade_gui.button_upgrade_tier"), e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEUpgradeGUIButtonMessage(0, x, y, z));
				BASEUpgradeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 41, this.topPos + 16, 87, 20).build();

		guistate.put("button:button_upgrade_tier", button_upgrade_tier);
		this.addRenderableWidget(button_upgrade_tier);

	}

}
