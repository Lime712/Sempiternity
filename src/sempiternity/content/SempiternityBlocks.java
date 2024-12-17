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
import sempiternity.content.SempiternityItems;
import sempiternity.content.SempiternityLiquids;

import static arc.Core.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class SempiternityBlocks{
    public static Block

    wallOreErbia, wallOreAluminium,

    tube, tubeRouter, tubeBridge, tubeUnloader,

    vortexPump, pipe, pipeBridge

    ;

    public static void load(){

        //environment

        //boulder

        //ore

        wallOreErbia = new OreBlock("ore-wall-erbia", SempiternityItems.erbia){{
            wallOre = true;
        }};

        wallOreAluminium = new OreBlock("ore-wall-aluminium", SempiternityItems.aluminium){{
            wallOre = true;
        }};

        //crafting

        //defense

        //walls

        //distribution

        tube = new Duct("tube"){{
            requirements(Category.distribution, with(SempiternityItems.aluminium, 1));
            health = 90;
            speed = 3f;
            researchCost = with(SempiternityItems.aluminium, 5);
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

        tubeUnloader = new DirectionalUnloader("tube-unloader"){{
            requirements(Category.distribution, with(SempiternityItems.amalgam, 20, SempiternityItems.erbia, 20, SempiternityItems.nitride, 20));
            health = 120;
            speed = 3f;
            solid = false;
            underBullets = true;
            regionRotated1 = 1;
        }};

        //liquid

        vortexPump = new Pump("vortex-pump"){{
            requirements(Category.liquid, with(SempiternityItems.erbia, 40, SempiternityItems.aluminium, 30));
            pumpAmount = 1f / 24f;
            size = 2;
        }};
        
        pipe = new ArmoredConduit("pipe"){{
            requirements(Category.liquid, with(SempiternityItems.erbia, 2));
            botColor = Color.valueOf("282b34");
            leaks = true;
            liquidCapacity = 20f;
            liquidPressure = 1.03f;
            health = 250;
            researchCostMultiplier = 3;
            underBullets = true;
        }};

        pipeBridge = new DirectionLiquidBridge("pipe-bridge"){{
            requirements(Category.liquid, with(SempiternityItems.aluminium, 8, SempiternityItems.erbia, 20));
            range = 2;
            hasPower = false;
            researchCostMultiplier = 1;
            underBullets = true;

            ((Conduit)pipe).rotBridgeReplacement = this;
        }};

        //power

        //production

        //storage

        //turrets

        //units

        //payloads

    }
}