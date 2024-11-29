package com.kh.pack2.pre3;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEx {

    public void method1(){
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "happyLunch.txt";
    try{
        FileReader fr = new FileReader(path+fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }
    } catch (Exception e){
        System.out.println(e.getMessage()+" 의 문제가 발생했습니다. ");

    }






    }
}
