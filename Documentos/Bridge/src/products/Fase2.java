/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.AbstractFaseDoJogo;
import interfaces.IBackEnd;

/**
 *
 * @author dagoberto
 */
public class Fase2 extends AbstractFaseDoJogo {
    
    public Fase2(IBackEnd backEnd) {
        super(backEnd);
    }

    @Override
    public void iniciar() {
        System.out.println("_______________");
        backEnd.desenhar();
        backEnd.playAnimation();
        backEnd.playAudio();
        backEnd.playAnimation();
        backEnd.playAudio();
        System.out.println("_______________");
        System.out.println("Iniciando fase2");
        
    }

}
