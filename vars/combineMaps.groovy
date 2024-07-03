def call(Map... maps){
  Map result list, maps, arrays [], {}, :
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
        result[k] = result[k] instanceof Map ? combineMaps(result[k], v) : v
      }
    }
  }
  result
}
