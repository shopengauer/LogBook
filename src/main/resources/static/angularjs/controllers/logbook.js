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

    //  $routeProvider.when("/person",{
    //    templateUrl: "userView.html",
    //      controller: "mainLogBookCtrl"
    //});
    ////
    //$routeProvider.when("/system",{
    //    templateUrl: "partials/aas.html",
    //    controller: "aasCtrl"
    //});
    //
    //$routeProvider.when("/creasys",{
    //    templateUrl: "partials/forms/creasys.html",
    //    controller: "creaSysCtrl"
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

mainModule.controller("aasCtrl",function($scope,$http){

    $scope.aas = [{
        id: 1,
        customer: 'Альянс-строй',
        developer: 'ООО"Матрица"',
        aasName: 'Система АИИС',
        desc: 'Система автоматизированного учета электроэнергии',
        commission: {id: 2},
        employee: {id: 36, username: 'Павлов В.С.'}
    },
        {
            id: 2,
            customer: 'КЭС-Прикамье',
            developer: 'ООО"Матрица"',
            aasName: 'Система АИИС Прикамье',
            desc: 'Система автоматизированного учета электроэнергии',
            commission: {id: 3},
            employee: {id: 38, username: 'Козел В.И.'}
        }

                   ];
   $scope.date = new Date();

})


