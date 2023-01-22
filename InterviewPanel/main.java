package com.MahadevanRDJ.InterviewPanel;
import java.util.LinkedList;
import java.util.Queue;


public class main {
    public static void main(String[] args) {
        new Interview();
    }
}
class Interview {
    static Queue <Integer> InterviewRoom = new LinkedList<>();
    static Queue <Integer> WaitingRoom = new LinkedList<>();
    static int Member; 
    Interview() {
        for (int i = 0; i < 5; i++) Interview.WaitingRoom.add(++Member);
        System.out.println("\t\t\t\t\t\t1.Go for Interview");
        System.out.println("\t\t\t\t\t\t2.End the Interview");
        InterviewSession.MainMenu();
    }
}
