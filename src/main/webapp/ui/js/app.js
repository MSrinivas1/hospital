/*
 * user script written srinivas  
 */
var hosp = angular.module('hosp',[
                                  'ngRoute',
                                  'hosp.homeController'])

hosp.config(function($routeProvider){
	$routeProvider
	.when('/home',{
		templateUrl:'ui/template/home-tmpl.html',
		controller:'HomeController'
	})
	.otherwise({
		templateUrl:'ui/template/home-tmpl.html'
	});
});