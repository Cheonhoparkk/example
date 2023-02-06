package com.cos.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.blog.mapper.BoardInfoMapper;
import com.cos.blog.vo.BoardInfoVO;


@Service
public class BoardInfoService{

	@Autowired
	private BoardInfoMapper boardInfoMapper;

	public List<BoardInfoVO> getBoardInfos(BoardInfoVO boardInfo){
		return boardInfoMapper.selectBoardInfoList(boardInfo);
	}
	
	public BoardInfoVO getBoardInfo(int biNum) {
		return boardInfoMapper.selectBoardInfo(biNum);
	}
	public int insertBoardInfo(BoardInfoVO boardInfo) {
		return boardInfoMapper.insertBoardInfo(boardInfo);
	}
	
	public int updateBoardInfo(int biNum) {
		return boardInfoMapper.updateBoardInfo(biNum);
	}
	
	public int deleteBoardInfo(int biNum) {
		return boardInfoMapper.deleteBoardInfo(biNum);
	}
}