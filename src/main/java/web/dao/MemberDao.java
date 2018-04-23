package web.dao;

import java.util.List;

import web.dto.Member;

public interface MemberDao {
	// Member Table 전체 조회 쿼리
	public List selectAll();

	// Member 삽입
	public void insert(Member member);

	// Member 삭제	
	public void delete(Member member);

	// Member 수정	
	public void update(Member member);

	// Member 조회	
	public Member selectMember(Member member);
}
