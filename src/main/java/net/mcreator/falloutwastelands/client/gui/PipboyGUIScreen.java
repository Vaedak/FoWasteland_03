package net.mcreator.falloutwastelands.client.gui;

public class PipboyGUIScreen extends AbstractContainerScreen<PipboyGUIMenu> {

	private final static HashMap<String, Object> guistate = PipboyGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_teleport_to_base;

	public PipboyGUIScreen(PipboyGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fallout_wastelands_:textures/screens/pipboy_gui.png");

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
	}

	@Override
	public void init() {
		super.init();

		button_teleport_to_base = Button.builder(Component.translatable("gui.fallout_wastelands_.pipboy_gui.button_teleport_to_base"), e -> {
			if (

			ShouldDisplayTPButtonProcedure.execute()

			) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new PipboyGUIButtonMessage(0, x, y, z));
				PipboyGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -117, this.topPos + 14, 108, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible =

						ShouldDisplayTPButtonProcedure.execute()

				;
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});

		guistate.put("button:button_teleport_to_base", button_teleport_to_base);
		this.addRenderableWidget(button_teleport_to_base);

	}

}
