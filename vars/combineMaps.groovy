def call(Map... maps){
  Map result
  // Map... maps
  println "maps length: ${maps.length}"
  if (maps.length == 0){
    result = [:]
  }
  else if (maps.length == 1){
    result = maps[0]
  }else{
    result = [:]
    maps.each{ map -> println map}
  }
}
