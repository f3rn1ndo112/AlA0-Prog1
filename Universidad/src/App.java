public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("    SISTEMA UNIVERSITARIO    \n");

        Materia mat1 = new Materia();
        mat1.setNombreMateria("Matematicas");
        mat1.setCalificacion(9.0f);
        mat1.setCodigoMateria("MAT101");
        mat1.setCreditoMateria(5);

        Materia mat2 = new Materia();
        mat2.setNombreMateria("Base de Datos");
        mat2.setCalificacion(8.5f);
        mat2.setCodigoMateria("BD101");
        mat2.setCreditoMateria(4);

        Materia mat3 = new Materia();
        mat3.setNombreMateria("Programacion");
        mat3.setCalificacion(10.0f);
        mat3.setCodigoMateria("PROG102");
        mat3.setCreditoMateria(6);

        Estudiante est1 = new Estudiante();
        est1.setNombre("Juan");
        est1.setApellido("Olguin");
        est1.setEdad(20);
        est1.setCarrera("Ingenieria en Sistemas");
        est1.agregarMaterias(new Materia[]{mat1, mat2});
        est1.setPromedio(est1.getMaterias());

        Estudiante est2 = new Estudiante();
        est2.setNombre("Ramiro");
        est2.setApellido("Sabbath");
        est2.setEdad(21);
        est2.setCarrera("Ingenieria en Sistemas");
        est2.agregarMaterias(new Materia[]{mat1, mat3});
        est2.setPromedio(est2.getMaterias());

        Estudiante est3 = new Estudiante();
        est3.setNombre("Frabizio");
        est3.setApellido("Bendoleña");
        est3.setEdad(22);
        est3.setCarrera("Ingenieria en Sistemas");
        est3.agregarMaterias(new Materia[]{mat2, mat3});
        est3.setPromedio(est3.getMaterias());

        Estudiante[] estudiantes = new Estudiante[]{est1, est2, est3};

        Carrera carrera = new Carrera();
        carrera.setNombre("Ingenieria en Sistemas");
        carrera.setDireccion("Av. Siempre Viva 123");
        carrera.agregarEstudiantes(estudiantes);

        System.out.println("\n    Listado de Estudiantes    ");
        carrera.listareEstudiantes(estudiantes);

        System.out.println("\n    Promedios    ");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre() + " " + estudiantes[i].getApellido() +
                " - Promedio: " + estudiantes[i].getPromedio());
        }
        System.out.println("\n    Buscar Estudiante    ");
        carrera.buscarEstudiantes("Juan", estudiantes);
    }
}
