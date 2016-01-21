
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
     * Este método muestra por pantalla la suma de los números entre el 0 y el 10(ambos incluídos)
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

    /**
     * Este método recibe dos números y devuelve la suma de los valores comprendidos entre ellos ambos incluidos
     * Si los números son iguales devuelve el mismo números.
     */
    public int sumValuesInterval(int num1, int num2)
    {
        int resultado = -1;
        if (num1 >= 0 && num2 >= 0) {
            int mayor = num2;
            if (num1 > mayor) {
                num2 = num1;
                num1 = mayor;
            }
            resultado = num1;
            while (num1 < num2) {
                num1++;
                resultado = num1 + resultado;
            }
        }
        else {
            System.out.println("ERROR: algúm valor de los introducidos no es positivo.");
        }
        return resultado;
    }

    /**
     * Este método nos comprueba si un número es primo (devuelve "true") o no (devuelve "false").
     * En caso de ser menor de 1 nos informa del error por pantalla y nos devuelve "false".
     */
    public boolean isPrime(int n) {
        boolean esPrimo = true;// Partimos de que el número es primo.
        int divisor = 2;
        if (n > 1) {
            while (divisor < n && esPrimo) {
                if (n % divisor == 0) {
                    esPrimo = false;
                }
                else {
                    divisor++;
                }
            }
        }
        else {
            System.out.println("ERROR: el valor debe de ser mayor que 1.");
            esPrimo = false;
        }
        return esPrimo;
    }
}
