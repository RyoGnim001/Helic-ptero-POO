public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;

    public Helicoptero(int capacidade){
        this.ligado = false;
        this.altitude = 0;
        this.capacidade = capacidade;
        this.pessoas = 0;
    }

    public boolean entrada(){
        if (pessoas < capacidade){
            pessoas++;
            System.out.println("Uma pessoas entrou no Helicóptero.");
            return true;
        }else{
            System.out.println("A capacidade do Helicóptero foi excedida.");
            return false;
        }
    }

    public boolean saida(){
        if (pessoas > 0){
            pessoas--;
            System.out.println("Uma pessoa saiu do Helicóptero.");
            return true;
        }else{
            System.out.println("Não existe nenhum passageiro embarcado.");
            return false;
        }
    }

    public boolean ligar(){
        if (ligado == false){
            ligado = true;
            System.out.println("O Helicóptero foi ligado.");
            return true;
        }else{
            System.out.println("O Helicóptero já est ligado.");
            return false;
        }
    }

    public boolean decolar(int pegandoAltitude){
        if (ligado && altitude == 0){
            altitude = pegandoAltitude;
            System.out.println("O Helicóptero está decolando para " + pegandoAltitude + " Metros de altitude.");
            return true;
        }else if(!ligado){
            System.out.println("Não é possível decolar, o Helicóptero esta deligado.");
            return false;
        }else{
            System.out.println("O Helicóptero já está ligado.");
            return false;
        }
    }

    public boolean aterrissar(){
        if (ligado && altitude > 0){
            altitude = 0;
            System.out.println("Helicóptero aterrissando.");
            return true;
        }else if(!ligado){
            System.out.println("O Helicóptero já está desligado.");
            return false;
        }else{
            System.out.println("O Helicóptero já está no chão.");
            return false;
        }
    }

    public boolean isLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public  int getAltitude(){
        return altitude;
    }
    public void setAltitude(int altitude){
        this.altitude = altitude;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public String StatusHelicóptero(){
        return "Helicóptero [ligado=" + ligado + ", altitude=" + altitude + " metros, capacidade=" + capacidade
                + ", pessoas a bordo=" + pessoas + "]";
    }

}
