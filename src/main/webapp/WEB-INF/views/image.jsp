<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Base64" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Image</title>
</head>
<body>
<%
   
    if (request.getAttribute("img") != null) {
      
        byte[] imageBytes = (byte[]) request.getAttribute("img");

        String base64Image = Base64.getEncoder().encodeToString(imageBytes);
        System.out.println("Image successfully retrieved and encoded.");
%>
        <img src="data:image/jpeg;base64,<%= base64Image %>" alt="Image from database"/>
        <h1>Hello</h1>
<%
    } else {
        System.out.println("Failed to retrieve image.");
%>
        <h1>No Image Found</h1>
<%
    }
%>
</body>
</html>
