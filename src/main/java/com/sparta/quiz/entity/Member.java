package com.sparta.quiz.entity;
import com.sparta.quiz.dto.MemberResponseDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String pw;

    public Member(long id,String name, String email, String pw) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pw = pw;
    }

    public Member(MemberResponseDto memberDto) {
        this.id = memberDto.getId();
        this.name = memberDto.getName();
        this.email = memberDto.getEmail();
        this.pw = memberDto.getPw();
    }
}
