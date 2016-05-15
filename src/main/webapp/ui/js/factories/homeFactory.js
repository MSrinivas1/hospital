/*
 * user script written srinivas  
 */
var hospital = angular.module('hosp');

hospital.factory('homeFactory',function($http, $log){
	return {
		
		savePerson : function(person){
			$http.post('http://localhost:8081/api/v1/savePerson',person)
			 .success(function(data) {
				console.log('data'+data);
			});
			//console.log(person);
		}
	}
	
})