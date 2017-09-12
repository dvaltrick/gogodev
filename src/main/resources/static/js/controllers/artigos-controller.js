appGoGoDev.controller("artigosController",function($scope,$http){
    $scope.artigos = {};
    
    $scope.carregarArtigos = function(){
        $http({method:'GET',url:'http://localhost:8080/artigos'}).then(
            function (response){
                $scope.artigos = response.data;
            }, 
            function(response){
                console.log(response.data);
                console.log(response.status);
            });
    }

    $scope.carregarArtigos();
});    