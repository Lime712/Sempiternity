package sempiternity.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import sempiternity.content.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class SempiternityBlocks{
    public static Block

    wallOreErbia, wallOreAluminium,

    tube, tubeRouter, tubeBridge, tubeUnloader

    ;

    public static void load(){

        wallOreErbia = new OreBlock("ore-wall-erbia", SempiternityItems.erbia){{
            wallOre = true;
        }};

        wallOreAluminium = new OreBlock("ore-wall-aluminium", SempiternityItems.aluminium){{
            wallOre = true;
        }};

        wallOreAluminium = new OreBlock("ore-wall-aluminium", SempiternityItems.aluminium){{
            wallOre = true;
        }};

        tube = new Duct("tube"){{
            requirements(Category.distribution, with(SempiternityItems.aluminium, 1));
            health = 90;
            speed = 3f;
            researchCost = with(Items.aluminium, 5);
        }};

        tubeRouter = new DuctRouter("tube-router"){{
            requirements(Category.distribution, with(SempiternityItems.aluminium, 10));
            health = 90;
            speed = 3f;
            regionRotated1 = 1;
            solid = false;
            researchCost = with(SempiternityItems.aluminium, 20);
        }};

        tubeBridge = new DuctBridge("tube-bridge"){{
            requirements(Category.distribution, with(SempiternityItems.aluminium, 20));
            health = 90;
            speed = 3f;
            buildCostMultiplier = 2f;
            researchCostMultiplier = 0.3f;
            range = 2;
        }};

        ductUnloader = new DirectionalUnloader("duct-unloader"){{
            requirements(Category.distribution, with());
            health = 120;
            speed = 3f;
            solid = false;
            underBullets = true;
            regionRotated1 = 1;
        }};
    }
}