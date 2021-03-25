package com.myblue.MyBlue;

import static spark.Spark.get;
 
import spark.Request;
import spark.Response;
import spark.Route;

public class Main {
	public static void main(String[] args) {

		get(new Route("/test") {
			@Override
			public Object handle(Request request, Response response) {
				return  "MyBlue backend is working!";
			}
		});
	}
}
