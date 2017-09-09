//Modulo principal
var appGoGoDev = angular.module("appGoGoDev",['ngRoute']);

appGoGoDev.config(function ($routeProvider,$locationProvider){
    $routeProvider.when("/artigos", 
                        {
                            templateUrl:"views/lista-artigos.html",
                            controller:"artigosController"
                        })
                    .otherwise({redirectTo:"/"});

    $locationProvider.html5Mode(true);
});