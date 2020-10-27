package com.thoughtworks.capability.gtb.entrancequiz.Controller;
import com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto.MemberRequest;
import com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto.MembersResponse;
import com.thoughtworks.capability.gtb.entrancequiz.Model.Members;
import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")

@RequestMapping("/membersList")
public class MembersController {
    private final MemberService memberService;

    public MembersController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<Void> newMember(@RequestBody MemberRequest request) {
        memberService.saveMember(new Members(request));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<MembersResponse> getAllMembers() {
        List<Members> members = memberService.getAll();
        return ResponseEntity.ok(new MembersResponse(members));
    }
}
