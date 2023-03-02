package com.sparta.quiz.dto;

import com.sparta.quiz.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Getter
@NoArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;
    public MemberResponseDto(Long id,String name,String email,String pw) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pw = pw;
    }

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.email = member.getEmail();
        this.pw = member.getPw();
    }

    public MemberResponseDto(Optional<Member> member) {
        this.id = member.get().getId();
        this.name = member.get().getName();
        this.email = member.get().getEmail();
        this.pw = member.get().getPw();
    }
}