(ns org.datavec.api.transform.analysis.quality.QualityAnalysisState
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality QualityAnalysisState]))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `T`"
  ([^QualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `T`

  returns: `T`"
  ([^QualityAnalysisState this other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^QualityAnalysisState this]
    (-> this (.getColumnQuality))))

