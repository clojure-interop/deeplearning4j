(ns org.datavec.api.transform.analysis.columns.IntegerAnalysis
  "Analysis for Integer columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns IntegerAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerAnalysis this]
    (-> this (.toString))))

(defn get-min-double
  "returns: `double`"
  (^Double [^IntegerAnalysis this]
    (-> this (.getMinDouble))))

(defn get-max-double
  "returns: `double`"
  (^Double [^IntegerAnalysis this]
    (-> this (.getMaxDouble))))

(defn get-column-type
  "returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^IntegerAnalysis this]
    (-> this (.getColumnType))))

