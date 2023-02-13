package kr.kh.test2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.test2.dao.MemberDAO;

@Service
public class MemberServiceImp implements MemberService {

//	@Autowired
//	MemberDAO memberDao;
//
//	@Override
//	public String selectMemberName(Integer num) {
//		if(num == null)
//			return null;
//		return memberDao.selectMemberName(num);
//	}
}
