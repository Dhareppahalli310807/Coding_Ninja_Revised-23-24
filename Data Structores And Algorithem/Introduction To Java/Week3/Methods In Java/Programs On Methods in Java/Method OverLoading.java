class MethodOverLoading{
    public static void sum(int a, int b){
        System.out.prinln(x:"Sum of 2 integre");
        System.out.prinln(a + b);
    }

    public static void sum(int a, int b, int c){
        System.out.prinln(x:"Sum of 3 integer");
        System.out.prinln(a + b + c);
    }

    public static void sum(double a, int b){
        System.out.prinln(x:"Sum of 1 double and 1 integer");
        System.out.prinln(a + b);
    }

    public static void sum(double a, double b){
        System.out.prinln(x:"Sum of 2 double");
        System.out.prinln(a + b);
    }

    public static void main(String args[]){
        sum(a:1, b:3);
        sum(a:3, b:4, c:10);
        sum(a:10.5f, b:20);
        sum(a:1.4f, b:2.4f);
    }
}