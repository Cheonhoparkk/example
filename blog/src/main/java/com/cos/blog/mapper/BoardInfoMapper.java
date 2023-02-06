package com.cos.blog.mapper;

import java.util.List;

import com.cos.blog.vo.BoardInfoVO;


public interface BoardInfoMapper {
	
	List<BoardInfoVO> selectBoardInfoList(BoardInfoVO boardInfo);
	BoardInfoVO selectBoardInfo(int biNum);
	int insertBoardInfo(BoardInfoVO boardInfo);
	int updateBoardInfo(int biNum);
	int deleteBoardInfo(int biNum);
	
}