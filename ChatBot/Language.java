package com.MahadevanRDJ.ChatBot;

public class Language {
    
    public static void language(int n) {
        switch(n) {
            case 2: English.LanguageMenu();
                    break;
            default: 
            {
            System.out.println("\n\t\t\t\t****************Language you seleceted currenty not added. Choose ENGLISH*******************\n");
            new MainMenu();
            }
        }
    }

    
}
