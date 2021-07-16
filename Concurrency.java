class Table
{
	synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
			try
			{
				Thread.sleep(600);
			}
			catch(InterruptedException e)
			{}
		}
	}
}

class TableClass extends Thread
{
	Table t;
	TableClass(Table t)
	{
		this.t=t; // this.t is outside one i.e., Table t
	}
	public void run()
	{
		t.printTable(15);
	}	
}
class TableClass2 extends Thread
{
	Table t;
	TableClass2(Table t)
	{
		this.t=t; // this.t is outside one i.e., Table t
	}
	public void run()
	{
		t.printTable(13);
	}	
}

class Concurrency
{
	public static void main(String args[])
	{
		Table tObj = new Table();
		TableClass ta = new TableClass(tObj);
		TableClass2 ta2 = new TableClass2(tObj);
		ta.start();
		ta2.start();
		
	}
}