package com.knoldus.Liskov;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

abstract class Member {
    String name;
    String memberType;
    Date mStartDate;
    Date mEndDate;

    public Member(String name){
        this.name=name;
    }
    public abstract void addToDatabase();
}

class LifetimeMember extends Member{
    public LifetimeMember(String  name, Date mStart){
        super(name);
        this.memberType="LifeTime";
        this.mStartDate= mStart;
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.YEAR, 70);
        this.mEndDate= cal.getTime();
    }

    @Override
    public void addToDatabase() {
        //Logic to add this customer to Database
        System.out.println("Added  the LifeTime Info Of a Customer into a DB");
    }
}

class AnnualMember extends Member{
    public AnnualMember(String  name, Date mStart){
        super(name);
        this.memberType="Annual";
        this.mStartDate= mStart;
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        this.mEndDate= cal.getTime();
    }

    @Override
    public void addToDatabase() {
        //Logic to add this customer to Database
        System.out.println("Added  the Annual Info Of a Customer into a DB");
    }
}

class Enquiry extends Member{
    public Enquiry(String name){
        super(name);
        this.memberType="Enquiry";
    }

    @Override
    public void addToDatabase() {
        //Logic to add this customer to Database
        System.out.println("Added  the Enquiry Info Of a Customer into a DB");
    }
}
class CustomerInfo{
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();
        myList.add(new LifetimeMember("Gulshan Singh", new Date()));
        myList.add(new AnnualMember("Fabeeha", new Date()));
        myList.add(new Enquiry("Morgagae Freeman"));
        for(Member c: myList){
            c.addToDatabase();
        }
    }
}