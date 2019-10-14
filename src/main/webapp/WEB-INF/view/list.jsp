<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript"></script>
</head>
<body>
 
 <form >
   <table>
        <tr>
            <td>编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>售后百分比</td>
        
        </tr>
  <c:forEach items="${list }" var="c">
       <tr>
            <td>${c.id }</td>
            <td>${c.name }</td>
            <td>${c.monkey }</td>
            <td>${c.bf }</td>
        
        </tr>
  
  </c:forEach> 
    <tr>
        <td colspan="12">
          <a href="${pageContext.request.contextPath}/findlist?page=${prePage}">上一页</a>
          <a href="${pageContext.request.contextPath}/findlist?page=${nextPage}">下一页</a>
        
        </td>
    
    </tr>
   
   </table>
 
 
 
 </form>
 
 
 
</body>
</html>