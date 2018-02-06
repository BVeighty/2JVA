package com.supinfo.reportwriter;

public class SubContractor extends Worker
{
    private int cost;
    
    public SubContractor(String firstname, String lastname, int cost)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cost = cost;
    }
    
    @Override
    public String displayInfos()
    {
        return "€" + this.cost + "/day";
    }
}
