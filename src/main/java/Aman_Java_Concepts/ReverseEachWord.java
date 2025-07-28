package Aman_Java_Concepts;

public class ReverseEachWord {
    public static String reverseWords(String input) {
        String[] words = input.split("\\s+"); 
        String output = "";

        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            int l = 0, r = arr.length - 1;
            while (l < r) {
                char tmp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = tmp;
            }
            output += new String(arr);
            if (i < words.length - 1) {
                output += " ";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String str = "my name is zakir";
        System.out.println(reverseWords(str));
       
    }
}




