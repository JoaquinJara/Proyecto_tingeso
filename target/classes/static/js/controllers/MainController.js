app.controller('MainController', ['$scope','$location', function($scope,$location) {

	$scope.title = "Proyecto Tingeso";

  
    $scope.studentPage = $location.path() === '/student';
 

	$scope.navigation = [
	
	{"text":"Ver Estudiantes",   "link":"#!/student", "condition":$scope.studentPage},
	
	];

}]);