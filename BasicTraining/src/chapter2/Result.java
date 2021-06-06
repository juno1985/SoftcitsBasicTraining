package chapter2;

import java.io.*;
import java.util.Stack;
import java.util.stream.IntStream;

public class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            char c = arr[i];

            if(c == '[' || c == '(' ||  c== '{'){
                stack.push(c);
            }else{
                char top ;
                try {
                    top = stack.pop();
                } catch (Exception e) {
                    return "NO";
                }
                if( (c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{') ){
                    return "NO";
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
