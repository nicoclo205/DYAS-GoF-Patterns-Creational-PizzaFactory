package edu.unisabana.pizzafactory.model;

public class FabricaPizzaDelgada extends FabricaPizza {

    @Override
    public Amasador crearAmasador(){
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador(){
        return new HorneadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador(){
        return new MoldeadorPizzaDelgada();
    }
    
}
