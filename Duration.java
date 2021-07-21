class Duration
{
	public static void main(String[] args) 
	{
		System.out.println(getDurationString(3600,0));
        System.out.println(getDurationString(0, 3600));
        System.out.println(getDurationString(0, 3660));
        System.out.println(getDurationString(63, 6));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(3666));
	}

	public static String getDurationString(int min, int sec)
	{
		String duration="";
		int sum= min*60+sec;
		if (min >= 0 && sec >= 0 && sec < 60)
		{
			duration= "(sum/3600)+"h "+((sum%3600)/60)+"m "+(sum%60)+"s "";
		}
		else
			return "Invalid Value";
		return duration;
	}

	public static String getDurationString(int sec)
	{
		String duration="";
		if (sec >= 0)
		{
			duration=getDurationString(sec/60,sec%60);
		}
		return duration;
	}
}
