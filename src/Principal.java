public class Principal {

    public static void main(String[] args) {

        Alumno a0 = new Alumno();
        Alumno a1 = new Alumno("Manuel","Garcia Sacedon","ax0074",8.35);
        Alumno a2 = new Alumno("Margarita","Lopez Medina","mj7726",7.70);
        Alumno a3 = new Alumno("Estela","Sanchez Arellano","bc2658",6.75);

        a0.setNombre("Felipe");
        a0.setApellido("Arias Gonzalez");
        a0.setMatricula("aa1253");
        a0.setCalificacion(3.50);

        a3.anadirAsignatura("Estructura de datos");
        a3.anadirAsignatura("Taller de sistemas");

        System.out.println("Asignaturas del primer alumno: ");
        a0.mostrarAsignaturas();

        System.out.println("Asignaturas del ultimo alumno: ");
        a3.mostrarAsignaturas();

    }

}
