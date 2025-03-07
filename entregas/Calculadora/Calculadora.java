package entregas.Calculadora;

public class Calculadora {

    protected double[] numeros;
    private int tamañoActual;

    public Calculadora() {
        this.numeros = new double[10];
        this.tamañoActual = 0;
    }

    public void mostrarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros[" + i + "] = " + numeros[i]);
        }
    }

    public void agregarNumeros(double numero) {
        if (tamañoActual == numeros.length) {

            double[] nuevoArray = new double[numeros.length * 2];

            for (int i = 0; i < numeros.length; i++) {
                nuevoArray[i] = numeros[i];
            }
            numeros = nuevoArray;
        }
        numeros[tamañoActual] = numero;
        tamañoActual++;
    }

    public int obtenerTamañoActual(){
        return tamañoActual;
    }
}
