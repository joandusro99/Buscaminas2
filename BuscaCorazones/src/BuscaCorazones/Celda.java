/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaCorazones;

/**
 *
 * @author Estudiantes
 */
class Celda {
    
    private Corazon miCorazon;
    private Bandera miBandera;
    private Estado miEstado;
    private CorazonesAlrededor misCorazonesAlrededor;

    public Corazon getMiCorazon() {
        return miCorazon;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public Estado getMiEstado() {
        return miEstado;
    }

    public CorazonesAlrededor getMisCorazonesAlrededor() {
        return misCorazonesAlrededor;
    }

    public void setMiCorazon(Corazon miCorazon) {
        this.miCorazon = miCorazon;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public void setMiEstado(Estado miEstado) {
        this.miEstado = miEstado;
    }

    public void setMisCorazonesAlrededor(CorazonesAlrededor misCorazonesAlrededor) {
        this.misCorazonesAlrededor = misCorazonesAlrededor;
    }
    
    
    
}
