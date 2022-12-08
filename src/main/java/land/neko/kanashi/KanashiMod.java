package land.neko.kanashi;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KanashiMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("Kanashi");

	public static String CLIENT_NAME = "Kanashi";
	public static String CLIENT_VERSION = "v0";

	@Override
	public void onInitialize() {
		LOGGER.info("[Kanashi]");
	}

	public static MinecraftClient mc() {
		return MinecraftClient.getInstance();
	}

	public static ClientPlayerEntity player(){
		return MinecraftClient.getInstance().player;
	}

	public static ClientWorld world(){
		return MinecraftClient.getInstance().world;
	}

}
