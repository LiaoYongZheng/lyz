package com.lyz.service.impl;


import com.lyz.domain.Member;
import com.lyz.mapper.IMemberMapper;
import com.lyz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private IMemberMapper iMemberMapper;
    @Override
    public List<Member> findAll() {
        return iMemberMapper.findAll();
    }
}
