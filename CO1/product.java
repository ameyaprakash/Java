class product
{
	String pcode;
  	String pname;
  	int prize;

	public product(String pcode_get, String pname_get, int prize_get)
	{
   		pcode=pcode_get;
  		pname= pname_get;
  		prize=prize_get;
	}
	public int get_prize()
	{
		return prize;
	}
	public static void main(String[] args)
	{
		product obj1 = new product("p100","Soap",20);
       		product obj2 = new product("p101","Biscut",25);
       		product obj3 = new product("p105","Shampoo",75);

       		if(obj1.prize<=obj3.prize && obj1.prize<=obj2.prize)
     			System.out.println("Lowest product is: "+obj1.pname);
		if(obj2.prize<=obj1.prize && obj2.prize<=obj3.prize)
     			System.out.println("Lowest product is: "+obj2.pname);
       		if(obj3.prize<=obj1.prize && obj3.prize<=obj2.prize)
     			System.out.println("Lowest product is: "+obj3.pname);
 	}
}
