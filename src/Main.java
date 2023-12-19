public class Main {
    public static void main(String[] args) {
        // Crear un array de Figura con instancias de Cuadrado y Circulo
        Figura[] figuras = new Figura [5];
        figuras[0] = new Cuadrado();
        figuras[1] = new Cuadrado();
        figuras[2] = new Circulo();
        figuras[3] = new Circulo();
        figuras[4] = new Cuadrado();

        // Contar cuantos elementos son instancias de Cuadrado y cuantas son instancias de Circulo
        int cuadrados = 0;
        int circulos = 0;

        for(Figura figura : figuras) {
            if(figura instanceof Cuadrado) {
                cuadrados++;
            } else if(figura instanceof Circulo) {
                circulos++;
            }
        }
        System.out.println("Cantidad de cuadrados: " + cuadrados);
        System.out.println("Cantidad de circulos: " + circulos);
    }
}