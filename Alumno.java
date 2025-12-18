/**
 * Alumno.java
 * Definición de la clase Alumno
 * 
 * @author profe
 */
public class Alumno {
    private String nombre;
    private double notaMedia = 0.0;
    public String[] modulos = {"ED", "PROG", "SI", "IP1", "Inglés", "LM", "DIGI"};
    private double[] notasModulos = new double[7];

    public Alumno(){
        this.nombre = "";
        this.notaMedia = 0.0;
    }

    public Alumno(String nombre){
        this.nombre = nombre;
        this.notaMedia = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public double[] getNotasModulos() {
        return notasModulos;
    }

    public void setNotasModulos(double nota, int i) {
        this.notasModulos[i] = nota;
    }

    public void calcularNotaMedia(){
        double notaAux =  0.0;
        for (int i=0; i < this.modulos.length; i++){
            notaAux += this.notasModulos[i];
        }
        notaAux = notaAux / this.modulos.length;
        this.notaMedia = notaAux;
        //this.setNotaMedia(notaAux);
    }

}