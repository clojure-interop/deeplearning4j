(ns org.deeplearning4j.spark.impl.common.reduce.IntDoubleReduceFunction
  "Add both elements of a Tuple2<Integer,Double>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common.reduce IntDoubleReduceFunction]))

(defn ->int-double-reduce-function
  "Constructor."
  (^IntDoubleReduceFunction []
    (new IntDoubleReduceFunction )))

(defn call
  "f - `scala.Tuple2`
  s - `scala.Tuple2`

  returns: `scala.Tuple2<java.lang.Integer,java.lang.Double>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^IntDoubleReduceFunction this ^scala.Tuple2 f ^scala.Tuple2 s]
    (-> this (.call f s))))

