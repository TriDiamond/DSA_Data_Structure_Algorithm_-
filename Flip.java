class HelloWorld {
    
    public static int[] flip(int[] A){
    //Travel Array using Kadan Algorithm    
        int n = A.length;
        int cs = 0;
        int max_sum = 0;
        int l = 0;
        int r = 0;
        int[] ans = new int[2];
        // 0 contributing +1, 1 contributing -1
    for(int i = 0; i < n; i++){
        if(A[i] == 0){
            cs++;
        }else{
            cs--;
        }
        
        if(cs > max_sum){
          max_sum = cs;
            ans[0] = l + 1;
            ans[1] = r + 1;
        }
        
        if(cs < 0){
            cs = 0;
            l = i+1;
            r = i + 1;
        }else {
            r++;
        }
        
    }
    if(max_sum == 0){
       return new int[0];
    }
    return ans;
    }
    
    public static void main(String[] args) {
      int[] A = {0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1};
      int[] flip = flip(A);
      for(int i = 0; i < flip.length; i++){
      System.out.print(flip[i]+" ");
      }
    }
}
