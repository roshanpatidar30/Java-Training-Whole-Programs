
//public class P52AddTwoComplexNumbersbyPassingClasstoaFunction {
//
//}
public class P52_Complex {

    double real;
    double imag;

    public P52_Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        P52_Complex n1 = new P52_Complex(2.3, 4.5),
                n2 = new P52_Complex(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static P52_Complex add(P52_Complex n1, P52_Complex n2)
    {
        P52_Complex temp = new P52_Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}