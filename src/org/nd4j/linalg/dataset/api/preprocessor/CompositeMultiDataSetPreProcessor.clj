(ns org.nd4j.linalg.dataset.api.preprocessor.CompositeMultiDataSetPreProcessor
  "A simple Composite MultiDataSetPreProcessor - allows you to apply multiple MultiDataSetPreProcessors sequentially
 on the one MultiDataSet, in the order they are passed to the constructor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor CompositeMultiDataSetPreProcessor]))

(defn ->composite-multi-data-set-pre-processor
  "Constructor.

  pre-processors - Preprocessors to apply. They will be applied in this order - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^CompositeMultiDataSetPreProcessor [^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processors]
    (new CompositeMultiDataSetPreProcessor pre-processors)))

(defn pre-process
  "Description copied from interface: MultiDataSetPreProcessor

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^CompositeMultiDataSetPreProcessor this ^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (-> this (.preProcess multi-data-set))))

