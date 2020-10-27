package com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Members;

public class MemberResponse {
    private String name;

    public MemberResponse(Members member) {
        this.name = member.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
