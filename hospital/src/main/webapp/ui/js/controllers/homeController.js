/*
 * user script written srinivas  
 */
var hosp = angular.module('hosp.homeController',[])

hosp.controller("HomeController",function($scope,$http,homeFactory){
	
	$scope.person= {};
	
	$scope.savePerson = function(){
		homeFactory.savePerson($scope.person);
	};
	
	$scope.resetPerson = function(){
		$scope.person= {};
	}
});