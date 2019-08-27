import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class RequisicaoHTTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			RequisicaoHTTP.call_me();
			
		}
		catch (Exception e){
			e.printStackTrace();
			
		}

	}
	
	
	public static void call_me()  throws Exception{

		String url1 = "https://viacep.com.br/ws/70075900/json";
		URL obj = new URL(url1);
		
		HttpURLConnection  con = (HttpURLConnection) obj.openConnection();
		con.setRequestProperty("User-Agent", "Mozila/5.0");
		int responsecode = con.getResponseCode();
		System.out.println("\nsending 'GET' requesto to URL:"  + url1);
		System.out.println("Response Cod:"  + responsecode);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		String inputline;
		
		StringBuffer response = new StringBuffer();
		while((inputline = in.readLine()) !=null) {
			
			response.append(inputline);
		}
		in.close();
		System.out.println(response.toString());
		
		
	}
	
	
	

}


