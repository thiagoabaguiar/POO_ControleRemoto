package classes;

/**
 * @author Thiago Aguiar
 */

public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private int volumeAntesMudo;
    private boolean ligado;
    private boolean tocando;

    // Construtor
    public ControleRemoto() {
        this.volume = 10;
        this.volumeAntesMudo = this.volume;
        this.ligado = false;
        this.tocando = false;
    }

    // Getter e Setter
    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolumeAntesMudo() {
        return this.volumeAntesMudo;
    }

    private void setVolumeAntesMudo(int volume) {
        this.volumeAntesMudo = volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos abstratos
    @Override
    public void ligarDesligar() {

        if (this.isLigado()) {

            this.setLigado(false);
            this.setTocando(false);

        } else {

            this.setLigado(true);

        }

    }

    @Override
    public String abrirFecharMenu() {

        String retorno, barrasVolume = new String();
        
        if (this.isLigado()) {

            for (int i = 0; i < this.getVolume(); i++) {
                barrasVolume += "[" + (i + 1) + "]";
            }

            retorno = "*** MENU *** \n"
                    + "Ligado/Desligado: " + this.isLigado() + "\n"
                    + "Volume: " + barrasVolume + "\n"
                    + "Tocando: " + this.isTocando();

        } else {

            retorno = "Aparelho Desligado";

        }

        return retorno;
    }

    @Override
    public void maisVolume() {

        if (this.isLigado() && this.getVolume() < 100) {

            this.setVolume(this.getVolume() + 1);
            this.setVolumeAntesMudo(this.getVolumeAntesMudo() + 1);

        }

    }

    @Override
    public void menosVolume() {

        if (this.isLigado() && this.getVolume() > 0) {

            this.setVolume(this.getVolume() - 1);
            this.setVolumeAntesMudo(this.getVolumeAntesMudo() - 1);

        }

    }

    @Override
    public void ligarDesligarMudo() {

        if (this.isLigado() && this.getVolume() > 0) {

            this.setVolume(0);

        } else {

            this.setVolume(this.getVolumeAntesMudo());

        }

    }

    @Override
    public void playPause() {

        if (this.isLigado() && !this.isTocando()) {

            this.setTocando(true);

        } else if (this.isLigado() && this.isTocando()) {

            this.setTocando(false);

        }

    }

}
