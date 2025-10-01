public class Estudiante {
    private Integer edad;
    private String nombre;
    private String apellido;
    private String carrera;
    private Float promedio;
    private Materia[] materias;

public Integer getEdad(){
    return this.edad;
}
public Integer setEdad(Integer edad){
    if (edad < 16){
        System.out.println("edad no valida");
        edad = -1;
        return this.edad;
    } else {
        this.edad = edad;
        return this.edad;
    }
}
public String getNombre(){
    return this.nombre;
}
public String setNombre(String nombre){
      if (nombre.length() < 0){
        System.out.println("nombre no valido");
        nombre = "N/A";
        return this.nombre;
    } else {
        this.nombre = nombre;
        return this.nombre;
    }
}
public String getApellido(){
    return this.apellido;
}
public String setApellido(String apellido){
    if (apellido.length() < 0){
        System.out.println("apellido no valido");
        apellido = "N/A";
        return this.apellido;
    } else {
        this.apellido = apellido;
        return this.apellido;
    }
}
public String getCarrera(){
    return this.carrera;
}
public String setCarrera(String carrera){
    this.carrera = carrera;
    return this.carrera;
}
public Float getPromedio(){
    return this.promedio;
}
public Float setPromedio(Materia[] materias){
    Float suma = 0.0f;
    for (int i = 0; i < materias.length; i++){
        suma += materias[i].getCalificacion();
    }
    this.promedio = suma / materias.length;
    if (this.promedio < 0.0f || this.promedio > 10.0f){
        System.out.println("promedio no valido");
        this.promedio = -1.0f;
    }
    return this.promedio;
}

public Materia[] getMaterias(){
    return this.materias;
}
public Materia[] agregarMaterias(Materia[] materias){
    this.materias = materias;
    return this.materias;
}
}
