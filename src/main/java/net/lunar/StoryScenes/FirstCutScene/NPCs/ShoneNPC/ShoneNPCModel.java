package net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC;

import net.lunar.StoryEntities.DefaultNPCAnimations;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ShoneNPCModel<T extends ShoneNPCEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Character;
	private final ModelPart Head;

	public ShoneNPCModel(ModelPart root) {
		this.Character = root.getChild("Character");
		this.Head = Character.getChild("BodyPart").getChild("Head");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Character = modelPartData.addChild("Character", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData LeftLeg = Character.addChild("LeftLeg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

		ModelPartData LeftLegStart = LeftLeg.addChild("LeftLegStart", ModelPartBuilder.create().uv(16, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.1F, 0.0F, 0.0F));

		ModelPartData LeftLegEnd = LeftLeg.addChild("LeftLegEnd", ModelPartBuilder.create().uv(16, 54).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 54).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.25F))
				.uv(0, 16).cuboid(-2.1F, 6.05F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.1F, 6.0F, 0.0F));

		ModelPartData RightLeg = Character.addChild("RightLeg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

		ModelPartData RightLegStart = RightLeg.addChild("RightLegStart", ModelPartBuilder.create().uv(0, 16).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 32).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData RightLegEnd = RightLeg.addChild("RightLegEnd", ModelPartBuilder.create().uv(0, 22).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 38).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.25F))
				.uv(0, 16).cuboid(-2.0F, 6.05F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData BodyPart = Character.addChild("BodyPart", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

		ModelPartData Body = BodyPart.addChild("Body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(16, 32).cuboid(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

		ModelPartData RightArm = BodyPart.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -7.0F, 0.0F));

		ModelPartData RightArmStart = RightArm.addChild("RightArmStart", ModelPartBuilder.create().uv(40, 16).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(40, 32).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 5.5F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData RightArmEnd = RightArm.addChild("RightArmEnd", ModelPartBuilder.create().uv(40, 22).cuboid(-1.0F, 0.1633F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(40, 38).cuboid(-1.0F, 0.1633F, -2.0F, 3.0F, 5.0F, 4.0F, new Dilation(0.25F))
				.uv(40, 16).cuboid(-1.0F, 6.1733F, -2.0F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 3.8367F, 0.0F));

		ModelPartData LeftArm = BodyPart.addChild("LeftArm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -7.0F, 0.0F));

		ModelPartData LeftArmStart = LeftArm.addChild("LeftArmStart", ModelPartBuilder.create().uv(32, 48).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 48).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 5.5F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData LeftArmEnd = LeftArm.addChild("LeftArmEnd", ModelPartBuilder.create().uv(32, 54).cuboid(-2.0F, 0.1633F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 54).cuboid(-2.0F, 0.1633F, -2.0F, 3.0F, 5.0F, 4.0F, new Dilation(0.25F))
				.uv(32, 48).cuboid(-2.0F, 6.1633F, -2.0F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 3.8367F, 0.0F));

		ModelPartData Head = BodyPart.addChild("Head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -9.0F, 0.0F));

		ModelPartData LEye = Head.addChild("LEye", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -2.0F, -4.0F));

		ModelPartData LEyeM = LEye.addChild("LEyeM", ModelPartBuilder.create().uv(78, 1).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 0.0F, -0.05F));

		ModelPartData REye = Head.addChild("REye", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -2.0F, -4.05F));

		ModelPartData REyeM = REye.addChild("REyeM", ModelPartBuilder.create().uv(72, 1).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 0.0F, 0.0F));

		ModelPartData LBrow = Head.addChild("LBrow", ModelPartBuilder.create().uv(76, 0).cuboid(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -3.5F, -4.2F));

		ModelPartData RBrow = Head.addChild("RBrow", ModelPartBuilder.create().uv(72, 0).cuboid(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -3.5F, -4.2F));

		ModelPartData Boobs = BodyPart.addChild("Boobs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData BoobsLayer_r1 = Boobs.addChild("BoobsLayer_r1", ModelPartBuilder.create().uv(17, 38).cuboid(-3.0F, -4.0F, -0.25F, 6.0F, 4.0F, 4.0F, new Dilation(0.25F))
				.uv(17, 18).cuboid(-3.0F, -4.0F, -0.25F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.5F, -4.0F, -0.5236F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 80, 64);
	}

	@Override
	public void setAngles(ShoneNPCEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(DefaultNPCAnimations.WALK, limbSwing, limbSwingAmount, 2.5f, 2f);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Character.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Character;
	}
}