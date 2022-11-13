package casting_autowidering;

public class B
{
	byte b1 = 10;
	int i  = b1;
	float f1  = b1;
	double d1   = b1;
	double d2 = i;
	double d3 = f1;
}
// if right hand side is narrower and left side is wider comiler taking only requrid wider