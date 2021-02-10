package es.ulpgc.eii.modular;

/*  Aitor Ventura Delgado
    03.04.2019
    Crearemos una clase que implementará las características básicas de los
    números racionales. */

public class Rational implements Comparable <Rational>, Cloneable {
    private int num;
    private int den;
    
    // Constructor
    public Rational(int n, int d){
        // Reducimos la fracción
        int x = mcd(n, d);
        num = n / x;
        den = d / x;
    }
    
    // MCD (reducir fracciones a su forma canónica)
    private static int mcd(int m, int n){
        if (n == 0){
            return m;
        } else {
            return mcd(n, m%n);
        }
    }
    
    // Método suma
    public Rational add(Rational a){
        int numerator = (this.num * a.den) + (this.den * a.num);
        int denominator = (this.den * a.den);
        
        return new Rational(numerator, denominator);
    }
    
    // Método producto
    public Rational prod(Rational b){
        int numerator = (this.num * b.num);
        int denominator = (this.den * b.den);
        
        return new Rational(numerator, denominator);
    }
    
    // Método ver si son iguales (equivalentes)
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Rational)){
            return false;
        }
        
        Rational b = (Rational) obj;
        return compareTo(b) == 0;
    }
    
    // Método toString
    @Override
    public String toString(){
        return String.valueOf(this.num) + "/" + String.valueOf(this.den);
    }
    
    // Método comparar
    @Override
    public int compareTo(Rational c){
        if ((this.num * c.den) > (this.den * c.num)){
            return 1;
        }
        
        if ((this.num * c.den) < (this.den * c.num)){
            return -1;
        }
        
        return 0;
    }
    
    // Método clonar
    @Override
    public Rational clone(){
        int numerator = this.num;
        int denominator = this.den;
        return new Rational(numerator, denominator);
    }
}