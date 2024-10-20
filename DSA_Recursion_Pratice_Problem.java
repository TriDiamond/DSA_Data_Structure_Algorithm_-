***************************************************
Print Increasing and decreasing using Recursion 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //Print Increasing and decreasing using Recursion
    static void printIncreasing(int n){
     if(n == 0){
         return;
     }
     printIncreasing(n-1);
     System.out.println(n);
    }
    static void printDecreasing(int n){
      if(n == 0){
         return;
     }
     System.out.println(n);
     printDecreasing(n-1);
    }
    
    public static void main(String[] args) {
    int n = 10;
    printIncreasing(n);
    printDecreasing(n);
    }
}
***************************************************************
2)  //sum of Natural Number using Recursion
    static int naturalNumbers(int n){
     if(n == 0){
         return 0;
     }
     int ans = naturalNumbers(n-1)+n;
     return ans ;
    }
    //fibonacci
    static int fibonacci(int n){
        if(n == 0 || n ==1){
            return n;
        }
        int ans  = fibonacci(n-2)+fibonacci(n-1);
        return ans;
    }
    
    public static void main(String[] args) {
    int n = 10;
    //int ans = naturalNumbers(n);
    int ans = fibonacci(n);
    System.out.print(ans);
    }
***********************************************************************
3) class HelloWorld {
    //indices of an array using Recursion
    static int[] occurence(int[] A, int B, int i, int count){
        int[] ans = new int[A.length];
        if(i == A.length){
            int[] result = new int[count];
            return result;
        }
        if(A[i] == B){
        ans = occurence(A, B, i+1, count+1);
        ans[count] = i;
        return ans;
        }else{
        ans = occurence(A, B, i+1, count);
        return ans;
        }
    }
    
    public static void main(String[] args) {
    int[] A = {10, 6, 9, 10, 7, 10};
    int B = 10;
    int count = 0;
    int i = 0;
    int[] ans = occurence(A, B, i, count);
    for(int j = 0; j < ans.length; j++){
    System.out.print(ans[j]);
    }
    }
}
***********************************************************
4)// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //finding a power using recursion
    static int exponential(int a, int n){
        if(n == 0){
            return 1; 
        }
     int hp = exponential(a,n/2);
     int ans= 0;
     if(n%2 == 0){
        ans = hp * hp;
      return ans;
     }else{
        ans = hp * hp *a;
        return ans;
     }
    }
  
    public static void main(String[] args) {
    int a = 2;
    int n = 5;
    int ans = exponential(a,n);
    System.out.print(ans);
    }
    
}
***********************************************************************************
