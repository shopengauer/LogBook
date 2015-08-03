/**
 * Created by Vasiliy on 03.08.2015.
 */

angular.module("LogBookApp").config(function($routeProvider){


    $routeProvider.when("/person",{
        templateUrl: "userView.html",
        controller: "mainLogBookCtrl"
    });
    //
    $routeProvider.when("/system",{
        templateUrl: "partials/aas.html",
        controller: "aasCtrl"
    });

    $routeProvider.when("/creasys",{
        templateUrl: "partials/forms/creasys.html",
        controller: "creaSysCtrl"
    });




});