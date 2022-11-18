package com.company.calculator;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

public class CalcSalary {

	@DateTimeFormat(pattern = "HH:mm")
	private Date work_start_time;
	@DateTimeFormat(pattern = "HH:mm")
	private Date work_end_time;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date work_start_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date work_end_date;
	//월급 멤버변수
	private int salary;
	//최저시급 멤버변수
	private int pay=9160;
	public Map<String, Integer> calc(){

		Map<String, Integer> map=new HashMap();
		int start_time=work_start_time.getHours();
		int end_time=work_end_time.getHours();
		int minute=work_end_time.getMinutes()-work_start_time.getMinutes();
		int start_date=work_start_date.getDate();
		int end_date=work_end_date.getDate();
		int start_month=work_start_date.getMonth()+1;
		int end_month=work_end_date.getMonth()+1;

		
		//		System.out.println("시작시간 : "+work_start_time);
//		System.out.println("종료시간 : "+work_end_time);
//		System.out.println("시작날짜 : "+work_start_date);
//		System.out.println("종료날짜 : "+work_end_date);
//		System.out.println("시작일 : "+start_date);
//		System.out.println("종료일 : "+end_date);
//		System.out.println("시작월 : "+start_month);
//		System.out.println("종료월 : "+end_month);
//		System.out.println("잔여 분계산 : "+minute);
		
		long diffSec = ((work_end_date.getTime() - work_start_date.getTime())/1000);
		long diffDays = diffSec / (24*60*60)+1; //일자수 차이
		int workDay=(int) diffDays;
		//노동 시간
		int workTime=end_time-start_time;
		
		
		if(minute/30==0) {
			salary+=0;
		}else {
			salary+=pay/2;
		}
		salary+=Math.abs(workDay)*Math.abs(workTime)*pay;
		
		System.out.println("하루 근무시간 : "+workTime+"시간");
		System.out.println("총 계약기간 : "+workDay+"일");
		System.out.println("월급 : "+salary+"원");
		
		
		map.put("workTime", workTime);
		map.put("workDay", workDay);
		map.put("salary", salary);
		
		return map;
	}

	public Date getWork_start_time() {
		return work_start_time;
	}

	public void setWork_start_time(Date work_start_time) {
		this.work_start_time = work_start_time;
	}

	public Date getWork_end_time() {
		return work_end_time;
	}

	public void setWork_end_time(Date work_end_time) {
		this.work_end_time = work_end_time;
	}

	public Date getWork_start_date() {
		return work_start_date;
	}

	public void setWork_start_date(Date work_start_date) {
		this.work_start_date = work_start_date;
	}

	public Date getWork_end_date() {
		return work_end_date;
	}

	public void setWork_end_date(Date work_end_date) {
		this.work_end_date = work_end_date;
	}

	@Override
	public String toString() {
		return "CalcSalary [work_start_time=" + work_start_time + ", work_end_time=" + work_end_time
				+ ", work_start_date=" + work_start_date + ", work_end_date=" + work_end_date + ", salary=" + salary
				+ ", pay=" + pay + "]";
	}
	
	
	
}
