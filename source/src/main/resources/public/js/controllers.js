// CONTROLLERS
radar.controller('homeController', ['$scope', function($scope) {
    

    
}]);

radar.controller('cityController', ['$scope', '$resource', 'City', function($scope, $resource, City) {

    $scope.cities = City.query();

}]);

radar.controller('cityMapController', ['$scope', '$resource', '$routeParams', 'City', function($scope, $resource, $routeParams, City) {

    $scope.cityId = $routeParams.id;

    $scope.city = City.get({id : $scope.cityId});
    $scope.radarSites = City.getRadars({id : $scope.cityId});

    $scope.activeIcon = {
        "scaledSize": [40, 40],
        "url": "/images/radar.png"
    };

    $scope.inactiveIcon = {
        "scaledSize": [40, 40],
        "url": "/images/no-radar.png"
    };

}]);