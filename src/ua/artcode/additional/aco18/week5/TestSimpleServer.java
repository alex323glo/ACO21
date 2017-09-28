package ua.artcode.additional.aco18.week5;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class TestSimpleServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);  // create server on port 8000

        // possible variant:
//        server.createContext("/test", new HttpHandler() {
//            @Override
//            public void handle(HttpExchange httpExchange) throws IOException {
//                System.out.println(httpExchange.getProtocol());
//                System.out.println(httpExchange);
//
//                System.out.println("server accepted a message");
//            }
//        });

        // variant with lambda:
        server.createContext("/test", httpExchange -> {     // create context with "/test" request message
            String requestURI = httpExchange.getRequestURI().toString();
            System.out.println("Request URI is \"" + requestURI + "\"");
            System.out.println("HTTP method is \"" + httpExchange.getRequestMethod() + "\"");

            String[] params = requestURI.split("\\?")[1].split("&");    // get right from "?" part
            String name = params[0].split("=")[1];      // get right part from first of splited by "=" parts

            try (OutputStream outputStream = httpExchange.getResponseBody()) {
                String response = "Hello from server, " + name + "!";
                httpExchange.sendResponseHeaders(200, response.length());   // set response header (i and length)

                outputStream.write(response.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        });

        server.createContext("/post-info", httpExchange -> {

            if (httpExchange.getRequestMethod().equals("POST")) {
                Scanner sc = new Scanner(httpExchange.getRequestBody());
                StringBuilder stringBuilder = new StringBuilder("");
                while (sc.hasNext()) {
                    stringBuilder.append(sc.nextLine()).append("\n");
                }
                System.out.println(stringBuilder.toString());

                try (OutputStream outputStream = httpExchange.getResponseBody()) {
                    String response = "Hi. Your message was received!";
                    httpExchange.sendResponseHeaders(200, response.length());   // set response header
                    outputStream.write(response.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }
            }
        });

        server.setExecutor(null);   // creates a default executor
        server.start();     // run server...
        System.out.println("Server started");
    }

}
