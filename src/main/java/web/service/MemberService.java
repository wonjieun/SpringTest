package web.service;

import java.util.List;

import web.dto.Member;

public interface MemberService {
	// Member 테이블 정보 전체 조회하기
	public List getMembers();

	// Member 정보 삽입 - 회원가입
	public void insert(Member member);
	
	public void delete(Member member);
	
	// Member 정보 수정 - idx기준으로 이름, 이메일, 전화번호 수정
	public void update(Member member);
	
	// Member 한명 정보 가져오기
	// UPDATE의 결과를 확인하기 위해
	// idx, name, email, phone 전부 조회 조건으로 사용중
	public Member getOneMember(Member member); 
}
