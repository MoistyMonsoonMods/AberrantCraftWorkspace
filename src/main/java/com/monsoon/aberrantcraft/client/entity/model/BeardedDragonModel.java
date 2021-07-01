package com.monsoon.aberrantcraft.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.monsoon.aberrantcraft.common.entity.BeardedDragon;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BeardedDragonModel<T extends BeardedDragon> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer tail;
	private final ModelRenderer frontlegr;
	private final ModelRenderer frontlegl;
	private final ModelRenderer backlegr;
	private final ModelRenderer backlegl;

	public BeardedDragonModel() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(27, 46).addBox(-3.0F, -4.0F, -5.0F, 6.0F, 4.0F, 10.0F, 0.0F, false);
		body.texOffs(3, 40).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 0.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -2.0F, -5.0F);
		body.addChild(head);
		head.texOffs(16, 15).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 3.0F, 0.0F, false);
		head.texOffs(23, 0).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		head.texOffs(37, 3).addBox(-2.0F, 2.0F, -4.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
		head.texOffs(43, 31).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 2.0F, -4.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.texOffs(37, 3).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -2.0F, 5.0F);
		body.addChild(tail);
		tail.texOffs(0, 15).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 10.0F, 0.0F, false);

		frontlegr = new ModelRenderer(this);
		frontlegr.setPos(-3.0F, 0.0F, -3.5F);
		body.addChild(frontlegr);
		frontlegr.texOffs(20, 7).addBox(-4.0F, 0.0F, -1.5F, 4.0F, 0.0F, 3.0F, 0.0F, false);

		frontlegl = new ModelRenderer(this);
		frontlegl.setPos(3.0F, 0.0F, -3.5F);
		body.addChild(frontlegl);
		frontlegl.texOffs(0, 6).addBox(0.0F, 0.0F, -1.5F, 4.0F, 0.0F, 3.0F, 0.0F, false);

		backlegr = new ModelRenderer(this);
		backlegr.setPos(-3.0F, 0.0F, 4.5F);
		body.addChild(backlegr);
		backlegr.texOffs(0, 3).addBox(-4.0F, 0.0F, -1.5F, 4.0F, 0.0F, 3.0F, 0.0F, false);

		backlegl = new ModelRenderer(this);
		backlegl.setPos(3.0F, 0.0F, 4.5F);
		body.addChild(backlegl);
		backlegl.texOffs(0, 0).addBox(0.0F, 0.0F, -1.5F, 4.0F, 0.0F, 3.0F, 0.0F, false);
	}
	
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		
	}

	@Override
	public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_,
			float p_225597_6_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_,
			float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
		// TODO Auto-generated method stub
		
	}
}