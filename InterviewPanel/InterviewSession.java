package com.MahadevanRDJ.InterviewPanel;
import java.util.Scanner;

public class InterviewSession {
   
    public static void MainMenu() {
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.println("Choose the Options :");
            n = scan.nextInt();
            switch(n) {
                case 1: Start(); break;
                case 2: End(); break;
                case 3: System.exit(0);
            }
        } while(n != 3);
    }
    public static void Start() {
        int candidates = Interview.WaitingRoom.remove();
        Interview.InterviewRoom.add(candidates);
        System.out.println(Interview.InterviewRoom.peek());
        System.out.println("\t\t\t\t\tCandidate " + candidates + " started their Interview.");
        for (int i = 0; i < 1000000; i++) System.out.print(""); 
        System.out.println("\t\t\t\t\t\tInterview going on...");
        MainMenu();
    }
    public static void End() {
        System.out.println(Interview.InterviewRoom.peek());
        if(Interview.InterviewRoom.peek() == null) {System.out.println("\t\t\t\t\t\tInterview not yet started for any candidates.."); return;}
        for (int i = 0; i < 10000000; i++)System.out.print("");
        System.out.println("\t\t\t\t\tCandidate " + Interview.InterviewRoom.remove() + " finished their Interview..");
        Interview.WaitingRoom.add(++Interview.Member);
        MainMenu();

    }
}
