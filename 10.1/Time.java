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

	//����Сʱ
	public int getHour(){
		return hour;
	}

	//���ط���
	public int getMinute(){
		return minute;
	}

	//��������
	public int getSecond(){
		return second;
	}

	//�����ŵĺ���������һ����ʱ��
	public void setTime(long elapseTime){
		//�Ѻ���ת������
		long totalSeconds = elapseTime / 1000;

		//��ǰʱ�������
		second = (int)(totalSeconds % 60);

		long totalMinutes = totalSeconds / 60;

		//��ǰʱ��ķ�����
		minute = (int)(totalMinutes % 60);

		long totalHours = totalMinutes / 60;

		//��ǰʱ���Сʱ��
		hour = (int)(totalHours % 24);

	}
}