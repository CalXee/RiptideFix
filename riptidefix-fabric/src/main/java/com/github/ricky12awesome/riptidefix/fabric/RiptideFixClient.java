package com.github.ricky12awesome.riptidefix;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class RiptideFixClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("fabric")) {

        }
    }
}
