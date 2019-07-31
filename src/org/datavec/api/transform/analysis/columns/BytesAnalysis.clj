(ns org.datavec.api.transform.analysis.columns.BytesAnalysis
  "Analysis for bytes (byte[]) columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns BytesAnalysis]))

(defn ->bytes-analysis
  "Constructor.

  builder - `org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder`"
  (^BytesAnalysis [^org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder builder]
    (new BytesAnalysis builder)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BytesAnalysis this]
    (-> this (.toString))))

(defn get-count-total
  "returns: `long`"
  (^Long [^BytesAnalysis this]
    (-> this (.getCountTotal))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^BytesAnalysis this]
    (-> this (.getColumnType))))

