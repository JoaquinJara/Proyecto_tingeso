var app = angular.module('student',['ngRoute']);

app.config(function($routeProvider){
    $routeProvider
 
        .when('/student',{
            templateUrl: 'js/views/student.html',
            controller: 'StudentController'
        })

        .otherwise({
            redirectTo: '/index'
        });
});