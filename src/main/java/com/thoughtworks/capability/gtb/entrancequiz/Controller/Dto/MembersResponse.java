package com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Members;

import java.util.List;
import java.util.stream.Collectors;

public class MembersResponse {

    public MembersResponse(List<Members> membersList) {
        List<MemberResponse> memberResponses = membersList.stream().map(MemberResponse::new).collect(Collectors.toList());
    }
}
