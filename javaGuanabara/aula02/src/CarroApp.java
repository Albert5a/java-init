public class CarroApp {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Blazer";
        carro1.cor = "Verde";
        carro1.tamanho = 3.5f;
        carro1.velocidade = 120;
        carro1.ligar();
        carro1.status();
        carro1.mover();
    }
}
