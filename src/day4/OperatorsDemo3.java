package day4;

public class OperatorsDemo3 {

	public static void main(String[] args) {
		// Increment / Decrement Operator
		// ++ --
		// Increment: post (a++ a-- ) pre (++a --a)
		// Decrement: post (a++ a-- ) pre (++a --a)
		
		int a = 5;
		System.out.println(a);
		a++;    // a = a+1
		System.out.println(a);
		
		System.out.println("-------------------");
		
		int i = 4;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println("---------------------");
		int b = 2;
		int y = 5 - ++b;
		System.out.println( b= b+1);
		System.out.println( y= 5-y);
		
		System.out.println("---------------------");
		
		int ran = 1;
		int man = ran++;
		System.out.println(ran);
		System.out.println(man);
		
		System.out.println("---------------------");
		
		int e = 1;
		int d = e++ + e++;
		System.out.println(e);
		System.out.println(d);
				
		System.out.println("---------------------");
		
		int p = 1;
		int q = ++p + ++p;
		System.out.println(p);
		System.out.println(q);
		
		System.out.println("---------------------");
		
		int ra = 1;
		int ma = ++ra + ra++;
		System.out.println(ra);                                
		System.out.println(ma);

		
		System.out.println("---------------------");
		
		int me = 1;
		int u = ++me + me++ + ++me;
		System.out.println(me);
		System.out.println(u);

		int pun = 1;
		int bun = ++a;
		System.out.println(pun);
		System.out.println(bun);
		
		System.out.println("---------------------");
		
		int aa = 5;
		int bb = aa++;
		System.out.println(aa);
		System.out.println(bb);
		
System.out.println("---------------------");
		
		int j = 5;
		j = j++ + ++j + j + 1;
		System.out.println(j);
		

		
		

	}

}
