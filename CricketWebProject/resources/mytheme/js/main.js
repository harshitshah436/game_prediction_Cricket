function validate_activity() {
		
		var partnership = document.forms["myForm"]["partnership"].value;
		if (partnership == null || partnership == "") {
			alert("Top Partnership must be filled out.");
			return false;
		}
		if(isNaN(partnership)){
			alert("Top Partnership must be a numeric. So enter a valid number");
			return false;
		}
		
		var weather= document.forms["myForm"]["weather"].value;
		if (weather == null || weather == "") {
			alert("Weather must be filled out.");
			return false;
		}
		if (weather != "sunny" && weather != "overcast" && weather != "windy") {
			alert("Please enter weather from {sunny, overcast, windy} (case sensitive)");
			return false;
		}
		
		var first_bat= document.forms["myForm"]["first_bat"].value;
		if (first_bat == null || first_bat == "") {
			alert("First Bat must be filled out.");
			return false;
		}
		if (first_bat != "Pak" && first_bat != "India") {
			alert("Please enter First Bat value from {Pak,India} (case sensitive)");
			return false;
		}
		
		var home_advantage= document.forms["myForm"]["home_advantage"].value;
		if (home_advantage == null || home_advantage == "") {
			alert("Home Advantage must be filled out.");
			return false;
		}
		if (home_advantage != "Pak" && home_advantage != "India") {
			alert("Please enter Home Advantage from {Pak,India} (case sensitive)");
			return false;
		}
		
		var run_target = document.forms["myForm"]["run_target"].value;
		if (run_target == null || run_target == "") {
			alert("Run Target must be filled out.");
			return false;
		}
		if(isNaN(run_target)){
			alert("Run Target must be a numeric. So enter a valid number");
			return false;
		}
		
		var day_night = document.forms["myForm"]["day_night"].value;
		if (day_night == null || day_night == "") {
			alert("Day-Night must be filled out.");
			return false;
		}
		if (day_night != "No" && day_night != "Yes") {
			alert("Please enter Day-Night from {No,Yes} (case sensitive)");
			return false;
		}
		
		var top_score = document.forms["myForm"]["top_score"].value;
		if (top_score == null || top_score == "") {
			alert("Top Score must be filled out.");
			return false;
		}
		if(isNaN(top_score)){
			alert("Top Score must be a numeric. So enter a valid number");
			return false;
		}
		
		var toss_won= document.forms["myForm"]["toss_won"].value;
		if (toss_won == null || toss_won == "") {
			alert("Toss Won must be filled out.");
			return false;
		}
		if (toss_won != "Pak" && toss_won != "India") {
			alert("Please enter Toss Won value from {Pak,India} (case sensitive)");
			return false;
		}
	}