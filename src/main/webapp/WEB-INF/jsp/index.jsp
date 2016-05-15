<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="hosp">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="shortcut icon" type="image/x-icon" href="ui/images/favicon.ico"/>

	    <link rel="stylesheet" href="ui/js/lib/bootstrap/dist/css/bootstrap.css">
	    <link rel="stylesheet" href="ui/js/lib/ng-table/ng-table.css">
		<link rel="stylesheet" href="ui/css/index.css"/>
	
		<script src="ui/js/lib/underscore-min-1.5.2.js"></script>
	    <script src="ui/js/lib/ng-file-upload/angular-file-upload-shim.min.js"></script>
	    <script src="ui/js/lib/angular/angular.min.js"></script>
	    <script src="ui/js/lib/ng-file-upload/angular-file-upload.min.js"></script>
	    <script src="ui/js/lib/angular-route/angular-route.min.js"></script>
	    <script src="ui/js/lib/angular-animate/angular-animate.min.js"></script>
	    <script src="ui/js/lib/angular-touch/angular-touch.min.js"></script>
	    <script src="ui/js/lib/angular-strap/dist/angular-strap.min.js"></script>
	    <script src="ui/js/lib/angular-strap/dist/angular-strap.tpl.min.js"></script>
	    <script src="ui/js/lib/ng-table/ng-table.min.js"></script>
	    <script src="ui/js/lib/jquery/dist/jquery.js"></script>
	    <script src="ui/js/lib/angular-unsavedChanges/dist/unsavedChanges.js"></script>
	    <script src="ui/js/lib/spin.js/spin.js"></script>
	    <script src="ui/js/lib/angular-spinner/angular-spinner.js"></script>
	    <script src="ui/js/lib/ui-bootstrap-tpls-0.11.0.min.js"></script>
	    <script src="ui/js/lib/async.js"></script>
	
		<script src = "ui/js/app.js"></script>
		<script src = "ui/js/controllers/homeController.js"></script>
		<script src = "ui/js/factories/homeFactory.js"></script>
	</head>
	<body>
	    <div class="container">
        	<div class="navbar-collapse collapse">
           		header
       		</div>
   		
			<div class="container">
		    	<div class="view-container">
		    		<div ng-view></div>   
				</div>
			</div>
			<div class="navbar-collapse collapse">
				footer
			</div>
		</div>
	</body>
</html>