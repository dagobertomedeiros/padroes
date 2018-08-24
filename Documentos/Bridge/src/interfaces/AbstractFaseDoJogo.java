/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author dagoberto
 */
public abstract class AbstractFaseDoJogo {

    protected IBackEnd backEnd;

    public AbstractFaseDoJogo(IBackEnd backEnd) {
        this.backEnd = backEnd;
    }

    public abstract void iniciar();
}
