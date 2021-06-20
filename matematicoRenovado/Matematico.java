
public class Matematico
{ private Calculadora calculadora;
    public Matematico() {
        calculadora = new Calculadora();
    }

    public String  valoresDeX(int a, int b, int c) {
        String respuesta;
        respuesta = calculadora.valoresDeX(a, b, c);

        return respuesta;        
    }

    public String ecuacionRecta(int x1, int  y1, int x2, int y2){
        String respuesta;
        respuesta = calculadora.ecuacionRecta(x1, y1, x2, y2);
        return respuesta;
    }

    public double hallarCateto(int h, int c1){
        double respuesta;
        respuesta = calculadora.hallarCateto(h, c1);
        return respuesta;
    }   
}
