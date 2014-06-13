package rfx.server.http.processor;

import static io.netty.handler.codec.http.HttpHeaders.Names.REFERER;
import static io.netty.handler.codec.http.HttpHeaders.Names.USER_AGENT;
import io.netty.handler.codec.http.HttpHeaders;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import rfx.server.http.HttpProcessor;
import rfx.server.http.HttpProcessorMapper;
import rfx.server.util.StringPool;

@HttpProcessorMapper(uriPath = "/server-info", templatePath = "server-info.mustache", contentType = StringPool.MIME_TYPE_UTF8_HTML)
public class ServerInfoHttpProcessor extends HttpProcessor {

	@Override
	protected String handler() {
		HttpHeaders headers = request.headers();
		String referer = headers.get(REFERER);
		String userAgent = headers.get(USER_AGENT);
		System.out.println("referer: "+referer);
		System.out.println("userAgent: "+userAgent);
		System.out.println("filter: "+param("filter"));
		
		return render(new ServerInfoModel());
	}

	static class ServerInfoModel {
		String time;
		List<String> infos = new ArrayList<>();

		public ServerInfoModel() {
			time = new Date().toString();
			Properties props = System.getProperties();
			Enumeration e = props.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				if (key.startsWith("java.vm")) {
					String s = (key + " : " + props.getProperty(key));
					infos.add(s);
				}
			}
		}
	}

}
