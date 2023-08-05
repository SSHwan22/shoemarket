package com.market.shoes.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.market.shoes.model.vo.Member;

@Mapper
@Repository
public interface MemberMapper {

	String memberEnroll(Member m);
}
