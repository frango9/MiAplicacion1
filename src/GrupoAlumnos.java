public class GrupoAlumnos {

    private Alumno[] listaAlum;
    private int numAlum;
    private int maximo;
    private String nombreGrupo;

    public GrupoAlumnos(){

        numAlum = 0;
        maximo = 10;
        nombreGrupo = "";
        listaAlum = new Alumno[maximo];

    }

    public GrupoAlumnos(int max, String nom) {

        maximo = max;
        nombreGrupo = nom;
        numAlum = 0;
        listaAlum = new Alumno[maximo];

    }

    public int getnumAlum()
    {
        return numAlum;
    }

    public int getmaximo()
    {
        return maximo;
    }

    public String getnombreGrupo()
    {
        return nombreGrupo;
    }

    public void setnombreGrupo(String nombreGrupo)
    {
        this.nombreGrupo = nombreGrupo;
    }

    public Alumno alumnoPos(int i){

        return listaAlum[i];
    }

    public boolean insertarAlumno(Alumno a){

        if(numAlum < maximo){
            listaAlum[numAlum]= a;
            numAlum++;

            return true;
        }

        else return false;
    }

    public void mostrarGrupo(){
        //TODO
        System.out.println(nombreGrupo);

        for (int i = 0; i < maximo ; i++) {
            System.out.println(listaAlum[i]);
        }

    }

    /*public double mediaCalif(){


        for (int i = 0; i < numAlum; i++) {
            
        }

    }*/

}
