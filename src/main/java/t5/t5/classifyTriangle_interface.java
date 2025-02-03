package t5.t5;

public interface classifyTriangle_interface {
	public class isEquilateral {
		public Boolean test(int a, int b, int c) {
		    return a + b > c && a + c > b && b + c > a && a == b && b == c;}}
	public class isIsosceles {
		public Boolean test(int a, int b, int c) {
		    return a + b > c && a + c > b && b + c > a && ((a == b) || (b == c) || (a == c));}}
	public class isTriangle {
		public Boolean test(int a, int b, int c) {
		    return a + b > c && a + c > b && b + c > a && a == b && b == c;}}

}