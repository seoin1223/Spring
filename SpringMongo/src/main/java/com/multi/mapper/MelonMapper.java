package com.multi.mapper;

import java.util.List;

import com.multi.domain.MelonVO;

public interface MelonMapper {
	// 오늘의 멜론 크롤링해서 몽고 디비에 저장
		int crawlingMelon() throws Exception;
		
		// 수집된 멜론 목록 가져오기
		List<MelonVO> getMelonList(String collectionName) throws Exception;

		int insertMelon(List<MelonVO> mList, String collectionName);
}
