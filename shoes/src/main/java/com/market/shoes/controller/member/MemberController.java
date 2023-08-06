package com.market.shoes.controller.member;

import org.springframework.web.bind.annotation.RestController;

import com.market.shoes.model.service.member.MemberService;
import com.market.shoes.model.vo.Member;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
	
	public String memberEnroll(Member m) {
		
		return memberService.memberEnroll(m);
	}
}
