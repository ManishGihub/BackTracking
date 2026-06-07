// Q) Print all permutaions of the string

public class PrintPermutation {
    public static void PrintPermu(String str, String permu, int idx){
        if(str.length() == 0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            PrintPermu(newStr, permu + currChar, idx+1);
        }
    }
    public static void main(String []args){
        String str = "abc";
        PrintPermu(str,"",0);
    }
}

// abc
// acb
// bac
// bca
// cab
// cba
