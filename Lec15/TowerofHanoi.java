package Lec15;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh(3,"A","C","B");

	}
	
	public static void toh(int n,String from,String to,String via)
	{
		if(n == 0)
		{
			return;
		}
		else
		{
			toh(n-1,from,via,to);
			System.out.println("Move "+n+"th disk from "+from+" to "+to);
			toh(n-1,via,to,from);
		}
	}

}
