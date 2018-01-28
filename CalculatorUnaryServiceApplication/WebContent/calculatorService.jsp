<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.accenture.calculate.CalculatorServiceForUnaryOp"%>

<%

CalculatorServiceForUnaryOp calcServiceSingle = new CalculatorServiceForUnaryOp();

String n1 = request.getParameter("no1");
String opt = request.getParameter("opt"); 
char op = opt.charAt(0);
System.err.println(" n1: "+n1+" : opt : "+opt);
Double results = null;

if(opt.equals("r")){
	results = calcServiceSingle.calcSingle(Integer.parseInt(n1), op);
	 out.print(results);
}else if(opt.equals("i")){
	results = calcServiceSingle.calcSingle(Integer.parseInt(n1), op);
	 out.print(results);
}
 
%>

