package land.neko.kanashi.mod.mods.render;

import com.google.common.eventbus.Subscribe;
import land.neko.kanashi.KanashiMod;
import land.neko.kanashi.mod.mods.Mod;
import land.neko.kanashi.mod.mods.movement.SprintMod;
import net.minecraft.SharedConstants;
import net.minecraft.client.util.math.MatrixStack;

import java.awt.*;

public class OverlayMod {


    @Subscribe
    public static void onOverlayRender() {
        if (!KanashiMod.mc().options.debugEnabled) {
            KanashiMod.mc().textRenderer.drawWithShadow(new MatrixStack(), String.format("%s (rel-%s)", KanashiMod.CLIENT_NAME + " " + KanashiMod.CLIENT_VERSION, SharedConstants.getGameVersion().getName()), 2, 2, 0xffffff);
            //SprintMod.SprintArrayRender();
            }
        }
    }
