
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    /**
     * Este método imprime por pantalla todos los mútiplos de 5 entre 10 y 95 (ambos no incluídos)
     */
    public void multiplesOfFive() 
    {
        int num = 10;
        boolean cabecera = true;
        while (num < 90) {
            num += 5;
            if (cabecera) {
                System.out.println("Los mútiplos de 5 entre 10 y 95 (ambos no incluídos) son:");
                cabecera = false;
            } 
            System.out.println(num);
        }
    }
    
    /**
     * Este métod no muestra por pantalla la suma de los números entre el 0 y el 10(ambos incluídos)
     */
    public void sumValues()
    {
        int num = 0;
        int suma = 0;
        while (num < 10) {
            num++;
            suma += num;
        }
        System.out.println("La suma de los números entre el 0 y el 10(ambos incluídos) es:");
        System.out.println(suma);
    }
}
