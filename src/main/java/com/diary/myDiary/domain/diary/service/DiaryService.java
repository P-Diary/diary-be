package com.diary.myDiary.domain.diary.service;

public interface DiaryService {

    void saveDiary(String content, String emotion);
    void deleteDiary(Long id);
    void readDiary(Long id);
}
