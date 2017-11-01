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
	<title>${character.name}'s Profile</title>
</head>
<body>
	<div class="container">
		<div class="row">
			   <div class="col-sm-offset-3 col-sm-6">
			    	<div class="well text-center">
			    		<img style="width: 30%;" src="http://albertcervantes.com/cs3220/cdn/simpsons/simpsons.png">
				    	<h2>${character.name}</h2>
				    	<c:if test="${character.numOfPhotos > 0 }">
					    	<p class="lead">Displaying 1 of ${character.numOfPhotos}.</p>
					    	<p>
						    	<a class="btn btn-success" href="CharacterCatalog">
						    			Catalog
						    	</a>
						    	<a class="btn btn-success" href="CharacterProfile?id=${character.linkName}">
					    			Next Image
					    		</a>
				    		</p>
					   		<p class="text-center" style="overflow: none;">
						   		<a href="CharacterProfile?id=${character.linkName}">
									<c:set var= "num" scope = "session" value = "${character.randomNumber}"></c:set>
						   			<c:if test="${num  <= 9999 && num > 999}">
						   				<img style="max-height: 200px;" src="http://albertcervantes.com/cs3220/cdn/simpsons/${character.linkName}/pic_${num}.jpg">			    			
						   			</c:if>
						   			<c:if test="${num  <= 999 && num > 99}">
						   				<img style="max-height: 200px;" src="http://albertcervantes.com/cs3220/cdn/simpsons/${character.linkName}/pic_0${num}.jpg">			    			
						   			</c:if>
						   			<c:if test="${num  <= 99 && num > 9}">
						   				<img style="max-height: 200px;" src="http://albertcervantes.com/cs3220/cdn/simpsons/${character.linkName}/pic_00${num}.jpg">			    			
						   			</c:if>
						   			<c:if test="${num <= 9 && num > 0}">
						   				<img style="max-height: 200px;" src="http://albertcervantes.com/cs3220/cdn/simpsons/${character.linkName}/pic_000${num}.jpg">			    			
						   			</c:if>
						   		</a>
					   		</p>
				    	</c:if>
				    	<c:if test="${character.numOfPhotos == 0 }">
				    		<span class="text text-danger lead">Sorry, No Photos for this Character</span>
				    		<br></br>
				    		<a class="btn btn-success" href="CharacterCatalog">
						    			Catalog
						    	</a>
				    	</c:if>
			   		</div>
			    </div>
		</div>
	</div>
</body>
</html>