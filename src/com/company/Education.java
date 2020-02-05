package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Education {
    private String school;
    private String state;

    Scanner scan = new Scanner(System.in);
    ArrayList<String> schoolsAttended = new ArrayList<>();


    public Education(){


    }
    public void schoolAttended(){
            System.out.println("Name of school: ");
            this.school = scan.nextLine();
            System.out.println("State: ");
            this.state = scan.nextLine();
            String schoolAttend = "School: " + getSchool() + "\nState: "
                    + getState();
            schoolsAttended.add(schoolAttend);

    }
    public void printOut(ArrayList<String> schoolsAttended){
        for(String x : schoolsAttended){
            System.out.println("=======");
            System.out.println(x);
            System.out.println("========");
        }
    }


    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }


}
