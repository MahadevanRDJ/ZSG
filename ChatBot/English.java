package com.MahadevanRDJ.ChatBot;

import java.util.Scanner;

public class English {
    public static void LanguageMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t1.Balance \n\t\t\t\t\t\t2.NewOffers \n\t\t\t\t\t\t3.AccountInfo \n\t\t\t\t\t\t4.Recharge \n\t\t\t\t\t\t5.OtherServices");
        System.out.println("Press '0' for Mainmenu");
        System.out.print("\t\t\tEnter the menu option: ");
        int menu = scan.nextInt();

        switch(menu) {
            case 1: Balance(); break;
            case 2: NewOffers(); break;
            case 3: AccountInfo(); break;
            case 4: Recharge(); break;
            case 5: OtherServices(); break;
            case 0: new MainMenu(); break;
            default: System.out.println("Error occured for choosing a invalid menu option.");
        }
    }
    public static void Balance() {
        System.out.println("\t\t\t\t\t\t Balance ");
        System.out.println("\t\t\t Your Primary balance : Rs 10.32\n\t\t\t Your Secondary Balance : Rs 25");
        System.out.println("Validity: 08-02-2023");
        System.out.println("Press '0' to Back");
        Back();
    }

    public static void NewOffers() {
        System.out.println("\t\t\t\t\t\t\tWelcome to XYZ New offers");
        System.out.println("Unlimited Offers: \n\t\t 1.Rs.118 - 20GB \n\t\t2.Rs.298 - 50GB \n");
        System.out.println("Smart Offers: \n\t\t1.Rs124  - 28GB/Unlimited Calls\n\t\tValidity: 28Days. \n\t\t2.Rs.288 - 50GB/Unlimited calls\n\t\tValidity: 56Days.");
        Back();
    }
    public static void AccountInfo() {
        System.out.println("\t\t\t\t\t\t Account Information ");
        System.out.println("Telecom Operator : XYZ");
        System.out.println("Mobile No. : 96XXXXXX80");
        System.out.println("Technology supports: 2G/3G/4G");
        Back();
    }
    public static void Recharge() {
        System.out.println("\t\t\t\t\t\t Recharge Options: ");
        System.out.println("1.Recharge using XYZ payment bank.");
        System.out.println("2.Using UPI");
        Back();
    }
    public static void OtherServices() {
        System.out.println("\t\t\t\t\t\t Other Services ");
        System.out.println("1.Broadband Fixedline");
        System.out.println("2.DTH");
        System.out.println("3.Start/Stop a service");
        Back();
    }
   
    public static void Back() {
        Scanner scan = new Scanner(System.in);
        scan.next();
        LanguageMenu();
    }
}