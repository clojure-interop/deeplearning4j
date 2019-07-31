(ns org.datavec.api.transform.quality.DataQualityAnalysis
  "A report outlining number of invalid and missing features"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality DataQualityAnalysis]))

(defn ->data-quality-analysis
  "Constructor."
  (^DataQualityAnalysis []
    (new DataQualityAnalysis )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DataQualityAnalysis this]
    (-> this (.toString))))

