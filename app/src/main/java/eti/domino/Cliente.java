package eti.domino;

/**
 * Created by Byron on 16/5/2017.
 */

import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.logging.*;
public class Cliente {
    public static void main(String[] args) {
        ArrayList<Thread> clients = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            clients.add(new Persona(i));
        }
        for (Thread thread : clients) {
            thread.start();
        }
    }
}
