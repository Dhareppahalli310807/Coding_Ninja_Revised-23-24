
class TraverseArray{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,122,33,22,12,21,22,233,44,4,5,55,21};
        // System.out.println(arr.length);

        // for(int i = 0; i <= arr.length - 1; i++){
        //     System.out.println(arr[i]+ " ");
        // }

        for(int i :arr){
             System.out.println(i+ " ");
        }
    }
}