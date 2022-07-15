package com.project;

public class Reverse {
	public static void main(String[] args) {
		
        String pre="+(908)523-9271";
        String s;
        Integer j=pre.length();
        System.out.println(j);//1729325809
        
        for(int i=j-1;i>0;i--)
        {
            if(pre.charAt(i)=='+'||pre.charAt(i)=='('||pre.charAt(i)==')'||pre.charAt(i)=='-')
            {
                continue;
            }
            
                System.out.print(pre.charAt(i));
        }


        
	}
}
