class CatPlay 
{
	public static void main(String[] args) 
	{
		System.out.println(isCatPlaying(true,30));
		System.out.println(isCatPlaying(true,55));
		System.out.println(isCatPlaying(true,20));
		System.out.println(isCatPlaying(false,30));
		System.out.println(isCatPlaying(false,38));
		System.out.println(isCatPlaying(false,20));
	}

	public static boolean isCatPlaying(boolean summer,int temperature)
	{
		if (summer==true&&temperature<=45&&temperature>=25)
		{
			return true;
		}
		else if (summer==false&&temperature<=35&&temperature>=25)
		{
			return true;
		}
		return false;
	}
}
