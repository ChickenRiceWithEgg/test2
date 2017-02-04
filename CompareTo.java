package chapter7;
//section3：用CompareTo方法按字典顺序比较两个字符串，返回值为正数，负数或者零
public class CompareTo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("a");
		String s2 = new String("b");
		String s3 = new String("c");
		System.out.println(s1+" compareTo "+s2+":"+s1.compareTo(s2));
		System.out.println(s1+" compareTo "+s3+":"+s1.compareTo(s3));
		System.out.println(s3+" compareTo "+s2+":"+s3.compareTo(s2));
	}

}
