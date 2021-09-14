package com.efe;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength=10;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String hotmailSuffix="hotmail.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department=setDepartment();


        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.password);

        email=firstName.toLowerCase()+"."+ lastName.toLowerCase()+ "@" + department+ "." + hotmailSuffix;

    }
private String setDepartment(){
    System.out.print("New worker : "+firstName +". Department Codes:\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
    Scanner scanner=new Scanner(System.in);
   int preferringDepartment= scanner.nextInt();
    if (preferringDepartment==1){
        return "sales";
    }
    else if (preferringDepartment==2){
        return "dev";
    }
    else if(preferringDepartment==3){
        return "acct";
    }
    else{
       return "";
    }
}
private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password=new char[length];
    for (int i = 0; i < length; i++) {
        int rand=(int)(Math.random() * passwordSet.length());
        password[i]=passwordSet.charAt(rand);
    }
    return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    public String showInformation(){
        return "Display name: " + firstName + " " + lastName+" "+
                "\nCompany email " +email+
                "\nMailbox Capacity :" +mailboxCapacity +"mb";
    }
}
