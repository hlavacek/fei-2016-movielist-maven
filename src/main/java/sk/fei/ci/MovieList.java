package sk.fei.ci;

import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovieList {

	private static final Logger LOG = LoggerFactory.getLogger(MovieList.class);

	public static void main(String[] args) {
		port(getHerokuAssignedPort());
		get("/hello", (req, res) -> "Hello World<br/>Save private ryan");
		get("/", (req, res) -> "Index");

		LOG.info("App started");
	}

	static int getHerokuAssignedPort() {
		ProcessBuilder processBuilder = new ProcessBuilder();
		if (processBuilder.environment().get("PORT") != null) {
			return Integer.parseInt(processBuilder.environment().get("PORT"));
		}
		return 4567; 
	}

}
