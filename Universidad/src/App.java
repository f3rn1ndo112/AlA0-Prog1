public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Materia mat1 = new Materia();
        mat1.setNombreMateria("Matematicas");
        mat1.setCalificacion(9.5f);
        mat1.setCodigoMateria("MAT101");
        mat1.setCreditoMateria(5);
        Materia BD1 = new Materia();
        BD1.setNombreMateria("Base de Datos");
        BD1.setCalificacion(8.5f);
        BD1.setCodigoMateria("BD101");
        BD1.setCreditoMateria(4);
        Estudiante est1 = new Estudiante();
        est1.setNombre("Juan");
        est1.agregarMaterias(new Materia[]{mat1, BD1});
        est1.setPromedio(est1.getMaterias());
        System.out.println("el promedio de " + est1.getNombre() + " es: " + est1.getPromedio());
        System.out.println("El estudiante " + est1.getNombre() + " esta inscrito en las materias " + est1.getMaterias()[0].getNombreMateria() + " y " + est1.getMaterias()[1].getNombreMateria());
    }
}
