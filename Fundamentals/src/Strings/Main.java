package Strings;

public class Main {
    public static String reverseString(String string){
        int start = 0;
        int end  = string.length()-1;
        char[] array = string.toCharArray();
        while(start < end){
            swap(array, start, end);
            start++;
            end--;
        }
        return new String(array);
    }
    public static void swap(char[] array, int start, int end){
       char temp = array[start];
       array[start]  = array[end];
       array[end] = temp;
    }
}
