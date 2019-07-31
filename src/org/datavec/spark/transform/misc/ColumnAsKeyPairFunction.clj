(ns org.datavec.spark.transform.misc.ColumnAsKeyPairFunction
  "Very simple function to extract out one writable (by index) and use it as a key in the resulting PairRDD
 For example, myWritable.mapToPair(new ColumnsAsKeyPairFunction(myKeyColumnIdx))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc ColumnAsKeyPairFunction]))

(defn ->column-as-key-pair-function
  "Constructor."
  (^ColumnAsKeyPairFunction []
    (new ColumnAsKeyPairFunction )))

(defn call
  "writables - `java.util.List`

  returns: `scala.Tuple2<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^ColumnAsKeyPairFunction this ^java.util.List writables]
    (-> this (.call writables))))

