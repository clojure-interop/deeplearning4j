(ns org.deeplearning4j.spark.datavec.DataVecByteDataSetFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec DataVecByteDataSetFunction]))

(defn ->data-vec-byte-data-set-function
  "Constructor.

  label-index - Index of the label column - `int`
  num-possible-labels - Number of classes for classification (not used if regression = true) - `int`
  batch-size - size of examples in DataSet. Pass in total examples if including all - `int`
  byte-file-len - number of bytes per individual file - `int`
  regression - False for classification, true for regression - `boolean`
  pre-processor - DataSetPreprocessor (may be null) - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^DataVecByteDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Integer batch-size ^Integer byte-file-len ^Boolean regression ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (new DataVecByteDataSetFunction label-index num-possible-labels batch-size byte-file-len regression pre-processor))
  (^DataVecByteDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Integer batch-size ^Integer byte-file-len ^Boolean regression]
    (new DataVecByteDataSetFunction label-index num-possible-labels batch-size byte-file-len regression))
  (^DataVecByteDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Integer batch-size ^Integer byte-file-len]
    (new DataVecByteDataSetFunction label-index num-possible-labels batch-size byte-file-len)))

(defn call
  "input-tuple - `scala.Tuple2`

  returns: `scala.Tuple2<java.lang.Double,org.nd4j.linalg.dataset.DataSet>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^DataVecByteDataSetFunction this ^scala.Tuple2 input-tuple]
    (-> this (.call input-tuple))))

