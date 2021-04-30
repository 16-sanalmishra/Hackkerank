import java.util.Scanner;

/**
 * linearSearch
 */
public class linearSearch {

    public int searchKey(int arr[] , int n, int key){
        for (int i=0; i<n; i++){
            if(arr[i]==key)
            {
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linearSearch ls = new linearSearch();
        int arr[] = {6,5,7,9,4,2,1,3};
        int k =10;
        int len = arr.length;
       int res = ls.searchKey(arr, len, k);
       if(res == 1){
           System.out.println("Found");
       }
       else{
        System.out.println("Not Found");
       }


    }
}