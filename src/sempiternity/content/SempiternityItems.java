package sempiternity.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class SempiternityItems{
    public static Item aerogel, aluminium, amalgam, erbia, nitride;

    public static void load(){
        aerogel = new Item("aerogel", Color.valueOf("edb347")){{
            cost = 2f;
        }};

        aluminum = new Item("aluminum", Color.valueOf("a89fc9")){{
            hardness = 3;
            cost = 1;
            healthScaling = 0.75f;
        }};

        amalgam = new Item("amalgam", Color.valueOf("405859")){{
            cost = 1.2f;
            healthScaling = 0.5f;
        }};

        erbia = new Item("erbia", Color.valueOf("ae467c")){{
            cost = 1.2f;
            healthScaling = 1f;
        }};

        nitride = new Item("nitride", Color.valueOf("dcd2f0")){{
            cost = 1.3f;
            healthScaling = 0.5f;
        }};
    }
}