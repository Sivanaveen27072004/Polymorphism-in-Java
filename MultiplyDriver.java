class Multiply {
    static int Multiply(int a, int b)
    {
        return a * b;
    }
    static double Multiply(double a, double b)
    {
        return a * b;
    }
}
class MultiplyDriver {
    public static void main(String[] args)
    {
        System.out.println(Multiply.Multiply(2, 4));
        System.out.println(Multiply.Multiply(5.5, 6.3));
    }
}
