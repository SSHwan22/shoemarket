package com.market.shoes.controller.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.market.shoes.model.service.member.MemberService;
import com.market.shoes.model.vo.Member;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
	
	@PostMapping("/member/enroll")
	public String memberEnroll(@RequestBody Member m) {
		return memberService.memberEnroll(m);
	}
	
	@PostMapping("/member/login")
	public String login() {
		return memberService.memberLogin();
	}
}
