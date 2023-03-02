package com.sparta.quiz.service;

import com.sparta.quiz.dto.MemberResponseDto;
import com.sparta.quiz.entity.Member;
import com.sparta.quiz.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponseDto findMember(long id) {
        Optional<Member> member = memberRepository.findById(id);
        MemberResponseDto dto = new MemberResponseDto(member);
        return dto;
    }

    public List<MemberResponseDto> findAllMember() {
        List<Member> list = memberRepository.findAllByOrderByCreatedAtAsc();
        List<MemberResponseDto> list2 = new ArrayList<MemberResponseDto>();
        for (int i=0;i<list.size();i++) {
            list2.add(new MemberResponseDto(list.get(i)));
        }
        return list2;
    }

    public MemberResponseDto createMember(MemberResponseDto responseDto) {
        Member member = new Member(responseDto);
        memberRepository.save(member);
        return responseDto;
    }
}
