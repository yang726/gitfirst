<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <form action="Add" method="post">
    学号：<input type="text" name="id" value=""><br/>
     
       <input type="submit" name="查询" value=""><br/>
       </form>
       <table>
       <c:forEach items="${list}" var="stu"	>
              <tr>
              <td>id</td>
		       		<td>stu.getstuname</td>
		   
		       		<td>stu.getage</td>
		       		
		       </tr>
		       </c:forEach>
       </table>
       
</body>
</html>