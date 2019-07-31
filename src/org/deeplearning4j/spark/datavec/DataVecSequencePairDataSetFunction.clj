(ns org.deeplearning4j.spark.datavec.DataVecSequencePairDataSetFunction
  "Map Tuple2<Collection<Collection<Writable>>,Collection<Collection<Writable>> objects (out of a TWO datavec-spark
 sequence record reader functions) to DataSet objects for Spark training.
 Analogous to SequenceRecordReaderDataSetIterator, but in the context of Spark.
 Supports loading data from a TWO sources only; hence supports many-to-one and one-to-many situations.
 see DataVecSequenceDataSetFunction for the single file version"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec DataVecSequencePairDataSetFunction]))

(defn ->data-vec-sequence-pair-data-set-function
  "Constructor.

  Constructor for data with a specified alignment mode, no data set preprocessor or writable converter

  num-possible-labels - `int`
  regression - `boolean`
  alignment-mode - `org.deeplearning4j.spark.datavec.DataVecSequencePairDataSetFunction$AlignmentMode`"
  (^DataVecSequencePairDataSetFunction [^Integer num-possible-labels ^Boolean regression ^org.deeplearning4j.spark.datavec.DataVecSequencePairDataSetFunction$AlignmentMode alignment-mode]
    (new DataVecSequencePairDataSetFunction num-possible-labels regression alignment-mode))
  (^DataVecSequencePairDataSetFunction [^Integer num-possible-labels ^Boolean regression]
    (new DataVecSequencePairDataSetFunction num-possible-labels regression))
  (^DataVecSequencePairDataSetFunction []
    (new DataVecSequencePairDataSetFunction ))
  (^DataVecSequencePairDataSetFunction [^Integer num-possible-labels ^Boolean regression ^org.deeplearning4j.spark.datavec.DataVecSequencePairDataSetFunction$AlignmentMode alignment-mode ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor ^org.datavec.api.io.WritableConverter converter]
    (new DataVecSequencePairDataSetFunction num-possible-labels regression alignment-mode pre-processor converter)))

(defn call
  "input - `scala.Tuple2`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.DataSet [^DataVecSequencePairDataSetFunction this ^scala.Tuple2 input]
    (-> this (.call input))))

