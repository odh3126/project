package kr.co.mlec.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.domain.Account;
import kr.co.mlec.domain.Board;
import kr.co.mlec.domain.Comment;
import kr.co.mlec.domain.File;
import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

public interface TestMapper3 {
	
	void insertBoard1(Board board);
	void insertBoard2(Board board);
	void insertFile(File file);
	int selectBoardNo();
	List<Member> selectMemberList();
	Account selectMemberAccountById(String id);
	List<Board>selectBoardList1();
	List<Comment> selectCommentList1();
	List<Comment> selectCommentList2ByNo(int no);
}








