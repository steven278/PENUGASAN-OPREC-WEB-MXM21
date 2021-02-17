var app = angular.module("myApp", ['ngResource']);
        app.factory('Randomquote', function ($resource) {
            return $resource('https://api.quotable.io/random');
        });
        app.controller("myCtrl", function ($scope, Randomquote) {
            $scope.search = function () {
                $scope.quote = Randomquote.get();
            }
        });