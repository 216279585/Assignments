import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean loopMenu = true;
        int choice;


        while(loopMenu == true){

            menu();
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter cm:");
                    float cm = input.nextFloat();
                    System.out.println(cm/100 + "m");
                    break;
                case 2:
                    System.out.println("Enter m:");
                    float m = input.nextFloat();
                    System.out.println(m*100 + "cm");
                    break;
                case 3:
                    loopMenu = false;
                    break;
                default:
                    System.out.println("Option not recognized");
                    break;

            }
        }

    }

    static void menu(){
        System.out.println("\n"+"=====Menu=====");
        System.out.println("1. Convert cm to m");
        System.out.println("2. Convert m to cm");
        System.out.println("3. Exit");
        System.out.println("=============="+"\n");
    }
}
