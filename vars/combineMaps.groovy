def call(Map... maps){
  // Map... maps
  println "maps length: ${maps.length}"
  if (maps.length == 0){
    result = [:]
  } else if (maps.length == 1){
    result = maps[0]
  } else{
    result = [:]
    maps.each{ map -> 
      map.each { k, v ->
        // assert map instanceof java.util.Map
        println "checking instance of type"
        if (result[k] instanceof Map){
          println result[k]
        } else{
          println "false"
        }
        // result[k] = result[k] instanceof Map ? combineMaps(result[k], v) : v
      }
    }
  }
  result
}
