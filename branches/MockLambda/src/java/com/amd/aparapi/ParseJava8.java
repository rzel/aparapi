package com.amd.aparapi; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ParseJava8{
   public static void main(String[] args) throws FileNotFoundException, ClassParseException{
       ClassModel classModel = new ClassModel(new FileInputStream(args[0]));
   }
}