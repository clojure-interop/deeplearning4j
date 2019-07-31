(ns org.deeplearning4j.spark.datavec.DataVecSequenceDataSetFunction
  "Map Collection<Collection<Writable>> objects (out of a datavec-spark sequence record reader function) to
 DataSet objects for Spark training.
 Analogous to SequenceRecordReaderDataSetIterator, but in the context of Spark.
 Supports loading data from a single source only (hence no masknig arrays, many-to-one etc here)
 see DataVecSequencePairDataSetFunction for the separate collections for input and labels version"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec DataVecSequenceDataSetFunction]))

(defn ->data-vec-sequence-data-set-function
  "Constructor.

  label-index - Index of the label column - `int`
  num-possible-labels - Number of classes for classification (not used if regression = true) - `int`
  regression - False for classification, true for regression - `boolean`
  pre-processor - DataSetPreprocessor (may be null) - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`
  converter - WritableConverter (may be null) - `org.datavec.api.io.WritableConverter`"
  (^DataVecSequenceDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Boolean regression ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor ^org.datavec.api.io.WritableConverter converter]
    (new DataVecSequenceDataSetFunction label-index num-possible-labels regression pre-processor converter))
  (^DataVecSequenceDataSetFunction [^Integer label-index ^Integer num-possible-labels ^Boolean regression]
    (new DataVecSequenceDataSetFunction label-index num-possible-labels regression)))

(defn call
  "input - `java.util.List`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.DataSet [^DataVecSequenceDataSetFunction this ^java.util.List input]
    (-> this (.call input))))

