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
public enum MessageType {
	PLAIN_TEXT(0), MEANS_FLASH(1), MEANS_UNICODE(2), MEANS_UNICODE_FLUSH(6);

	private int code;

	private MessageType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
