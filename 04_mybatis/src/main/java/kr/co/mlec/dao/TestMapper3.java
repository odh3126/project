package kr.co.mlec.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.domain.Board;
import kr.co.mlec.domain.File;
import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

public interface TestMapper3 {
	
	void insertBoard1(Board board);
	void insertFile(File file);
	int selectBoardNo();
}








