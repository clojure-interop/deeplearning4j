(ns org.datavec.api.transform.analysis.columns.DoubleAnalysis
  "Analysis for Double columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns DoubleAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DoubleAnalysis this]
    (-> this (.toString))))

(defn get-min-double
  "returns: `double`"
  (^Double [^DoubleAnalysis this]
    (-> this (.getMinDouble))))

(defn get-max-double
  "returns: `double`"
  (^Double [^DoubleAnalysis this]
    (-> this (.getMaxDouble))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^DoubleAnalysis this]
    (-> this (.getColumnType))))

