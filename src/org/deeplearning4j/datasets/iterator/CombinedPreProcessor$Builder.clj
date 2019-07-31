(ns org.deeplearning4j.datasets.iterator.CombinedPreProcessor$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator CombinedPreProcessor$Builder]))

(defn ->builder
  "Constructor."
  (^CombinedPreProcessor$Builder []
    (new CombinedPreProcessor$Builder )))

(defn add-pre-processor
  "idx - `int`
  pre-processor - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`

  returns: `org.deeplearning4j.datasets.iterator.CombinedPreProcessor$Builder`"
  (^org.deeplearning4j.datasets.iterator.CombinedPreProcessor$Builder [^CombinedPreProcessor$Builder this ^Integer idx ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.addPreProcessor idx pre-processor)))
  (^org.deeplearning4j.datasets.iterator.CombinedPreProcessor$Builder [^CombinedPreProcessor$Builder this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.addPreProcessor pre-processor))))

(defn build
  "returns: `org.deeplearning4j.datasets.iterator.CombinedPreProcessor`"
  (^org.deeplearning4j.datasets.iterator.CombinedPreProcessor [^CombinedPreProcessor$Builder this]
    (-> this (.build))))

