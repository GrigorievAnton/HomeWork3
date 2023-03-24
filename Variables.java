public class Variables {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 =5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2/d1 + d2 % i1 -l;
        System.out.println(result);
        double x1 = 1.1;
        double y1 = 1;
        result = (x1*(8.3-y1)/x1-y1)*(x1+y1);
        System.out.println(result);
        int a1 = 5;
        int b = 8;
        int result1 = a1-- - --a1 + ++a1 + a1++ + a1;
        result = ++b - b ++ + ++b - --b;
        System.out.println(result1);
        System.out.println(result);
    }
}
