/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.AbstractFaseDoJogo;
import products.BackEndLinux;
import products.BackEndWindows;
import products.Fase1;
import products.Fase2;

/**
 *
 * @author dagoberto
 */
public class Run {
    public static void main(String args[]){
        AbstractFaseDoJogo fase = new Fase1(new BackEndLinux());
        fase.iniciar();
        fase = new Fase2(new BackEndWindows());
        fase.iniciar();
    }
}
