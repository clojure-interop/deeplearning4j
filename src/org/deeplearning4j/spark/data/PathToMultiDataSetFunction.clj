(ns org.deeplearning4j.spark.data.PathToMultiDataSetFunction
  "Simple function used to load MultiDataSets (serialized with MultiDataSet.save()) from a given Path (as a String)
 to a MultiDataSet object - i.e., RDD<String> to RDD<MultiDataSet>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data PathToMultiDataSetFunction]))

(defn ->path-to-multi-data-set-function
  "Constructor."
  (^PathToMultiDataSetFunction []
    (new PathToMultiDataSetFunction )))

(def *-buffer-size
  "Static Constant.

  type: int"
  PathToMultiDataSetFunction/BUFFER_SIZE)

(defn call
  "path - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^PathToMultiDataSetFunction this ^java.lang.String path]
    (-> this (.call path))))

