/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deshsmsstub;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyclingbd007
 */
public class DeshSMSService implements DeshSMSInterface {

	@Override
	public String submitMessage(Sender sender) {
		String dataFromUrl = "";
		String dataBuffer = "";

		try {
			URL sendUrl = new URL("http://" + sender.getServer() + ":" + sender.getPort() + "/sendsms");

			HttpURLConnection httpConnection = (HttpURLConnection) sendUrl.openConnection();
			httpConnection.setRequestMethod("POST");
			httpConnection.setDoInput(true);
			httpConnection.setUseCaches(false);

			DataOutputStream dataStreamToServer = new DataOutputStream(httpConnection.getOutputStream());
			String byteString = "username=" + URLEncoder.encode(sender.getUsername(), "UTF-8")
					+ "&password=" + URLEncoder.encode(sender.getPassword(), "UTF-8")
					+ "&type=" + URLEncoder.encode(sender.getType(), "UTF-8")
					+ "&dlr=" + URLEncoder.encode(sender.getDlr(), "UTF-8")
					+ "&destination=" + URLEncoder.encode(sender.getDestination(), "UTF-8")
					+ "&source=" + URLEncoder.encode(sender.getSource(), "UTF-8")
					+ "&message=" + URLEncoder.encode(sender.getMessage(), "UTF-8");
			dataStreamToServer.writeBytes(byteString);
			dataStreamToServer.flush();
			dataStreamToServer.close();

			BufferedReader dataStreamFromUrl = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));

			while ((dataBuffer = dataStreamFromUrl.readLine()) != null) {
				dataFromUrl += dataBuffer;
			}

			dataStreamFromUrl.close();

		} catch (MalformedURLException ex) {
			Logger.getLogger(DeshSMSService.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(DeshSMSService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return dataFromUrl;
	}

	@Override
	public StringBuffer convertToUnicode(String regText) {
		char[] chars = regText.toCharArray();
		StringBuffer hexString = new StringBuffer();
		for (char c : chars) {
			String iniHexString = Integer.toHexString((int) c);
			if (iniHexString.length() == 1) {
				iniHexString = "000" + iniHexString;
			} else if (iniHexString.length() == 2) {
				iniHexString = "00" + iniHexString;
			} else if (iniHexString.length() == 3) {
				iniHexString = "0" + iniHexString;
			}

			hexString.append(iniHexString);
		}

		System.out.println(hexString);
		return hexString;
	}

}
