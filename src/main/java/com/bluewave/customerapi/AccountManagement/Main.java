package com.bluewave.customerapi.AccountManagement;

import static spark.Spark.get;
 
import spark.Request;
import spark.Response;
import spark.Route;

public class Main {
	public static void main(String[] args) {
		//		get(new Route("/Accounts/:id") {

		get(new Route("/accounts/1001") {
			@Override
			public Object handle(Request request, Response response) {
				return  "Account: number=1001, name=John Doe, email=johndoe@gmail.com";
			}
		});
		
		
		get(new Route("/accounts/1002") {
			@Override
			public Object handle(Request request, Response response) {
				return  "Account: number=1002, name=Jane Smith, email=janesmith@gmail.com";
			}
		});
	}
}
