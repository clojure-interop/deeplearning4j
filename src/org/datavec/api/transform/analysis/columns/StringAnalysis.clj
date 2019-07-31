(ns org.datavec.api.transform.analysis.columns.StringAnalysis
  "Analysis for String columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns StringAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringAnalysis this]
    (-> this (.toString))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^StringAnalysis this]
    (-> this (.getColumnType))))

