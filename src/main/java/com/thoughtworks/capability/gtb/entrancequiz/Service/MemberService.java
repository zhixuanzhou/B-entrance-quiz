package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Members;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// TODO GTB-知识点: - 不符合三层架构，缺少用于保存数据的Repository层
public class MemberService {
    private final List<Members> membersList = new ArrayList<>();

    public List<Members> getAll(){
        return membersList;
    }

    public void saveMember (Members member) {

    }
}
