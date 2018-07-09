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
public interface DeshSMSInterface {
	
	/**
	 * Submit Message
	 * @param sender
	 * @return {@link String}
	 */
	public String submitMessage(Sender sender);
	
	/**
	 * Converts the unicode to hex value
	 * @param regText
	 * @return {@link StringBuffer}
	 */
	public StringBuffer convertToUnicode(String regText);
}
