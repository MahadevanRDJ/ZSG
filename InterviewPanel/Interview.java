package com.MahadevanRDJ.InterviewPanel;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Interview {

    protected static Queue <Integer> interviewRoom = new LinkedList<>();
    protected static Queue <Integer> waitingRoom = new LinkedList<>();
    protected static Scanner scan = new Scanner(System.in);
    protected static int member;

    public static void main(String[] args) {
        Interview interview = new Interview();
        interview.start();
    }

    public void start() {
        for (int i = 0; i < 5; i++) Interview.waitingRoom.add(++member);
        System.out.println("\t\t\t\t\t\t1.Go for Interview");
        System.out.println("\t\t\t\t\t\t2.End the Interview");
        InterviewSession.mainMenu();
    }
}

class InterviewSession extends Interview{
   
    public static void mainMenu() {
        int n;
        do{
            System.out.print("Choose the Options :");
            n = scan.nextInt();
            switch(n) {
                case 1: begin(); break;
                case 2: end(); break;
                case 3: System.exit(0);
            }
        } while(n != 3);
    }

    public static void begin() {
        int candidates = Interview.waitingRoom.remove();
        Interview.interviewRoom.add(candidates);
        System.out.println("\t\t\t\t\tCandidate " + candidates + " started their Interview.");
        mainMenu();
    }

    public static void end() {
        if(Interview.interviewRoom.peek() == null) {System.out.println("\t\t\t\t\tInterview not yet started for any candidates.."); return;}
        System.out.println("\t\t\t\t\tCandidate " + Interview.interviewRoom.remove() + " finished their Interview..");
        Interview.waitingRoom.add(++Interview.member);
        mainMenu();
    }
}
