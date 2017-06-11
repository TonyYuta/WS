package core;


import java.io.IOException;
import okhttp3.*;

public class Get {
	
	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("http://localhost:8888/api/ip").get().build();
		ResponseBody response = client.newCall(request).execute().body();	
		System.out.println(response.string());
	}
}
