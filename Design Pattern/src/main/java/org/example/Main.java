package org.example;

import org.example.Builder.House;
import org.example.Builder.HouseBuilder;
import org.example.Composite.Boss;
import org.example.Composite.BusinessAnalyst;
import org.example.Composite.Developer;
import org.example.Composite.Leader;
import org.example.FactoryMethod.Candy;
import org.example.FactoryMethod.CandyFactory;
import org.example.FactoryMethod.CandyType;
import org.example.Prototype.User;
import org.example.Proxy.ProxyImage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Proxy Pattern
//        ProxyImage proxyImage = new ProxyImage("https://abcd.com/dev.png");
//
//        System.out.println("First time");
//        proxyImage.load();
//        System.out.println("Seconds time");
//        proxyImage.load();

        //Composite Pattern
//        Developer dev1 = new Developer(30,"John",2000);
//        Developer dev2 = new Developer(25,"Ana",1800);
//
//        Leader leader = new Leader(45,"Sam",5000);
//        leader.add(dev1);
//        leader.add(dev2);
//
//        BusinessAnalyst ba = new BusinessAnalyst(27,"Jame",2100);
//
//        Boss boss = new Boss(60,"Tom",8000);
//        boss.add(leader);
//        boss.add(ba);
//        boss.print();

        //Builder Pattern
//        House house1 = new HouseBuilder()
//                .buildDoors(5)
//                .buildRoof(true)
//                .buildPool(true)
//                .buildWalls(4)
//                .withColor("Black")
//                .build();
//        System.out.println(house1);

        // FactoryMethod Pattern
//        Candy candy = CandyFactory.getCandy(CandyType.MINTY_CANDY);
//        System.out.println(candy.getCandyName());

        // ProtoType Pattern
//        User user1 = new User("van-tan","vantan@gmail.com",25);
//        System.out.println(user1);
//        User user2 = user1.clone();
//        System.out.println(user2);
//
//        System.out.println("==================");
//        user1.setAge(30);
//        System.out.println(user1);
//        System.out.println(user2);
    }
}