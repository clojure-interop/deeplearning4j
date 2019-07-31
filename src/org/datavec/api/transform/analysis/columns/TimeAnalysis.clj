(ns org.datavec.api.transform.analysis.columns.TimeAnalysis
  "Analysis for Time columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns TimeAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TimeAnalysis this]
    (-> this (.toString))))

(defn get-min-double
  "returns: `double`"
  (^Double [^TimeAnalysis this]
    (-> this (.getMinDouble))))

(defn get-max-double
  "returns: `double`"
  (^Double [^TimeAnalysis this]
    (-> this (.getMaxDouble))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^TimeAnalysis this]
    (-> this (.getColumnType))))

