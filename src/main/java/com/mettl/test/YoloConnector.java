package com.mettl.test;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class YoloConnector {
        private native void personCount();
        public static void main(String[] args) {
                int personCount = 0;
                try{
                        Path path = Paths.get("/home/vinay/workspace/cpp_workspace/darknet/data/person.jpg");
                        byte[] fileContents =  Files.readAllBytes(path);
                        System.out.println("length : "+fileContents.length);
                        new YoloConnector().personCount();
                        System.out.println("Person Count : " + personCount);
                }catch(Exception e){
                        System.out.println("error");
                }
        }

        static {
                System.loadLibrary("foo");
        }
}