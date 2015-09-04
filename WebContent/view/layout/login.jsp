<%@ taglib prefix="s" uri="/struts-tags"%>
<s:div>
	<h1>Login</h1>
</s:div>
<s:if test="%{#parameters.error != null}">
	<div style="color: red">Invalid User</div>
</s:if>
<s:form action="j_spring_security_check">
	<s:textfield label="Name" name="username" />
	<s:password label="Password" name="password" />
	<s:submit key="submit" />
</s:form>
<s:if test="#session.logined == 'false'">
	<a>Invalid user name or password</a>
</s:if>