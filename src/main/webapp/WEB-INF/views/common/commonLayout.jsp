<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv='cache-control' content='no-cache'>
    <meta http-equiv='expires' content='0'>
    <meta http-equiv='pragma' content='no-cache'>

    <link
            href="<c:url value="vendor/bootstrap-3.3.7-dist/css/bootstrap.css" />"
            rel="stylesheet">

    <link href="<c:url value="css/jenapp.css" />"
          rel="stylesheet">

    <script src="<c:url value="/vendor/jquery/js/jquery-1.10.2.min.js" />"></script>
    <script src="<c:url value="js/jenImages.js" />"></script>
    <script src="<c:url value="js/jenVideos.js" />"></script>

</head>
<body>
<!-- Static navbar -->
<div class="navbar navbar-inverse navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/home">Home</a></li>
                <li><a href="/images">Images</a></li>
                <li><a href="/videos">Video</a></li>
                <li><a href="/music">Music</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>
</body>