package com.MahadevanRDJ.ChatBotStack;

import java.util.Scanner;
import java.util.Stack;

public class ChatBot { 
    protected static Stack <ChatBot> stack = new Stack<>();
    protected Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ChatBot chatbot = new ChatBot();
        System.out.println("\t\t\t\t\t\t\tWelcome to XYZ telecom service.\n");
        System.out.print("\tDear Customer, We've provided you the all kind of our services via this 24/7 system and also customers who are all using our service across the world,");
        System.out.println(" we've introduced this system to your language. \n");
        stack.push(chatbot);
        chatbot.start();
    }

    public void start() {
        int choice;
        System.out.println("Languages avalaible are:");
        System.out.println("1.Tamil\n2.English\n0-EXIT\n");
        System.out.print("Please, Enter your Option: ");
        choice = scan.nextInt();

        switch(choice) {
            case 1:
            case 2: {
                    LanguageMenu english = new LanguageMenu();
                    stack.push(english); 
                    english.start();
                    break;
            }
            case 0: stop();
        }
    }

    public static void stop() {
        System.exit(0);
    }
}

class LanguageMenu extends ChatBot{
    public void start() {
        System.out.println("1.Balance\n2.Recharge\n3.OtherServices\n9-Back\n0-Exit\n");
        System.out.print("Kindly, Enter Your Option: ");
        int choice = scan.nextInt();
        switch(choice) {
            case 1: {
                System.out.println("Your Primary balance : Rs 10.32\nYour Secondary Balance : Rs 25");
                System.out.println("Validity: 02-02-2023");
                System.out.println("9-Back");
                System.out.println("0-EXIT");
                System.out.print("Enter your Option: ");
                choice = scan.nextInt();
                
                switch(choice) {
                    case 9: ChatBot back = stack.peek();
                            back.start();
                            break;
                    case 0: stop();
                }
                break;
            }
            case 2: {
                Recharge recharge = new Recharge();
                stack.push(recharge);
                recharge.start();
                break;
            }
            case 3: {
                OtherServices others = new OtherServices();
                stack.push(others);
                others.start();
                break;                
            }
            case 9: {
                stack.pop();
                ChatBot back = stack.peek();
                back.start();
                break;
            }
            case 0: System.exit(0);
        }
    }

}

class Recharge extends ChatBot {
    public void start() {
        System.out.println("1.265=UL call+1GB/D,28D\n2.479=UL call+1.5GB/D,56D\n3.299=UL call+1.5GB/D28D\n4.549=UL call+25GB/D,56D\n9-Back\n0-EXIT\n");
        System.out.print("Kindly, Enter your Option: ");
        int choice = scan.nextInt();
        do{
            switch(choice) {
                case 1: 
                case 2:
                case 3:
                case 4: {
                    System.out.println("1.UPI");
                    System.out.println("2.Recharge Coupon");
                    System.out.print("Enter your option: "); int n = scan.nextInt();
                    RechargePayments rechargePayments = new RechargePayments(n);
                    stack.push(rechargePayments);
                    rechargePayments.makePayment();
                    break;
                }
                case 9: {
                    stack.pop();
                    ChatBot back = stack.peek();
                    back.start();
                    break;
                }
                case 0: System.exit(0);

            }
        } while (choice != 0);

    }

    class RechargePayments extends Recharge{
        private int option;
        RechargePayments(int option) {
            this.option = option;
        }

        private void makePayment() {
            do {
                switch(this.option) {
                    case 1: 
                    case 2:
                    case 3:
                        System.out.println("Your recharge is successful. Thanks for using our services."); 
                        System.out.println("9-Back");
                        System.out.println("0-EXIT");
                        System.out.print("Kindly, Enter your Option: ");
                        this.option = scan.nextInt();
                        break;
                    case 9: {
                        stack.pop();
                        stack.pop();
                        ChatBot back = stack.peek();
                        back.start();
                        break;
                    }
                    case 0: System.exit(0);
                }
            } while(this.option != 0);
        }
    }
}
class OtherServices extends ChatBot {
    public void start() {
        System.out.println("1.Broadband\n2.DTH\n9-Back\n0-EXIT\n");
        System.out.print("Kindly, Enter your Option: ");
        int choice = scan.nextInt();
        do{

            switch(choice) {
                case 1: 
                case 2:
                case 3: {
                    System.out.println("Your service is provided. Thanks for using our service.");
                    System.out.println("9-Back");
                    System.out.println("0-EXIT");
                    System.out.print("Enter your Option: ");
                    choice = scan.nextInt();
                    break;
                }
                case 9: {
                    stack.pop();
                    ChatBot back = stack.peek();
                    back.start();
                    break;
                }
                case 0: System.exit(0);
            }
        } while (choice != 0);
    }
}
