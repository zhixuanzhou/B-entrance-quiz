package com.thoughtworks.capability.gtb.entrancequiz.Controller;
import com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto.MemberRequest;
import com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto.MembersResponse;
import com.thoughtworks.capability.gtb.entrancequiz.Model.Members;
import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// TODO GTB-工程实践: - import语句不要使用通配符
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")
// TODO GTB-知识点: - 违反Restful实践, url不合理
@RequestMapping("/membersList")
public class MembersController {
    private final MemberService memberService;

    public MembersController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    // TODO GTB-知识点: - 违反Restful实践, Post请求成功后应该返回201
    public ResponseEntity<Void> newMember(@RequestBody MemberRequest request) {
        memberService.saveMember(new Members(request));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    // TODO GTB-知识点: - 违反Restful实践，请求成功后直接返回数据即可，不需要再包一层
    public ResponseEntity<MembersResponse> getAllMembers() {
        List<Members> members = memberService.getAll();
        return ResponseEntity.ok(new MembersResponse(members));
    }
}
