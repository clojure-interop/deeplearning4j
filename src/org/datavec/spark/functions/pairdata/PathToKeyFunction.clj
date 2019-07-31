(ns org.datavec.spark.functions.pairdata.PathToKeyFunction
  "Given a Tuple2, where the first value is the full path, map this
 to a Tuple3 where the first value is a key (using a PathToKeyConverter),
 second is an index, and third is the original data stream"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata PathToKeyFunction]))

(defn ->path-to-key-function
  "Constructor.

  index - `int`
  converter - `org.datavec.spark.functions.pairdata.PathToKeyConverter`"
  (^PathToKeyFunction [^Integer index ^org.datavec.spark.functions.pairdata.PathToKeyConverter converter]
    (new PathToKeyFunction index converter)))

(defn call
  "in - `scala.Tuple2`

  returns: `scala.Tuple2<java.lang.String,scala.Tuple3<java.lang.String,java.lang.Integer,org.apache.spark.input.PortableDataStream>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^PathToKeyFunction this ^scala.Tuple2 in]
    (-> this (.call in))))

