package com.diary.myDiary.domain.member.repository;

import com.diary.myDiary.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUsername(String username);

    boolean existsByUsername(String username);

    Optional<Member> findByRefreshToken(String refreshToken);
}
