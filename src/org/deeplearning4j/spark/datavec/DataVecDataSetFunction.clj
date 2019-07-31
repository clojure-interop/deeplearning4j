(ns org.deeplearning4j.spark.datavec.DataVecDataSetFunction
  "Map Collection<Writable> objects (out of a datavec-spark record reader function) to DataSet objects for Spark training.
 Analogous to RecordReaderDataSetIterator, but in the context of Spark."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec DataVecDataSetFunction]))

(defn ->data-vec-data-set-function
  "Constructor.

  Main constructor, including for multi-label regression

  label-index-from - Index of the first target - `int`
  label-index-to - Index of the last target, inclusive (for classification or single-output regression: same as labelIndexFrom) - `int`
  num-possible-labels - Unused for regression, or number of classes for classification - `int`
  regression - If true: regression. false: classification - `boolean`
  pre-processor - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`
  converter - `org.datavec.api.io.WritableConverter`"
  (^DataVecDataSetFunction [^Integer label-index-from ^Integer label-index-to ^Integer num-possible-labels ^Boolean regression ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor ^org.datavec.api.io.WritableConverter converter]
    (new DataVecDataSetFunction label-index-from label-index-to num-possible-labels regression pre-processor converter))
  (^DataVecDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Boolean regression ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor ^org.datavec.api.io.WritableConverter converter]
    (new DataVecDataSetFunction label-index num-possible-labels regression pre-processor converter))
  (^DataVecDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Boolean regression]
    (new DataVecDataSetFunction label-index num-possible-labels regression)))

(defn call
  "curr-list - `java.util.List`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.DataSet [^DataVecDataSetFunction this ^java.util.List curr-list]
    (-> this (.call curr-list))))

