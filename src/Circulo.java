public class Circulo extends Figura{
    private double radio;

    // Recordar que el constructor vacio
    // lo crea el compilador de Java por defecto
    // cuando no se define ningun constructor

    //Metodo para calcular el area del circulo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Metodo para calcular la circunferencia del circulo
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Getters y setters (opcional, segun necesidad)

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
