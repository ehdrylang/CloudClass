package org.study.service;

import org.study.domain.BoardVO;
import org.study.domain.MeetingVO;

public interface MeetingService {
	
	public void meetingComplete(MeetingVO vo) throws Exception;
	
	public MeetingVO meetingRequestCheck(MeetingVO vo) throws Exception;

	public void meetingCountUp(Integer bno) throws Exception;

	public BoardVO meetingBoardInfo(Integer bno) throws Exception;
	
	

}
