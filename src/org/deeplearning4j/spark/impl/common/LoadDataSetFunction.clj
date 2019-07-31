(ns org.deeplearning4j.spark.impl.common.LoadDataSetFunction
  "This is a function that is used to load a DataSet object using DataSet.load(InputStream)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common LoadDataSetFunction]))

(defn ->load-data-set-function
  "Constructor."
  (^LoadDataSetFunction []
    (new LoadDataSetFunction )))

(defn call
  "path - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.DataSet [^LoadDataSetFunction this ^java.lang.String path]
    (-> this (.call path))))

