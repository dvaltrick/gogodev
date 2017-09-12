//Modulo principal
var appGoGoDev = angular.module("appGoGoDev",['ngRoute']);

appGoGoDev.config(function ($routeProvider,$locationProvider){
    $routeProvider.when("/artigos", 
                        {
                            templateUrl:"views/lista-artigos.html",
                            controller:"artigosController"
                        })
                    .when("/artigos/:artigoId", 
                        {
                            templateUrl:"views/ler-artigo.html",
                            controller:"lerArtigosController"
                        })
                    .when("/novoartigo", 
                        {
                            templateUrl:"views/novo-artigo.html",
                            controller:"novoArtigoController"
                        })
                    .when("/",
                        {
                            templateUrl:"views/lista-artigos.html",
                            controller:"artigosController"
                        })
                    .otherwise({redirectTo:"/"});

    $locationProvider.html5Mode(true);
});