
/**
 * A partir del código terminado de la actividad 0049, añade a tu proyecto una clase Test que implemente dos métodos: testSumValuesInterval y testIsPrime. 
 * Estos métodos deben crear un objeto de la clase Calculadora e invocar al menos 6 veces al método que comprueban respectivamente con diferentes parámetros. 
 * A partir del valor de retorno que proporciona el método que comprueban deben informar por pantalla de si se ha pasado ese test y, 
 * en función de si pasa todos los test o no, indicar por pantalla si el método funciona correctamente o no.
 * 
 * Comprobando isPrime(2)... resultado correcto true / resultado metodo true... OK
 * Comprobando isPrime(4)... resultado correcto false / resultado metodo false... OK
 * Comprobando isPrime(5)... resultado correcto true / resultado metodo true... OK
 * Comprobando isPrime(10)... resultado correcto false / resultado metodo false... OK
 * Comprobando isPrime(13)... resultado correcto true / resultado metodo true... OK
 * Comprobando isPrime(101)... resultado correcto true / resultado metodo true... OK
 */
public class Test
{
    public void testSumValuesInterval() 
    {
        Calculadora casio = new Calculadora();
        int correctos = 0;
        String resultado = "... ERROR";
        if (casio.sumValuesInterval(5,-1) == -1) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando sumValuesInterval(5,-1)... resultado correcto -1 / resultado metodo " + casio.sumValuesInterval(5,-1) + resultado);
        
        resultado = "... ERROR";
        if (casio.sumValuesInterval(-3,7) == -1) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando sumValuesInterval(-3,7)... resultado correcto -1 / resultado metodo " + casio.sumValuesInterval(-3,7) + resultado);
        
        resultado = "... ERROR";
        if (casio.sumValuesInterval(0,7) == 28) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando sumValuesInterval(0,7)... resultado correcto 28 / resultado metodo " + casio.sumValuesInterval(0,7) + resultado);
        
        resultado = "... ERROR";
        if (casio.sumValuesInterval(7,0) == 28) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando sumValuesInterval(7,0)... resultado correcto 28 / resultado metodo " + casio.sumValuesInterval(7,0) + resultado);
        
        resultado = "... ERROR";
        if (casio.sumValuesInterval(5,5) == 5) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando sumValuesInterval(5,5)... resultado correcto 5 / resultado metodo " + casio.sumValuesInterval(5,5) + resultado);
        
        resultado = "... ERROR";
        if (casio.sumValuesInterval(100,100) == 100) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando sumValuesInterval(100,100)... resultado correcto 100 / resultado metodo " +casio.sumValuesInterval(100,100) + resultado);
        if (correctos == 6) {
            System.out.println("El método SI funciona corectamente.");
        }
        else {
            System.out.println("El método NO funciona corectamente.");
        }
    }

    public void testIsPrime() 
    {
        Calculadora casio = new Calculadora();
        int correctos = 0;
        String resultado = "... ERROR";
        if (!casio.isPrime(1)) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando isPrime(1)... resultado correcto false / resultado metodo " + casio.isPrime(1) + resultado);
        
        resultado = "... ERROR";
        if (casio.isPrime(2)) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo " + casio.isPrime(2) + resultado);
        
        resultado = "... ERROR";
        if (!casio.isPrime(4)) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado metodo " + casio.isPrime(4) + resultado);
        
        resultado = "... ERROR";
        if (!casio.isPrime(10)) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo " + casio.isPrime(10) + resultado);
        
        resultado = "... ERROR";
        if (casio.isPrime(13)) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + casio.isPrime(13) + resultado);
        
        resultado = "... ERROR";
        if (casio.isPrime(101)) {
            resultado = "... OK";
            correctos++;
        }
        System.out.println("Comprobando isPrime(101)... resultado correcto true / resultado metodo " + casio.isPrime(101) + resultado);
        
        if (correctos == 6) {
            System.out.println("El método SI funciona corectamente.");
        }
        else {
            System.out.println("El método NO funciona corectamente.");
        }
    }
}