/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohammad
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int J = in.nextInt();
        System.out.println(((J - 1) * (J - 2) * (J - 3)) / 6);
    }
}
