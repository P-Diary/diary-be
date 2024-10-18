package com.diary.myDiary.domain.notification.service.impl;

import com.diary.myDiary.domain.notification.repository.NotificationRepository;
import com.diary.myDiary.domain.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    @Override
    public void sendNotification(Long memberId, String message) {

    }

    @Override
    public void readNotification(Long notificationId) {

    }

    @Override
    public void readAllNotification(Long memberId) {

    }

    @Override
    public void deleteNotification(Long notificationId) {

    }

    @Override
    public void deleteAllNotification(Long memberId) {

    }
}
