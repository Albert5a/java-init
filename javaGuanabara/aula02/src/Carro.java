public class Carro {
    String modelo;
    String cor;
    float tamanho;
    int velocidade;
    boolean ligado;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Um carro " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("está ligado? " + this.ligado);
    }

    void mover() {
        if  (this.ligado == false) {
            System.out.println("ERRO! Carro ligado não move");
        } else {
            System.out.println("Movendo com sucesso");
        }
    }

    void ligar() {
        this.ligado = true;
    }
    
    void desligar() {
        this.ligado = false;

    }
}
