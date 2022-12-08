package land.neko.kanashi.mixin;

import land.neko.kanashi.mod.mods.movement.SprintMod;
import land.neko.kanashi.mod.mods.movement.StepMod;
import land.neko.kanashi.mod.mods.player.NofallMod;
import land.neko.kanashi.mod.mods.render.ESPMod;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {

	@Inject(method = "tick", at = @At("HEAD"))
	public void onPreTick(CallbackInfo info) {
		//KanashiMod.LOGGER.info("onPreTick");
		SprintMod.Sprint();
		StepMod.StepPre();
		ESPMod.onESPRender();
		NofallMod.Nofall();
	}



	@Inject(method = "tick", at = @At("TAIL"))
	public void onPostTick(CallbackInfo info) {
		//KanashiMod.LOGGER.info("onPostTick");
	}
}
