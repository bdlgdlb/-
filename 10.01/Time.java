public class Time{
	private int hour;
	private int minute;
	private int second;

	public Time (){
		this(System.currentTimeMillis());
	}

	public Time (long elapseTime){
		setTime(elapseTime);
	}

	public Time (int hour, int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//返回小时
	public int getHour(){
		return hour;
	}

	//返回分钟
	public int getMinute(){
		return minute;
	}

	//返回秒数
	public int getSecond(){
		return second;
	}

	//用流逝的毫秒数设置一个新时间
	public void setTime(long elapseTime){
		//把毫秒转换成秒
		long totalSeconds = elapseTime / 1000;

		//当前时间的秒数
		second = (int)(totalSeconds % 60);

		long totalMinutes = totalSeconds / 60;

		//当前时间的分钟数
		minute = (int)(totalMinutes % 60);

		long totalHours = totalMinutes / 60;

		//当前时间的小时数
		hour = (int)(totalHours % 24);

	}
}