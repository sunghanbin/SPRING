package com.brms.member.dao;

import java.util.HashMap;
import java.util.Map;

import com.brms.member.Member;

public class MemberDao {

	
//	데이터 베이스 역활 대신
	private Map<String,Member> memberDB =
			new HashMap<String,Member>();
			
	public void insert(Member member) {
		memberDB.put(member.getmId(),member);
	}
	
	public Member select(String mId) {
		return memberDB.get(mId);		
	}
	
	public Map<String,Member> getmemberDB(){
		return memberDB;
	}
}
