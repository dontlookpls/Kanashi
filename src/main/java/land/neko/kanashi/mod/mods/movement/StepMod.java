package land.neko.kanashi.mod.mods.movement;

import land.neko.kanashi.KanashiMod;
import land.neko.kanashi.mod.ModManager;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

import static land.neko.kanashi.KanashiMod.player;

public class StepMod extends ModManager {

    static boolean ground = false;

    public static void StepPre(){
        if(KanashiMod.player().horizontalCollision && KanashiMod.player().isOnGround() && player().stepHeight <= 0.6F){
            PlayerMoveC2SPacket packetLook = new PlayerMoveC2SPacket.LookAndOnGround(KanashiMod.player().getYaw(),KanashiMod.player().getPitch(), ground);
            PlayerMoveC2SPacket packetPos = new PlayerMoveC2SPacket.PositionAndOnGround(KanashiMod.player().getX(), KanashiMod.player().getY() + 1, KanashiMod.player().getZ(), ground);
            KanashiMod.mc().getNetworkHandler().sendPacket(packetLook);
            KanashiMod.mc().getNetworkHandler().sendPacket(packetPos);
            KanashiMod.player().stepHeight = 1.01F;
            KanashiMod.LOGGER.info("Step");
            ground = false;
        } else {
            KanashiMod.player().stepHeight = 0.6F;
        }
    }
}
