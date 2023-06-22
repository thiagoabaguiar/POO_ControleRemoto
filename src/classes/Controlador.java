package classes;

/**
 * @author Thiago Aguiar
*/

public interface Controlador {
    
    public abstract void ligarDesligar();
    public abstract String abrirFecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarDesligarMudo();
    public abstract void playPause();
    
}