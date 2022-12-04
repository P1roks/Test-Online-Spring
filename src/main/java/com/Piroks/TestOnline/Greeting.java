package com.Piroks.TestOnline;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonView;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Configurable
public class Greeting{

//	private final long id;
	@Autowired
	private String counter;

//	private GreetMsg msg;
//	private class GreetMsg{
//		public static String first = "Hello";
//		private String second;
//
//		public GreetMsg(String msg){
//			this.second = msg;
//		}
//
//		@Override
//		public String toString() {
//			return String.format("%s %s",this.first,this.second);
//		}
//	}

	public Greeting(){
		super();
	}

//	public long getId() { return id; }
//	public GreetMsg getMessage() { return this.msg; }
	public String getCounter() {return this.counter;}

	@Override
	public String toString() {
		return String.format("counter: %s",this.counter);
	}
}
