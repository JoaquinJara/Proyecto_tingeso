app.controller('StudentController', ['$scope','$http', function($scope,$http) {

    $scope.students = [];
    $scope.newStudent = {};

    $scope.resetNewStudent = function(){
        $scope.newStudent = {
        "rut":0,
        "name":"",
        "mail":"",
        "program":"",
        "year":0
        }
    }



    $scope.loadStudents = function(){
        $http.get('/students').then(function(response){
            $scope.students = response.data._embedded.students;
        });
        $scope.resetNewStudent();
    }

   $scope.send = function(){
        console.log($scope.newStudent);
        var student = {
            "rut":$scope.newStudent.rut,
            "name":$scope.newStudent.name,
            "mail":$scope.newStudent.mail,
            "program":$scope.newStudent.program,
            "year":$scope.newStudent.year
        };
       
        $http.post('/students',student).then(function(response){
            console.log(response);
            var studentUrl = response.data._links.student.href;
         
                $http.post(studentUrl,{headers:{'Content-Type':'text/uri-list'}}).then(function(response){
                    console.log(response);
                });
            
            $scope.loadStudents();
        });
    }


    $scope.loadStudents();
   

}]);