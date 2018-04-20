package web.dao;

import java.util.List;

import web.dto.Member;

public interface MemberDao {
	// Member Table 전체 조회 쿼리
	public List selectAll();

	// Member 삽입
	public void insert(Member member);
	
	public void delete(Member member);
}
