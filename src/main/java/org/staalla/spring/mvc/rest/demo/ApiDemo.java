package org.staalla.spring.mvc.rest.demo;



public class ApiDemo {

	public static void main(String[] args) {

		// Build deploy the war (mvn clean package) in jboss/tomcat
		//CURL cmd to test the api, replace the localhost:8380 according to the server port where the api is deployed

		System.out.println("Try the API using CURL");
		System.out.println("curl -X GET -H \"Cache-Control: no-cache\" \"http://localhost:8380/rest/api/message\" ");
	}
}
