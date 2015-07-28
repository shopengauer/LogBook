/**
 * Created by Vasiliy on 25.07.2015.
 */
angular.module("LogBookApp").controller("personCtrl",function($scope,$location) {

   $scope.message1 = 'Person controller';
  // $location.path("/");

   $scope.setScope = function(){
      $location.path("/page");
   }

})


