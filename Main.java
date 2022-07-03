import java.util.Arrays;
class Main {
  
  public static void main(String[] args) {
    
        String ANSI_RED = "\u001B[31m";
        String BLUE_BOLD = "\033[1;34m";
        String PURPLE_BOLD = "\033[1;35m";

        
        
        double[] listaNotas ={2.3, 2.2, 8, 4, 7.0, 6.0, 4.5, 9.2, 3.5, 6.7, 9.7, 0.7,7.5};
        double total =0;
        
        for (int i = 0; i < listaNotas.length; i++) 
        {
         total += listaNotas[i];
        }
        
        System.out.println("listaNotas = " + Arrays.toString(listaNotas));
        System.out.println(BLUE_BOLD + "Suma Notas = " + total);
        
        double average = total / listaNotas.length ;
        
        System.out.println(PURPLE_BOLD + "Promedio = "+ average);
        
        
        //Cálculando la Mayor Nota
        double max = listaNotas[0];
        
        for (int i = 1; i < listaNotas.length; i++) 
        {
        if (listaNotas[i] > max) 
            max = listaNotas[i];
        }
        
        System.out.println(BLUE_BOLD + "Nota Máxima = "+ max);
        
        //Cálculando la menor Nota
        double min = listaNotas[0];
        
        for (int i = 1; i < listaNotas.length; i++) 
        {
        if (listaNotas[i] < min) 
            min = listaNotas[i];
        }
        
        System.out.println(ANSI_RED + "Nota menor = "+ min);
        
        double matrizRespuesta[] = new double[3];
        matrizRespuesta[0] = average;
        matrizRespuesta[1] = min;
        matrizRespuesta[2] = max;
        System.out.println(Arrays.toString(matrizRespuesta));
        
         //return matrizRespuesta;
  }

}