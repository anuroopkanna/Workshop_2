package com.BridgelabsW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class  Hashmap1 {
public class EmployeeCompanies {
    public static void main(String[] args) {
        HashMap<CompaniesDetails, EmployeeDetails> hm =new HashMap<>();
        CompaniesDetails Tesla =new CompaniesDetails("lohith","25","9376723823","hyd","ts","developer");
        CompaniesDetails Tata =new CompaniesDetails("Shyam","26","9376563823","mumbai","mh","developer");
        CompaniesDetails Infosys = new CompaniesDetails("divya","26","937672345","chaennai","tl","programer");
        CompaniesDetails Genpact =new CompaniesDetails("Kavya","25","9376723823","hyd","ts","DA");
        hm.put(1,Tesla);
        hm.put(2,Tata);
        hm.put(3,Infosys);
        hm.put(4,Genpact);
        System.out.println("iterating hashmap");
        for (Map.Entry m: Map.of().entrySet());{
            int key=entry.getKey();
            CompaniesDetails b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.employeeDetails);
        }
       // System.out.println("**Welcome to the Details of Multiple companies**");
        CompaniesDetails companiesDetails = new CompaniesDetails();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1)Add concats: \n 2) edit: \n 3) displaycontact: \n 4)Exit");
            int option = sc.nextInt();
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
                case 4: {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println(option + "Enter the valid option");
                    break;
                }
            }
            System.out.println("exit");
        }
    }
}
}