(ns org.datavec.spark.functions.pairdata.MapToBytesPairWritableFunction
  "A function to read files (assuming exactly 2 per input) from a PortableDataStream and combine the contents into a BytesPairWritable"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata MapToBytesPairWritableFunction]))

(defn ->map-to-bytes-pair-writable-function
  "Constructor."
  (^MapToBytesPairWritableFunction []
    (new MapToBytesPairWritableFunction )))

(defn call
  "in - `scala.Tuple2`

  returns: `scala.Tuple2<org.apache.hadoop.io.Text,org.datavec.spark.functions.pairdata.BytesPairWritable>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^MapToBytesPairWritableFunction this ^scala.Tuple2 in]
    (-> this (.call in))))

