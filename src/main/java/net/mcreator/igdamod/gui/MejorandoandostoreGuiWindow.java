
package net.mcreator.igdamod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.igdamod.IgdamodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MejorandoandostoreGuiWindow extends ContainerScreen<MejorandoandostoreGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = MejorandoandostoreGui.guistate;
	public MejorandoandostoreGuiWindow(MejorandoandostoreGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 306;
		this.ySize = 226;
	}
	private static final ResourceLocation texture = new ResourceLocation("igdamod:textures/mejorandoandostore.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Store", 138, 6, -16724992);
		this.font.drawString(ms, "10 points", 32, 19, -12829636);
		this.font.drawString(ms, "50 points", 132, 21, -12829636);
		this.font.drawString(ms, "100 points", 230, 21, -12829636);
		this.font.drawString(ms, "Insert Points", 3, 145, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 110, this.guiTop + 60, 95, 20, new StringTextComponent("Ancient debris"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(0, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 107, this.guiTop + 36, 100, 20, new StringTextComponent("IGDA block x 64"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(1, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 16, this.guiTop + 36, 75, 20, new StringTextComponent("Diamond x2"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(2, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 60, 95, 20, new StringTextComponent("Heart of the sea"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(3, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 8, this.guiTop + 85, 95, 20, new StringTextComponent("Wither head x2"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(4, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 216, this.guiTop + 36, 80, 20, new StringTextComponent("Cataxis Hat"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(5, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 219, this.guiTop + 60, 75, 20, new StringTextComponent("Watanomask"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(6, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 220, this.guiTop + 84, 75, 20, new StringTextComponent("Angek Mask"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(7, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 117, this.guiTop + 84, 80, 20, new StringTextComponent("Duke's Bone"), e -> {
			if (true) {
				IgdamodMod.PACKET_HANDLER.sendToServer(new MejorandoandostoreGui.ButtonPressedMessage(8, x, y, z));
				MejorandoandostoreGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
	}
}
