package server;

import com.sun.net.httpserver.HttpServer;
import handler.httpHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

public class Server {
    final int port = 8001;
    final String hostName = "localhost";
    private final httpHandler httphandler = new httpHandler();
    public void start() throws IOException {

        HttpServer server = HttpServer.create( new InetSocketAddress(hostName, port), 0);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        server.createContext("/",  httphandler);
        server.setExecutor(threadPoolExecutor);
        server.start();
        Logger logger = Logger.getLogger(Server.class.getName());
        logger.info(" framework.Server started on port: " + port);
    }
}
