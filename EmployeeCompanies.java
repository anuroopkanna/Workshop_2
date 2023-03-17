package com.BridgelabsW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EmployeeCompanies {
    public static void main(String[] args) {
        HashMap<String, companiesDetails> hashMap =new HashMap();
        companiesDetails kia =new companiesDetails();
        companiesDetails tata =new companiesDetails();
        companiesDetails infosys = new companiesDetails();
        companiesDetails genpact =new companiesDetails();
        hashMap.put("a",kia);
        hashMap.put("b",tata);
        hashMap.put("c",infosys);
        hashMap.put("d",genpact);
        System.out.println("iteration starts");
        for (Map.Entry value:hashMap.entrySet())
        {
            System.out.println();
            System.out.println(value.getKey()+" "+value.getValue());
        }
        /*CompaniesDetails kiaCompany =  hashMap.get("a");
        System.out.println(kiaCompany.addDetails());
        System.out.println(kia+" "+kiaCompany);
        CompaniesDetails tataCompany =  hashMap.get("b");
        System.out.println(tataCompany);
        CompaniesDetails infosysIt =  hashMap.get("c");
        System.out.println(infosysIt);
        CompaniesDetails genpactTechnologies =  hashMap.get("d");
        System.out.println(genpactTechnologies);*/
       //System.out.println("**Welcome to the Details of Multiple companies**");
        companiesDetails companiesDetails = new companiesDetails();
        Scanner sc = new Scanner(System.in);
        boolean option = true;
        while (option) {
            System.out.println("1) Add concats: \n 2) Edit: \n 3) Displaycontact: \n 4) Exit");
            int choose = sc.nextInt();
            switch (choose) {
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
                    option = false;
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
