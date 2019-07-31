(ns org.deeplearning4j.text.labels.LabelsProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.labels LabelsProvider]))

(defn next-label
  "returns: `T`"
  ([^LabelsProvider this]
    (-> this (.nextLabel))))

(defn get-label
  "index - `int`

  returns: `T`"
  ([^LabelsProvider this ^Integer index]
    (-> this (.getLabel index))))

