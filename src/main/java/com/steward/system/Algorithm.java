package com.steward.system;

import java.util.*;



public class Algorithm {
     
     public  static ArrayList<String> sampleWords = {"LOG", "ACCOUNT", "REGISTER", "DEBIT", "PASSWORD", "CARD", "PIN", "CREDIT", "RESET"};
     public static String emailsmp = "Someone tried to log in to your instagram account. If this wasn't you, please use the following code to confirm your identity";
     public static String correctedEmail;
     public static int emailArraySize;
     public static boolean wordfound;
     public static int occurances =0;
     public static double m;

    static void autoCapitalize(){
        correctedEmail = emailsmp.toUpperCase();
    }

    static void getArraysize(){
        emailArraySize = sampleWords.size();
    }

    static  void addNewSample(){
        getArraysize();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to add to sample words : ");
        String a = sc.nextLine();
        sampleWords.add(a);
    }

    static void checkSampleWords(){
        System.out.println("SYSTEM STARTED TO CHECK YOUR EMAIL");
        getArraysize();
        for(int i =0;i<emailArraySize;i++){
            String checker = sampleWords.get(i);
            wordfound = false;
            if(correctedEmail.contains(checker)){
                wordfound = true;
                occurances+=1;
            }
        }
        m = 100*occurances/emailArraySize;
        System.out.println("The email had "+occurances+" of possible scamming words");
        System.out.println("The email has "+m+"% of being a fraudlent email");
        if(m<30){
            System.out.println("YOUR EMAIL MAY BE SAFE");
        } else if (m>30&&m<70) {
            System.out.println("YOUR EMAIL IS MODERATELY FRAUDULENT");
        }else {
            System.out.println("YOUR EMAIL IS MODERATELY FRAUDULENT");
        }

    }


    public static void main(String[] args) {

        addNewSample();
       autoCapitalize();
       getArraysize();
        checkSampleWords();
    }
}
    

