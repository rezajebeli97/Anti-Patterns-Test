package java_demo;

import java.io.FileNotFoundException;

public class ASTExample {
	public static String name = "nothing";

	public static void main(String[] args) throws FileNotFoundException, NoSuchFieldException, Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(name);
			Helper helper = new Helper();
			System.out.println(helper.helper());
			throw new FileNotFoundException();
		} catch (NullPointerException e) {
			if (e.getCause() != null) {
				e.printStackTrace();
				System.out.println(e.getCause());
				throw new Exception (e.getCause());
			}
				
		} catch (FileNotFoundException e) {
			System.out.println("Something wrong.");
			e.printStackTrace();
			throw new Exception();
		} catch (Exception e) {
			throw new Exception("Blah: " + e.getMessage());
		}
		finally {
			throw new Exception();
		}
	}
}
