// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwatanodog extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Leg1;
	private final ModelRenderer Leg2;
	private final ModelRenderer Leg3;
	private final ModelRenderer Leg4;
	private final ModelRenderer TailRotation;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Modelwatanodog() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 11.0F, -1.0F);
		bone.setTextureOffset(6, 34).addBox(-6.0F, -6.0F, -9.0F, 12.0F, 12.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(4, 33).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 10.0F, 12.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(1.0F, 1.4F, -9.3F);
		bone.addChild(Head);
		Head.setTextureOffset(0, 47).addBox(-6.0F, -6.4F, -6.7F, 10.0F, 10.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-6.0F, 0.6F, -7.7F, 10.0F, 3.0F, 8.0F, 0.2F, false);
		Head.setTextureOffset(0, 0).addBox(-5.0F, 1.6F, -6.7F, 8.0F, 2.0F, 6.0F, 0.5F, false);
		Head.setTextureOffset(0, 0).addBox(-6.0F, -0.4F, -2.7F, 10.0F, 1.0F, 3.0F, 0.2F, false);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -1.4F, -7.7F, 4.0F, 2.0F, 3.0F, 0.2F, false);
		Head.setTextureOffset(35, 57).addBox(1.0F, -9.4F, -3.7F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(6, 49).addBox(-6.0F, -10.4F, -3.7F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		Head.setTextureOffset(35, 57).addBox(-7.0F, -9.4F, -3.7F, 4.0F, 5.0F, 2.0F, 0.0F, true);
		Head.setTextureOffset(2, 46).addBox(2.0F, -10.4F, -3.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(40, 0).addBox(-2.0F, -1.4F, -8.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -3.9F, -6.2F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.2F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.0F, -3.9F, -6.2F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
		cube_r2.setTextureOffset(0, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.2F, false);

		Leg1 = new ModelRenderer(this);
		Leg1.setRotationPoint(-4.0F, 5.0F, -5.0F);
		bone.addChild(Leg1);
		Leg1.setTextureOffset(20, 52).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, true);

		Leg2 = new ModelRenderer(this);
		Leg2.setRotationPoint(4.0F, 5.0F, -5.0F);
		bone.addChild(Leg2);
		Leg2.setTextureOffset(20, 52).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		Leg3 = new ModelRenderer(this);
		Leg3.setRotationPoint(-4.0F, 5.0F, 7.0F);
		bone.addChild(Leg3);
		Leg3.setTextureOffset(20, 51).addBox(-0.5F, -1.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, true);

		Leg4 = new ModelRenderer(this);
		Leg4.setRotationPoint(3.0F, 5.0F, 7.0F);
		bone.addChild(Leg4);
		Leg4.setTextureOffset(20, 51).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		TailRotation = new ModelRenderer(this);
		TailRotation.setRotationPoint(0.0F, -3.0F, 10.0F);
		bone.addChild(TailRotation);
		setRotationAngle(TailRotation, -1.0908F, 0.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -2.4094F, 8.8749F);
		TailRotation.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(36, 26).addBox(-2.5F, -2.1563F, 3.7404F, 5.0F, 3.0F, 1.0F, 0.1F, false);
		cube_r3.setTextureOffset(37, 23).addBox(-1.5F, -3.1563F, 3.7404F, 3.0F, 5.0F, 1.0F, 0.1F, false);
		cube_r3.setTextureOffset(36, 26).addBox(-1.5F, -2.1563F, 5.7404F, 3.0F, 3.0F, 1.0F, 0.5F, false);
		cube_r3.setTextureOffset(29, 19).addBox(-2.5F, -3.1563F, 4.7404F, 5.0F, 5.0F, 4.0F, 0.1F, false);
		cube_r3.setTextureOffset(10, 37).addBox(-2.5F, -3.1563F, -0.2596F, 5.0F, 5.0F, 9.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -0.4094F, 3.8749F);
		TailRotation.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 54).addBox(-2.0F, -2.5999F, 0.1049F, 4.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailRotation.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 55).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}