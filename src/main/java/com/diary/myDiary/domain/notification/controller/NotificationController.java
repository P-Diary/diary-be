package com.diary.myDiary.domain.notification.controller;

import com.diary.myDiary.domain.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public void sendNotification(Long memberId, String message) {
        notificationService.sendNotification(memberId, message);
    }

    public void readNotification(Long notificationId) {
        notificationService.readNotification(notificationId);
    }

    public void readAllNotification(Long memberId) {
        notificationService.readAllNotification(memberId);
    }

    public void deleteNotification(Long notificationId) {
        notificationService.deleteNotification(notificationId);
    }

    public void deleteAllNotification(Long memberId) {
        notificationService.deleteAllNotification(memberId);
    }
}
