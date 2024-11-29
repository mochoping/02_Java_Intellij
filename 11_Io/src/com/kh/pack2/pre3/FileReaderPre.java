package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    /**
     * readTxt(String Path, String fileName)
     * @param path
     * @param fileName
     */
    public void readTxt(String path, String fileName) {
        String file = path + fileName;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
        }
        } catch (IOException e) {
            System.out.println(e.getMessage() + " 의 문제가 발생했습니다.");
        } finally {
            System.out.println("읽기 모드를 종료합니다.");
        }
        }
    }
