import java.nio.file.StandardOpenOption;

/**
 * Mascota.java
 * Definición de la interfaz Mascota
 *
 * @author profe
 */
public interface Mascota {
    String getCodigo();

    void hazRuido();

    void come(String comida);

    void peleaCon(Animal contrincante);
    void hacerseNecesidades();
}
