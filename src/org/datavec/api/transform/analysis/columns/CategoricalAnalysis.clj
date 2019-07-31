(ns org.datavec.api.transform.analysis.columns.CategoricalAnalysis
  "Analysis for categorical columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns CategoricalAnalysis]))

(defn ->categorical-analysis
  "Constructor."
  (^CategoricalAnalysis []
    (new CategoricalAnalysis )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CategoricalAnalysis this]
    (-> this (.toString))))

(defn get-count-total
  "returns: `long`"
  (^Long [^CategoricalAnalysis this]
    (-> this (.getCountTotal))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^CategoricalAnalysis this]
    (-> this (.getColumnType))))

