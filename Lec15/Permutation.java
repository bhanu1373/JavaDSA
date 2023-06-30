package Lec15;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		permutation2("abca", "");
		trickyPermutation("abca", "");
		

	}
	
	public static void permutation(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				String nq = ques.substring(0,i)+ques.substring(i+1);
				permutation(nq, ans+ques.charAt(i));
			}
		}
	}
	
	public static void permutation2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i <= ans.length(); i++)
			{
				String na = ans.substring(0,i)+ques.charAt(0)+ans.substring(i);
				permutation2(ques.substring(1), na);
			}
		}
	}
	
	
	public static void trickyPermutation(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				if(ques.indexOf(ques.charAt(i)) == i)
				{
					String nq = ques.substring(0,i)+ques.substring(i+1);
					trickyPermutation(nq, ans+ques.charAt(i));
				}
			}
		}
	}

}
