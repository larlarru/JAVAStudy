package teststudy.testpackages;

public class Test_arr {

	public static void main(String[] args) {
		
		String[] arr = {"메뉴1이고 갯수는 1개",
						"메뉴2이고 갯수는 2개",
						"메뉴3이고 갯수는 3개",
						"메뉴4이고 갯수는 4개",
						"메뉴5이고 갯수는 5개"};
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
		
		String[] arr1 = new String[10];
		
		
		arr1[0] = arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4];
		
		System.out.println(arr[0]);
		
	}

}
