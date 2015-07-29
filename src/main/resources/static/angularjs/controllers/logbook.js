/**
 * Created by Василий on 12.07.2015.
 */


var mainModule = angular.module("LogBookApp",["ngRoute"]);

mainModule.config(function($routeProvider,$locationProvider){

    //$locationProvider.html5Mode(true);
    //$routeProvider.when("/",{
    //    templateUrl: "userView.html",
    //    controller: "userCtrl",
    //    roles: "ROLE_ADMIN"
    //});


    //$routeProvider.when("/",{
    //    templateUrl: "editorView.html",
    //    controller: "personCtrl"
    //});

      $routeProvider.when("/person",{
        templateUrl: "userView.html",
          controller: "mainLogBookCtrl"
    });
    //
    //$routeProvider.when("/edit",{
    //    templateUrl: "editorView.html",
    //    controller: "adminCtrl"
    //});


}).controller("mainLogBookCtrl",function($scope,$http,$location){

    $scope.setView = function(view){

        $location.path(view);
    }

    $scope.hidePanel = function(){

       // var i = $scope.viewFlag;
        $scope.viewFlag = !$scope.viewFlag;
    }

  })


