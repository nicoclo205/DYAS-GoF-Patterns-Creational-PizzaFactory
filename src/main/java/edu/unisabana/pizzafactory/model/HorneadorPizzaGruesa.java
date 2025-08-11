package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {
    
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza gruesa a temperatura alta por más tiempo.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}