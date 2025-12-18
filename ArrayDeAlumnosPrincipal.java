/**
 * ArrayDeAlumnosPrincipal.java
 * Programa que prueba un array de la clase Alumno
 * 
 * @author profe
 */
public class ArrayDeAlumnosPrincipal {
    public static void main(String[] args) {
        // Define la estructura, un array de 5 alumnos
        // pero no crea los objetos
        Alumno[] alum = new Alumno[2];
        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        String nombreIntroducido;
        //double notaIntroducida;
        //double notaAux = 0.0;
        for (int i = 0; i < alum.length; i++) {
            alum[i] = new Alumno();
            System.out.println("Alumno " + (i+1));
            System.out.print("Nombre: ");
            nombreIntroducido = System.console().readLine();
            (alum[i]).setNombre(nombreIntroducido);
            //System.out.print("Nota media: ");
            // notaIntroducida = Double.parseDouble(System.console().readLine());
            // alum[i].setNotaMedia(notaIntroducida);
            System.out.println("Dame las notas de cada módulo: ");
            for (int modulos = 0; modulos < alum[i].modulos.length; modulos++){
                // notaAux = 0.0;
                double nota;
                System.out.print("Introduce la nota del módulo " + alum[i].modulos[modulos] + ": ");
                nota = Double.parseDouble(System.console().readLine());
                alum[i].setNotasModulos(nota, modulos);
                //System.out.println();
                //notaAux += nota;
            }
            alum[i].calcularNotaMedia();
            System.out.println();
            //alum[i].setNotaMedia(notaAux / alum[i].modulos.length);
        } // for i
          // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");
        double sumaDeMedias = 0;
        for (int i = 0; i < alum.length; i++) {
            System.out.println("Alumno " + (i+1));
            System.out.println("Nombre: " + alum[i].getNombre());
            for (int modulos = 0; modulos < alum[i].modulos.length; modulos++){
                System.out.print("La nota del módulo " + alum[i].modulos[modulos] + ": ");
                System.out.println(alum[i].getNotasModulos()[modulos]);
                //notaAux += nota;
            }
            System.out.printf("Nota media: %.2f", alum[i].getNotaMedia());
            System.out.println();
            System.out.println("----------------------------");
            sumaDeMedias += alum[i].getNotaMedia();
        } // for i
        System.out.printf("La media global de la clase es %.2f", (sumaDeMedias / alum.length));
        System.out.println();
    }
}