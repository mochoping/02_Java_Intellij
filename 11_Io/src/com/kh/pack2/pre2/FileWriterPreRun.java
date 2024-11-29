package com.kh.pack2.pre2;

public class FileWriterPreRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "user.txt";
        FileWritePre fwp = new FileWritePre();

        System.out.println("=== [" + fileName + "] 생성 시작 ===");
        //fwp.createTxt(path, fileName);
        fwp.writeTxt(path, fileName);
        //
    }
}
