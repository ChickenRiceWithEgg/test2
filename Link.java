package chapter7;

public class Link {
	//section1：可以使用+号将字符串和字符串或者字符串和其他数据类型进行连接
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int booktime = 4;
		float practice = 2.5f;
		//System.out.println("I like
		//	 java");     这样是错的
		System.out.println("I like"
				+" java");   //这样是对的
		System.out.println("我每天花费"+booktime+"小时看书；"+practice+"小时上机练习，一共花费"+booktime+practice+"小时学习。");
		System.out.println("我每天花费"+booktime+"小时看书；"+practice+"小时上机练习，一共花费"+(booktime+practice)+"小时学习。");
	}

}

