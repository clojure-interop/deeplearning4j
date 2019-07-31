(ns org.datavec.api.transform.analysis.columns.ColumnAnalysis
  "Interface for column analysis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns ColumnAnalysis]))

(defn get-count-total
  "returns: `long`"
  (^Long [^ColumnAnalysis this]
    (-> this (.getCountTotal))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^ColumnAnalysis this]
    (-> this (.getColumnType))))

