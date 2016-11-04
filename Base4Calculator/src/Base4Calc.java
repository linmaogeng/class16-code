
public class Base4Calc 
{
	private int result;
	
	Base4Calc() { result = 0; }
	
	void clear() { result = 0; }
	
	void addition (int first, int second)
	{
		result = first + second;
	}
	
	void subtraction (int first, int second)
	{
		result = first - second;
	}
	
	void division (int first, int second)
	{
		result = first / second;
	}
	
	void multiplication (int first, int second)
	{
		result = first * second;
	}

	// What other methods will you need?
}
