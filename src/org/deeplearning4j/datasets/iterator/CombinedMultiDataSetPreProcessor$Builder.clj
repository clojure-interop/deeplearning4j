(ns org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator CombinedMultiDataSetPreProcessor$Builder]))

(defn ->builder
  "Constructor."
  (^CombinedMultiDataSetPreProcessor$Builder []
    (new CombinedMultiDataSetPreProcessor$Builder )))

(defn add-pre-processor
  "Inserts the specified preprocessor at the specified position to the list of preprocessors to be applied

  idx - the position to apply the specified preprocessor at - `int`
  pre-processor - to be added to list of preprocessors to be applied - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`

  returns: `org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor$Builder`"
  (^org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor$Builder [^CombinedMultiDataSetPreProcessor$Builder this ^Integer idx ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.addPreProcessor idx pre-processor)))
  (^org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor$Builder [^CombinedMultiDataSetPreProcessor$Builder this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.addPreProcessor pre-processor))))

(defn build
  "returns: `org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor`"
  (^org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor [^CombinedMultiDataSetPreProcessor$Builder this]
    (-> this (.build))))

