package com.archimedes.main.apirest.users.adapters;

import com.archimedes.main.apirest.users.mappers.MembersModelMapper;
import com.archimedes.main.apirest.users.models.MembersModel;
import com.archimedes.main.application.users.ports.input.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private MembersModelMapper membersModelMapper;

    @PostMapping("/add")
    public ResponseEntity<MembersModel> addMembership(@RequestBody MembersModel member){
        var memberDto = membersModelMapper.toDto(member);
        memberService.add(memberDto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/revoke")
    public ResponseEntity<MembersModel> revokeMembership(@RequestParam String email){
        memberService.revoke(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<MembersModel> updateMembership(@RequestBody MembersModel member) {
        var memberDto = membersModelMapper.toDto(member);
        memberService.update(memberDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/recurrent-billing")
    public ResponseEntity<MembersModel> recurrentBilling(@RequestParam String recurringType) {
        memberService.recurrentUpdate(recurringType);
        return ResponseEntity.ok().build();
    }

}
