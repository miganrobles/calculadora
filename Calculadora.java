
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
    public void multiplesOfFive() {
        int num = 10;
        while (num < 90) {
            num += 5;
            System.out.println(num);
        }
    }
}
