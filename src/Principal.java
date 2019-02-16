public class Principal {

    public static void main(String[] args) {


        GrupoAlumnos g1 = new GrupoAlumnos(20,"G1");

        Alumno a0 = new Alumno();
        Alumno a1 = new Alumno("Manuel","Garcia Sacedon","ax0074",8.35);
        Alumno a2 = new Alumno("Margarita","Lopez Medina","mj7726",7.70);
        Alumno a3 = new Alumno("Estela","Sanchez Arellano","bc2658",6.75);
        Alumno a4 = new Alumno("Francisco", "Gomez Prieto","bp0418",9.71);

        a0.setNombre("Felipe");
        a0.setApellido("Arias Gonzalez");
        a0.setMatricula("aa1253");
        a0.setCalificacion(3.50);

        a3.anadirAsignatura("Estructura de datos");
        a3.anadirAsignatura("Taller de sistemas");

        a4.anadirAsignatura("Fundamentos fisicos");
        a4.anadirAsignatura("Estructura de datos");

        g1.insertarAlumno(a0);
        g1.insertarAlumno(a1);
        g1.insertarAlumno(a2);
        g1.insertarAlumno(a3);
        g1.insertarAlumno(a4);

        System.out.println("\n**************************************************************\n");

        System.out.println("Asignaturas del primer alumno: ");
        a0.mostrarAsignaturas();

        System.out.println("Asignaturas del ultimo alumno: ");
        a3.mostrarAsignaturas();

        System.out.println("\n***************************************************************\n");

        g1.mostrarGrupo();

        System.out.println("·La mediad del grupo es: " + g1.mediaCalif());

        g1.maxCalif();

    }

}
