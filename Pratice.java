package gitLab;

public class Pratice {
	/* Method that checks if a given string contains the string "not" and adds it on if it does not*/
	public String notString(String str) {
		  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
}
