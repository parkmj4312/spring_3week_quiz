package com.sparta.quiz.controller;

import com.sparta.quiz.dto.MemberResponseDto;
import com.sparta.quiz.entity.Member;
import com.sparta.quiz.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     *
     * @param id
     */
    @GetMapping("/member/{id}")
    public MemberResponseDto getMemberInfo(@PathVariable Long id) {
        MemberResponseDto dto = memberService.findMember(id);
        return dto;
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public List<MemberResponseDto> getMemberList() {
        return memberService.findAllMember();
    }
    @PostMapping("/member")
    public MemberResponseDto createMember(@RequestBody MemberResponseDto requestDto) {
        return memberService.createMember(requestDto);
    }

}