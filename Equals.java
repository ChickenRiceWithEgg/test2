package chapter7;
//section2:用equals()和equalsIgnoreCase()方法对字符串进行比较，比较两个字符串内容是否相等
public class Equals {
	
	public static void main(String args[]){
		String s1 = new String ("abc");
		String s2 = new String ("ABC");
		String s3 = new String ("abc");
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equalsIgnoreCase(s2);
		boolean b3 = s1.equals(s3);
		System.out.println(s1+"equals"+s2+":"+b1);
		System.out.println(s1+"equalsIgnoreCase"+s2+":"+b2);  //忽略大小写，比较两个字符串是否相等
		System.out.println(s1+"equals"+s3+":"+b3);
	}
}
