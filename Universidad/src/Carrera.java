public class Carrera {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

public String getNombre(){
    return this.nombre;
}
public String setNombre(String nombre){
    this.nombre = nombre;
    return this.nombre;
}
public String getDireccion(){
    return this.direccion;
}
public String setDireccion(String direccion){
    this.direccion = direccion;
    return this.direccion;
}
public Estudiante[] getEstudiantes(){
    return this.estudiantes;
}
public Estudiante[] agregarEstudiantes(Estudiante[] estudiantes){
    this.estudiantes = estudiantes;
    return this.estudiantes;
}
public Estudiante[] listareEstudiantes(Estudiante[] estudiantes){
    System.out.println("Los estudiantes inscritos en la carrera de " + this.getNombre() + " son:");
    for (int i = 0; i < estudiantes.length; i++){
        System.out.println(estudiantes[i].getNombre());
    }
    return this.estudiantes;
}
public Estudiante[] buscarEstudiantes(String nombre, Estudiante[] estudiantes){
    System.out.println("Buscando estudiante...");
    for (int i = 0; i < estudiantes.length; i++){
        if (estudiantes[i].getNombre().equals(nombre)){
            System.out.println("Estudiante encontrado: " + estudiantes[i].getNombre());
            return new Estudiante[]{estudiantes[i]};
        }
    }
    System.out.println("Estudiante no encontrado");
    return new Estudiante[]{};
}

}