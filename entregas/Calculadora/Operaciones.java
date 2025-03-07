package entregas.Calculadora;

public class Operaciones extends Calculadora {

    public Operaciones(Calculadora calculadora) {
        super();
    }

    public double sumar(){
        double resultado = 0;
        for (int i = 0; i < obtenerTamañoActual(); i++) {
            resultado = resultado + numeros[i];
        }
        return resultado;
    }

    public double restar(){
        double resultado = 0;
        for (int i = 0; i < obtenerTamañoActual(); i++) {
            resultado = resultado - numeros[i];
        }
        return resultado;
    }
    
    
}
