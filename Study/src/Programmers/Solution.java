package Programmers;

public class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            Char[] ar;
            int index = n;
            Char[] result;
            
            for (int i = 0; i < my_string.length(); i++)
            {
                ar = my_string[i].toCharArray;
            }
            
            for (int i = 0; i < n; i++)
            {
                result = ar[index];
                index--;
            }
            
            answer = String.valueOf(result);
            return answer;
        }
    }
}
