class HelloWorld {
    
    //check if the ith bit is on or off
    public static int check(int n, int i){
        if((n & (1 << i)) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    
    public static int uniqueNo(int[] A){
        int n = A.length;
        int ans = 0;
        for(int i = 0; i < 32; i++){  // 32 bits for an integer
            int count = 0;
            for(int j = 0; j < n; j++){
                if(check(A[j], i) != 0){ // Check ith bit of A[j]
                    count++;
                }
            }
            if(count % 3 == 1){
                // set ith bit in ans
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] A = { 4, 5, 5, 4, 0, 6, 6, 4, 5, 6};
        int ans = uniqueNo(A);
        System.out.println(ans);
    }
}
