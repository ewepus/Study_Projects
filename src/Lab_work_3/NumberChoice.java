package Lab_work_3;

import java.util.Scanner;

public class NumberChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(sc.nextLine());
            result = input>0?Math.min(result, input):result; //Тернарный оператор - переменная = если?то:иначе;
        }
        System.out.println(result);
    }
}
//var_9
/*int input = Integer.parseInt(sc.nextLine());
  if (input > 0){
      result = Math.min(result, input);
  } else result = result;*/