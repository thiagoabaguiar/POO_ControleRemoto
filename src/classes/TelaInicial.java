package classes;

/**
 *
 * @author Thiago Aguiar
 */

public class TelaInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControleRemoto c1 = new ControleRemoto();
        
        c1.ligarDesligar();
        c1.playPause();
        String retorno = c1.abrirFecharMenu();                
        System.out.println(retorno);
 
    }
    
}
