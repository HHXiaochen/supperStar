<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <title></title>
</head>
<body>

<form action="" method="">
  <table align="center" border="1">
    <tr><td>文档分类：<select name="entry">
      <option value="0">请选择</option>
      <option value="1">IT计算机</option>
      <option value="2">办公文档</option>
      <option value="3">外语学习</option>
    </select>
      <input type="submit" value="查询">
      <input>
    </td>
    </tr>
    <tr>
      <td>文档编号</td>
      <td>文档名称</td>
      <td>文档摘要</td>
      <td>上传人</td>
      <td>上传日期</td>
      <td>操作</td>
    </tr>
    <c:forEach var="entry" items="${list}" varStatus="status">
      <tr
              <c:if test="${status.index%2==0 }"> style=background-color:red;</c:if>>
        <td>${entry.id }</td>
        <td>${entry.title }</td>
        <td>${entry.summary }</td>
        <td>${entry.uploaduser }</td>
        <td>${entry.createdate }</td>
        <td><a href="#">删除</a></td>
      </tr>
    </c:forEach>
  </table>
</form>
</body>
</html>