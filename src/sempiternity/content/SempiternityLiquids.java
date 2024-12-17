package sempiternity.content;

import arc.graphics.*;
import mindustry.type.*;

public class SempiternityLiquids{
    public static Liquid ammonia, chlorine, epoxy, mercury;

    public static void load(){
        ammonia = new Liquid("ammonia", Color.valueOf("ffcade")){{
            heatCapacity = 0.6f;
            temperature = 0.3f;
            boilPoint = 0.4f;
            gasColor = Color.valueOf("ffe3ee");
        }};

        chlorine = new Liquid("chlorine", Color.valueOf("dce86e")){{
            gas = true;
            flammability = 1f;
        }};

        epoxy = new Liquid("epoxy", Color.valueOf("afb386")){{
            viscosity = 0.5f;
            flammability = 1.5f;
            explosiveness = 0.3f;
            boilPoint = 0.55f;
            gasColor = Color.valueOf("585c2c");
        }};

        mercury = new Liquid("mercury", Color.valueOf("cdeded")){{
            heatCapacity = 1f;
            temperature = 0.4f;
            viscosity = 0.6f;
        }};
    }
}