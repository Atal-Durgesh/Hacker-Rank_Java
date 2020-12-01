import java.util.Scanner;

class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toUpperCase().toCharArray();
        char[] b1 = b.toUpperCase().toCharArray();
        char tempA;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
              if(a1[i]>a1[j]){
                 tempA = a1[i];
                 a1[i] = a1[j];
                 a1[j] = tempA;
              }
            }
        }
        char tempB;
        for(int i=0;i<b.length();i++){
            for(int j=i+1;j<b.length();j++){
              if(b1[i]>b1[j]){
                 tempB = b1[i];
                 b1[i] = b1[j];
                 b1[j] = tempB;
              }
            }
        }
        boolean hasAnagram = true;
        if(a.length()==b.length()){  
                  
            for(int i=0;i<a.length();i++){
              if(a1[i]!=b1[i]){
                hasAnagram = false;
                break;
              }
            }
        }else{
            hasAnagram = false;
        }
        return hasAnagram;
    }
    


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}