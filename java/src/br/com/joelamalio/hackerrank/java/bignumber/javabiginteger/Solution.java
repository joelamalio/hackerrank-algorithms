package br.com.joelamalio.hackerrank.java.bignumber.javabiginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
    }
}
