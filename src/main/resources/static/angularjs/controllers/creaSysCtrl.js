/**
 * Created by Vasiliy on 03.08.2015.
 */


angular.module("LogBookApp").controller("creaSysCtrl",function($scope) {

  $scope.fio = '';
  $scope.organization = '';
  $scope.jobtitle = '';

  $scope.commis = [];
  $scope.addCommMember = function () {
      console.log("AddCommMember");
      var member = {};
      member.fio =  $scope.fio;
      member.organization = $scope.organization;
      member.jobtitle = $scope.jobtitle;
      console.log(member);
     $scope.commis.push(member);
      console.log($scope.commis);
  }


})