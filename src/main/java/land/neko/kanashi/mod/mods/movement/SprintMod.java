package land.neko.kanashi.mod.mods.movement;

import land.neko.kanashi.KanashiMod;
import land.neko.kanashi.mod.mods.Mod;

public class SprintMod extends Mod {

    static boolean state = true;

    public SprintMod(String label) {
        super("Sprint");
    }

    public static void Sprint(){
        if(KanashiMod.mc().options.forwardKey.isPressed() && !KanashiMod.player().horizontalCollision && !KanashiMod.player().isSprinting() && !KanashiMod.player().isSneaking() && state){
            KanashiMod.player().setSprinting(true);
            KanashiMod.LOGGER.info("Sprint");
        }
    }
}
