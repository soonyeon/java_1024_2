<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
label.error{color:red;}
</style>
<h1>회원가입</h1>
<form action="<c:url value='/signup'></c:url>" method="post">
	<div class="form-group">
		<label for="id">아이디:</label>
		<input type="text" class="form-control" id="id" name="me_id">
	</div>
	<button class="btn btn-outline-success col-12" type="button" onclick="alert('추후 구현')">아이디 중복체크</button>
	<div class="form-group">
		<label for="pw">비번:</label>
		<input type="password" class="form-control" id="pw" name="me_pw">
	</div>
	
	<button class="btn btn-outline-success col-12">로그인</button>
</form>

<script src="<c:url value='/resources/js/jquery.validate.min.js'></c:url>"></script>
<script src="<c:url value='/resources/js/additional-methods.min.js'></c:url>"></script>
