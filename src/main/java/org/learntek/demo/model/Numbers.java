/**
 * 
 */
package org.learntek.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author HP
 *
 */
public class Numbers {
	
	@JsonProperty("No1") // if the request field name and request model class variable names are different
	private int no1;
	
	@JsonProperty("No2")
	private int no2;
	
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
}