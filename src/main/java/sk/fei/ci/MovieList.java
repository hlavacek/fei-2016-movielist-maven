package sk.fei.ci;

import static spark.Spark.*;

public class MovieList {

	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello World<br/>Save private ryan");
	}
}
