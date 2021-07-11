package tutorial.example.day19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		//HttpClient
		//HttpRequest
		//HttpResponse

		HttpClient httpClient = HttpClient.newBuilder()
				.version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(5))
				.build();

		String requestBody = new StringBuilder()
				.append("{")
				.append("\"cvalue\":\"9c3bbce6191dbc2c73e85f34b27bf729\",")
				.append("\"ctype\":\"Username\"")
				.append("\"password\":\"sesfwefewfs\"")
				.append("\"captchaProvider\":\"PROVIDER_ARKOSE_LABS\"")
				.append("\"captchaId\":\"\"")
				.append("\"captchaToken\":\"52460eb19f5521722.6967645401|r=us-east-1|metabgclr=transparent|guitextcolor=%23474747|maintxtclr=%23b8b8b8|metaiconclr=transparent|meta=6|lang=en|pk=476068BF-9607-4799-B53D-966BE98E2B81|at=40|sup=1|rid=79|ag=101|cdn_url=https%3A%2F%2Froblox-api.arkoselabs.com%2Fcdn%2Ffc|lurl=https%3A%2F%2Faudio-us-east-1.arkoselabs.com|surl=https%3A%2F%2Froblox-api.arkoselabs.com\"")
				.append("}").toString();

		HttpRequest request = HttpRequest.newBuilder()
				.POST(HttpRequest.BodyPublishers.ofString(requestBody))
				.uri(URI.create("https://auth.roblox.com/v2/login"))
				.header("Content-Type", "application/json")
				.build();

		HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println("response code->" + response.statusCode());

		System.out.println("response body->" + response.body());

	}
}
