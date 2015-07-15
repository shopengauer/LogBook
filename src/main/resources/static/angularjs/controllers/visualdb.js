/**
 * Created by Василий on 12.07.2015.
 */


var mainModule = angular.module("VisualDB",["customFilters"]);

mainModule.controller("visualDbCtrl",function($scope,$http){
    $http.get('/resource/').success(function(data) {
        $scope.devices = data;
    })
});
