package t5.t5;


/**
 * Hello world!
 */
public class App {
	 public static class Triangle_classification {

	        enum Triangle_Types {
	            equilateral,
	            isosceles,
	            Scalene,
	            Nottriangle,
	            ERROR
	        }
	public class TriangleClassifier implements classifyTriangle_interface{
	private isIsosceles IsIsosceles ;
	private isTriangle IsTriangle;
	private isEquilateral IsEquilateral;
	TriangleClassifier(isIsosceles IsIsosceles,isTriangle IsTriangle,isEquilateral IsEquilateral){
	this.IsIsosceles = IsIsosceles;
	this.IsTriangle= IsTriangle;
	this.IsEquilateral= IsEquilateral;}
	public String classifyTriangle(int a, int b, int c) 
	{Triangle_Types triangle = null;
	if(IsTriangle.test(a, b, c)){

	    if (this.IsEquilateral.test(a, b, c)) {
	        triangle= Triangle_Types.equilateral;
	        }else if(this.IsIsosceles.test(a, b, c)) {
	        triangle= Triangle_Types.isosceles;
	        }else {
	        triangle= Triangle_Types.Scalene;}     }
	return triangle.toString();}
}}}
