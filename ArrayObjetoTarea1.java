
package arrayobjetotarea1;

/**
 *
 * @author STIVEN
 */
class Combustible{
    public int codigo;
    public String elemento;
    Combustible(int codigo,String elemento){
        this.codigo=codigo;
        this.elemento=elemento;
    }

}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("                 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-LATACUNGA");
       System.out.println("\nCARRERA: INGENIERIA AUTOMOTRIZ");
       System.out.println("\nNOMBRE: JIMÉNEZ JULIO");
       System.out.println("\nMATERIA: PROGRAMACIÓN");
       System.out.println("\nDOCENTE: ING.LUIS GUERRA");
       System.out.println("\nNRC: 7450");
       System.out.println("\n");
       Combustible[]arreglo;
       arreglo=new Combustible [10];
       arreglo[0]=new Combustible(2,"Relación molar");
       arreglo[1]=new Combustible(5,"Densidad");
       arreglo[2]=new Combustible(7,"Relación estequiométrica aire");
       arreglo[3]=new Combustible(5,"Viscosidad ");
       arreglo[4]=new Combustible(1,"Temperatura de autoignición");
       arreglo[5]=new Combustible(7,"Ebullición máxima");
       arreglo[6]=new Combustible(4,"Vaporización del combustible");
       arreglo[7]=new Combustible(4,"Velocidad de llama");
       arreglo[8]=new Combustible(1,"Temperatura de llama");
       arreglo[9]=new Combustible(6,"Inflamabilidad limite");
       for (int i=0;i<arreglo.length;++i)
           System.out.println("La propiedad " +i+ " de un combustible etanol "
                   + " tiene una proporcionalidad de "+arreglo[i].codigo+" con respecto a la "+arreglo[i].elemento);
    }

}
