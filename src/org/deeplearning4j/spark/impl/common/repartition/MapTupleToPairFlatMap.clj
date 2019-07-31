(ns org.deeplearning4j.spark.impl.common.repartition.MapTupleToPairFlatMap
  "This is a simple function used to convert a JavaRDD<Tuple2<T,U>> to a JavaPairRDD<T,U> via a
 {JavaRDD.mappartitionsToPair()} call."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common.repartition MapTupleToPairFlatMap]))

(defn ->map-tuple-to-pair-flat-map
  "Constructor."
  (^MapTupleToPairFlatMap []
    (new MapTupleToPairFlatMap )))

