/**
 * Created by Vasiliy on 13.07.2015.
 */

angular.module("VisualDB").constant("activeListTypeClass","btn-primary").controller("deviceListCtrl",function($scope,$filter,activeListTypeClass){

    var selectedType = null;
     $scope.devicesOnThePage = 9;
     $scope.selectedPage = 1;

    $scope.selectType = function(newType){
        selectedType = newType;
        $scope.selectedPage = 1;
    }

    $scope.selectPage = function(newPage){
        $scope.selectedPage = newPage;

    }

    $scope.typeFilterFn = function(device){
           return selectedType == null || device.devicetype == selectedType;

    }

    $scope.getTypeClass= function(type){
        return selectedType == type ? activeListTypeClass : "";
    }

    $scope.getPageClass= function(currentPage){
        return $scope.selectedPage == currentPage ? activeListTypeClass : "";
    }

})
