public class Alumno {

    static int MAX = 5;

    private  String nombre
    private String apellido
    private String matricula;
    private double calificacion;
    private String[] asignaturas;
    private int numAsig;

    public Alumno(){

        nombre = "";
        apellido = "";
        matricula = "";
        calificacion = 0;
        asignaturas = new String[MAX];
        numAsig = 0;
    }

    pubic Alumno (String nom, String ape, String mat, double cal){

        nombre = nom;
        apellido = ape;
        matricula = mat;
        calificacion = cal;
        numAsig = 0;
        asignaturas = new String[MAX];
    }


    public static void anadirAsignatura(String asig){

    }


    public static void mostrarAsignaturas()

}