import java.util.Scanner;

public class gold_room3{

    public static void readinput(Scanner input){
        String value_ss = "";
        int number = 0;

        System.out.print("> ");
        value_ss = input.next();
        while (true){
            char input_check =' ';
            for(int i=0;i<value_ss.length();i++){
                input_check = value_ss.charAt(i);
                if (input_check < 48 || input_check > 57){
                    System.out.println("숫자아님"+input_check);
                    readinput(input);
                    System.exit(1);
                    //break; break가 들어가면 오류발생
                }
            }
            number = Integer.parseInt(value_ss);
            if (number < 50){
                System.out.println("not greedy");
                //exit(1);
                break;
            }
            else{
                System.out.println("greedy");
                break;
            }

        } //while(true)
    } // readinput method

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        readinput(input);
    }

} //gold_room3
