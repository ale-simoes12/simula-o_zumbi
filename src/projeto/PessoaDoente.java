/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author unifamedrano
 */
public class PessoaDoente extends Pessoa implements IMovable {

    //metodo mover
    Virus v;

    @Override

    /**
     * metodo mover
     */
    public void mover() {
        
        
        
        
        

    }

    /**
     * construtor pessoaDonete
     *
     * @param x
     * @param y
     * @param cor
     * @param v
     */
    public PessoaDoente(int x, int y, int cor, Virus v) {
        super(x, y, cor);
        this.v = v;

    }

}
