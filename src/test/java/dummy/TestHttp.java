package dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class TestHttp {

	@Test
	public void testMethodForHTTP() {
		int i;
		// TODO Auto-generated method stub
try{
	for(i=0;i<=10;i++)
	{
	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet("http://www.apache.org/");

	// add request header
	//request.addHeader("User-Agent", USER_AGENT);
	HttpResponse response = client.execute(request);
	System.out.println("REesponse ");
	System.out.println("Response Code : "
	                + response.getStatusLine().getStatusCode());

	BufferedReader rd = new BufferedReader(
		new InputStreamReader(response.getEntity().getContent()));

	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = rd.readLine()) != null) {
		//System.out.println("REesponse ");
		//System.out.println(line);
	}
	}
}
catch(Exception e)
{
	System.out.println("Exception");
}

	}

}
