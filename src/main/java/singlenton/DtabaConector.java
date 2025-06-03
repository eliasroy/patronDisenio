package singlenton;

/**
 * rules:
 * 1 debemos tener un construcctor privado
 * 2 debemos tener atributos privado estatico
 * 3 debemos tener un metodo estatico que retorne la instancia
 */
public class DtabaConector {

    private static DtabaConector instancia;

    private DtabaConector() {
        System.out.println("Conector a Dtaba creado");
    }

    public static synchronized DtabaConector getInstancia() {
        if (instancia == null) {
            instancia = new DtabaConector();
        }
        return instancia;
    }

    public void conectar() {
        // Lógica para conectar a Dtaba
        System.out.println("Conectando a Dtaba...");
    }
    public void desconectar() {
        // Lógica para desconectar de Dtaba
        System.out.println("Desconectando de Dtaba...");
    }
}
