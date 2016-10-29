package sk.fei.ci;

import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovieList {
	
	private static final Logger LOG = LoggerFactory.getLogger(MovieList.class);

	public static void main(String[] args) {
		if (args.length > 0) {
			int port = Integer.parseInt(args[0]);
			LOG.info("Running application on port {}.", port);
			port(Integer.parseInt(args[0]));
		}
		get("/hello", (req, res) -> "Hello World<br/>Save private ryan");
		get("/", (req, res) -> "Index");
		
		LOG.info("App started");
	}
}
