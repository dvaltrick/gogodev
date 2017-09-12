appGoGoDev.controller("lerArtigosController",function($scope,$http,$routeParams){
    $scope.artigo = {};
    
    $http({method:'GET',url:'http://localhost:8080/artigos/'+$routeParams.artigoId}).then(
        function (response){
            $scope.artigo = response.data;
        }, 
        function(response){
            console.log(response.data);
            console.log(response.status);
        });
    
}); 