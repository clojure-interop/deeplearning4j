(ns org.nd4j.linalg.dataset.api.preprocessor.CompositeDataSetPreProcessor
  "A simple Composite DataSetPreProcessor - allows you to apply multiple DataSetPreProcessors sequentially
 on the one DataSet, in the order they are passed to the constructor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor CompositeDataSetPreProcessor]))

(defn ->composite-data-set-pre-processor
  "Constructor.

  pre-processors - Preprocessors to apply. They will be applied in this order - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^CompositeDataSetPreProcessor [^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processors]
    (new CompositeDataSetPreProcessor pre-processors)))

(defn pre-process
  "Description copied from interface: DataSetPreProcessor

  data-set - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^CompositeDataSetPreProcessor this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.preProcess data-set))))

