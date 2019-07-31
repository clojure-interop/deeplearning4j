(ns org.deeplearning4j.spark.data.PathToDataSetFunction
  "Simple function used to load DataSets (serialized with DataSet.save()) from a given Path (as a String)
 to a DataSet object - i.e., RDD<String> to RDD<DataSet>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data PathToDataSetFunction]))

(defn ->path-to-data-set-function
  "Constructor."
  (^PathToDataSetFunction []
    (new PathToDataSetFunction )))

(def *-buffer-size
  "Static Constant.

  type: int"
  PathToDataSetFunction/BUFFER_SIZE)

(defn call
  "path - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.DataSet [^PathToDataSetFunction this ^java.lang.String path]
    (-> this (.call path))))

