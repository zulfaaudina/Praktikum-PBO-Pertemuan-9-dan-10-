package Shape;

public class Square {
	int sisi;
	
	public Square(int s)
	{
		sisi = s;
	}
	public int getSisi()
	{
		return sisi;
	}
	public void setSisi(int sisi)
	{
		this.sisi = sisi;
	}
	
	public int Area()
	{
		int a = 0;
		a = getSisi()*getSisi();
		return a;
	}
	
	public String toString()
	{
		String area = "";
		area = "Area Square with s = (" + getSisi()+ ") : " +Area();
		return area;
	}
}
