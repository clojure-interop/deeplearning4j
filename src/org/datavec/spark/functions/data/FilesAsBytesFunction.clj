(ns org.datavec.spark.functions.data.FilesAsBytesFunction
  "A PairFunction that simply loads bytes[] from a a PortableDataStream, and wraps it (and the String key)
 in Text and BytesWritable respectively."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.data FilesAsBytesFunction]))

(defn ->files-as-bytes-function
  "Constructor."
  (^FilesAsBytesFunction []
    (new FilesAsBytesFunction )))

(defn call
  "in - `scala.Tuple2`

  returns: `scala.Tuple2<org.apache.hadoop.io.Text,org.apache.hadoop.io.BytesWritable>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^FilesAsBytesFunction this ^scala.Tuple2 in]
    (-> this (.call in))))

