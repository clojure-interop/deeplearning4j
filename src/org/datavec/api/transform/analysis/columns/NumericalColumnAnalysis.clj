(ns org.datavec.api.transform.analysis.columns.NumericalColumnAnalysis
  "Abstract class for numerical column analysis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns NumericalColumnAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NumericalColumnAnalysis this]
    (-> this (.toString))))

(defn get-min-double
  "returns: `double`"
  (^Double [^NumericalColumnAnalysis this]
    (-> this (.getMinDouble))))

(defn get-max-double
  "returns: `double`"
  (^Double [^NumericalColumnAnalysis this]
    (-> this (.getMaxDouble))))

