package com.example.employeemanagementsystem;

public class Employee {

    private String Title;
    private int Thumbnail;

    public Employee(){
    }

    public Employee (String title, int thumbnail)
    {
        Title = title;
        Thumbnail = thumbnail;

    }

    public String getTitle()
    {
        return Title;
    }

    public int getThumbnail()
    {
        return Thumbnail;
    }
}
