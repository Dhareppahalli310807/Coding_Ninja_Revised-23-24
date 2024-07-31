class SecondLargest{
    public static void main(String[] args) {
        int A[i] = {10,20,30,40};
        int max1 = A[0];
        int max2 = max1;



        for(i = 1; i< A.length; i++){
            if(A[i]> max1){
                max2 = max1;
                max1 = A[i];
            }else if(A[i]> max2){
                max2 = A[i];
            }
        }
        System.err.println("Greatest Number is: "+ max2);
    }
}
