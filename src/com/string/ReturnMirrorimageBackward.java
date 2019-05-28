package com.string;

public class ReturnMirrorimageBackward {
	
	/* Given a string, look for a mirror image (backwards) string at both the 
	 * beginning and end of the given string. In other words, zero or more 
	 * characters at the very begining of the given string, and at the very end 
	 * of the string in reverse order (possibly overlapping). For example, the 
	 * string "abXYZba" has the mirror end "ab".
	 */
	
	public static String mirrorEnds(String string)
	{
		int len = string.length();
		int p = len - 1;
		for(int i = 0; i < len; i++, p--)
		{
			if(string.charAt(i) != string.charAt(p))
				return string.substring(0, i);
		}
		return string;
	}
	
	
	public static String mirrorEnds2(String string) {
	    StringBuilder result = new StringBuilder();
	    
	    for(int i = 0; i < string.length(); i++) {
	        if(string.charAt(i) == string.charAt(string.length() - i - 1))
	            result.append(string.charAt(i));
	        else
	            break;
	    }
	                              
	    return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(mirrorEnds("abXYZba"));
		System.out.println(mirrorEnds2("abXYZba"));
	}

}
