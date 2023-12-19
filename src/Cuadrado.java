public class Cuadrado extends Figura{
    private double lado;

    // Recordar que el constructor vacio
    // lo crea el compilador de Java por defecto
    // cuando no se define ningun constructor

    // Metodo para calcular el area del cuadrado
    public double calcularArea() {
        return lado * lado;
    }

    // Metodo para calcular el perimetro (circunferencia)
    public double calcularPerimetro(){
        return 4 * lado;
    }

    // Getters y setters (opcional, segun necesidad)

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
