package com.kh.throwsExceptionPre;

import java.io.*;

public class ThrowsPre {
    //try 대신 throws IOException 작성
    public void method1() throws IOException {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "여행지도";
        String extName = ".docs";

        File f = new File(path + fileName + extName);

        f.createNewFile();
        System.out.println("파일생성이 완료 되었습니다.");

        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);

        String content ="안녕하세요";
        fw.write(content);





    }
    //try 대신 throws IOException 작성하고 에러 확인하기

    public void method2() throws Exception {
        String path = System.getProperty("user.home") + "/Desktop/";
        FileReader fr = new FileReader(System.getProperty("user.home") + "/Desktop/" + "여행지도" + ".docs");
        String line = fr.toString();
        System.out.println(line);
    }
}
