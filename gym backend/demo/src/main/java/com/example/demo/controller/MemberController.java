package com.example.demo.controller;
import com.example.demo.model.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable(value = "id") String memberID) {
        Optional<Member> member = memberService.getMemberById(memberID);
        return member.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Member> createMember(@RequestBody Member member) {
        Member createdMember = memberService.saveMember(member);
        return ResponseEntity.status(201).body(createdMember);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable(value = "id") String memberID, @RequestBody Member memberDetails) {
        Member updatedMember = memberService.updateMember(memberID, memberDetails);
        return updatedMember != null ? ResponseEntity.ok(updatedMember) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable(value = "id") String memberID) {
        memberService.deleteMember(memberID);
        return ResponseEntity.noContent().build();
    }
}
