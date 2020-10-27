package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Members;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final List<Members> membersList = new ArrayList<>();

    public List<Members> getAll(){
        return membersList;
    }

    public void saveMember (Members member) {

    }
}
