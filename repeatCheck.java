public class repeatCheck {
    public static void main(String[] args) {
        int [] arr = {3,3,2,2,1,1,9,5,6,5,6};
        int check[]  = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            check[arr[i]] += 1;
        }
        for(int i=0; i<check.length; i++){
            if(check[i] == 1){
                System.out.println(i);
            }
        }
    }
    
}
