<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h1> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h1>
	
<form:errors path="student1.*"/>
	<form action="/ThirdMvcProject/submitAdmissionForm.html" method="post">
		<p>
			Student's Name : <input type="text" name="studentName" />
		</p>
		<p>
			Student's Hobby : <input type="text" name="studentHobby" />
		</p>
		<p>
			Student's Mobile : <input type="text" name="studentMobile" />
		</p>
		<p>
			Student's Date of Birth : <input type="text" name="studentDOB" />
		</p>
		<p>
			Student's city : <input type="text" name="studentAddress.city" />
		</p>
		<p>
			Student's country : <input type="text" name="studentAddress.country" />
		</p>
		<input type="submit" value="Submit this form by clicking here" />
	</form>
 
</body>
</html>

