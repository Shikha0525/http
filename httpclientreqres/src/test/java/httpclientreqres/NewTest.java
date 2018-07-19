package httpclientreqres;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
  
  WebDriver driver;
  String baseurl;
  
  @Test
  public void test01ListUsers() throws ClientProtocolException, IOException {
	  
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users?page=2");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("List Users Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void test02SingleUser()  throws ClientProtocolException, IOException {
	  
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users/2");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Single Users Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void test03SingleUserNotFound()  throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users/23");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Single Users Not Found Response Code: "+actual);
	  int expected=404;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test04ListResource() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/unknown");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("List Resource Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test05SingleResource() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/unknown/2");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Single Resource Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test06SingleResourceNotFound() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/unknown/23");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Single Resource Not Found Response Code: "+actual);
	  int expected=404;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test07Create() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Create Response Code: "+actual);
	  int expected=201;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test08Update() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users/2");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Update Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test09Patch()throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users/2");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Patch Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test10Delete() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users/2");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Delete Response Code: "+actual);
	  int expected=204;
	  Assert.assertEquals(expected, actual);
	  
	  
  }
  
  @Test
  public void test11RegisterSuccessful() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/register");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Register Successful Response Code: "+actual);
	  int expected=204;
	  Assert.assertEquals(expected, actual);
	  
  }
 
  @Test
  public void test12RegisterUnsuccessful() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/register");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Register Successful Response Code: "+actual);
	  int expected=400;
	  Assert.assertEquals(expected, actual);
	  
  }

  @Test
  public void test13LoginSuccessful() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/login");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Login Successful Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test14LoginUnSuccessful() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/login");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Login UnSuccessful Response Code: "+actual);
	  int expected=400;
	  Assert.assertEquals(expected, actual);
	  
  }
  
  @Test
  public void test15DelayedResponse() throws ClientProtocolException, IOException {
	  HttpClient client = new DefaultHttpClient();
	  HttpGet request = new HttpGet("https://reqres.in/api/users?delay=3");
	  HttpResponse response = (HttpResponse) client.execute(request);
	  int actual = response.getStatusLine().getStatusCode();
	  System.out.println("Delayed Response Code: "+actual);
	  int expected=200;
	  Assert.assertEquals(expected, actual);
	  
  }
  
}


