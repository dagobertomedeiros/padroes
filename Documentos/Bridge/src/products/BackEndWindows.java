/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.IBackEnd;

/**
 *
 * @author dagoberto
 */
public class BackEndWindows implements IBackEnd {

    @Override
    public void desenhar() {
        System.out.println("Desenhando fase no windows");
    }

    @Override
    public void playAudio() {
        System.out.println("Iniciando audio no windows");
    }

    @Override
    public void playAnimation() {
        System.out.println("Iniciando animacao no windows");
    }

}
