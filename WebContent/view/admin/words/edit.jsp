<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/words/"/>">Back</a>
<h1>Category</h1>
<div>
	<div>
		<s:form action="/admin/words/update">
			<s:hidden name="word.wordId" />
			<s:textfield key="Name" name="word.wordContent" />
			<s:select label="Category" headerKey="-1"
				headerValue="Select Category" list="categories" listKey="categoryId"
				listValue="categoryName" name="word.category.categoryId" />
			<s:textfield key="Audio" name="word.audio" />

			<s:label value="Answers" />
			<s:iterator value="word.answers" status="answer">
				<s:hidden name="word.answers[%{#answer.count-1}].answerId" />
				<s:textfield name="word.answers[%{#answer.count-1}].answerContent" />
				<s:checkbox label="Correct Answer" cssClass="answer"
					name="word.answers[%{#answer.count-1}].isCorrect" value="isCorrect" />
			</s:iterator>
			<s:submit key="submit" />
		</s:form>
	</div>
</div>