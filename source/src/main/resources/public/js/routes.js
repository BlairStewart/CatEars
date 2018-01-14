// ROUTES
radar.config(function ($routeProvider) {
   
    $routeProvider
    
    .when('/', {
        templateUrl: 'pages/home.htm',
        controller: 'homeController'
    })

    .when('/city', {
        templateUrl: 'pages/city/index.htm',
        controller: 'cityController'
    })

    .when('/city/:id', {
        templateUrl: 'pages/city/map.htm',
        controller: 'cityMapController'
    })

});