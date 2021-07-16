abstract class phone
{
	abstract void brand();
}

class oppo extends phone
{
	void brand()
	{
		System.out.println("Model name is Oppo F3");
	}
}

class AbstractClass
{
	public static void main(String args[])
	{
		oppo obj = new oppo();
		obj.brand();
		// or
		phone  Pobj = obj;
		Pobj.brand();
		//or 
		phone phoneObj = new oppo();
		phoneObj.brand();
	}
}