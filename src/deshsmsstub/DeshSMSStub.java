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
public class DeshSMSStub {

	private static final String SERVER = "121.241.242.114";
	private static final int PORT = 8080;
	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	
	/**
	 * @param args the command line arguments
	 */
	//server, port, username, password, message, dlr, type, destination, source
	public static void main(String[] args) {
		Sender sender = new Sender();
		sender.setUsername("tester909");
		sender.setPassword("test11");
		sender.setMessage("test for unicode");
		sender.setType("0");
		sender.setDlr("1");
		sender.setDestination("01515634889");
		sender.setSource("Update");
		sender.setServer(SERVER);
		sender.setPort(PORT);
		
		System.out.println(sender.toString());
		
		DeshSMSService service = new DeshSMSService();
		String response = service.submitMessage(sender);
		System.out.println("Response: " + response);
	}
	
}
