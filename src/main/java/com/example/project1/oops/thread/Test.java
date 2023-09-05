package com.example.project1.oops.thread;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.stream.Collector;

public class Test {

    ServerSocket serverSocket;
    Socket socket;
    BufferedReader br;
    PrintWriter out;

    public Test() {
        try {

            serverSocket = new ServerSocket(7777);
            System.out.println("Server is Ready");
            System.out.println("Waiting");
            socket = serverSocket.accept();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(socket.getOutputStream());

            stratReading();
            stratWritig();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void stratReading() {
        System.out.println("Strat Reading");
        Runnable r1 = () -> {
            while (true) {
                try {
                    String msg = br.readLine();
                    if (msg.equals("exit")) {
                        System.out.println("Client  has Stopped");
                        break;
                    }
                    System.out.println("Client :-" + msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };
        new Thread(r1).start();

    }

    public void stratWritig() {
        System.out.println("Start Writing");
        Runnable r2 = () -> {
            while (true) {
                try {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };
        new Thread(r2).start();

    }

    static class CustomArrayList extends ArrayList {
        @Override
        public boolean add(Object o) {

            return !this.contains(o) && super.add(o);
        }
    }

    public static void main(String[] args) {
        Map<Custom,Integer> map=new HashMap<>();
        map.put( Custom.build("Subrat",1),1);
        map.put(new Custom("Subrat",1),2);
        map.put(new Custom("Subrat",1),3);
       map.put( Custom.builder().id(1).build(),4);

        System.out.println(map);


    }

    @Data
    @AllArgsConstructor(staticName = "build")
    @Builder
//    @ToString
    static class Custom {
        String name;
        Integer id;
    }
}