(ns org.datavec.api.transform.analysis.columns.LongAnalysis
  "Analysis for Long columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns LongAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongAnalysis this]
    (-> this (.toString))))

(defn get-min-double
  "returns: `double`"
  (^Double [^LongAnalysis this]
    (-> this (.getMinDouble))))

(defn get-max-double
  "returns: `double`"
  (^Double [^LongAnalysis this]
    (-> this (.getMaxDouble))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^LongAnalysis this]
    (-> this (.getColumnType))))

