package com.market.shoes.controller.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.market.shoes.model.service.member.MemberService;
import com.market.shoes.model.vo.Member;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

	private final MemberService memberService;
	
	@PostMapping("/enroll")
	public String memberEnroll(@RequestBody Member m) {
		return memberService.memberEnroll(m);
	}
	
	@PostMapping("/login")
	public String loginMember(@RequestBody Member m) {
		return new Gson().toJson(memberService.memberLogin(m));
	}
}
