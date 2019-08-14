package com.example.demo.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Orang")
@XmlType(propOrder = {"name", "age", "gender"})
public class Orang
{
    private int id;

    @XmlTransient
    private String name;

    @XmlAttribute
    private int age;

    @XmlElement(name = "gen")
    private String gender;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return "Orang [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

}
