package chapter7;

public class CommonMethod {
//section4:介绍String类的常见方法
	public static void main(String[] args) {
//length()方法
		String name = new String("一颗椰子树");
		String address = new String("一座孤岛上");
		String message = "在"+address+"有"+name;
		System.out.println("方法1：length()方法");
		System.out.println("\t字符串:"+name+"\t\t的长度为"+name.length());
		System.out.println("\t字符串:"+address+"\t\t的长度为"+address.length());
		System.out.println("\t字符串:"+message+"\t\t的长度为"+message.length());
		System.out.println("\n");
		
//indexOf("a")方法和lastIndexOf("a")方法
			//indexOf()方法返回所搜索的字符或者字符串首次出现的位置，str.indexOf("a")
			//lastIndexOf()方法返回所搜索的字符和字符串最后一次出现的位置，str.lastIndexOf("a")
		String str = "We are student   ";
		int index1 = str.indexOf("a");
		int index2 = "We are student".indexOf("a");//这样也可以
		int index3 = str.lastIndexOf("e");
		System.out.println("方法2：indexOf()和lastIndexOf()方法");
		System.out.println("\ta在"+str+"中的位置是"+index1);
		System.out.println("\ta在"+str+"中的位置是"+index2);
			//这里输出index为3，因为“W”、“e”、“ ”、“a”，“a”应该是在第四位，但是
			//String对象在计算机中是用数组表示的，字符串的下标是从0至length()-1
			//所以这里的“a”的index是3
		System.out.println("\te在"+str+"中最后一次出现的位置是"+index3);
			//使用lastIndexOf("e")不是为了从后往前找第几个是e，而是e最后一次出现的位置
			//如果 lastIndexOf()方法中的参数是空字符串""，则返回的结果与调用该字符串length()方法的返回结果相同。
		System.out.println("\n");
		
//charAt(int index)方法
		//获取字符串指定索引位置的字符
		char Achar = str.charAt(index1);
		System.out.println("方法3：charAt()方法");
		System.out.println("\t字符串str中索引位置是index的字符是："+Achar);
		System.out.println("\n");
		
//trim()方法
		//返回一个新字符串，这个新字符串在原有字符串基础上去掉了前导空白和尾部空白，包括空格和制表符tab
		String newStr1 = str.trim();
		System.out.println("方法4：trim()方法");
		System.out.println("\t字符串str的长度是："+str.length());
		System.out.println("\t去掉左右空格后的长度是："+newStr1.length());
		System.out.println("\t新字符串是："+str);
		System.out.println("\n");
		
//substring(int beginIndex)和substring(int beginIndex,endIndex)方法
		//substring(int beginIndex)方法是返回从指定的索引位置开始截取，直到该字符串的结尾这一部分的字符串
		//substring(int beginIndex,endIndex)方法是返回从beginIndex索引位置到endIndex索引位置之间的字符串,不包括engIndex位置上的字符
		String newStr2 = str.substring(3);
		String newStr3 = str.substring(3, 10);
		System.out.println("方法5：substring()方法");
		System.out.println("\t原字符串为："+str);
		System.out.println("\t新字符串1为："+newStr2);
		System.out.println("\t新字符串2为："+newStr3);
		System.out.println("\n");
		
//split(String sign)方法和split(String sign,int limit)方法
		//split(String sign)方法是按照指定的方式对原字符串进行分割，并将分割后的结果存放在字符串数组中
		//split(String sign,int limit)方法则在split(String sign)方法的基础上限定了分割的次数
		String split = new String("abc,def,ghi,jkl");
		String[] newSplit1 = split.split(",");
		String[] newSplit2 = split.split(",",2);
		System.out.println("方法6：split()方法");
		System.out.println("\t原字符串是："+split);
		
		System.out.println("\t以\",\"分割后的数组内容是：");
		for(int i = 0; i<newSplit1.length; i++ ){
			System.out.print("\t");
			System.out.print("  "+newSplit1[i]);
		}
		System.out.println("\n\t限定分割次数为2的数组内容是：");
		for(int i = 0; i<newSplit2.length; i++ ){
			System.out.print("\t");
			System.out.print("  "+newSplit2[i]);
		}
		System.out.println("\n");
		
//replease(char oldChar，char newChar)方法
		//replease方法可将指定的字符或者字符串替换成新的字符或者字符串
		//若字符串oldchar没有出现在原字符串中，则直接返回原字符串
		String replease = str.replace("e","E");
		System.out.println("\n方法7：replease()方法");
		System.out.println("\t"+replease);
		String replease2 = str.replace("student","STUDENT");
		System.out.println("\t"+replease2);
		System.out.println("\n");
		
//toUpperCase()方法和toLowerCase()方法
		//这两种方法是将字符串内所有字符改为大写字母或小写字母，数字与非字符不受影响
		String Mix = new String("Hello Java");
		String Upper = new String("HELLO JAVA");
		String new1 = Mix.toUpperCase();
		String new2 = Upper.toLowerCase();
		System.out.println("方法8：toUpperCase()方法和toLowerCase()方法");
		System.out.println("\t原字符串Mix:"+Mix);
		System.out.println("\t原字符串UPPER:"+Upper);
		System.out.println("\t分别变换成大小写后:");
		System.out.println("\tMix.toUpperCase():"+new1);
		System.out.println("\tUpper.toLowerCase():"+new2);
		System.out.println("\tnew1 equals new2:"+new1.equals(new2));
		String upperMix = Mix.toUpperCase();
		String upperUpper = Upper.toUpperCase();
		System.out.println("\t忽略大小写后，Mix equals Upper:"+upperMix.equals(upperUpper));
		System.out.println("\n");
		
//startsWith(String prefix)方法和endsWIth(String suffix)方法
		//startsWith(String prefix)方法用于判断字符串是否以指定内容开始
		//endsWith(String suffix)方法用于判断字符串是否以指定内容结束      这两种方法的返回值都是boolean类型
		String num1 = new String("1234567");
		String num2 = new String("7654321");
		boolean b1 = num1.startsWith("12");
		boolean b2 = num1.endsWith("66");
		boolean b3 = num2.startsWith("77");
		boolean b4 = num2.endsWith("21");
		System.out.println("方法9:startsWith()方法和endsWith()方法");
		System.out.println("\tnum1是以'12'开始的吗"+b1);
		System.out.println("\tnum1是以'66'结束的吗"+b2);
		System.out.println("\tnum2是以'77'开始的吗"+b3);
		System.out.println("\tnum2是以'21'结束的吗"+b4);
	}
		
}
