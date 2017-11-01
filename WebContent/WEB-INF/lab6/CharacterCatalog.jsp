<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link rel="stylesheet" href="../css/simpsons.css">
	<title>CharacterCatalog</title>
</head>
<body>
	<div class="container">

		<div class="jumbotron text-center">
  			<img style="width: 30%;" src="http://albertcervantes.com/cs3220/cdn/simpsons/simpsons.png">
  			<h1>Character Catalog</h1>
  			<p class="lead">Click on an image below to view a random image of your favorite character!</p>
		</div>
		
		<div class="row">
			<c:forEach items="${characters}" var="character">
				<div class="col-sm-4 text-center">
					<div class="well">
						<a href="CharacterProfile?id=${character.linkName}">
						<h4 class="text-center">${character.name}</h4>
						<c:if test="${character.numOfPhotos == 0}">
							<img style="height: 150px;" src="http://via.placeholder.com/150?text=N/A" class="img-responsive img-thumbnail" alt="${character.name}">
						</c:if>
						<c:if test="${character.numOfPhotos > 0}">
							<img style="height: 150px;" src="http://albertcervantes.com/cs3220/cdn/simpsons/${character.linkName}/pic_0001.jpg" class="img-responsive img-thumbnail" alt="${character.name}">
						</c:if>
						</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>