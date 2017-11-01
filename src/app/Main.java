package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    private static ServerSocket ss;
    private static Socket s;
    private static BufferedReader br;
    private static InputStreamReader isr;
    private static String message = "";

    public static void main(String[] args) {

        try {
            while(true) {

                ss = new ServerSocket(5000);
                s = ss.accept();

                isr = new InputStreamReader(s.getInputStream());
                br = new BufferedReader(isr);
                message = br.readLine();

                System.out.println(message);
                isr.close();
                br.close();
                ss.close();
                s.close();
            }
        }
        catch(Exception ex){

        }
    }
}
