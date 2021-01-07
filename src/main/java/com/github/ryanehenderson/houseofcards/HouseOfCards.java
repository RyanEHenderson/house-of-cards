package com.github.ryanehenderson.houseofcards;

import com.github.ryanehenderson.houseofcards.setup.Registration;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("houseofcards")
public class HouseOfCards {
    public static HouseOfCards instance;
    public static final String MOD_ID = "houseofcards";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public HouseOfCards() {
        instance = this;
        Registration.register();
    }
}
