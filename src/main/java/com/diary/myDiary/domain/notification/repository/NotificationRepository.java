package com.diary.myDiary.domain.notification.repository;

import com.diary.myDiary.domain.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
