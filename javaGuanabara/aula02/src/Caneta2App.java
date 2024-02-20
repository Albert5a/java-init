public class Caneta2App {
    public static void main(String[] args) throws Exception {
        Caneta2 c2 = new Caneta2();
        c2.modelo = "BIC cristal";
        c2.cor = "Azul";
        // c2.ponta = 0.5f;
        c2.carga = 1;
        // c2.tampada = false;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
