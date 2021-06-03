package com.Match.demo.match;

//import java.time.LocalDateTime;

//import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Match {
	@Id 
	@GeneratedValue
	private Long id ;
	//@DateTimeFormat(pattern = "MM/dd/yyyy")	
	private String date;
	private String lieu;
	private Type type;
	private Categirie categirie; 
	
	
	
	public Categirie getCategirie() {
		return categirie;
	}


	public void setCategirie(Categirie categirie) {
		this.categirie = categirie;
	}


	public Match() {
		super();
	}


	public Match(String date, String lieu, Type type, Categirie categirie) {
		super();
		//this.id = id;
		this.date = date;
		this.lieu = lieu;
		this.type = type;
		this.categirie = categirie ;
		
	}
	

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	public enum Type {
		amical ,
		Ligue ,
		Coupe 
	}
	
	public enum Categirie {
		U6 ,
		U8,
		U10 ,
		U12 
	}
	
	
}
