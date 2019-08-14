package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication<E>
{
    private String result;

    private String obus = "Obus";

    @GetMapping("/")
    public String hello()
    {
        // HashSet
        Set<String> objHashSet = new HashSet<String>();
        objHashSet.add(obus);

        // TreeSet
        Set<String> objTreeSet = new TreeSet<String>();
        objTreeSet.add(obus);

        // ArrayList
        List<String> objList = new ArrayList<String>();
        objList.add(obus);

        // LinkedList
        List<String> objLinkedList = new LinkedList<String>();
        objLinkedList.add(obus);

        // HashMap
        Map<String, String> objHashMap = new HashMap<String, String>();
        objHashMap.put(obus, obus);

        // TreeMap
        Map<String, String> objTreeMap = new TreeMap<String, String>();
        objTreeMap.put(obus, obus);

        // PriorityQueue
        Queue<String> objPriorityQueue = new PriorityQueue<String>();
        objPriorityQueue.add(obus);

        return objPriorityQueue.toString();
    }

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }

}
