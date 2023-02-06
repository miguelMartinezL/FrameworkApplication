package handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class httpHandler implements HttpHandler {
    public void handle(HttpExchange httpExchange) throws IOException
    {
        switch(httpExchange.getRequestMethod().toUpperCase()){
            case "GET":
                try{

                } catch (Exception e){
                    
                }
            case "POST":
                try{

                } catch (Exception e){

                }
        }
    }
}
