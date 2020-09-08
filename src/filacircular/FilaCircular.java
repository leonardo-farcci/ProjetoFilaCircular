/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircular;

/**
 *
 * @author lab212
 */
public class FilaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f = new Fila();
        f.insereFim(2);
        System.out.println(f.exibeLista());
        f.insereFim(3);
        System.out.println(f.exibeLista());
        f.insereFim(4);
        System.out.println(f.exibeLista());
        f.insereFim(5);
        System.out.println(f.exibeLista());
        f.removeFim();
        System.out.println(f.exibeLista());
    }
    
}
