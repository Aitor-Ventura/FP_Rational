import es.ulpgc.eii.modular.Rational;
import java.util.*;
 
public class Main {
    /**
     * Shows how to use the class es.ulpgc.eii.modular.Rational
     * @param args
     */
    public static void main(String[] args) {
        // Preparing the execution
        
        System.out.println("Este programa va a ilustrar las operaciones de manejo de números");
        System.out.println("racionales. Se le va a pedir que introduzca dos números racionales");
        System.out.println("------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        
        // Declaration of three Rational objects
        
        Rational r1, r2, sum, prod;
        
        // Creates the first Rational from two integers
        
        System.out.print("Numerador del primer número: ");
        int n = input.nextInt();
        System.out.print("Denominador del primer número: ");
        int d = input.nextInt();
        r1 = new Rational(n, d);
        
        // Creates the second Rational from two integers
        
        System.out.print("Numerador del segundo número: ");
        n = input.nextInt();
        System.out.print("Denominador del segundo número: ");
        d = input.nextInt();
        r2 = new Rational(n, d);
        
        // Sums the two rationales and shows the result
        
        sum = r1.add(r2);
        System.out.println("---------------------------------------");
        // Implicitly calls toString
        System.out.println("La suma de " + r1 + " + " + r2 + " es: " + sum);

        // Multiplys the two rationales and shows the result
        
        prod = r1.prod(r2);
        System.out.println("---------------------------------------");
        // Implicitly calls toString
        System.out.println("El producto de " + r1 + " + " + r2 + " es: " + prod);
        
        Rational r3 = r1.clone();
        
        // Compare
        
        System.out.println("---------------------------------------");
        System.out.println("La comparación de " + r1 + " con " + r2 + " da: " + r1.compareTo(r2));
        System.out.println("La comparación de " + r1 + " con " + r3 + " da: " + r1.compareTo(r3));
        System.out.println("La comparación de " + r2 + " con " + r1 + " da: " + r2.compareTo(r1));

        //System.out.println("La igualdad de " + r1 " + con " + r2 + " da: " + r1.equals(r2));
        System.out.println("La igualdad de " + r1 + " con " + r3 + " da: " + r1.equals(r3));
        System.out.println("La igualdad de " + r2 + " con " + r1 + " da: " + r2.equals(r1));

        // Finalize
        
        input.close();
    }
}
