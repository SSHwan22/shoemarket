package com.market.shoes.model.service;

import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.MemberMapper;
import com.market.shoes.model.vo.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

	private final MemberMapper memberMapper;

	@Override
	public String memberEnroll(Member m) {
		return memberMapper.memberEnroll(m);
	}
	
	
}