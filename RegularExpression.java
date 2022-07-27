package com.phase.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression 
{
	public static void main(String[] args)

{
	String sentence = "Face is index of mind";
	Pattern p = Pattern.compile("mind");
	Matcher m = p.matcher(sentence);
	while(m.find())
	{
		System.out.println(m.group()+ " starts at "+m.start());
	}
	
}
}