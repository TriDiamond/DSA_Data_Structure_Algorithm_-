class HelloWorld {
    public static int minimumSwap(int[] A, int B){
    int swap_count = 0;
    int n = A.length;
    int k = 0;
    int ans = 0;
    for(int i = 0; i < n; i++){
        if(A[i] <= B){
            k++;
        } 
    }
    //Swap_Count For 1st Sliding Window
    for(int i = 0; i < k; i++){
        if(A[i] > B){
            swap_count++;
        }
    }
    ans = swap_count;
    //Swap Count For remaining Window
    int s = 1, e = k;
    while(e < n){
        //remove the impact causing
        if(A[s-1] > B){
            swap_count--;
        }
        if(A[e] > B){
            swap_count++;
        }
        if(swap_count < ans){
            ans = swap_count;
        }
        s++;
        e++;
    }
       return ans; 
    }
    public static void main(String[] args) {
      int[] A = {1, 10, 15, 2, 9, 13, 4};
      int B = 5;
      int ans = minimumSwap(A, B);
      System.out.print(ans);
      }
    
}
