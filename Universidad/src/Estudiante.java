public class Estudiante {
    private Integer edad;
    private String nombre;
    private String apellido;
    private String carrera;
    private Float promedio;

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
public Float setPromedio(Float promedio){
    if (promedio < 0 || promedio > 10){
        System.out.println("promedio no valido");
        promedio = -1f;
        return this.promedio;
    } else {
        this.promedio = promedio;
        return this.promedio;
    }
}
}
