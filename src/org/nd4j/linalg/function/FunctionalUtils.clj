(ns org.nd4j.linalg.function.FunctionalUtils
  "A simple util class for collapsing a Map
 in to a List of Pair
 where each item in the list will be an entry in the map
 represented by a Pair of the original key and value type."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function FunctionalUtils]))

(defn ->functional-utils
  "Constructor."
  (^FunctionalUtils []
    (new FunctionalUtils )))

(defn *cogroup
  "For each key in left and right, cogroup returns the list of values
  as a pair for each value present in left as well as right.

  left - the left list of pairs to join - `java.util.List`
  right - the right list of pairs to join - `java.util.List`

  returns: a map of the list of values by key for each value in the left as well as the right
  with each element in the pair representing the values in left and right respectively. - `<K,V> java.util.Map<K,org.nd4j.linalg.primitives.Pair<java.util.List<V>,java.util.List<V>>>`"
  ([^java.util.List left ^java.util.List right]
    (FunctionalUtils/cogroup left right)))

(defn *group-by-key
  "Group the input pairs by the key of each pair.

  list-input - the list of pairs to group - `java.util.List`

  returns: a map representing a grouping of the
  keys by the given input key type and list of values
  in the grouping. - `<K,V> java.util.Map<K,java.util.List<V>>`"
  ([^java.util.List list-input]
    (FunctionalUtils/groupByKey list-input)))

(defn *map-to-pair
  "Convert a map with a set of entries of type K for key
  and V for value in to a list of Pair

  map - the map to collapse - `java.util.Map`

  returns: the collapsed map as a List - `<K,V> java.util.List<org.nd4j.linalg.primitives.Pair<K,V>>`"
  ([^java.util.Map map]
    (FunctionalUtils/mapToPair map)))

