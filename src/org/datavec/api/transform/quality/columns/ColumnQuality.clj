(ns org.datavec.api.transform.quality.columns.ColumnQuality
  "Base class for the quality of a column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns ColumnQuality]))

(defn ->column-quality
  "Constructor."
  (^ColumnQuality []
    (new ColumnQuality )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ColumnQuality this]
    (-> this (.toString))))

