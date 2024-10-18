package com.diary.myDiary.domain.notification.service;

public interface NotificationService {

    void sendNotification(Long memberId, String message);
    void readNotification(Long notificationId);
    void readAllNotification(Long memberId);
    void deleteNotification(Long notificationId);
    void deleteAllNotification(Long memberId);
}
