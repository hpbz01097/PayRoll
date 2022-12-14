package com.company.biz.schedule;

import java.util.List;
import java.util.Map;

public interface ScheduleService {
	List<ScheduleVO> getScheduleList();

	ScheduleVO getSchedule(ScheduleVO vo);
	
	public void updateSchedule(Map<String, Object> map) throws Exception;
	
	public int getMaxSchedule_no() throws Exception;
	
	public int insertSchedule(Map<String, Object> map) throws Exception;

	List<UserScheduleVO> getScheduleListByUser_no(int user_no) throws Exception;

	public int deleteSchedule(int schedule_no) throws Exception;
	
	
}
