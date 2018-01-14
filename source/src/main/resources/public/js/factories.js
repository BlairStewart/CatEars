radar.factory('City', ['$resource', function($resource) {
    return $resource('/api/v1/city/:id', null, {
        query : {
            method: 'GET',
            isArray: true,
            transformResponse: function(data) {
                return angular.fromJson(data).results;
            }
        },
        get : {
            method: 'GET',
            transformResponse: function(data) {
                return angular.fromJson(data).results;
            }
        },
        getRadars : {
            method: 'GET',
            url: '/api/v1/city/:id/radarsites',
            isArray: true,
            transformResponse: function(data) {
                return angular.fromJson(data).results;
            }
        },
        delete : {
            method : 'DELETE',
            url : '/api/v1/city/:id'
        },
        update : {
            method : 'PUT'
        },
        create : {
            method : 'POST'
        }
    });
}]);
