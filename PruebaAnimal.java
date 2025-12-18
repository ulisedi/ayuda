

/**
 * PruebaAnimal.java
 * Programa que prueba la clase Animal y sus subclases
 * 
 * @author profe
 */
public class PruebaAnimal {
    public static void main(String[] args) {
        Gato garfield = new Gato(Sexo.MACHO, "6465464");
        Gato tom = new Gato(Sexo.MACHO,"34534534");
        Gato lisa = new Gato(Sexo.HEMBRA,"34342");
        Gato silvestre = new Gato(Sexo.MACHO,"435345");
        System.out.println(garfield);
        System.out.println(tom);
        System.out.println(lisa);
        System.out.println(silvestre);
        Ave miLoro = new Ave();
        miLoro.aseate();
        miLoro.vuela();
        Pinguino pingu = new Pinguino(Sexo.HEMBRA);
        pingu.aseate();
        pingu.vuela();
        pingu.duerme();
    }
}
