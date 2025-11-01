// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
int lim = 100;

int a = (int) (Math.random()*lim);
int b = (int) (Math.random()*lim);
int c = (int) (Math.random()*lim);
System.out.println("The three random numbers bewtween 0 and " + lim + " are:");
System.out.println(a + " " + b + " " + c);

int min = Math.min(a, Math.min(b,c));
int max = Math.max(a, Math.max(b,c));
int mid = a + b + c - min - max;
System.out.println("In ascending order: " + min + " " + mid + " " + max	);

	}
}
