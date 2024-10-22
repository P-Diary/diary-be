package com.diary.myDiary.domain.diary.service.impl;

import com.diary.myDiary.domain.diary.repository.DiaryRepository;
import com.diary.myDiary.domain.diary.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;

    @Override
    public void saveDiary(String content, String emotion) {

    }

    @Override
    public void deleteDiary(Long id) {

    }

    @Override
    public void readDiary(Long id) {

    }
}
