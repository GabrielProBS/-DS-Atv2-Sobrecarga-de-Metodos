public class Conversor {
    public double conversor(double celsius){
        return celsius * 9/5 + 32; //Cálculo de conversão de Celsius para Fahrenheit
    }

    public float conversor(float fahrenheit){
        return (fahrenheit - 32) * 5/9; //Cálculo de conversão de Fahrenheit para Celsius
    }

public Conversor(){} //Para deixar global
}
