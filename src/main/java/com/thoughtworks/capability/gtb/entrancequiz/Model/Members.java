package com.thoughtworks.capability.gtb.entrancequiz.Model;

import com.thoughtworks.capability.gtb.entrancequiz.Controller.Dto.MemberRequest;

public class Members {
    private String name;
    public String getName() {
        return name;
    }

    public Members (String name) {
        this.name = name;
    }

    public Members (MemberRequest memberRequest) {
        this.name = memberRequest.getName();
    }
}
