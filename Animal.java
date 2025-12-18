import java.nio.file.StandardOpenOption;

/**
 * Animal.java
 * Definición de la clase Animal
 * 
 * @author profe
 */
public enum Sexo {
    MACHO, HEMBRA, HERMAFRODITA
}

public abstract class Animal {
    private Sexo sexo;

    public Animal() {
        sexo = Sexo.MACHO;
    }

    public Animal(Sexo s) {
        sexo = s;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String toString() {
        return "Sexo: " + this.sexo + "\n";
    }

    /**
     * Hace que el animal se eche a dormir.
     */
    public void duerme() {
        System.out.println("Zzzzzzz");
    }
    
public void hacerseNecesidades(){
   System.out.println("PSSSSSSSSSSSSSSS");
    };




}