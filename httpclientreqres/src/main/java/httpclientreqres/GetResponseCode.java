package httpclientreqres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GetResponseCode {
	
	WebDriver driver;
	public void ResponseCheck(String url) throws ClientProtocolException, IOException {
	
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet("http://www.vogella.com");
		HttpResponse response = (HttpResponse) client.execute(request);

		// Get the response
		BufferedReader rd = new BufferedReader
		    (new InputStreamReader(
		    ((org.apache.http.HttpResponse) response).getEntity().getContent()));

//		String line = "";
//		while ((line = rd.readLine()) != null) {
//		    textView.append(line);
//		}
		
	}	
 
}
