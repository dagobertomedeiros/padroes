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
public class Fase1 extends AbstractFaseDoJogo {

    public Fase1(IBackEnd backEnd) {
        super(backEnd);
    }

    @Override
    public void iniciar() {
        backEnd.desenhar();
        backEnd.playAnimation();
        backEnd.playAudio();
        System.out.println("Iniciando fase1");
    }

}
