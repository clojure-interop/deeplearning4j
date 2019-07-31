(ns org.nd4j.linalg.dataset.api.preprocessor.ImageFlatteningDataSetPreProcessor
  "A DataSetPreProcessor used to flatten a 4d CNN features array to a flattened 2d format (for use in networks such
 as a DenseLayer/multi-layer perceptron)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor ImageFlatteningDataSetPreProcessor]))

(defn ->image-flattening-data-set-pre-processor
  "Constructor."
  (^ImageFlatteningDataSetPreProcessor []
    (new ImageFlatteningDataSetPreProcessor )))

(defn pre-process
  "Description copied from interface: DataSetPreProcessor

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^ImageFlatteningDataSetPreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

