package com.supinfo.reportwriter;

public class Employee extends Worker
{
    private int salary, holidays;
    
    public Employee(String firstname, String lastname, int salary, int holidays)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.holidays = holidays;
    }
    
    @Override
    public String displayInfos()
    {
        return "€" + this.salary + "/month, " + this.holidays + " days";
    }
}
