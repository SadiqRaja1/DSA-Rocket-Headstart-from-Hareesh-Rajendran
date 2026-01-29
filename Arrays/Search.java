public class Search {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};

        int x = 3;

        System.out.println(searchElement(arr, x));
    }

    public static int searchElement(int arr[], int x) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }

}