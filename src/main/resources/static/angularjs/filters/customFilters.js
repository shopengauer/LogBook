/**
 * Created by Vasiliy on 13.07.2015.
 */
angular.module("customFilters",[]).filter("unique",function(){
    return function(data,propertyName){
       if(angular.isArray(data) && angular.isString(propertyName)){
          var results = [];
           var uniqueKeys = {};
          for(i=0;i< data.length;i++){
              var value = data[i][propertyName];
              // если такое свойство уже определено то пропускаем его
              // то есть здесь собираем набор не повторяющихся свойств
              if(angular.isUndefined(uniqueKeys[value])){
                  uniqueKeys[value] = true;
                  results.push(value);
              }
          }
           return results;
       }else
       {
           return data;
       }
    }
}).filter("pagination",function(){
    return function(data,size,page){
        if(angular.isArray(data)&&angular.isNumber(size)&&angular.isNumber(page)){
            var start_index= size*(page - 1);
            if(data.length<start_index){
                return [];
            }else{
              // return $filter.
            }

        }else{
            return data;
        }
    }
}).filter("pageCounter",function(){
    return function(data,size){

    }
})