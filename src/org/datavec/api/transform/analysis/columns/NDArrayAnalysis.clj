(ns org.datavec.api.transform.analysis.columns.NDArrayAnalysis
  "Column analysis class for NDArray columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns NDArrayAnalysis]))

(defn ->nd-array-analysis
  "Constructor."
  (^NDArrayAnalysis []
    (new NDArrayAnalysis )))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^NDArrayAnalysis this]
    (-> this (.getColumnType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayAnalysis this]
    (-> this (.toString))))

