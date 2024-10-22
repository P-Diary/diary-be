package com.diary.myDiary.domain.diary.repository;

import com.diary.myDiary.domain.diary.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {


}
