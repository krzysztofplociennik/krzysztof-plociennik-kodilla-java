package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();
        //FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        try {
            //fileReaderWithoutHandling.readFile();
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem reading the file!");
        }
    }
}
