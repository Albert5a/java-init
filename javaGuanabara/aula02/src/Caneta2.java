public class Caneta2 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if  (this.tampada == true) {
            System.out.println("ERRO! Caneta tampada não rabisca");
        } else {
            System.out.println("Rabiscado com sucesso");
        }
    }

    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;

    }
}
