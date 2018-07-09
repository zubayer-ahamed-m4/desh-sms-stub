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
public class Sender {

	/**
	 * Username of the SMPP Account
	 */
	String username;
	
	/**
	 * Password of the SMPP Account
	 */
	String password;
	
	/**
	 * The message to send 
	 * Can be used for 'long' message, that is, 
	 * messages longer than 160 characters for plain text,
	 * 140 for flash and 280 for unicode
	 */
	String message;
	
	/**
	 * Type indicate the type of message
	 * 0 : Plain Text (GSM 3.38 Character encoding)
	 * 1 : Flash Message (GSM 3.38 Character encoding)
	 * 2 : Unicode
	 * 3 : Reserved
	 * 4 : Wap Push
	 * 5 : Plain Text (ISO-8859-1 Character encoding)
	 * 6 : Unicode Flash
	 * 7 : Flash Message (ISO-8859-1 Character encoding)
	 */
	String type;
	
	/**
	 * Indicates whether the client wants delivery report for this message
	 * 0 : No delivery report required
	 * 1 : Delivery report required
	 */
	String dlr;
	
	/**
	 * Mobile number to which to send message to (may or may not include a '+' sign)
	 * Multiple mobile numbers can be separated by commas (note the comma (',') should be URL encoded)
	 */
	String destination;
	
	/**
	 * The source address that should appear in the message
	 * Max length of 18 if only numeric
	 * Max length of 11 if Alpha numeric
	 * If you wish plus('+') should be prefixed to the sender address when the message is displayed on the cell phone
	 * please prefix the plus sign to your sender address while submitting the message
	 * Note:  the plus sign should be URL encoded
	 * Additional restrictions on this field may be enforced b the SMSC
	 */
	String source;
	String server;
	/**
	 * 
	 */
	int port;

	public Sender() {
	}

	public Sender(String username, String password, String message, String type, String dlr, String destination, String source, String server, int port) {
		this.username = username;
		this.password = password;
		this.message = message;
		this.type = type;
		this.dlr = dlr;
		this.destination = destination;
		this.source = source;
		this.server = server;
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDlr() {
		return dlr;
	}

	public void setDlr(String dlr) {
		this.dlr = dlr;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Sender{" + "username=" + username + ", password=" + password + ", message=" + message + ", type=" + type + ", dlr=" + dlr + ", destination=" + destination + ", source=" + source + ", server=" + server + ", port=" + port + '}';
	}
}
