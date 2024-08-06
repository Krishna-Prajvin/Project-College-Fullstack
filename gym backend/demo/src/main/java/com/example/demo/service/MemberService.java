package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(String memberID) {
        return memberRepository.findById(memberID);
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(String memberID, Member memberDetails) {
        if (memberRepository.existsById(memberID)) {
            memberDetails.setMemberID(memberID);
            return memberRepository.save(memberDetails);
        }
        return null;
    }

    public void deleteMember(String memberID) {
        memberRepository.deleteById(memberID);
    }
}
