
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Amasador;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.FabricaPizzaGruesa;
import edu.unisabana.pizzafactory.model.FabricaPizzaInt;
import edu.unisabana.pizzafactory.model.Horneador;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Moldeador;

import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    private FabricaPizza fabrica;

    public PreparadorPizza(){

    }

    public PreparadorPizza(FabricaPizza fabrica){
        this.fabrica = fabrica;
    }

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{
                new Ingrediente("queso",1),
                new Ingrediente("jamon",2)};    

            System.out.println("=== PREPARANDO PIZZA DELGADA ===");
            PreparadorPizza preparadorDelgada = new PreparadorPizza(new FabricaPizzaDelgada());
            preparadorDelgada.prepararPizza(ingredientes, Tamano.MEDIANO);
            
            System.out.println("\n=== PREPARANDO PIZZA GRUESA ===");
            PreparadorPizza preparadorGruesa = new PreparadorPizza(new FabricaPizzaGruesa());
            preparadorGruesa.prepararPizza(ingredientes, Tamano.PEQUENO);
            
            System.out.println("\n=== PREPARANDO PIZZA INTEGRAL ===");
            PreparadorPizza preparadorIntegral = new PreparadorPizza(new FabricaPizzaInt());
            preparadorIntegral.prepararPizza(ingredientes, Tamano.MEDIANO);

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        
        Amasador amasador = fabrica.crearAmasador();
        Horneador horneador = fabrica.crearHorneador();
        Moldeador moldeador = fabrica.crearMoldeador();

        amasador.amasar();
        if (tam == Tamano.PEQUENO) {
            moldeador.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            moldeador.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
