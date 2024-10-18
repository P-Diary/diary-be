package com.diary.myDiary.domain.member.exception;

import com.diary.myDiary.global.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberException extends RuntimeException {

    private final ErrorCode errorCode;
}
