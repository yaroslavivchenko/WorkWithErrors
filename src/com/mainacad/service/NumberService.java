package com.mainacad.service;

import com.mainacad.exception.MyCustomException;

import java.io.File;
import java.io.FileWriter;
import java.util.logging.Logger;

public class NumberService {

    public static final Logger LOGGER = Logger.getLogger(NumberService.class.getName());

    public static Double getDivResult(int number1, int number2) throws MyCustomException {
        Double result = null;

        result = Double.valueOf(number1) / number2;

        File file = new File("C:/work/logs.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("text");
        } catch (Exception  e){
            throw  new MyCustomException("something wrong");
        }
        return result;
    }
}
