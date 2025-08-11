package edu.unisabana.pizzafactory.model;

public class FabricaPizzaInt extends FabricaPizza {
    
    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaInt();
    }
    
    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaInt();
    }
    
    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaInt();
    }
}