package land.neko.kanashi.mod.mods.player;

import land.neko.kanashi.KanashiMod;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class NofallMod {

    public static void Nofall(){
        if(KanashiMod.player().fallDistance >= 2) {
            //KanashiMod.player().setOnGround(true);
            PlayerMoveC2SPacket packetLook = new PlayerMoveC2SPacket.LookAndOnGround(KanashiMod.player().getYaw(),KanashiMod.player().getPitch(), true);
            PlayerMoveC2SPacket packetPos = new PlayerMoveC2SPacket.PositionAndOnGround(KanashiMod.player().getX(), KanashiMod.player().getY(), KanashiMod.player().getZ(), true);
            KanashiMod.mc().getNetworkHandler().sendPacket(packetLook);
            KanashiMod.mc().getNetworkHandler().sendPacket(packetPos);
            KanashiMod.LOGGER.info("NoFall");
        }
    }
}
