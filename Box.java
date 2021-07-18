class BoxCreation
{
	double width = 5;
	double depth = 6;
	double height;
	double vol;	
	void volume()
	{
		vol = width+depth+height;
	}

}
class Box
{
	public static void main(String args[])
	{
		BoxCreation BC = new BoxCreation();
		BC.volume();
		System.out.println("Volume : "+BC.vol);
	}
}