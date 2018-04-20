package web.service;

import java.util.List;

import web.dto.Member;

public interface MemberService {
	// Member 테이블 정보 전체 조회하기
	public List getMembers();

	// Member 정보 삽입 - 회원가입
	public void insert(Member member);
	
	public void delete(Member member);
}
