(ns org.datavec.local.transforms.misc.ColumnAsKeyPairFunction
  "Very simple function to extract out one writable (by index) and use it as a key in the resulting PairRDD
 For example, myWritable.mapToPair(new ColumnsAsKeyPairFunction(myKeyColumnIdx))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc ColumnAsKeyPairFunction]))

(defn ->column-as-key-pair-function
  "Constructor."
  (^ColumnAsKeyPairFunction []
    (new ColumnAsKeyPairFunction )))

(defn apply
  "Description copied from interface: Function

  writables - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.primitives.Pair<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.nd4j.linalg.primitives.Pair [^ColumnAsKeyPairFunction this ^java.util.List writables]
    (-> this (.apply writables))))

