package com.BridgelabsW2;

import java.util.Scanner;

public class EmployeeCompanies {
    public static void main(String[] args) {
        System.out.println("**Welcome to the Details of Multiple companies**");
        CompaniesDetails companiesDetails=new CompaniesDetails();
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("1)Add concats: \n 2) edit: \n 3) displaycontact: \n 4)Exit");
            int option=sc.nextInt();
            switch (option) {
                case 1: {
                    companiesDetails.addContacts();
                    break;
                }
                case 2: {
                    companiesDetails.edit();
                    break;
                }
                case 3: {
                    companiesDetails.displayContact();
                    break;
                }
                case 4:
                {
                    flag=false;
                    break;
                }
                default:{
                    System.out.println(option+"Enter the valid option");
                    break;
                }
            }
            System.out.println("exit");
        }
    }
}
