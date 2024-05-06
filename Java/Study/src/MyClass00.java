public class MyClass00 {
    public static void main(String[] args) {
//        a*x + b*x*x + c = 0  квадратное уравнение
        int a = 5;
        int b = -3;
        int c = -2;
        int D = b*b - 4*a*c; // дискриминант
//        y = a*x + b*x*x + c;
        double x1 = (-b + Math.sqrt(D)) / (2*a);
        double x2 = (-b - Math.sqrt(D)) / (2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
