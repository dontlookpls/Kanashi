package land.neko.kanashi.mod.mods;

import java.awt.*;

public abstract class Mod {

    private static String label;
    private boolean state;
    private int keybind;
    private Color color;

    public Mod(String label) {
        Mod.label = label;
    }
    public static String getLabel() {
        return label;
    }
    public Color getColor() {
        return color;
    }
}
