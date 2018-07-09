/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deshsmsstub;

/**
 *
 * @author cyclingbd007
 */
public enum DLRType {
	REQUIRED(0), NOT_REQUIRED(1);
	
	private int code;
	
	private DLRType(int code){
		this.code = code;
	}
	
	public int getCode(){
		return code;
	}
}
