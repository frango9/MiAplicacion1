public class Alumno {

    private static int MAX = 5;

    private String nombre;
    private String apellido;
    private String matricula;
    private double calificacion;
    private String[] asignaturas;
    private int numAsig;

    public Alumno() {

        nombre = "";
        apellido = "";
        matricula = "";
        calificacion = 0.0;
        asignaturas = new String[MAX];
        numAsig = 0;
    }

    public Alumno(String nom, String ape, String mat, double cal) {

        nombre = nom;
        apellido = ape;
        matricula = mat;
        calificacion = cal;
        numAsig = 0;
        asignaturas = new String[MAX];
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(int calificacion)
    {
        this.calificacion = calificacion;
    }

    public int getNumAsig()
    {
        return numAsig;
    }


    public void anadirAsignatura(String asig)
    {
        if(numAsig == MAX){
            System.out.println("No es posible agregar mas asignaturas.");
        }
        else{
            asignaturas[numAsig++] = asig;
        }
    }


    public void mostrarAsignaturas()
    {
        if(numAsig == 0)
            System.out.println("Sin asignaturas.");
        else{
            for (int i = 0; i < numAsig; i++) {
                System.out.println(asignaturas[i]);
            }
        }
    }

}