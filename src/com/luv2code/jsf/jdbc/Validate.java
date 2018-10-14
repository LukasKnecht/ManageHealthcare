package com.luv2code.jsf.jdbc;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;

@ManagedBean
@SessionScoped
public class Validate {
	
	String Stringregex = "^[a-zA-Z]+$";
	String Emailregex  = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
	String Numberregex = "^[0-9]*$";
	String Dateregex = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
	String Timeregex = "^((?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$)";


public Boolean ValidateString(String text) {  //makes sure every character is not a number e.g. Firstname 
	
	if(text.matches(Stringregex)) {
		
		return true; 
	}
	
	return false;
}

public Boolean ValidateEmail(String Email) { //validates that any email is in correct format 
	
	if(Email.matches(Emailregex)) {
		
		return true; 
	}
	
	return false;
}


public Boolean ValidateNumber(String Number) { //makes sure every character is a number e.g. patientid 
	
	if(Number.matches(Numberregex)) {
		
		return true; 
	}
	
	return false;
}


public Boolean ValidateDate(String Date) { //validates input is in correct date format 
	
	if(Date.matches(Dateregex)) {
		
		return true; 
	}
	
	return false;
}



public Boolean ValidateTime(String Time) { //validates input is in correct time format 
	
	if(Time.matches(Timeregex)) {
		
		return true; 
	}
	
	return false;
}











}




