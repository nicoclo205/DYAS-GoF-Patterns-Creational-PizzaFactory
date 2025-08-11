package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaInt implements Moldeador {
    
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaInt.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena integral con técnica especial.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaInt.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana integral con técnica especial.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}