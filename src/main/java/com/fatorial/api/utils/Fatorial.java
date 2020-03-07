package com.fatorial.api.utils;

public class Fatorial {

	Integer fat=1;
	
	public Integer fat(Integer a)throws Exception{

		if(a==0)
			return 1;
		if(a>0)
		{
			for(int i=2;i<=a;i++)
			{
				fat*=i;
			}


			return fat;
		}
		else

			throw (new Exception ("Não é possível  Calcular números negativos!"));


	}
	
	 public static int fatorial(int num) {
     
	        if (num <= 1) {

	            return 1;

	        } else {
	            return fatorial(num - 1) * num;

	        }

	    }
}