(ns org.deeplearning4j.spark.models.sequencevectors.export.ExportContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.export ExportContainer]))

(defn ->export-container
  "Constructor."
  (^ExportContainer []
    (new ExportContainer )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ExportContainer this]
    (-> this (.toString))))

