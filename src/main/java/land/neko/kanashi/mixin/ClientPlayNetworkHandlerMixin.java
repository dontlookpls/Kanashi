package land.neko.kanashi.mixin;

import land.neko.kanashi.KanashiMod;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    @Inject(method = "sendPacket", at = @At("HEAD"))
    private void onSendPacket(Packet<?> packet, CallbackInfo info){
        KanashiMod.LOGGER.info("PACKET SENT: " + packet);
    }

}
