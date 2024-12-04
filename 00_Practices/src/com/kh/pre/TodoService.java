package com.kh.pre;

import java.util.Map;

public interface TodoService {

    /**
     * 할일목록반환 서비스
     * @return todolist + 완료개수
     *
     */
    Map<String,String> todoFistFullView();

    /**
     * 할 일 추가 기능
     * @param title 할일의 제목
     * @param detail 할 일의 상세제목
     * @return 추가된 할 일의 번호를 전달 / 전달싶패시 -1뜸
     *
     */
    int todoAdd(String title, String detail);

    /**
     * 할 일 수정 기능
     * @param index
     * @param title
     * @param detail 할 일의 상세제목
     * @return
     */
    boolean todoUpdate(int index, String title, String detail);

}

