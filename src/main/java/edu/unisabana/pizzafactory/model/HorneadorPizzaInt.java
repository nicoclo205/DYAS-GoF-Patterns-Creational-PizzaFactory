package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaInt implements Horneador {
    
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaInt.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza integral a temperatura media.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}