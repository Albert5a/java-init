public class Caneta {
    public String modelo;
    private float ponta;
    public String cor;
    private boolean tampada;

    public Caneta(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }



    // public Caneta(String m, String c, float p) { // este é o método construtor
    //     this.modelo = m;
    //     this.cor = c;
    //     this.ponta = p;
    //     this.tampar();

    // }

    // public void tampar() {
    //     this.tampada = true;
    // }

    // public void destampar() {
    //     this.tampada = false;
    // }

    // public String getModelo() {
    //     return this.modelo;
    // }
    // public void setModelo(String m) {
    //     this.modelo = m;
    // }
    // public float getPonta() {
    //     return this.ponta;
    // }
    // public void setPonta(float p) {
    //     this.ponta = p;
    // }

    // public void status() {
    //     System.out.println("SOBRE CANETA: ");
    //     System.out.println("MODELO: " + this.getModelo());
    //     System.out.println("ponta: " + this.getPonta());
    //     System.out.println("cor: " + this.cor);
    //     System.out.println("tampada: " + this.tampada);
    //     System.out.println("CONCLUÍDO");
    // }
    
}
