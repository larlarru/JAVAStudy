package g_oop2;

public class Time {
	
	
	//Source에 generate getters and setters...로 시작하는걸로 클릭해서 만들어주면된다.
	private int hour;
	private int minute;
	private int second;
	
	//변수값을 읽어오거나 저장할 수 있다.
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		if (hour < 0) {
			this.hour = 0;
		} else if (hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	/*	if(hour >= 0 && hour <= 24){
		this.hour = hour;
		} else {
			System.out.println("시간 잘못입력");
		}*/
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		 //선생님이 하신거
		if (minute < 0) {
			this.minute = 0;
		} else if(minute > 59) {
			this.minute = 59;
			setHour(this.minute + 1);
		} else {
			this.minute = minute;
		}
		
		
		
		/*if(minute >= 0 && minute <= 60){
			this.minute = minute;
			} else {
				System.out.println("분 잘못입력");
			}*/
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {

		if (second < 0) {
			this.second = 0;
		} else if (second > 59) {
			this.second = 59;
			setMinute(this.second + 1);
		} else {
			this.second = second;
		}
		
		/*if (second == 60) {
			this.second = 0;
			minute++;
		} 
		if (minute == 60) {
			this.minute = 0;
			hour++;
		} 
		if (hour == 24) {
			this.hour = 0;
		} */
		
		
	/*	if(second >= 0 && second <= 60){
			this.second = second;
			} else {
				System.out.println("초 잘못입력");
			}*/
	}
	
	//시간 메서드
	String getTime(){
		return hour + " : " + minute + " : " + second;
	}
	
	void clock() { //시간출력할때 이것만 알아도됨 stop는 몰라도됨
		while(true) {
			System.out.println(getTime());
			stop(100);
			setSecond(second + 1);
		}
	}
	
	
	private void stop(int i) {
		try { //try catch는 에러처리로 에러를 방지하기 위한 코드
			Thread.sleep(i); //파라미터에 넘겨진 만큼 스레드 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //컴터가 잠시동안 잠
		
	}
	
	
	
}
























