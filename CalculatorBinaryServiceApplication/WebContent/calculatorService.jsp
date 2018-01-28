<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.accenture.calculate.CalculatorServiceForBinaryOp"%>

<%

CalculatorServiceForBinaryOp calcService = new CalculatorServiceForBinaryOp();

String n1 = request.getParameter("no1");
String n2 = request.getParameter("no2");
String opt = request.getParameter("opt"); 
char op = opt.charAt(0);
System.err.println(" n1: "+n1+" : n2: "+n2+" : opt : "+opt);
Integer result = null;
Double output = null;
if(opt.equals("a")){
	result = calcService.calc(Integer.parseInt(n1), Integer.parseInt(n2), op);
    	out.print(result);
}                
else if(opt.equals("s")){
	result = calcService.calc(Integer.parseInt(n1), Integer.parseInt(n2), op);
       out.print(result);
}else if(opt.equals("m")){
	result = calcService.calc(Integer.parseInt(n1), Integer.parseInt(n2), op);
	  out.print(result);
}else if(opt.equals("d")){
	output = calcService.calcDiv(Integer.parseInt(n1), Integer.parseInt(n2), op);
	 out.print(output);
}
 
%>

