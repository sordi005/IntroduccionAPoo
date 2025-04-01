
public class Empleado {
    private int empledadoID;
    private String nombre;
    private String puesto;
    private Double salario;
    private static int totalEmpleados;
    private static int contadorID;


    public Empleado(int empledadoID, String nombre, String puesto, Double salario) {

        this.empledadoID = empledadoID;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.empledadoID = ++contadorID;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 3000;
        totalEmpleados++;

    }

    @Override
    public java.lang.String toString() {
        return "Empleado{" +
                "empledadoID=" + empledadoID +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
    public void actualizarSalario(Double aumento){
            salario += aumento;
            System.out.println("Salario actualizado: " + salario);
    }
    public void actualizarSalario(){
        Double aumento = 500;
        salario += aumento;
        System.out.println("Salario actualizado: " + salario);
    }
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }


    public static void main(String[] args) {

    }
}