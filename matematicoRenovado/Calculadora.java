
public class Calculadora
{

    public String  valoresDeX(int a, int b, int c) {

        double x1, x2;
        String lasEquis;
        x1= (-b +Math.sqrt(b*b-(4*a*c)))/(2*a);
        x2= (-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
        lasEquis= "xi= " +x1+ " x2= "+x2; 
        return lasEquis; 

    }

    public String ecuacionRecta( int x1,int  y1,int x2, int y2){
        double ce;
        double pendiente;
        String ecuacion;
        pendiente= (y2-y1)/(x2-x1);
        ce=  y1-((y2-y1)/(x2-x1))*x1;
        ecuacion = "y= "+ pendiente+"x"+ "+"+ ce;

        return ecuacion;
    }

    public double hallarCateto ( int h, int c1){
        double c2;
        c2= (Math.sqrt(Math.pow(h, 2)- Math.pow(c1,2)));
        return c2;
    }   

}
