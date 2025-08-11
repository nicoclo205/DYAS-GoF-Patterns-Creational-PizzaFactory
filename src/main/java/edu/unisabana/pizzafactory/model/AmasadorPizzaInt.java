package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaInt implements Amasador {
    
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaInt.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza integral con harina integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}