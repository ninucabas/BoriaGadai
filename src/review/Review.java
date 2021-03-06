package review;

import java.text.SimpleDateFormat;
import java.util.Date;

import authorization.User;

public class Review {
	
	private User user;
	private String gameName, text, date;
	private int stars;
		
	public Review(User user, String gameName, String text, int stars, Date date){
		this.user = user;
		this.gameName = gameName;
		this.text = text;
		this.stars = stars;
		this.date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	}
	
	public String getDate(){
		return date;
	}
	
	public String getUserFullName(){
		return user.getName() + " " + user.getSurname();
	}
	
	public int getUserID(){
		return user.getId();
	}
	
	public String getGameName(){
		return gameName;
	}
	
	public String getText(){
		return text;
	}
	
	public int getStars(){
		return stars;
	}
}
