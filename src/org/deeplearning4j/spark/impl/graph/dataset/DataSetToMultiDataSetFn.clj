(ns org.deeplearning4j.spark.impl.graph.dataset.DataSetToMultiDataSetFn
  "Convert a JavaRDD<DataSet> to a JavaRDD<MultiDataSet>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.dataset DataSetToMultiDataSetFn]))

(defn ->data-set-to-multi-data-set-fn
  "Constructor."
  (^DataSetToMultiDataSetFn []
    (new DataSetToMultiDataSetFn )))

(defn call
  "d - `org.nd4j.linalg.dataset.DataSet`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^DataSetToMultiDataSetFn this ^org.nd4j.linalg.dataset.DataSet d]
    (-> this (.call d))))

