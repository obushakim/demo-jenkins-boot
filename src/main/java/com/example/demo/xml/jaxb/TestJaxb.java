package com.example.demo.xml.jaxb;

public class TestJaxb
{
    private static final String FILE_NAME = "obus-jaxb-example";

    public Orang createJaxb()
    {
        Orang orang = new Orang();
        orang.setId(1);
        orang.setName("obus");
        orang.setAge(20);
        orang.setGender("Male");

        return orang;
    }
}
