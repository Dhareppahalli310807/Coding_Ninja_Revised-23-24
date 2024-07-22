class Relational{
    public static void main(String args[]){
        // 1 equality(==, !=)
        // 2 Relational(<,<=,>,>=)
        // 3 logical (&& , ||)

        int a= 10;
        int b= 16;
        int c = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        boolean bIsNotGretest = (b<a) || (b<c);
        System.out.println(bIsNotGretest);
    }
}