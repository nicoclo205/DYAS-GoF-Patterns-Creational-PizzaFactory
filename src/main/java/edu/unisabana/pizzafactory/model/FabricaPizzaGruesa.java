package edu.unisabana.pizzafactory.model;

public class FabricaPizzaGruesa extends FabricaPizza {

    @Override
    public Amasador crearAmasador(){
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador(){
        return new HorneadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador(){
        return new MoldeadorPizzaGruesa();
    }
    
}
