/*  IndustrialBuildCraft
 *  By minecraftl539
 *  This is the first class made in 2013.
 */
 



package ibc.mcl.ibc;

import ibc.mcl.ibc.lib.Reference;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class IndustrialBuildCraft {
    

   
    @PreInit
    public void PreInit(FMLPreInitializationEvent event) {
       //everything thats loading before all the mods are loading 
    }
    @Init
    public void Init(FMLInitializationEvent event) {
     // everything thats loading while all other mods are loading   
    }
    @PostInit
    public void PostInit(FMLPostInitializationEvent event) {
      //everything thats loading after all mods loaded. Here will be the IC2 API loading and the BC API loading.  
    }
}

