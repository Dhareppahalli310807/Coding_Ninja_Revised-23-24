class Strings{
    public static void main(String args[]){
        // assiginning string literal
        String s1 = "welcome";
        System.out.println(s1);

        // using new keyword
        String str = new String(original:"Coding");

        // passing character array
        String ch[] = {'c', 'o', 'd', 'i', 'n', 'g'};
        String str1 = new String(ch);

        // passing byte array
        byte b[] = {97, 98, 99, 100};
        String str2 = new String(b);
    }
}