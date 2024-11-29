package com.kh.pack1.filePre;

import java.io.File;
import java.text.SimpleDateFormat;

public class FilePre2 {

    // 사용자 -> user1 -> front-workspace -> 01_html .C:/Users/user1/front-workspace/01_HTML
    // 위치 맏는지 확인,
    // 폴더에 들어있응 파일 이름, 수정한 날짜 출력
    // 출력은 FolderRun1

    public void method1(){
        File folder = new File("C:/Users/user1/front-workspace/01_HTML");
        if(folder.exists()) {
            File[] files = folder.listFiles();
            for(File f : files) {
                System.out.println(f.getName());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String date = sdf.format(f.lastModified());
                System.out.println(date);
            }

        }
    }
}
