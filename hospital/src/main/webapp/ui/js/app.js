/*
 * user script written srinivas  
 */
var hosp = angular.module('hosp',['hosp.homeController']);
	hosp.component('home', {
	  template:'template/home-tmpl.html',
	  $routeConfig:"HomeController"
	});