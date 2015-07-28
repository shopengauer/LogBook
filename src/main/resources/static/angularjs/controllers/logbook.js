/**
 * Created by Василий on 12.07.2015.
 */


var mainModule = angular.module("LogBookApp",["ngRoute"]);

mainModule.config(function($routeProvider,$locationProvider){

    //$locationProvider.html5Mode(true);

    $routeProvider.when("/",{
        templateUrl: "editorView.html",
        controller: "mainLogBookCtrl"
    });

      $routeProvider.when("/person",{
        templateUrl: "personEdit.html",
          controller: "mainLogBookCtrl"
    });

    $routeProvider.when("/edit",{
        templateUrl: "editorView.html",
        controller: "mainLogBookCtrl"
    });


}).controller("mainLogBookCtrl",function($scope,$http,$location){

      $scope.setView = function(view){

          $location.path(view);
      }



   })


