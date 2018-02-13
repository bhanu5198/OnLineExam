var applog = angular.module('myApp',['ngRoute']);

applog.config([ '$routeProvider', '$locationProvider',
    function($routeProvider, $locationProvider) {
        $routeProvider.when('/home', {
            templateUrl : 'home.html',
            controller : 'HomeController'
        })
        $routeProvider.when('/', {
            templateUrl : 'login.html',
            controller : 'LoginController'
        }).otherwise({
            redirectTo : 'index.html'
        });
        //$locationProvider.html5Mode(true); //Remove the '#' from URL.
    }
]);

applog.controller("LoginController", function($scope, $location, $http) {
    $scope.login = function() {
    	$http({
            method : "GET",
            url : "/userdetails",
            //params: {userName:$scope.username, password:$scope.password}
        }).success(function(data, status, headers, config) {
		    
    	    $scope.User = data[0];    	    
    	    //alert(data[0].username);
    	    //alert(data[0].password);
           
        var username = $scope.username;
    	
        var password = $scope.password;
        //alert($scope.username);
        if (data[0].username == $scope.username && data[0].password == $scope.password) {
            $location.path("/home" );
        } else {
            alert('invalid username or password');
        }
    	
    })
    }
    
});

applog.controller("HomeController", function($scope, $location, $http) {
	console.log("HomeController");
	      
$http({
	        method : "GET",
	        url : "/examdetails"
       }).success(function(data, status, headers, config) {
		//alert(data);
    	   
    	    $scope.query = {}
    	    $scope.queryBy = '$'
    	    $scope.UserList = data;
    	    
    	   // $scope.orderByField = 'examSlot';
            $scope.reverseSort = false;
    
      }).error(function(data, status, headers, config) {
        console.log("error");
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
	});

