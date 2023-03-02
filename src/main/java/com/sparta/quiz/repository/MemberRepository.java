package com.sparta.quiz.repository;

import com.sparta.quiz.dto.MemberResponseDto;
import com.sparta.quiz.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAllByOrderByCreatedAtAsc();
}