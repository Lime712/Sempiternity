package sempiternity;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import sempiternity.content.*;

public class SempiternityMod extends Mod{

    public SempiternityMod(){
        
    }

    @Override
    public void loadContent(){
        SempiternityItems.load();
        SempiternityLiquids.load();
        SempiternityBlocks.load();
    }

}
