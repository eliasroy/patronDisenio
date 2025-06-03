package singlenton;

public class main {
    public static void main(String[] args) {
        DtabaConector conector = DtabaConector.getInstancia();
        System.out.println("Conector a Dtaba obtenido: " + conector);

        DtabaConector otroConector = DtabaConector.getInstancia();
        System.out.println("Otro conector a Dtaba obtenido: " + otroConector);

    }
}
