<%@ page import="com.opensymphony.xwork2.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="authz"
	uri="http://www.springframework.org/security/tags"%>
<div id="header-main">
	<div id="logo">
		<h1>Framgia Japanese Learning System</h1>
	</div>
	<div id="menu-main">
		<a href="<s:url value="/users/"/>">Users</a> <a
			href="<s:url value="/categories/"/>">Categories</a> <a
			href="<s:url value="/words/"/>">Words</a> <a id="logout"
			href="/fels_70/j_spring_security_logout">Logout</a>

	</div>
</div>