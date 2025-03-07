package entregas.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.agregarNumeros(5);
        calculadora.agregarNumeros(10);

        calculadora.mostrarNumeros();

        Operaciones suma = new Operaciones(calculadora);
        System.out.println("suma: " + suma.sumar());
    }
    
}
