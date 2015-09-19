<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Cricket Game Prediction</title>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.3.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
</head>
<body>
	<form:form name="myForm" action="/IsCricketWebProject/dislayPrediction"
		method="POST">
		<h2>Enter details to Predict the Win</h2>
		<table class="tdcolor">
			<tr>
				<td><div>
						<form:label path="top_partnership">Top Partnership</form:label>
					</div>
				</td>
				<td><form:input id="partnership" name="partnership"
						path="top_partnership" />
				</td>
			</tr>
			<tr>
				<td><div>
						<form:label path="weather">Weather</form:label>
					</div>
				</td>
				<td><form:input id="weather" path="weather" />
				</td>
			</tr>
			<tr>
				<td><div>
						<form:label path="first_bat">First Bat</form:label>
					</div>
				</td>
				<td><form:input id="first_bat" path="first_bat" />
				</td>
			</tr>

			<tr>
				<td><div>
						<form:label path="home_advantage">Home Advantage</form:label>
					</div>
				</td>
				<td><form:input id="home_advantage" path="home_advantage" />
				</td>
			</tr>
			<tr>
				<td><div>
						<form:label path="run_target">Run Target</form:label>
					</div>
				</td>
				<td><form:input id="run_target" path="run_target" />
				</td>
			</tr>
			<tr>
				<td><div>
						<form:label path="day_night">Day-Night</form:label>
					</div>
				</td>
				<td><form:input id="day_night" path="day_night" />
				</td>
			</tr>
			<tr>
				<td><div>
						<form:label path="top_score">Top Score</form:label>
					</div>
				</td>
				<td><form:input id="top_score" path="top_score" />
				</td>
			</tr>
			<tr>
				<td><div>
						<form:label path="toss_won">Toss Won</form:label>
					</div>
				</td>
				<td><form:input id="toss_won" path="toss_won" />
				</td>
			</tr>
		</table>
		<input type="submit" value="Predict"
			onclick="return validate_activity();" />
	</form:form>
</body>
</html>