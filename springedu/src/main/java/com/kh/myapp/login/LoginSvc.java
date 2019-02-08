package com.kh.myapp.login;

import com.kh.myapp.member.dto.MemberDTO;


public interface LoginSvc {
	//회원유무 체크
	public boolean isMember(String id, String pw);
	
	//로그인
	public MemberDTO login(String id, String pw);
	
	// 아이디찾기
	public MemberDTO findId(String tel, String birth);

	// 비밀번호찾기
	public MemberDTO findPw(String id, String tel, String birth);
}
