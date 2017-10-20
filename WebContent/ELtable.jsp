<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>EL Table</title>
</head>
<body>
	<div class="container">

		<header>
		<div class="page-header">
			<h1>
				EL Table <small class="smal">Lab 5</small>
			</h1>
		</div>
		</header>

		<table class="table table-stripped">
			<tbody>
				<tr>
					<td><code>&#36{2+4/2}</code></td>
					<td>${2+4/2}</td>
				</tr>
				<tr>
					<td><code>&#36{2+3/2}</code></td>
					<td>${2+3/2}</td>
				</tr>
				<tr>
					<td><code>&#36{"2" + 3/2 }</code></td>
					<td>${"2" + 3/2 }</td>
				</tr>
				<tr>
					<td><code>&#36{"2" + 3 div 2}</code></td>
					<td>${"2" + 3 div 2}</td>
				</tr>
				<tr>
					<td><code>&#36{"a" + 3 div 2 }</code></td>
					<td>Error</td>
				</tr>
				<tr>
					<td><code>&#36{null == 'test'}</code></td>
					<td>${null == 'test'}</td>
				</tr>
				<tr>
					<td><code>&#36{null eq 'null'}</code></td>
					<td>${null eq 'null'}</td>
				</tr>
				<tr>
					<td><code>&#36{empty ""}</code></td>
					<td>${empty ""}</td>
				</tr>
				<tr>
					<td><code>&#36{empty null}</code></td>
					<td>${empty null}</td>
				</tr>
				<tr>
					<td><code>&#36{empty "null"}</code></td>
					<td>${empty "null"}</td>
				</tr>
				<tr>
					<td><code>&#36{"abc" lt 'b'}</code></td>
					<td>${"abc" lt 'b'}</td>
				</tr>
				<tr>
					<td><code>&#36{"cs320" > "cs203"}</code></td>
					<td>${"cs320" > "cs203"}</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>