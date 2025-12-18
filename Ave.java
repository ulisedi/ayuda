
/**
 * Ave.java
 * Definición de la clase Ave
 * 
 * @author profe
 */
public class Ave extends Animal {
    public Ave(Sexo s) {
        super(s);
    }

    public Ave() {
        super();
    }

    /**
     * Hace que el ave se limpie.
     */
    public void aseate() {
        System.out.println("Me estoy limpiando");
    }

    /**
     * Hace que el ave levante el vuelo.
     */
    public void vuela() {
        System.out.println("Estoy volando");
    }
}