package core_java;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int n3 = Integer.parseInt(args[2]);
			if (n1 >= 0 && n2 >= 0 && n3 >= 0) {
				int f = ((n1 / 10) + 1) * 10;
				int s = ((n2 / 10) + 1) * 10;
				int t = ((n3 / 10) + 1) * 10;
				System.out.println(f + s + t);
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
