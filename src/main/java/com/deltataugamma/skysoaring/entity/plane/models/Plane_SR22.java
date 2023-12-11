// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
/*
import com.deltataugamma.skysoaring.entity.plane.PlaneEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class Plane_SR22<T extends PlaneEntity> extends EntityModel<T> {
	private final ModelRenderer wings;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer body;
	private final ModelRenderer frontfront;
	private final ModelRenderer edge_r1;
	private final ModelRenderer edge_r2;
	private final ModelRenderer cockpit;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer steering;
	private final ModelRenderer Rudder3_r1;
	private final ModelRenderer Rudder1_r1;
	private final ModelRenderer details;
	private final ModelRenderer cube_r5;
	private final ModelRenderer wheels;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Plane_SR22() {
		texWidth = 256;
		texHeight = 256;

		wings = new ModelRenderer(this);
		wings.setPos(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(5.4924F, -21.75F, -10.9548F);
		wings.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0443F, 0.1745F, 0.0077F);
		cube_r1.texOffs(0, 0).addBox(-83.7511F, -4.1918F, -43.2509F, 78.0F, 3.0F, 32.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(5.4924F, -21.75F, -10.9548F);
		wings.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.0973F, 0.1745F, -3.1339F);
		cube_r2.texOffs(0, 0).addBox(-83.7222F, -4.1998F, 11.0696F, 78.0F, 3.0F, 32.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(0, 104).addBox(-4.0F, -33.0F, 13.0F, 18.0F, 18.0F, 39.0F, 0.0F, false);
		body.texOffs(104, 35).addBox(-7.0F, -33.0F, -12.0F, 24.0F, 19.0F, 25.0F, 0.0F, false);
		body.texOffs(0, 35).addBox(-9.0F, -34.0F, -60.0F, 28.0F, 21.0F, 48.0F, 0.0F, false);

		frontfront = new ModelRenderer(this);
		frontfront.setPos(-51.3953F, -4.7842F, 37.7447F);
		body.addChild(frontfront);
		

		edge_r1 = new ModelRenderer(this);
		edge_r1.setPos(56.5F, -19.5482F, -102.0581F);
		frontfront.addChild(edge_r1);
		setRotationAngle(edge_r1, 0.1745F, 0.0F, 0.0F);
		edge_r1.texOffs(114, 140).addBox(-13.5F, -8.5F, -7.0F, 27.0F, 17.0F, 14.0F, 0.0F, false);

		edge_r2 = new ModelRenderer(this);
		edge_r2.setPos(56.8877F, -16.9658F, -48.6996F);
		frontfront.addChild(edge_r2);
		setRotationAngle(edge_r2, -0.1309F, 0.0F, 0.0F);
		edge_r2.texOffs(1, 162).addBox(-13.7924F, 0.2667F, -61.0886F, 26.0F, 14.0F, 14.0F, 0.0F, false);

		cockpit = new ModelRenderer(this);
		cockpit.setPos(0.0F, 24.0F, 0.0F);
		cockpit.texOffs(140, 82).addBox(-6.0F, -47.0F, -43.0F, 22.0F, 14.0F, 22.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(5.4924F, -21.75F, -10.9548F);
		cockpit.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.texOffs(63, 171).addBox(-10.4924F, -40.5783F, -23.6649F, 20.0F, 10.0F, 19.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(5.4924F, -21.75F, -10.9548F);
		cockpit.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
		cube_r4.texOffs(75, 104).addBox(-10.4924F, -15.3901F, -21.7694F, 20.0F, 11.0F, 25.0F, 0.0F, false);

		steering = new ModelRenderer(this);
		steering.setPos(0.0F, 24.0F, 0.0F);
		steering.texOffs(141, 171).addBox(4.0F, -53.8983F, 45.5903F, 2.0F, 29.0F, 17.0F, 0.0F, false);

		Rudder3_r1 = new ModelRenderer(this);
		Rudder3_r1.setPos(5.4924F, -21.75F, -10.9548F);
		steering.addChild(Rudder3_r1);
		setRotationAngle(Rudder3_r1, 0.0F, 0.0F, 1.5708F);
		Rudder3_r1.texOffs(0, 35).addBox(-5.6483F, 0.9924F, 49.5452F, 2.0F, 29.0F, 17.0F, 0.0F, false);
		Rudder3_r1.texOffs(179, 154).addBox(-5.6483F, -30.0076F, 49.5452F, 2.0F, 29.0F, 17.0F, 0.0F, false);

		Rudder1_r1 = new ModelRenderer(this);
		Rudder1_r1.setPos(5.4924F, -21.75F, -10.9548F);
		steering.addChild(Rudder1_r1);
		setRotationAngle(Rudder1_r1, -1.5708F, 0.0F, 0.0F);
		Rudder1_r1.texOffs(0, 0).addBox(-1.4924F, -56.5672F, -21.548F, 2.0F, 15.0F, 11.0F, 0.0F, false);

		details = new ModelRenderer(this);
		details.setPos(0.0F, 24.0F, 0.0F);
		details.texOffs(15, 0).addBox(4.0F, -31.0F, -74.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(5.4924F, -25.75F, -9.9548F);
		details.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
		cube_r5.texOffs(140, 118).addBox(-20.3511F, -6.2224F, -66.0452F, 42.0F, 6.0F, 2.0F, 0.0F, false);

		wheels = new ModelRenderer(this);
		wheels.setPos(-39.0F, 13.0F, 47.0F);
		details.addChild(wheels);
		

		bone2 = new ModelRenderer(this);
		bone2.setPos(-10.5F, -7.7181F, 2.8794F);
		wheels.addChild(bone2);
		bone2.texOffs(21, 35).addBox(41.5F, -12.2819F, -109.8794F, 2.0F, 7.0F, 7.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(54.9924F, -27.0319F, -60.8342F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.8727F, 0.0F, 0.0F);
		cube_r6.texOffs(0, 104).addBox(-11.4924F, -24.0473F, -43.9955F, 1.0F, 2.0F, 14.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(12.75F, -5.4207F, 2.1441F);
		wheels.addChild(bone);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(31.7424F, -29.3293F, -60.099F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0F);
		cube_r7.texOffs(21, 35).addBox(10.5076F, 14.75F, -49.0452F, 2.0F, 7.0F, 7.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(31.7424F, -29.3293F, -60.099F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.8727F, 0.0F, 0.0F);
		cube_r8.texOffs(0, 104).addBox(9.5076F, -24.0473F, -43.9955F, 1.0F, 2.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		wings.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		cockpit.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		steering.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		details.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}*/