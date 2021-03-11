package java_demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	public static String name = "nothing";

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			System.out.println(name);
			try {
				throw new FileNotFoundException("try in try");
			} catch (Exception e) {
				// TODO: handle exception
			}
			finally {
				throw new FileNotFoundException("finally in try");
			}
			
		} catch (NullPointerException e) {
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something wrong.");
		} finally{
			try {
				throw new FileNotFoundException("try in finally");
			} catch (Exception e2) {
				// TODO: handle exception
			}
			finally {
				throw new FileNotFoundException("finally in finally");
			}
		}
	}
}
