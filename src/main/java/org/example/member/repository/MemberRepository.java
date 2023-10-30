package org.example.member.repository;

import org.example.member.entity.Member;
import org.example.util.Util;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<Member> memberList = new ArrayList<>();

    public Member getMemberFindByUserId(String userId) {
        for (int i = 0; i < memberList.size(); i++) {
            Member member = memberList.get(i);
            if (member.getUserId().equals(userId)) {
                return member;
            }
        }
        return null;
    }

    public void join(String userId, String password) {
        Member member = new Member(userId, password, Util.nowDateTime());
        memberList.add(member);
    }
}
