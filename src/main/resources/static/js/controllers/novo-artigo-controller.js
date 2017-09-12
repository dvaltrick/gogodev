appGoGoDev.controller("novoArtigoController",function($scope,$http,$window,$location){
    $scope.novoArtigo = {};

    $scope.salvarArtigo = function(){
        $http({method:'POST',
               url:'http://localhost:8080/artigos',
               data:$scope.novoArtigo}).then(
            function (response){
                $location.path("/artigos"); 
                console.log(response.data);
                console.log(response.status);
            }, 
            function(response){
                console.log(response.data);
                console.log(response.status);
            });
    }
});    