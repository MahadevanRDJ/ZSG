package com.MahadevanRDJ.ChatBot;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        new MainMenu();
    }
}
class MainMenu {
    public MainMenu() {
            Scanner scan = new Scanner(System.in);
            System.out.println("\t\t\t\t\t\tWelcome to XYZ customer care service.");
            System.out.println("Languages are: ");
            System.out.println("\t\t\t\t\t\t1.Tamil \n\t\t\t\t\t\t2.English \n\t\t\t\t\t\t3.Hindi");
            System.out.println("Enter '4' to exit the application.");
            System.out.print("\t\t\t\t\t\tPlease Select Languge : ");
            int n;
            do{
                n = scan.nextInt();
                switch(n) {
                case 1:Language.language(n); break;
                case 2:Language.language(2); break;
                case 3:Language.language(n);break;
                case 4:EXIT();
                default: System.out.println("Language you've choosen is not in the list.");
                }
            }while(n != 4);
        }
        public static void EXIT() {
            System.exit(0);
        }
}

