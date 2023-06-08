package com.example;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderEventHandler {
    @SubscribeEvent
    public void onRenderPlayerPost(RenderPlayerEvent.Post event) {
        GlStateManager.pushMatrix();
        // Translate to the player's position.
        GlStateManager.translate(event.entityPlayer.posX, event.entityPlayer.posY, event.entityPlayer.posZ);
        // TODO: Adjust these values to move the flower to the correct position on the player's head.
        GlStateManager.translate(0.0F, 1.5F, 0.0F);
        // TODO: Adjust this value to rotate the flower to the correct orientation.
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        Minecraft.getMinecraft().getBlockRendererDispatcher().renderBlockBrightness(Blocks.red_flower.getDefaultState(), 1.0F);
        GlStateManager.popMatrix();
    }
}
